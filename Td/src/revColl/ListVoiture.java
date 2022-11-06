/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revColl;

import java.util.Iterator;
import java.util.List;

/**
 *
 * @author semah
 */
public class ListVoiture {
    private List<Voiture> voitures; 
    
    public ListVoiture(List<Voiture> voitures) {
       this.voitures=voitures;
}
    public ListVoiture() {
        super();
}
    public List<Voiture> getVoitures() {
      return this.voitures;
    }

    public void setVoitures(List<Voiture> voitures) {
        this.voitures=voitures;
}

public void ajoutVoiture(Voiture v) throws VoitureException{ 
    
    if( !voitures.contains(v)){
        voitures.add(v);    
    }
    else {
        throw new VoitureException("Voiture existante");
    }
}    
public void supprimeVoiture(Voiture v) throws VoitureException{
    if(voitures.contains(v)){
       voitures.remove(v);
    }else {
         throw new VoitureException("Voiture non existante");
        }

}

public Iterator<Voiture> iterateur(){ 
    return voitures.iterator();
}
public int size(){
        return voitures.size();
}
public void affiche(){
for (int i=0;i<voitures.size();i++){
           System.out.println(voitures.get(i));
       }

    }
}
