package controller;

import java.sql.*;

import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import model.Book;
import model.IssueBook;
import model.Member;
import view.AddBookPanel;
import view.IssueBookPanel;
import view.ReturnBookPanel;


public class BookController {
    
    private Book book;
    private AddBookPanel bookView;

    private IssueBook IssueBook;
    private IssueBookPanel issueBookPanel;

    private ReturnBookPanel returnBookPanel;
    
    private final static String URL = "jdbc:mysql://localhost:3306/library";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "";
    conn conneC= new conn();
    public BookController(AddBookPanel bookView ){
        
        this.bookView = bookView;
    }
    public BookController(Book book, AddBookPanel bookView ){
        this.book = book;
        this.bookView = bookView;
    }
    public BookController(IssueBook issueBook, IssueBookPanel issueBookPanel){
        this.IssueBook = issueBook;
        this.issueBookPanel = issueBookPanel;
    }
    public BookController(ReturnBookPanel returnBookPanel){
        this.returnBookPanel = returnBookPanel;
    }
    
    // book model setters and getters 
    public String getBookIsbn() {
        return book.getIsbn();
    }

   
    public void setBookIsbn(String isbn) {
        book.setIsbn(isbn);
    }

  
    public String getBookTitre() {
        return book.getTitre();
    }

   
    public void setBookTitre(String titre) {
       book.setTitre(titre);
    }

    public int getBookAnneePub() {
        return book.getAnneePub();
    }

    
    public void setBookAnneePub(int AnneePub) {
        book.setAnneePub(AnneePub);
    }

    
    public int getBookNbPages() {
        return book.getNbPages();
    }

    public void setBookNbPages(int nbPages) {
       book.setNbPages(nbPages);
    }

   
    public int getBookIdSection() {
        return book.getIdSection();
    }

    
    public void setBookIdSection(int idSection) {
        book.setIdSection(idSection);
    }

    
    public String getBookNomAuteur() {
        return book.getNomAuteur();
    }

  
    public void setBookNomAuteur(String nomAuteur) {
       book.setNomAuteur(nomAuteur);
    }

    public int getBookNbExmpls() {
        return book.getNbExmpls();
    }

    public void setBookNbExmpls(int nbExmpls) {
        book.setNbExmpls(nbExmpls);
    }
    //getters AddbookPanel
    
    public String getBookAuthortf() {
        return bookView.getAuthortf().getText();
    }

    
    public String getBookIsbntf() {
        return bookView.getIsbntf().getText();
    }
    
    public String getBookTitletf() {
        return bookView.getTitletf().getText();
    }

    public int getBookYeartf() {
        return Integer.parseInt(bookView.getYeartf().getText());
    }


    public String getBookEditortf() {
        return getBookEditortf();
    }
    
    public int getBookPagetf() {
        return Integer.parseInt(bookView.getPagetf().getText());
    }
    //issueBookPanel getters
    public String getIssueBookIsbn(){
        return issueBookPanel.getIsbntf().getText();
    }
    public String getIssueBookMemberId(){
        return issueBookPanel.getMemberIdtf().getText();
    }
    public int getIssueBookDeadLine(){
        return Integer.parseInt(issueBookPanel.getDeadlinetf().getText());
    }
    //returnBookPanel getters
    public String getReturnBookIsbn(){
        return returnBookPanel.getIsbntf().getText();
    }
    public String getReturnBookMemberId(){
        return returnBookPanel.getMemberIdtf().getText();
    }

    // empty fields for addBookPanel
    public void emptyFields(){
        bookView.getIsbntf().setText("");
        bookView.getTitletf().setText("");
        bookView.getPagetf().setText("");
        bookView.getAuthortf().setText("");
        bookView.getEditortf().setText("");
        bookView.getYeartf().setText("");
   
        bookView.getDivcb().setSelectedIndex(0);
        bookView.getSubDivcb().setModel( new DefaultComboBoxModel());
        bookView.getSectioncb().setModel( new DefaultComboBoxModel());
       
    }
    // empty fields for issueBookPanel
    public void emptyIssueBookFields(){
        issueBookPanel.getIsbntf().setText("");
        issueBookPanel.getMemberIdtf().setText("");
        issueBookPanel.getDeadlinetf().setText("");
       
    }
    // empty fields for returnBookPanel
    public void emptyReturnBookFields(){
        returnBookPanel.getIsbntf().setText("");
        returnBookPanel.getMemberIdtf().setText(""); 
       
    }

    public void getBookFromTf(){
        book.setIsbn(getBookIsbntf());
        book.setTitre(getBookTitletf());
        book.setAnneePub(getBookAnneePub());
        book.setNbPages(getBookNbPages());
        book.setIdSection(getBookIdSection());
        book.setNomAuteur(getBookNomAuteur());
        book.setNbExmpls(getBookNbExmpls());
    }

    public int AddBook(){
        
        String query = "INSERT INTO livre (isbn, titre, AnneePub, nbPages, idSection, nomAuteur, nomEditeur, nbExmplrs, dateAjout) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
       
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, getBookIsbntf());
        conn.setStringValue(preparedStatement, 2,  getBookTitletf());
        conn.setIntValue(preparedStatement, 3, getBookYeartf());
        conn.setIntValue(preparedStatement, 4, getBookPagetf());
        conn.setIntValue(preparedStatement, 5, 0);
        conn.setStringValue(preparedStatement, 6, getBookAuthortf());
        conn.setStringValue(preparedStatement, 7, "unknown");
        conn.setIntValue(preparedStatement, 8, 0);
        conn.setStringValue(preparedStatement, 9, conn.getDate(0));
        int returnValue = conn.executeUpdate(preparedStatement);  
        conn.closeStatmnt(preparedStatement);
        if (returnValue == 0) return 0;
        else return -1;
      
        }
    public int editBook(){
    
        String query = "UPDATE livre SET titre= ?,AnneePub=?,nbPages=?,idSection=?,nomAuteur=?, nomEditeur=? WHERE isbn=?";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1,  getBookTitletf());
        conn.setIntValue(preparedStatement, 2, getBookYeartf());
        conn.setIntValue(preparedStatement, 3, getBookPagetf());
        conn.setIntValue(preparedStatement, 4, book.getIdSection());
        conn.setStringValue(preparedStatement, 5, getBookAuthortf());
        conn.setStringValue(preparedStatement, 6, "unknown");
        conn.setStringValue(preparedStatement, 7, getBookIsbntf());
        int returnValue = conn.executeUpdate(preparedStatement);  
        conn.closeStatmnt(preparedStatement);
        if (returnValue == 0) return 0;
        else return -1;
      
        }

    public int deleteBook(){
       
            String query = "DELETE FROM livre WHERE isbn=?";
            PreparedStatement preparedStatement = conn.getConn(query);
         
            conn.setStringValue(preparedStatement, 1, book.getIsbn());
      
            int returnValue = conn.executeUpdate(preparedStatement);  
            conn.closeStatmnt(preparedStatement);
            if (returnValue == 0) return 0;
            else return -1;
        
    }    

    public void searchBookByIsbn(){
        
        try{
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "SELECT r.numRayon, e.libelle, niveau FROM rayon r, etagere e, ranger rg, livre l WHERE e.idEtagere = rg.idEtagere and r.idRayon = e.idRayon and l.isbn = ?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, getBookIsbn());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
                int numRayon = resultSet.getInt("numRayon");
                String lib = resultSet.getString("libelle");
                int etage = resultSet.getInt("niveau");

                System.out.println("Le livre se trouve dans le rayon N° " + numRayon +" Etagère "+ lib + " niveau "+ etage);
            }else System.out.println("Livre introuvable");

        }
        catch(SQLException e){
            e.printStackTrace();
        }

    }
    

    public static String [] getClasses(){
        String [] classes = new String[10];
        
            String query = "SELECT nomClass FROM class";

            PreparedStatement preparedStatement = conn.getConn(query);
            ResultSet resultSet = conn.executeQuery(preparedStatement);
            int i = 0;
           
            while (conn.nextResultSet(resultSet)){
                classes[i] = conn.getStringResultSet(resultSet,"nomClass");
                i++;  
            }
        
        return classes;
    }
    
    public static String [] getDivisions(int idClass){
        String [] divs = new String[10];
    
            
            String query = "SELECT nomDiv FROM division where idClass = ?";
            
            PreparedStatement preparedStatement = conn.getConn(query);
            conn.setIntValue(preparedStatement, 1, idClass);
            ResultSet resultSet = conn.executeQuery(preparedStatement);
            int i = 0;
            while (conn.nextResultSet(resultSet)){
                divs[i] = conn.getStringResultSet(resultSet, "nomDiv");
                i++;
               
                }
            
        return divs;
    }
    public static int getIdDivition(int idSection){
        int idDiv = 0;
        String query = "SELECT idDiv FROM section WHERE idSection = ?";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setIntValue(preparedStatement, 1, idSection);
        
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        if(conn.nextResultSet(resultSet)){
            idDiv = conn.getIntResultSet(resultSet, "idDiv");
        }
        conn.closeStatmnt(preparedStatement);
        return idDiv;
    }

    public static int getIdClass(int idDiv){
        int idClass = 0;
        String query = "SELECT idClass FROM division WHERE idDiv = ?";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setIntValue(preparedStatement, 1, idDiv);
        
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        if(conn.nextResultSet(resultSet)){
            idClass = conn.getIntResultSet(resultSet, "idClass");
        }
        conn.closeStatmnt(preparedStatement);
        return idClass;
    }
    public static String [] getSections(int idDiv){
        String [] sections = new String[10];
        
        try{
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            
            String query = "SELECT nomSection FROM section where idDiv = ?";
            
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setInt(1, idDiv);
            ResultSet resultSet = preparedStatement.executeQuery();
            int i = 0;
            while (resultSet.next()){
                sections[i] = resultSet.getString("nomSection");
                i++;
               
                }
            }
        catch(SQLException e){
            e.printStackTrace();
            }
        
        return sections;
    }

   //issue book method
   public static boolean isBookInDB(String isbn){
    boolean exist = false;
       try{
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "select titre from livre where isbn =?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, isbn);
           
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                String titre = resultSet.getString("titre");
                if(titre != null) exist = true;
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return exist;
    }
   public static Book getBookFromDB(String isbn){
      Book book = null;
       try{
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "select * from livre where isbn =?";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            preparedStatement.setString(1, isbn);
           
            ResultSet resultSet = preparedStatement.executeQuery();

            if(resultSet.next()){
                String titre = resultSet.getString("titre");
                int AnneePub = resultSet.getInt("AnneePub");
                int nbPages = resultSet.getInt("nbPages");
                int idSection = resultSet.getInt("idSection");
                int nbExmplrs = resultSet.getInt("nbExmplrs");
                String nomAuteur = resultSet.getString("nomAuteur");
                String nomEditeur = resultSet.getString("nomEditeur");
                String dateAjout = resultSet.getString("dateAjout");
                
                book = new Book(isbn, titre, AnneePub, nbPages, idSection, nomAuteur, nomEditeur, nbExmplrs, dateAjout);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
        return book;
    }

    public int issueBook(){
        if(getIssueBookIsbn().equals("") || getIssueBookMemberId().equals("") || issueBookPanel.getDeadlinetf().getText().equals("")) return -6;
        book = getBookFromDB(getIssueBookIsbn());
        if(book== null) return -1;
        System.out.println(getIssueBookMemberId());
        if(!(PersonController.isMemberInDB(getIssueBookMemberId()))) return -2;
        if(getIssueBookDeadLine() < 0) return -4;
        if(getIssueBookDeadLine() == 0) return -5;
        
        String query = "INSERT INTO emprunter (isbn, idPers, dateEmprunt, delaiRetour) VALUES (?, ?, ?, ?)";
        String query2 = "UPDATE livre SET nbExmplrs = ? WHERE livre.isbn = ?";

        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, getIssueBookIsbn());
        conn.setStringValue(preparedStatement, 2, getIssueBookMemberId());
        conn.setStringValue(preparedStatement, 3, conn.getDate(0));
        conn.setStringValue(preparedStatement, 4, conn.getDate(getIssueBookDeadLine()));
        int result = conn.executeUpdate(preparedStatement);
        conn.closeStatmnt(preparedStatement);
        if (result == 0){
        PreparedStatement preparedStatement2 = conn.getConn(query2);
        conn.setStringValue(preparedStatement2, 2, book.getIsbn());
        conn.setIntValue(preparedStatement2, 1, book.getNbExmpls() - 1);
        conn.executeUpdate(preparedStatement2);
        conn.closeStatmnt(preparedStatement2);
        }else return -3;
        return 0;
    }
    
    public static boolean isIssuedTo(String isbn, String memberID){
        
        String query = "select idPers from emprunter where isbn = ? and idPers=?";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, isbn);
        conn.setStringValue(preparedStatement, 2, memberID);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        if(conn.nextResultSet(resultSet)){
           if (conn.getStringResultSet(resultSet, "idPers") != null) return true;
                
        }
        return false;
    }

    public int returnBook(){
      if(!isIssuedTo(getReturnBookIsbn(), getReturnBookMemberId())) return -1 ;
      if (getBookFromDB(getReturnBookIsbn()) == null) return -2;
      if(!(PersonController.isMemberInDB(getReturnBookMemberId()))) return -3;

       String addquery = "INSERT INTO retourner (isbn, idPers, dateRetour) VALUES (?, ?, ?)";
       PreparedStatement preparedStatement1 = conn.getConn(addquery);
       conn.setStringValue(preparedStatement1, 1, getReturnBookIsbn());
       conn.setStringValue(preparedStatement1, 2, getReturnBookMemberId());
       conn.setStringValue(preparedStatement1, 3, conn.getDate(0));
       conn.executeUpdate(preparedStatement1);
       conn.closeStatmnt(preparedStatement1);
       
       String remquery = "Delete from emprunter where isbn = ? and idPers = ?";
       PreparedStatement preparedStatement2 = conn.getConn(remquery);
       conn.setStringValue(preparedStatement2, 1, getReturnBookIsbn());
       conn.setStringValue(preparedStatement2, 2, getReturnBookMemberId());
       conn.executeUpdate(preparedStatement2);

       conn.closeStatmnt(preparedStatement2);
     
        return 0;
   }
 
   //BookManagmntPanel controllers 
   public Book[] getBookByTitleASC(){
        Book [] books = new Book[500];
        String query = "Select * from livre Order by titre ASC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String isbn = conn.getStringResultSet(resultSet, "isbn");
            String titre = conn.getStringResultSet(resultSet, "titre");
            int anneePub = conn.getIntResultSet(resultSet, "AnneePub");
            int nbPage = conn.getIntResultSet(resultSet, "nbPages");
            int idSection = conn.getIntResultSet(resultSet, "idSection");
            String nomAuteur = conn.getStringResultSet(resultSet, "nomAuteur");
            String nomEditeur = conn.getStringResultSet(resultSet, "nomEditeur");
            int nbExemplrs = conn.getIntResultSet(resultSet, "nbExmplrs");
            String dateAjout = conn.getStringResultSet(resultSet, "dateAjout");

            Book book = new Book(isbn, titre, anneePub, nbPage, idSection, nomAuteur, nomEditeur, nbExemplrs, dateAjout);
            books[i] = book;
            i++;
        }
        return books;
    } 

    public Book[] getBookByTitleDESC(){
        Book [] books = new Book[500];
        String query = "Select * from livre Order by titre DESC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String isbn = conn.getStringResultSet(resultSet, "isbn");
            String titre = conn.getStringResultSet(resultSet, "titre");
            int anneePub = conn.getIntResultSet(resultSet, "AnneePub");
            int nbPage = conn.getIntResultSet(resultSet, "nbPages");
            int idSection = conn.getIntResultSet(resultSet, "idSection");
            String nomAuteur = conn.getStringResultSet(resultSet, "nomAuteur");
             String nomEditeur = conn.getStringResultSet(resultSet, "nomEditeur");
            int nbExemplrs = conn.getIntResultSet(resultSet, "nbExmplrs");
            String dateAjout = conn.getStringResultSet(resultSet, "dateAjout");

            Book book = new Book(isbn, titre, anneePub, nbPage, idSection, nomAuteur, nomEditeur, nbExemplrs, dateAjout);
            books[i] = book;
            i++;
        }
        return books;
    } 

    public Book[] getMostBorrowedBooks(){
        Book [] books = new Book[500];
       
        
        String query = "SELECT *, COUNT(*) from (SELECT isbn from emprunter UNION all SELECT isbn FROM retourner) as merged_col, livre l where l.isbn = merged_col.isbn GROUP by l.isbn order by count(l.isbn);";
        String query2 = "select * from livre where isbn not in (SELECT l.isbn from (SELECT isbn from emprunter UNION all SELECT isbn FROM retourner) as merged_col, livre l where l.isbn = merged_col.isbn GROUP by l.isbn order by count(l.isbn))";
        PreparedStatement preparedStatement = conn.getConn(query);
        PreparedStatement preparedStatement2 = conn.getConn(query2);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        ResultSet resultSet2 = conn.executeQuery(preparedStatement2);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String isbn = conn.getStringResultSet(resultSet, "isbn");
            String titre = conn.getStringResultSet(resultSet, "titre");
            int anneePub = conn.getIntResultSet(resultSet, "AnneePub");
            int nbPage = conn.getIntResultSet(resultSet, "nbPages");
            int idSection = conn.getIntResultSet(resultSet, "idSection");
            String nomAuteur = conn.getStringResultSet(resultSet, "nomAuteur");
             String nomEditeur = conn.getStringResultSet(resultSet, "nomEditeur");
            int nbExemplrs = conn.getIntResultSet(resultSet, "nbExmplrs");
            String dateAjout = conn.getStringResultSet(resultSet, "dateAjout");

            Book book = new Book(isbn, titre, anneePub, nbPage, idSection, nomAuteur, nomEditeur, nbExemplrs, dateAjout);
            books[i] = book;
            i++;
        }
        while(conn.nextResultSet(resultSet2)){
            String isbn = conn.getStringResultSet(resultSet2, "isbn");
            String titre = conn.getStringResultSet(resultSet2, "titre");
            int anneePub = conn.getIntResultSet(resultSet2, "AnneePub");
            int nbPage = conn.getIntResultSet(resultSet2, "nbPages");
            int idSection = conn.getIntResultSet(resultSet2, "idSection");
            String nomAuteur = conn.getStringResultSet(resultSet2, "nomAuteur");
             String nomEditeur = conn.getStringResultSet(resultSet, "nomEditeur");
            int nbExemplrs = conn.getIntResultSet(resultSet, "nbExmplrs");
            String dateAjout = conn.getStringResultSet(resultSet, "dateAjout");

            Book book = new Book(isbn, titre, anneePub, nbPage, idSection, nomAuteur, nomEditeur, nbExemplrs, dateAjout);
            books[i] = book;
            i++;
        }
        return books;
    } 
    public Book[] getRecentlyAddedBooks(){
        Book [] books = new Book[500];
        String query =  "select * from livre ORDER by dateAjout DESC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
         while(conn.nextResultSet(resultSet)){
            String isbn = conn.getStringResultSet(resultSet, "isbn");
            String titre = conn.getStringResultSet(resultSet, "titre");
            int anneePub = conn.getIntResultSet(resultSet, "AnneePub");
            int nbPage = conn.getIntResultSet(resultSet, "nbPages");
            int idSection = conn.getIntResultSet(resultSet, "idSection");
            String nomAuteur = conn.getStringResultSet(resultSet, "nomAuteur");
             String nomEditeur = conn.getStringResultSet(resultSet, "nomEditeur");
            int nbExemplrs = conn.getIntResultSet(resultSet, "nbExmplrs");
            String dateAjout = conn.getStringResultSet(resultSet, "dateAjout");

            Book book = new Book(isbn, titre, anneePub, nbPage, idSection, nomAuteur, nomEditeur, nbExemplrs, dateAjout);
            books[i] = book;
            i++;
        }
        return books;
    } 

    public Book[] searchBooks(String searchInput){
        Book [] books = new Book[500];
        
        String query =  "select * from livre where titre like ? or nomAuteur like ?";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, '%'+searchInput+'%');
        conn.setStringValue(preparedStatement, 2, '%'+searchInput+'%');
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
         while(conn.nextResultSet(resultSet)){
            String isbn = conn.getStringResultSet(resultSet, "isbn");
            String titre = conn.getStringResultSet(resultSet, "titre");
            int anneePub = conn.getIntResultSet(resultSet, "AnneePub");
            int nbPage = conn.getIntResultSet(resultSet, "nbPages");
            int idSection = conn.getIntResultSet(resultSet, "idSection");
            String nomAuteur = conn.getStringResultSet(resultSet, "nomAuteur");
             String nomEditeur = conn.getStringResultSet(resultSet, "nomEditeur");
            int nbExemplrs = conn.getIntResultSet(resultSet, "nbExmplrs");
            String dateAjout = conn.getStringResultSet(resultSet, "dateAjout");

            Book book = new Book(isbn, titre, anneePub, nbPage, idSection, nomAuteur, nomEditeur, nbExemplrs, dateAjout);
            books[i] = book;
            i++;
        }
        return books;
    } 
     
    
    public DefaultTableModel getModel(Book [] books){
     
          DefaultTableModel model = new javax.swing.table.DefaultTableModel(new Object [][] {},
                new String [] {
                    "ISBN", "Title", "Autor", "Added"
                })
           {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
           };


                int i =0;
                while(books[i] != null){
                     String isbn = books[i].getIsbn();
                     String titre =books[i].getTitre();
                     String auteur = books[i].getNomAuteur();
                     String dateAjout = books[i].getDateAjout();

                    model.addRow(new Object[]{isbn, titre, auteur, dateAjout});
                    i++;
                }
                return model;
            }
    


        }