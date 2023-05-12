/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manager_pkg;

import general_pkg.IAction;
import java.util.ArrayList;
import general_pkg.User;

/**
 *
 * @author 840G3
 */
public class Manager {
    ArrayList<IAction> userList = new ArrayList<>();
    public void addUserToList(IAction user){
        userList.add(user);
    }
    public void printList(){
        userList.forEach(u ->{u.ShowInfor();});
    }
    public void showLoginStatus(){
        userList.stream().filter((u) -> ( u instanceof User)).forEachOrdered((u) -> {
            ((User)u).login();
        });
    }
}
