/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chuvi_dientichhcn;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;

/**
 *
 * @author 840G3
 */
public class DemoCheckedException {
    public static void Readfile() throws IOException {
        FileReader file = new FileReader("D:\\kiem.txt");
        BufferedReader fileInput =new BufferedReader(file);
        
        for (int i = 0; i < 3; i++) {
            
        }
    }
}
