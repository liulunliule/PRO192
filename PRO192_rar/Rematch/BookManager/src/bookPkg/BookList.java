/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bookPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

/**
 *
 * @author ADMIN
 */
public class BookList extends ArrayList{
    public BookList(){
        
    }
    
    public boolean loadFromFile(String filename){
        File f = new File(filename);
        if(f!.exists())
            return false;
        try{
            FileInputStream fis = new FileInputStream(f);
            ObjectInputStream os = new ObjectInputStream(fis);
            Book b;
            while(b=(Book))(os.readObject()) !=null){
            this.add(b);
        }
            os.close();
            fis.close();
        } catch (Exception e){
            System.out.println(e);
        }
        return true;
    }
}
