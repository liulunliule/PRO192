/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package carprj;

import java.util.ArrayList;
import java.util.List;

public abstract class DataManagement<E> {

    protected List<E> entityList;
    private IDatabaseService databaseService;
    
    public IDatabaseService getDatabaseService() {
        return this.databaseService;
    }

    public void setDatabaseService(IDatabaseService databaseService) {
        this.databaseService = databaseService;
    }
    
    public DataManagement() {
        this.entityList = new ArrayList();
    }
    
    public DataManagement(IDatabaseService databaseService) {
        this.entityList = new ArrayList<>();
        this.databaseService = databaseService;
    }

    public void loadData() {
        List<String> entityList = databaseService.loadData();
        this.entityList.clear();
        E entity = null;
        for (String entityString : entityList) {
            entity = parseString(entityString);
            if (entity != null) {
                this.entityList.add(entity);
            }
        }
    }

    public boolean saveData() {
        List<String> entityListString = new ArrayList();
        for (E entity : this.entityList) {
            entityListString.add(entity.toString());
        }
        return databaseService.saveData(entityListString);
    }

    public boolean insertData(E entity) {
        return this.databaseService.insert(entity.toString());
    }
    
    public boolean updateData(E entity) {
        if (entity == null) {
            return false;
        }
        int index = entityList.indexOf(entity);
        if (index == -1){
            return false;
        }
        entityList.set(index, entity);
        String entityString = entity.toString();
        return databaseService.update(entityString);
    }

    public boolean deleteData(String id) {
        for (E entity : entityList) {
            if (entity.toString().contains(id)) {
                entityList.remove(entity);
                return true;
            }
        }
        return false;
    }   

    protected abstract E parseString(String stringEntity);
}
