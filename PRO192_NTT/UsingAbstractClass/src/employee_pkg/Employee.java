/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee_pkg;

import general_pkg.IAction;
import general_pkg.User;

/**
 *
 * @author 840G3
 */
public class Employee extends User implements IAction {

    private String name;
    
    public Employee(String id, String passWord, String name) {
        this.id = id;
        this.passWord = passWord;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    

    @Override
    public void login() {
        System.out.printf("Employee logged in by name : %s and password: %s \n", name, passWord);
    }

    @Override
    public void ShowInfor() {
        System.out.format("id: %s, name :%s\n", id, name);
    }

}
