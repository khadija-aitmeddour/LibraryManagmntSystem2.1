package model;

public class Member extends Person{

    private String dateInscription;
    private String TypePers;
    private int nbEmprunts;

    
    public Member(){
        super(null, null, null, null, null, null, null);
        this.dateInscription = null;
        this.TypePers = "member";
    }

     public Member(String idPersonne, String nom, String prenom, String dateN, String adresse, String phone, String email, String dateInscription){
        super(idPersonne, nom, prenom, dateN, adresse, phone, email);
        this.dateInscription = dateInscription;
        this.TypePers = "member";
        }
     public Member(String idPersonne, String nom, String prenom, String dateN, String adresse, String phone, String email, String dateInscription, int nbEmprunts){
        super(idPersonne, nom, prenom, dateN, adresse, phone, email);
        this.dateInscription = dateInscription;
        this.nbEmprunts = nbEmprunts;
        this.TypePers = "member";
        }

        
        public String getDateInscription() {
            return dateInscription;
        }

        public void setDateInscription(String dateInscription) {
            this.dateInscription = dateInscription;
        }

        public String getTypePers() {
            return TypePers;
        }

        public void setTypePers(String TypePers) {
            this.TypePers = TypePers;
        }
        public int getNbEmprunts() {
            return nbEmprunts;
        }

}
