/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package general_pkg;

/**
 *
 * @author 840G3
 */
public abstract class User {
    protected String id;
    protected String passWord;
    
    public abstract void login();
}
