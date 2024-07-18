package model;

public class Book {
    
    private String isbn;
    private String titre;
    private int AnneePub;
    private int nbPages;
    private int idSection;
    private String nomAuteur;
    private String nomEditeur;
    private int nbExmpls;
    private String dateAjout;
   
    public Book(){
        this.isbn = null;
        this.titre = null;
        this.AnneePub = 0;
        this.nbPages = 0;
        this.idSection = 0;
        this.nomAuteur =null;
        this.nomEditeur =null;
        this.nbExmpls = 0;
        this.dateAjout = null;
        }
        
    public Book(String isbn, String titre, int AnneePub, int nbPages, int idSection, String nomAuteur, String nomEditeur, int nbExmpls, String dateAjout){
        this.isbn = isbn;
        this.titre = titre;
        this.AnneePub = AnneePub;
        this.nbPages = nbPages;
        this.idSection = idSection;
        this.nomAuteur = nomAuteur;
        this.nomEditeur = nomEditeur;
        this.nbExmpls = nbExmpls;
        this.dateAjout = dateAjout;
    }
   
    public String getIsbn() {
        return isbn;
    }

   
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

  
    public String getTitre() {
        return titre;
    }

   
    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneePub() {
        return AnneePub;
    }

    
    public void setAnneePub(int AnneePub) {
        this.AnneePub = AnneePub;
    }

    
    public int getNbPages() {
        return nbPages;
    }

    public void setNbPages(int nbPages) {
        this.nbPages = nbPages;
    }

   
    public int getIdSection() {
        return idSection;
    }

    
    public void setIdSection(int idSection) {
        this.idSection = idSection;
    }

    
    public String getNomAuteur() {
        return nomAuteur;
    }

    public String getNomEditeur() {
        return nomEditeur;
    }

  
    public void setNomAuteur(String nomAuteur) {
        this.nomAuteur = nomAuteur;
    }

    public int getNbExmpls() {
        return nbExmpls;
    }

    public void setNbExmpls(int nbExmpls) {
        this.nbExmpls = nbExmpls;
    }
   
    public String getDateAjout() {
        return dateAjout;
    }
}
