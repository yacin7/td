/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revColl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

/**
 *
 * @author semah
 */
public class Agence {
    private String nom; 
    private ListVoiture vs; 
    private Map<Client, ListVoiture> ClientVoitureLoue;

public Agence(String nom)
{
    this.nom=nom;
}
public void ajoutVoiture(Voiture v) throws VoitureException{
 vs.ajoutVoiture(v);
}

public void suppVoiture(Voiture v)throws VoitureException{
    vs.supprimeVoiture(v);
 }

public void loueClientVoiture(Client cl,Voiture v)throws VoitureException{
    ClientVoitureLoue.put(cl, vs);
}
public void retourClientVoiture(Client cl , Voiture v) throws VoitureException{
ClientVoitureLoue.remove(cl, v);
}

public List<Voiture> selectVoitureSelonCritere(Critere c){
    for (int i=0;i<vs.size();i++){
    if ( c instanceof CritereMarque){
        CritereMarque c1 =  (CritereMarque)c;
     if(c1.estSatisfaitPar(v)){
         return ;
     }
    }else if(c instanceof CriterePrix){
         CriterePrix c1 =  (CriterePrix)c;
     if(c1.estSatisfaitPar(v)){
         return ;
     }
    }
}
}

public Set<Client> ensembleClientsLoueurs(){
    return ClientVoitureLoue.keySet();
}

public Collection<ListVoiture> collectionVoituresLouees(){
        return ClientVoitureLoue.values();
}

public void afficheLesClientsEtLeursListesVoitures(){
for (Map.Entry<Client,ListVoiture> e : ClientVoitureLoue.entrySet()){
           System.out.println(e.getKey()+"-"+e.getValue());
          
       }
}

/*public Map<Client, ListVoiture> triCodeCroissant(){



}

public Map<Client, ListVoiture> triNomCroissant(){

}*/
}
