/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package App;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Willy
 */
public class ProduitTableModel extends AbstractTableModel {

    private List<Produit> produits;
    private String colNames[];
    
    @Override
    public int getRowCount() {
        return produits.size();
    }

    public ProduitTableModel() {
        produits = new ArrayList<Produit>();
    }
    
    @Override
    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        String value = "";
      switch (column) {
            case 0:
                value = "id";
                break;
            case 1:
                value = "libelle";
                break;
            case 2:
                value ="prix";
                break;
            case 3:
                value = "quantité";
                break;
        }

        return value;
    }
    
    public void addProduit(Produit p){
        produits.add(p);
        this.fireTableDataChanged();
        this.fireTableChanged(null);
    }
    
    public void removeProduit(Produit p) {
       produits.remove(p);
       this.fireTableDataChanged();
       this.fireTableChanged(null);
    }
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Produit produit = produits.get(rowIndex);
        Object value = null;
        
        switch (columnIndex) {
            case 0:
                value = produit.getId();
                break;
            case 1:
                value = produit.getLibelle();
                break;
            case 2:
                value = produit.getPrix()+" €";
                break;
            case 3:
                value = produit.getQuantity();
                break;
        }

        return value;
    }
    
    public Produit getProduit(int index){
        return this.produits.get(index);
    }

}
    
    
    


