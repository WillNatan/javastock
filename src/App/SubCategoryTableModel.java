/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import designpattern.Category;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Julien
 */
public class SubCategoryTableModel extends AbstractTableModel {
    private List<Category> categories;
    private String colNames;
    
    @Override
    public int getRowCount() {
        
        return categories.size();
        
    }

    @Override
    public int getColumnCount() {
        
        return 2;
        
    }

    public SubCategoryTableModel() {
        categories= new ArrayList<Category>();
    }
    
    @Override
    public String getColumnName(int column) {
        String value = "";
      switch (column) {
            case 0:
                value = "ID";
                break;
            case 1:
                value = "Nom de catégorie";
                break;
        }

        return value;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Category category = categories.get(rowIndex);
        Object value = null;
        
        switch (columnIndex) {
            case 0:
                value = category.getId();
                break;
            case 1:
                value = category.getNameCategory();
                break;
        }

        return value;
        
    }
}
