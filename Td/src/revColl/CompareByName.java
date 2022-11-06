/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revColl;

import java.util.Comparator;

/**
 *
 * @author semah
 */
public class CompareByName implements Comparator<Client>{
    
    CompareByName(){
        
    }

    @Override
    public int compare(Client o1, Client o2) {
        return (o1.getNom()).compareTo(o2.getNom());
    }
    
    
    
}
