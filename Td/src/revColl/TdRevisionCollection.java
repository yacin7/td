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
public class TdRevisionCollection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Client c1 = new Client(12335,"Semah","Kadri");
        Client c2 = new Client(14569,"Ahmed","Omar");
        Client c3 = new Client(12335,"Ines","Ammar");
        
        Voiture v1= new Voiture(123456,"Clio",5036f);
        Voiture v2= new Voiture(89595,"Audi",4595f);
        Voiture v3= new Voiture(54668,"Fiat",5985f);
        
        ListVoiture L1 = new ListVoiture();
        
        try{
            L1.ajoutVoiture(v1);
            L1.ajoutVoiture(v2);
            L1.ajoutVoiture(v3);
        }
        catch(VoitureException v) {
            System.out.println(v.getMessage());
        };
        
    }
    
}
