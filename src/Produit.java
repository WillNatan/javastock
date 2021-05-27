package App;


import UI.GUI;
import designpattern.Sujet;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Willy
 */
public class Produit extends Sujet {
    
    private Long id;
    private String libelle;
    private Float prix;
    private Integer quantity;
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public Float getPrix() {
        return prix;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    
    public void createProduct(Long id, String libelle, Float prix, Integer quantity){
        this.setId(id);
        this.setLibelle(libelle);
        this.setPrix(prix);
        this.setQuantity(quantity);
        this.notifierObservateurs();
    }
    
    @Override
    public String toString() {
        return "Produit{" + "id=" + id + ", libelle=" + libelle + ", prix=" + prix + ", quantity=" + quantity + '}';
    }
}
