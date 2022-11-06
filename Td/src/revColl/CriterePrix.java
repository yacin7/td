/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revColl;

/**
 *
 * @author semah
 */
public class CriterePrix implements Critere 
{
    private float prix; 

    public CriterePrix(float prix) {
        this.prix = prix;
    }   

@Override
public boolean estSatisfaitPar(Voiture v) {
    if (this.prix==v.getPrixLocation()){
        return true;
    }else {
        return false;
    }
}
    
}
