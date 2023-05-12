/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.util.List;

public interface IDatabaseService {

    List<String> loadData();
    
    List<String> sort(List<String> entityStringList, int fieldIndex, boolean ascending);

    boolean saveData(List<String> entityStringList);

    boolean insert(String entityString);

    boolean update(String entityString);

    boolean delete(String id);
    
}
