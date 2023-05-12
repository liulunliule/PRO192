/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

/**
 *
 * @author USER
 */
public class CompanyManagement {

    /**
     * list of employees
     */
    private ArrayList<Employee> empList = new ArrayList();

    /**
     * Constructor for CompanyManagement Initializes constructor method by
     * calling file read method
     *
     * @throws IOException
     * @throws FileNotFoundException
     */
    public CompanyManagement(String path, String path1) {
        this.empList = getEmployeeFromFile(path, path1);
    }

    public ArrayList<Employee> getEmployeeFromFile(String path, String path1) { //lấy danh sách từ file
        ArrayList<Employee> eList = new ArrayList(); //tạo 1 cái arraylist để chứa file
        try {
            BufferedReader bReader = new BufferedReader(new FileReader(path));
            BufferedReader bReader1 = new BufferedReader(new FileReader(path1));

            String line;
            
            ArrayList<String> programmingLanguages;
            HashMap<String, ArrayList<String>> mp = new HashMap();
            
            while ((line = bReader1.readLine()) != null) {
                String[] ls = line.split(","); //dòng này để in ra ngôn ngữ có dấu phẩy
                ArrayList<String> list = new ArrayList<String>(Arrays.asList(ls));
                list.remove(0);
                mp.put(ls[0], list);
            }

            //hàm để tìm và add Teamleader, Tester và 
            while ((line = bReader.readLine()) != null) {
                String[] ls = line.split(",");
                if (ls[1].startsWith("D")) { // nếu như vị trí mảng thứ 1 của file là chữ D
                    if (ls[5].compareToIgnoreCase("L") == 0) { //và thứ 5 là chữ L
                        eList.add(new TeamLeader(ls[1], ls[2], Integer.parseInt(ls[7]), ls[3], mp.get(ls[1]),
                                Integer.parseInt(ls[4]), Double.parseDouble(ls[6])));
                    } else {
                        eList.add(new Developer(ls[1], ls[2], Integer.parseInt(ls[5]), ls[3], mp.get(ls[1]),
                                Integer.parseInt(ls[4])));
                    }

                } else if (ls[1].startsWith("T")) {
                    eList.add(new Tester(ls[1], ls[2], Integer.parseInt(ls[5]), Double.parseDouble(ls[3]), ls[4]));
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return eList;
    }

    public ArrayList<Developer> getDeveloperByProgrammingLanguage(String pl) {
        ArrayList<Developer> dList = new ArrayList();
        for (Employee emp : this.empList) {
            if (emp instanceof Developer && ((Developer) emp).getProgrammingLanguages().contains(pl)) {
                dList.add((Developer) emp);
            }
        }
        return dList;
    }

    public ArrayList<Tester> getTestersHaveSalaryGreaterThan(double value) {
        ArrayList<Tester> tList = new ArrayList();
        for (Employee emp : this.empList) {
            if (emp instanceof Tester && ((Tester) emp).getSalary() > value) {
                tList.add((Tester) emp);
            }
        }
        return tList;
    }

    public ArrayList<Employee> getEmployeesHaveSalaryGreaterThan(double value) {
        ArrayList<Employee> tList = new ArrayList();
        for (Employee emp : this.empList) {
            if (emp.getSalary() > value) {
                tList.add(emp);
            }
        }
        return tList;
    }

    public Employee getEmployeeWithHighestSalary() {

        if (empList == null || empList.size() == 0) {
            return null;
        }
        Employee retEmp = empList.get(0);
        for (Employee emp : this.empList) {
            if (retEmp.getSalary() < emp.getSalary()) {
                retEmp = emp;
            }
        }
        return retEmp;
    }

    public TeamLeader getLeaderWithMostEmployees() {
        Map<String, ArrayList<Employee>> team = new HashMap();
        Map<String, TeamLeader> tLeader = new HashMap();
        ArrayList<Employee> list;
        String teamName = "";
        for (Employee emp : this.empList) {
            if (emp instanceof TeamLeader) {
                teamName = ((TeamLeader) emp).getTeamName();
                tLeader.put(teamName, (TeamLeader) emp);

            } else if (emp instanceof Developer) {
                teamName = ((Developer) emp).getTeamName();
                if (team.containsKey(teamName)) {
                    team.get(teamName).add(emp);
                } else {
                    list = new ArrayList();
                    list.add(emp);
                    team.put(teamName, list);
                }
            }
        }
        int cnt = 0;
        for (Map.Entry<String, ArrayList<Employee>> entry : team.entrySet()) {
            if (entry.getValue().size() > cnt) {
                cnt = entry.getValue().size();
                teamName = entry.getKey();
            }
        }
        return tLeader.get(teamName);
    }

    public ArrayList<Employee> sorted() {
        ArrayList<Employee> sortedList = (ArrayList<Employee>) this.empList.clone();

        Collections.sort(sortedList, new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                if (e2.getSalary() - e1.getSalary() > 0) {
                    return 1;
                } else if (e1.getSalary() == e2.getSalary()) {
                    String[] e1Name = e1.getEmpName().split(" ");
                    String[] e2Name = e2.getEmpName().split(" ");
                    return e1Name[e1Name.length - 1].compareTo(e2Name[e2Name.length - 1]);
                } else {
                    return -1;
                }

            }
        });
        return sortedList;

    }

    public void printEmpList() {
        this.empList.forEach(employee -> {
            System.out.println(employee.toString());
        });

    }

    public void printEmpList(ArrayList<Employee> list) {
        list.forEach(employee -> {
            System.out.println(employee.toString());
        });

    }

    public <E> boolean writeFile(String path, ArrayList<E> list) {
        try {
            File fileObj = new File(path);
            fileObj.createNewFile();
            FileWriter myWriter = new FileWriter(fileObj);
            for (E employee : list) {
                myWriter.write(employee.toString());
            }
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
        return true;
    }

    public boolean writeFile(String path, Employee employee) {
        try {
            File fileObj = new File(path);
            fileObj.createNewFile();
            FileWriter myWriter = new FileWriter(fileObj);
            myWriter.write(employee.toString());
            myWriter.close();
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
            return false;
        }
        return true;
    }

}
