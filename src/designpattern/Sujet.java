/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpattern;

import java.util.ArrayList;
import java.util.Collection;
import sun.awt.RepaintArea;

/**
 *
 * @author Willy
 */
public class Sujet {
    private Collection<Observateur> collectionObservateur;
    
    public Sujet(){
        collectionObservateur = new ArrayList();
    }
    public void ajouterObservateur  (Observateur o){
        collectionObservateur.add(o);
    }
     public void supprimerObservateur  (Observateur o){
        collectionObservateur.remove(o);
    }
    public void notifierObservateurs(){
        for(Observateur obs : collectionObservateur){
            obs.notifier(this);
        }
    }
}
