/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Customer_pkg;

import general_pkg.IAction;
import general_pkg.User;

/**
 *
 * @author 840G3
 */
public class Customer extends User implements IAction {

    /**
     * @param args the command line arguments
     */
    private String email;

    public Customer(String id, String passWord, String name) {
        this.id = id;
        this.passWord = passWord;
        this.email = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
        System.out.printf("Customer logged in by email : %s and password: %s \n", email, passWord);
    }

    @Override
    public void ShowInfor() {
        System.out.format("id: %s, email :%s\n", id, email);
    }

}
