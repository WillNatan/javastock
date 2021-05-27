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
public class SubCategory extends Sujet implements Category {
    private Category parent;
    private int id;
    private String nameCategory;
    
    public Category getParent() {
        return parent;
    }

    public void setParent(Category parent) {
        this.parent = parent;
    }

    @Override
    public int getId() {
        return id;
    }

    @Override
    public void setId(int id) {
        this.id=id;
    }

    @Override
    public String getNameCategory() {
        return nameCategory;
    }

    @Override
    public void setNameCategory(String nameCategory) {
        this.nameCategory=nameCategory;
    }
    
     public void createSubCategory(int id, String nameCategory, HeadCategory parent){
        this.setId(id);
        this.setNameCategory(nameCategory);
        this.setParent(parent);
        this.notifierObservateurs();
    }
     
}