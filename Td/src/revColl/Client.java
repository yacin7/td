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
public class Client implements Comparable<Client> {
    private int code; 
    private String nom;
private String prenom;

public Client(int code, String nom, String prenom) {
    this.code=code;
    this.nom=nom;
    this.prenom=prenom;
}
public int getCode() {
return code;
}
public void setCode(int code) {
this.code = code;
}
public String getNom() {
return nom;
}
public void setNom(String nom) {
this.nom = nom;
}
public String getPrenom() {
return prenom;
}
public void setPrenom(String prenom) {
this.prenom = prenom;
}

    @Override
    public int hashCode() {
    return 15 ;
}
    
    @Override
    public boolean equals(Object obj) {
if (obj==null)
        return false;
    if (obj.getClass() != this.getClass())
        return false;
    Client c = (Client)obj;
    return (this.code ==c.code);
}
    @Override
    public String toString(){
        return "Code: "+this.code+
                "Nom: "+this.nom +
                "Prenom: "+this.prenom;
}

    @Override
    public int compareTo(Client o) {
       return this.code-o.code;
    }
}
