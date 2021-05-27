package App;
import designpattern.Category;
import designpattern.Sujet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julien
 */
public class HeadCategory extends Sujet implements Category {
    private int id;
    private String nameCategory;
    
    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String getNameCategory() {
        return nameCategory;
    }

    @Override
    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
     public void createHeadCategory(int id, String nameCategory){
        this.setId(id);
        this.setNameCategory(nameCategory);
        this.notifierObservateurs();
    }
   
}
