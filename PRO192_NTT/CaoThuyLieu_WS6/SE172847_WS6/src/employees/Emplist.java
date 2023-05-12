package employees;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

public class Emplist extends ArrayList<Employee> {

    public Emplist() {
        super();
    }

    public void AddFromFiile(String fname) {
        try {
            File f = new File(fname);
            if (!f.exists()) {
                return;
            }
            FileReader fr = new FileReader(f);
            BufferedReader bf = new BufferedReader(fr);
            String details;
            while ((details = bf.readLine()) != null) {
                StringTokenizer stk = new StringTokenizer(details, ",");
                String code = stk.nextToken().toUpperCase();
                String name = stk.nextToken().toUpperCase();
                int salary = Integer.parseInt(stk.nextToken());
                Employee emp = new Employee(code, name, salary);
                this.add(emp);
            }
            bf.close();
            fr.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void saveToFiile(String fname) {
        if (this.isEmpty()) {
            System.out.println("Empty list");
            return;
        }
        try {
            File f = new File(fname);
            FileWriter fw = new FileWriter(f);
            PrintWriter pw = new PrintWriter(fw);
            for (Employee emp : this) {
                pw.println(emp.getCode() + "," + emp.getName() 
                        + "," + emp.getSalary());
            }
            pw.close();
            fw.close();
        } catch (Exception e) {
        }
    }

    private int find(String code) {
        for (int i = 0; i < this.size(); i++) {
            if (this.get(i).getCode().equals(code.toUpperCase())) {
                return i;
            }
        }
        return -1;
    }

    public void addNewEmp() {
        String newCode, newName;
        int salary;
        System.out.println("Enter new employee detail:");
        boolean check = true;
        do {
            newCode = Utils.Utils.getStringreg("Enter code: ", "SE\\d{6}", 
                    "Code cannot null", "Code must be (SExxxxxx)!!!");
            if (find(newCode) >= 0) {
                System.out.println("Code id Duplicate");
            } else {
                check = false;
            }
        } while (check);
        newName = Utils.Utils.getString("Enter name: ");
        salary = Utils.Utils.getInt("Enter Salary: ", 1000);
        this.add(new Employee(newCode.toUpperCase(), newName.toUpperCase(), salary));
        System.out.println("New employee has been added.");
    }

    public void removeEmp() {
        String code;
        code = Utils.Utils.getStringreg("Enter code of remove employee: ", "SE\\d{6}", 
                "Code cannot null", "Code must be (SExxxxxx)!!!");
        int pos =find(code);
        if(pos<0){
            System.out.println("This code does not exist.");
        }else{
            this.remove(this.get(pos));
            System.out.println("The employee "+ code +" has been removed.");
        }
    }
    
    public void promote() {
        String code;
        code = Utils.Utils.getStringreg("Enter code of remove employee: ", "SE\\d{6}", 
                "Code cannot null", "Code must be (SExxxxxx)!!!");
        int pos =find(code);
        if(pos<0){
            System.out.println("This code does not exist.");
        }else{
            int oldSalary=this.get(pos).getSalary();
            int newSalary;
            
            System.out.println("Old salary: "+ oldSalary);
            newSalary = Utils.Utils.getInt("Enter new salary: ",1000 ,oldSalary);
            
            this.get(pos).setSalary(newSalary);
            System.out.println("The employee "+ code +" has been updated.");
        }
    }
    
    public void print(){
        if(this.isEmpty()){
            System.out.println("Empty list!");
            return;
        }
        Collections.sort(this);
        System.out.println("\nEMPLOYEE LIST");
        System.out.println("-----------------------");
        for (Employee x : this) {
            x.print();
        }
    }
}
