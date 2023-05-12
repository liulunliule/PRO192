/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Stream;

public class FileDataService implements IDatabaseService {

    private String filePath;

    public FileDataService(String filePath) throws CException {
        if (filePath == null || filePath.isEmpty()) {
            throw new CException("File is null or empty.");
        }
        this.filePath = filePath;
    }

    @Override
    public List<String> loadData() {
        System.out.println("Load data from file " + this.filePath + " ...");
        List<String> entityStringList = new ArrayList();
        try ( Scanner sc = new Scanner(new File(this.filePath))) {
            String entityString;
            while (sc.hasNextLine()) {
                entityString = sc.nextLine();
                if (!entityString.isEmpty()) {
                    entityStringList.add(entityString);
                }
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileDataService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return entityStringList;
    }

    @Override
    public boolean saveData(List<String> entityStringList) {
        System.out.println("Save data to file " + this.filePath + " ...");
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, false))) {
            for (String entityString : entityStringList) {
                writer.append(entityString);
                writer.append("\n");
            }
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FileDataService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean insert(String entityString) {
        System.out.println("Insert data to file " + this.filePath + " ...");
        try ( BufferedWriter writer = new BufferedWriter(new FileWriter(filePath, true))) {
            writer.append(entityString);
            writer.append("\n");
            return true;
        } catch (IOException ex) {
            Logger.getLogger(FileDataService.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(String entityString) {
        System.out.println("Update data in file " + this.filePath + " ...");
        try{
            // retrieve data from file
            List<String> entityStringList = loadData();
            
            // update the data in memory
            int index = entityStringList.indexOf(entityString);
            entityStringList.set(index, entityString);
            
            return true;
        }catch(Exception ex){
            System.err.println("An error occurred while updating data: " + ex.getMessage());
            return false;
        }
    }

    @Override
    public boolean delete(String id) {
        System.out.println("Delete data from file " + this.filePath + " ...");
        try{
            // retrieve data from file
            List<String> entityStringList = loadData();
            
            // remove the entity with the given id from the list
            entityStringList.removeIf(entityString -> entityString.startsWith(id+','));
            
            return true;
        }catch(Exception ex){
            System.err.println("Error while deleting data: " + ex.getMessage());
            return false;
        }
    }
    
    public List<String> sort(List<String> entityStringList, int fieldIndex, boolean ascending) {
        entityStringList.sort((o1, o2) -> {
            String[] fields1 = o1.split(",");
            String[] fields2 = o2.split(",");
            int compareResult = fields1[fieldIndex].compareTo(fields2[fieldIndex]);
            return ascending ? compareResult : -compareResult;
        });
        return entityStringList;
    }

    
    private void prepareDataFile(String filePath) {
        File file = new File(filePath);
        if (!file.exists()) {
            try {
                File parent = file.getParentFile();
                if (parent != null) {
                    parent.mkdirs();
                }
                file.createNewFile();
                saveData((List<String>) Stream.of());
            } catch (IOException ex) {
                System.out.println(">>>>> Error: " + ex.getMessage());
            }
        }
    }
}
