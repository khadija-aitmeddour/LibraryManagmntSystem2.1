package model;

import java.awt.Image;

import javax.swing.ImageIcon;

public class User extends Person{
    private String dateDebut;
    private String position;
    private double salaire;
    private String TypePers;
    private String salt;
    private String pwd;
    private ImageIcon photo;

    public User(){
          super(null, null, null, null, null, null, null);
        this.dateDebut = null;
        this.position = null;
        this.salaire = 0;
        this.TypePers = "librarian";
    }
    public User(String email, String pwd){
          super(null, null, null, null, null, null, email);
        this.dateDebut = null;
        this.position = null;
        this.salaire = 0;
        this.pwd = pwd;
        this.TypePers = "librarian";
    }
    
    public User(String idPersonne, String nom, String prenom, String dateN, String adresse, String phone, String email, String dateDebut, String position, double salaire, String salt, String pwd, ImageIcon photo){
        super(idPersonne, nom, prenom, dateN, adresse, phone, email);
        this.dateDebut = dateDebut;
        this.position = position;
        this.salaire = salaire;
        this.salt = salt;
        this.pwd = pwd;
        this.photo = photo;
        this.TypePers = "librarian";
    }
    
    public String getDateDebut() {
        return dateDebut;
    }

    
    public void setDateDebut(String dateDebut) {
        this.dateDebut = dateDebut;
    }

    
    public String getPosition() {
        return position;
    }

    
    public void setPosition(String position) {
        this.position = position;
    }

   
    public double getSalaire() {
        return salaire;
    }

   
    public void setSalaire(double salaire) {
        this.salaire = salaire;
    }

    
    public String getTypePers() {
        return TypePers;
    }

    
    public void setTypePers(String TypePers) {
        this.TypePers = TypePers;
    }

    public String getPwd() {
        return this.pwd;
    }

    
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

     public String getSalt() {
        return this.salt;
    }
    
    public ImageIcon getPhoto(){
        return this.photo;
    }
    
    
}
