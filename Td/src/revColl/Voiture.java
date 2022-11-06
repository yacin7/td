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
public class Voiture {
    
    private int immariculation;
    private String marque; 
    private float prixLocation; 
    
    public Voiture(int immatriculation, String marque, float prixLocation) {
        this.immariculation=immatriculation;
        this.marque=marque;
        this.prixLocation=prixLocation;
}
    
public int getImmariculation() {
        return this.immariculation;
}
public void setImmariculation(int immariculation) {
    this.immariculation= immariculation;
}
public String getMarque() {
    return this.marque;
}
public void setMarque(String marque) {
    this.marque = marque;
}

public float getPrixLocation() {
    return this.prixLocation;
}

public void setPrixLocation(float prixLocation) { 
    this.prixLocation =prixLocation;
}
public int hashCode() {
    return 30 ;
}


    @Override
    public boolean equals(Object obj) {

    if (obj==null)
        return false;
    if (obj.getClass() != this.getClass())
        return false;
    Voiture v = (Voiture)obj;
    return (this.immariculation==v.immariculation && this.marque.equals(v.marque));
}
    
    @Override
    public String toString(){

    return "Immatriculation: "+this.immariculation+
            "Marque: "+this.marque+
            "Peix: "+this.prixLocation;

}

}
