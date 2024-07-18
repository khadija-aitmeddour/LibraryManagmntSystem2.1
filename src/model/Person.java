package model;

public abstract class Person {
    
    private String idPersonne;
    private String nom;
    private String prenom;
    private String dateN;
    private String adresse;
    private String phone;
    private String email;

    
    
    public Person(String idPersonne, String nom, String prenom, String dateN, String adresse, String phone, String email){
         this.idPersonne = idPersonne;
         this.nom = nom;
         this.prenom = prenom;
         this.dateN = dateN;
         this.adresse = adresse;
         this.phone = phone;
         this.email = email;
      
    }
    
    public String getIdPersonne() {
        return idPersonne;
    }
    public void setIdPersonne(String idPersonne) {
        this.idPersonne = idPersonne;
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
    
    public String getDateN() {
        return dateN;
    }

    public void setDateN(String dateN) {
        this.dateN = dateN;
    }

    public String getAdresse() {
        return adresse;
    }
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    

    
}


