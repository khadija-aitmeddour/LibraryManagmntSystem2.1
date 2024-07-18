package controller;

import org.jasypt.util.password.StrongPasswordEncryptor;
import java.security.SecureRandom;
import java.util.Base64;


import java.sql.*;
import javax.swing.ImageIcon;
import javax.swing.table.DefaultTableModel;

import model.User;
import view.AddMemberPanel;
import view.AddUserPanel;
import view.Profile;
import model.Book;
import model.Member;


public class PersonController {
    
    private Member member; 
    private User user;
    private Profile profile;
    private AddMemberPanel addMemberPanel;
    private AddUserPanel addUserPanel;
    private final static String URL = "jdbc:mysql://localhost:3306/library";
    private final static String USERNAME = "root";
    private final static String PASSWORD = "";
    
    StrongPasswordEncryptor passwordEncryptor = new StrongPasswordEncryptor();
    
    public PersonController(User user){
        this.user =user;
    }

    public PersonController(User user, Profile profile){
        this.user = user;
        this.profile = profile;
    }

    public PersonController(AddMemberPanel addMemberPanel){
        this.addMemberPanel = addMemberPanel;
    }

    public PersonController(Member member, AddMemberPanel addMemberPanel){
        this.member = member;
        this.addMemberPanel = addMemberPanel;
    }

    public PersonController(AddUserPanel addUserPanel){
        this.addUserPanel = addUserPanel;
    }
    public PersonController(User user, AddUserPanel addUserPanel){
        this.user = user;
        this.addUserPanel = addUserPanel;
    }
    
    public User getUser(){
        return this.user;
    }

    public Profile getProfile(){
        return this.profile;
    }
    public void setProfile(Profile userView){
       this.profile = userView;
    }
    //setters and getters for user
    public String getUserIdPersonne() {
        return user.getIdPersonne();
    }
    public void setUserIdPersonne(String idPersonne) {
        user.setIdPersonne(idPersonne);
    }

    public String getUserNom() {
        return user.getNom();
    }
    public void setUserNom(String nom) {
        user.setNom(nom);
    }

    public String getUserPrenom() {
        return user.getPrenom();
    } 
    public void setPrenom(String prenom) {
        user.setPrenom(prenom);;
    }
    
    public String getUserDateN() {
        return user.getDateN();
    }

    public void setUserDateN(String dateN) {
        user.setDateN(dateN);;
    }

    public String getUserAdresse() {
        return user.getAdresse();
    }
    public void setUserAdresse(String adresse) {
        user.setAdresse(adresse);;
    }

    public String getUserPhone() {
        return user.getPhone();
    }
    public void setUserPhone(String phone) {
        user.setPhone(phone);;
    }

    public String getUserEmail() {
        return user.getEmail();
    }
    public void setUserEmail(String email) {
        user.setEmail(email);;
    }
    public String getUserDateDebut() {
        return user.getDateDebut();
    }

    
    public void seUsertDateDebut(String dateDebut) {
        user.setDateDebut(dateDebut);;
    }

    
    public String getUserPosition() {
        return user.getPosition();
    }

    
    public void setUserPosition(String position) {
        user.setPosition(position);;
    }

   
    public double getUserSalaire() {
        return user.getSalaire();
    }

   
    public void setUserSalaire(double salaire) {
         user.setSalaire(salaire);;
    }

    
    public String getUserTypePers() {
        return user.getTypePers();
    }

    
    public void setUserTypePers(String TypePers) {
        user.setTypePers(TypePers);;
    }
    
    public ImageIcon getUserPhoto(){
        return user.getPhoto();
    }
    
    public String getUserPwd() {
        return user.getPwd();
    }

    
    public void setUserPwd(String pwd) {
        user.setPwd(pwd);
    }
    

    //getters of addMemberPanel
   
    
    public String getMemberEmailtf() {
        return addMemberPanel.getEmailtf().getText();
    }
    public String getMemberAddresstf() {
        return addMemberPanel.getAddresstf().getText();
    }
    
    public String getMemberFnametf() {
        return addMemberPanel.getFnametf().getText();
    }

    public String getMemberLnametf() {
        return addMemberPanel.getLnametf().getText();
    }
    
    public String getMemberPhonetf() {
        return addMemberPanel.getPhonetf().getText();
    }
    public String getMemberDaycb() {
        return (String)addMemberPanel.getDaycb().getSelectedItem();
    }
    
    public int getMemberMonthcb() {
        return addMemberPanel.getMonthcb().getSelectedIndex() + 1;
    }

    public String getMemberYearcb() {
        return (String)addMemberPanel.getYearcb().getSelectedItem();
    }
    
    //getters of addMemberPanel
   
    
    public String getUserEmailtf() {
        return addUserPanel.getEmailtf().getText();
    }
    public String getUserAddresstf() {
        return addUserPanel.getAddresstf().getText();
    }
    
    public String getUserFnametf() {
        return addUserPanel.getFnametf().getText();
    }

    public String getUserLnametf() {
        return addUserPanel.getLnametf().getText();
    }
    
    public String getUserPhonetf() {
        return addUserPanel.getPhonetf().getText();
    }
    public String getUserPositiontf() {
        return addUserPanel.getPositiontf().getText();
    }
    public Double getUserSalairytf() {
        return Double.parseDouble(addUserPanel.getSalarytf().getText());
    }
    public String getUserDaycb() {
        return (String)addUserPanel.getDaycb().getSelectedItem();
    }
    
    public int getUserMonthcb() {
        return addUserPanel.getMonthcb().getSelectedIndex() + 1;
    }

    public String getUserYearcb() {
        return (String)addUserPanel.getYearcb().getSelectedItem();
    }
    
    
    /*******************************Members controllers*******************************/

    public static String numMembers(){
        int num = 0;
         try{
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "Select count(idPersonne) from personne where typePers = 'member'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
               num = resultSet.getInt("count(idPersonne)");
            }
         }catch(SQLException e){
            e.printStackTrace();
         }
         return num +1 +"";
        }
     public void emptyFields(){
        addMemberPanel.getFnametf().setText("");
        addMemberPanel.getLnametf().setText("");
        addMemberPanel.getAddresstf().setText("");
        addMemberPanel.getEmailtf().setText("");
        addMemberPanel.getPhonetf().setText("");
       
        addMemberPanel.getDaycb().setSelectedIndex(0);
        addMemberPanel.getMonthcb().setSelectedIndex(0);
        addMemberPanel.getYearcb().setSelectedIndex(0);
       
    }

       public static boolean isMemberInDB(String idMember){
        boolean exist = false;
           try{
                Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                String query = "select idPersonne from personne where idPersonne =? and typePers = 'member'";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, idMember);
               
                ResultSet resultSet = preparedStatement.executeQuery();
    
                if(resultSet.next()){
                    String returnIdmember = resultSet.getString("iDPersonne");
                    if(returnIdmember != null) exist = true;
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            return exist;
        }

    public static Member getMemberFromDB(String idPers){
      Member member = null;
      
      String query = "Select * from personne where idPersonne =?";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, idPers);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
       
        if(conn.nextResultSet(resultSet)){
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateInscrit = conn.getStringResultSet(resultSet, "dateInscrit");

            member = new Member(idPers, nom, prenom, dateN, adresse, phone, email, dateInscrit);
       
        }
        return member;
    }

    
    public int addMember(){
       
            String query = "INSERT INTO personne (idPersonne, nom, prenom, dateN, adresse, email, phone, TypePers, dateInscrit, dateDebut, position, salaire, salt, password, ProfilePic, username) VALUES (?, ?, ?, ?,?, ?, ?, ?, ?, null, null, null,null,null, null, null)";
            PreparedStatement preparedStatement = conn.getConn(query);
            conn.setStringValue(preparedStatement, 1, numMembers() + conn.getDate(0));
            conn.setStringValue(preparedStatement, 2, getMemberLnametf());
            conn.setStringValue(preparedStatement, 3, getMemberFnametf());
            conn.setStringValue(preparedStatement, 4, getMemberYearcb()+"-"+getMemberMonthcb()+"-"+getMemberDaycb());
            conn.setStringValue(preparedStatement, 5, getMemberAddresstf());
            conn.setStringValue(preparedStatement, 6, getMemberEmailtf());
            conn.setStringValue(preparedStatement, 7, getMemberPhonetf());
            conn.setStringValue(preparedStatement, 8, "member");
            conn.setStringValue(preparedStatement, 9, conn.getDate(0));
           
            int returnValue = conn.executeUpdate(preparedStatement);  
            conn.closeStatmnt(preparedStatement);
            if (returnValue == 0) return 0;
            else return -1;
        
    }

    public int editMember(){
       
            String query = "UPDATE personne SET nom = ? ,prenom= ?,dateN=?,adresse=?,email=?,phone=? WHERE idPersonne=?";
            PreparedStatement preparedStatement = conn.getConn(query);
         
            conn.setStringValue(preparedStatement, 1, getMemberLnametf());
            conn.setStringValue(preparedStatement, 2, getMemberFnametf());
            conn.setStringValue(preparedStatement, 3, getMemberYearcb()+"-"+getMemberMonthcb()+"-"+getMemberDaycb());
            conn.setStringValue(preparedStatement, 4, getMemberAddresstf());
            conn.setStringValue(preparedStatement, 5, getMemberEmailtf());
            conn.setStringValue(preparedStatement, 6, getMemberPhonetf());
            conn.setStringValue(preparedStatement, 7, member.getIdPersonne());
      
            int returnValue = conn.executeUpdate(preparedStatement);  
            conn.closeStatmnt(preparedStatement);
            if (returnValue == 0) return 0;
            else return -1;
        }

    public int deleteMember(){
       
            String query = "DELETE FROM personne WHERE idPersonne=?";
            PreparedStatement preparedStatement = conn.getConn(query);
         
            conn.setStringValue(preparedStatement, 1, member.getIdPersonne());
      
            int returnValue = conn.executeUpdate(preparedStatement);  
            conn.closeStatmnt(preparedStatement);
            if (returnValue == 0) return 0;
            else return -1;
        
    }


    public Member[] getMembersByNameASC(){
        Member [] members = new Member[500];
        String query = "Select * from personne where TypePers = 'member' Order by nom ASC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateInscrit = conn.getStringResultSet(resultSet, "dateInscrit");

            Member member = new Member(idPers, nom, prenom, dateN, dateN, phone, email, dateInscrit);
            members[i] = member;
            i++;
        }

        return members;
    } 

    public Member[] getMembersByNameDESC(){
        Member [] members = new Member[500];
        String query = "Select * from personne where TypePers = 'member' Order by nom DESC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateInscrit = conn.getStringResultSet(resultSet, "dateInscrit");

            Member member = new Member(idPers, nom, prenom, dateN, adresse, phone, email, dateInscrit);
            members[i] = member;
            i++;
        }
        return members;
    } 
    public Member[] getMostActiveMembers(){
        Member [] members = new Member[500];
        
        String query = "SELECT *, COUNT(*) from (SELECT idPers from emprunter UNION all SELECT idPers FROM retourner) as merged_col, personne p where merged_col.idPers = p.idPersonne GROUP by idPers order By count(idPers) DESC";
        //String query2 = "select * from personne where idPersonne not in(SELECT idPers from (SELECT idPers from emprunter UNION all SELECT idPers FROM retourner) as merged_col, personne p where merged_col.idPers = p.idPersonne GROUP by idPers order By count(idPers) DESC);";
        
        PreparedStatement preparedStatement = conn.getConn(query);
        //PreparedStatement preparedStatement2 = conn.getConn(query2);

        ResultSet resultSet = conn.executeQuery(preparedStatement);
        //ResultSet resultSet2 = conn.executeQuery(preparedStatement2);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateInscrit = conn.getStringResultSet(resultSet, "dateInscrit");
            int nbEmprunts = conn.getIntResultSet(resultSet, "COUNT(*)");

            Member member = new Member(idPers, nom, prenom, dateN, adresse, phone, email, dateInscrit, nbEmprunts);
            members[i] = member;
            i++;
        }
       
        /*while(conn.nextResultSet(resultSet2)){
            String idPers = conn.getStringResultSet(resultSet2, "idPersonne");
            String nom = conn.getStringResultSet(resultSet2, "nom");
            String prenom = conn.getStringResultSet(resultSet2, "prenom");
            String dateN = conn.getStringResultSet(resultSet2, "dateN");
            String adresse = conn.getStringResultSet(resultSet2, "adresse");
            String email = conn.getStringResultSet(resultSet2, "email");
            String phone = conn.getStringResultSet(resultSet2, "phone");
            String dateInscrit = conn.getStringResultSet(resultSet2, "dateInscrit");
            

            Member member = new Member(idPers, nom, prenom, dateN, adresse, phone, email, dateInscrit, 0);
            members[i] = member;
            i++;
        }*/
        return members;
    } 
    public Member[] getRecentlyJoinedMembers(){
        Member [] members = new Member[500];
        String query =  "select * from personne where TypePers= 'member' ORDER by dateInscrit DESC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateInscrit = conn.getStringResultSet(resultSet, "dateInscrit");

            Member member = new Member(idPers, nom, prenom, dateN, adresse, phone, email, dateInscrit);
            members[i] = member;
            i++;
        }
        return members;
    } 
    public Member[] searchMembers(String searchInput){
        Member [] members = new Member[500];
        String query =  "select * from personne where idPersonne in (SELECT idPersonne from personne where TypePers= 'member') and idPersonne in (SELECT idPersonne from personne where nom like ? or prenom like ?)";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, '%'+searchInput+'%');
        conn.setStringValue(preparedStatement, 2, '%'+searchInput+'%');
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateInscrit = conn.getStringResultSet(resultSet, "dateInscrit");

            Member member = new Member(idPers, nom, prenom, dateN, adresse, phone, email, dateInscrit);
            members[i] = member;
            i++;
        }
        return members;
    } 
     
    //set model for members Managmnt Panel
    public DefaultTableModel getMemberModel(Member [] members){
     
          DefaultTableModel model = new javax.swing.table.DefaultTableModel(new Object [][] {},
                new String [] {
                    "Member ID", "Name", "Email", "joined"
                })  {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false
                    };
        
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                   };
        
                int i =0;
                while(members[i] != null){
                     String idPers = members[i].getIdPersonne();
                     String nom =members[i].getNom();
                     String prenom =members[i].getPrenom();
                     String email = members[i].getEmail();
                     String date = members[i].getDateInscription();

                    model.addRow(new Object[]{idPers, nom+' '+prenom, email, date});
                    i++;
                }
                return model;
            }
    
    public DefaultTableModel getActiveMemberModel(Member [] members){
     
          DefaultTableModel model = new javax.swing.table.DefaultTableModel(new Object [][] {},
                new String [] {
                    "Member ID", "Name","joined", "nbEmprunts"
                })  {
                    boolean[] canEdit = new boolean [] {
                        false, false, false,false
                    };
        
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                   };
        
            
                int i =0;
                while(members[i] != null){
                     String idPers = members[i].getIdPersonne();
                     String nom =members[i].getNom();
                     String prenom =members[i].getPrenom();
                     
                     int nbEmprunts = members[i].getNbEmprunts();
                     String date = members[i].getDateInscription();


                    model.addRow(new Object[]{idPers, nom+' '+prenom, date, nbEmprunts});
                    i++;
                }
                return model;
            }
    
    
    
    /*******************************Libarian controllers*******************************/ 
    public static String numLibrarians(){
        int num = 0;
         try{
            Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            String query = "Select count(idPersonne) from personne where TypePers = 'librarian'";
            PreparedStatement preparedStatement = conn.prepareStatement(query);
            ResultSet resultSet = preparedStatement.executeQuery();
            if(resultSet.next()){
               num = resultSet.getInt("count(idPersonne)");
            }
         }catch(SQLException e){
            e.printStackTrace();
         }
         return num +1 +"";
        }
    
       public void emptyUserFields(){
        addUserPanel.getFnametf().setText("");
        addUserPanel.getLnametf().setText("");
        addUserPanel.getAddresstf().setText("");
        addUserPanel.getEmailtf().setText("");
        addUserPanel.getPhonetf().setText("");
        addUserPanel.getPositiontf().setText("");
        addUserPanel.getSalarytf().setText("");
        addUserPanel.getDaycb().setSelectedIndex(0);
        addUserPanel.getMonthcb().setSelectedIndex(0);
        addUserPanel.getYearcb().setSelectedIndex(0);
       
    }
       public static boolean isUserInDB(String idMember){
        boolean exist = false;
           try{
                Connection conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
                String query = "select idPersonne from personne where idPersonne =? and typePers = 'librarian'";
                PreparedStatement preparedStatement = conn.prepareStatement(query);
                preparedStatement.setString(1, idMember);
               
                ResultSet resultSet = preparedStatement.executeQuery();
    
                if(resultSet.next()){
                    String returnIdmember = resultSet.getString("iDPersonne");
                    if(returnIdmember != null) exist = true;
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            return exist;
        }
    public static User getLibrarianFromDB(String idPers){
      User user = null;
      
      String query = "Select * from personne where idPersonne =?";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, idPers);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
       
        if(conn.nextResultSet(resultSet)){
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateDebut = conn.getStringResultSet(resultSet, "dateDebut");
            String position = conn.getStringResultSet(resultSet, "position");
            Double salary = conn.getDoubleResultSet(resultSet, "salaire");
            String salt = conn.getStringResultSet(resultSet, "salt");
            String pwd = conn.getStringResultSet(resultSet, "password");
            String urlphoto = conn.getStringResultSet(resultSet, "ProfilePic");
            ImageIcon photo = new ImageIcon(urlphoto);

            user = new User(idPers, nom, prenom, dateN, adresse, phone, email, dateDebut, position, salary, salt, pwd, photo);
        }

        return user;
    } 
    
    public int addLibrarian(){
        
            String query = "INSERT INTO personne (idPersonne, nom, prenom, dateN, adresse, email, phone, TypePers, dateInscrit, dateDebut, position, salaire, salt, password, ProfilePic, username) VALUES (?, ?, ?, ?,?, ?, ?, ?, null, ?,?,?,?,?,'src\\Photos\\5.jpg', null)";
            PreparedStatement preparedStatement = conn.getConn(query);
            conn.setStringValue(preparedStatement, 1, numLibrarians() + conn.getDate(0));
            conn.setStringValue(preparedStatement, 2, getUserLnametf());
            conn.setStringValue(preparedStatement, 3, getUserFnametf());
            conn.setStringValue(preparedStatement, 4, getUserYearcb()+"-"+getUserMonthcb()+"-"+getUserDaycb());
            conn.setStringValue(preparedStatement, 5, getUserAddresstf());
            conn.setStringValue(preparedStatement, 6, getUserEmailtf());
            conn.setStringValue(preparedStatement, 7, getUserPhonetf());
            conn.setStringValue(preparedStatement, 8, "librarian");
            conn.setStringValue(preparedStatement, 9, conn.getDate(0));
            conn.setStringValue(preparedStatement, 10, getUserPositiontf());
            conn.setDoubleValue(preparedStatement, 11, getUserSalairytf());
            String salt = getSalt();
            conn.setStringValue(preparedStatement, 12, salt);
            conn.setStringValue(preparedStatement, 13, hashPassword(getUserYearcb()+salt));
           int returnValue = conn.executeUpdate(preparedStatement);  
            conn.closeStatmnt(preparedStatement);
            if (returnValue == 0) return 0;
            else return -1;
    }

    public int editLibrarian(){
       
            String query = "UPDATE personne SET nom = ? ,prenom= ?,dateN=?,adresse=?,email=?,phone=?, position=?,salaire=? WHERE idPersonne=?";
            PreparedStatement preparedStatement = conn.getConn(query);
         
            conn.setStringValue(preparedStatement, 1, getUserLnametf());
            conn.setStringValue(preparedStatement, 2, getUserFnametf());
            conn.setStringValue(preparedStatement, 3, getUserYearcb()+"-"+getUserMonthcb()+"-"+getUserDaycb());
            conn.setStringValue(preparedStatement, 4, getUserAddresstf());
            conn.setStringValue(preparedStatement, 5, getUserEmailtf());
            conn.setStringValue(preparedStatement, 6, getUserPhonetf());
            conn.setStringValue(preparedStatement, 7, getUserPositiontf());
            conn.setDoubleValue(preparedStatement, 8, getUserSalairytf());
            conn.setStringValue(preparedStatement, 9, user.getIdPersonne());
      
            int returnValue = conn.executeUpdate(preparedStatement);  
            conn.closeStatmnt(preparedStatement);
            if (returnValue == 0) return 0;
            else return -1;
        }
    public int deleteLibrarian(){
       
            String query = "DELETE FROM personne WHERE idPersonne=?";
            PreparedStatement preparedStatement = conn.getConn(query);
         
            conn.setStringValue(preparedStatement, 1, user.getIdPersonne());
      
            int returnValue = conn.executeUpdate(preparedStatement);  
            conn.closeStatmnt(preparedStatement);
            if (returnValue == 0) return 0;
            else return -1;
        
    }

     public User[] getUsersByNameASC(){
        User [] users = new User[500];
        String query = "Select * from personne where TypePers = 'librarian' Order by nom ASC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateDebut = conn.getStringResultSet(resultSet, "dateDebut");
            String position = conn.getStringResultSet(resultSet, "position");
            Double salary = conn.getDoubleResultSet(resultSet, "salaire");
            String salt = conn.getStringResultSet(resultSet, "salt");
            String pwd = conn.getStringResultSet(resultSet, "password");
            String urlphoto = conn.getStringResultSet(resultSet, "ProfilePic");
            ImageIcon photo = new ImageIcon(urlphoto);

            User user = new User(idPers, nom, prenom, dateN, adresse, phone, email, dateDebut, position, salary, salt, pwd, photo);
            users[i] = user;
            i++;
        }

        return users;
    } 
     public User[] getUsersByNameDESC(){
        User [] users = new User[500];
        String query = "Select * from personne where TypePers = 'librarian' Order by nom DESC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateDebut = conn.getStringResultSet(resultSet, "dateDebut");
            String position = conn.getStringResultSet(resultSet, "position");
            Double salary = conn.getDoubleResultSet(resultSet, "salaire");
            String salt = conn.getStringResultSet(resultSet, "salt");
            String pwd = conn.getStringResultSet(resultSet, "password");
            String urlphoto = conn.getStringResultSet(resultSet, "ProfilePic");
            ImageIcon photo = new ImageIcon(urlphoto);

            User user = new User(idPers, nom, prenom, dateN, adresse, phone, email, dateDebut, position, salary, salt, pwd, photo);
            users[i] = user;
            i++;
        }

        return users;
    } 
    
    public User[] getRecentlyJoinedUsers(){
        User [] users = new User[500];
        String query =  "select * from personne where TypePers= 'librarian' ORDER by dateDebut DESC";
        PreparedStatement preparedStatement = conn.getConn(query);
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateDebut = conn.getStringResultSet(resultSet, "dateDebut");
            String position = conn.getStringResultSet(resultSet, "position");
            Double salary = conn.getDoubleResultSet(resultSet, "salaire");
            String salt = conn.getStringResultSet(resultSet, "salt");
            String pwd = conn.getStringResultSet(resultSet, "password");
            String urlphoto = conn.getStringResultSet(resultSet, "ProfilePic");
            ImageIcon photo = new ImageIcon(urlphoto);

            User user = new User(idPers, nom, prenom, dateN, adresse, phone, email, dateDebut, position, salary, salt, pwd, photo);
            users[i] = user;
            i++;
        }
        return users;
    } 

    public User[] searchUsers(String searchInput){
        User [] users = new User[500];
        String query =  "select * from personne where idPersonne in (SELECT idPersonne from personne where TypePers= 'librarian') and idPersonne in (SELECT idPersonne from personne where nom like ? or prenom like ?)";
        PreparedStatement preparedStatement = conn.getConn(query);
        conn.setStringValue(preparedStatement, 1, '%'+searchInput+'%');
        conn.setStringValue(preparedStatement, 2, '%'+searchInput+'%');
        ResultSet resultSet = conn.executeQuery(preparedStatement);
        int i=0;
        while(conn.nextResultSet(resultSet)){
            String idPers = conn.getStringResultSet(resultSet, "idPersonne");
            String nom = conn.getStringResultSet(resultSet, "nom");
            String prenom = conn.getStringResultSet(resultSet, "prenom");
            String dateN = conn.getStringResultSet(resultSet, "dateN");
            String adresse = conn.getStringResultSet(resultSet, "adresse");
            String email = conn.getStringResultSet(resultSet, "email");
            String phone = conn.getStringResultSet(resultSet, "phone");
            String dateDebut = conn.getStringResultSet(resultSet, "dateDebut");
            String position = conn.getStringResultSet(resultSet, "position");
            Double salary = conn.getDoubleResultSet(resultSet, "salaire");
            String salt = conn.getStringResultSet(resultSet, "salt");
            String pwd = conn.getStringResultSet(resultSet, "password");
            String urlphoto = conn.getStringResultSet(resultSet, "ProfilePic");
            ImageIcon photo = new ImageIcon(urlphoto);

            User user = new User(idPers, nom, prenom, dateN, adresse, phone, email, dateDebut, position, salary, salt, pwd, photo);
            users[i] = user;
            i++;
        }
        return users;
    } 
    
    //set model for librarian Managmnt Panel
    public DefaultTableModel getUserModel(User [] users){
     
          DefaultTableModel model = new javax.swing.table.DefaultTableModel(new Object [][] {},
                new String [] {
                    "User ID", "Name", "Position", "Joined"
                })  {
                    boolean[] canEdit = new boolean [] {
                        false, false, false, false
                    };
        
                    public boolean isCellEditable(int rowIndex, int columnIndex) {
                        return canEdit [columnIndex];
                    }
                   };
        
            
                int i =0;
                while(users[i] != null){
                     String idPers = users[i].getIdPersonne();
                     String nom =users[i].getNom();
                     String prenom =users[i].getPrenom();
                     String position = users[i].getPosition();
                     String dateDebut = users[i].getDateDebut();

                    model.addRow(new Object[]{idPers, nom+' '+prenom, position, dateDebut});
                    i++;
                }
                return model;
            }

    /*******************************Login controllers*******************************/
    public int getAuthenticatedUser(){
      
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            // Connection successful, perform database operations here
            String sql = "SELECT * FROM personne p WHERE email=? or username = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, getUserEmail());
            preparedStatement.setString(2, getUserEmail());
            
            ResultSet resultSet = preparedStatement.executeQuery();
            

            if (resultSet.next()){
                
                
                String salt = resultSet.getString("salt");
                String hashedPassword = resultSet.getString("password");
                boolean passwordMatch = passwordEncryptor.checkPassword(getUserPwd()+salt, hashedPassword);
                if(!passwordMatch)return -1;
                String idPers = resultSet.getString("idPersonne");
                String typePers = resultSet.getString("TypePers");
                String nom = resultSet.getString("nom");
                String prenom = resultSet.getString("prenom");
                String dateN = resultSet.getString("dateN");
                String adresse = resultSet.getString("adresse");
                String email = resultSet.getString("email");
                String phone = resultSet.getString("phone");
                String dateDebut = resultSet.getString("dateDebut");
                String position = resultSet.getString("position");
                Double salaire = resultSet.getDouble("salaire");
                String photoUrl = resultSet.getString("ProfilePic");
                ImageIcon photo = new ImageIcon(photoUrl);
                user = new User(idPers, nom, prenom, dateN, adresse, phone, email, dateDebut, position, salaire, salt, hashedPassword, photo);
                user.setTypePers(typePers);
                displayInfoUser();
                 System.out.println(user.getTypePers());
                if (user.getTypePers().equals("librarian")) return 1;
                else if(user.getTypePers().equals("admin")) return 2;
            }
            preparedStatement.close();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
       
        }
        return -1;
    }

    public String getSalt(){
    
        SecureRandom secureRandom = new SecureRandom();
        byte[] salt = new byte[16];
        secureRandom.nextBytes(salt);

        String saltString = Base64.getEncoder().encodeToString(salt);
        return saltString;
    } 

    public String hashPassword(String saltedPassword){
          return passwordEncryptor.encryptPassword(saltedPassword);
    } 
    
    public static boolean isMatched(String enteredPwd, String realPwd){
           return new StrongPasswordEncryptor().checkPassword(enteredPwd, realPwd);
        }

    public int changePassword(String newPassword){
       String query = "UPDATE personne SET salt=? ,password= ? WHERE idPersonne=?";

       String salt = getSalt();
       String hashedpwd = hashPassword(newPassword+salt);
       PreparedStatement preparedStatement = conn.getConn(query);
       conn.setStringValue(preparedStatement, 1, salt);
       conn.setStringValue(preparedStatement, 2, hashedpwd);
       conn.setStringValue(preparedStatement, 3, user.getIdPersonne());
       int returnValue = conn.executeUpdate(preparedStatement);  
       conn.closeStatmnt(preparedStatement);
           if (returnValue == 0) return 0;
            else return -1;
    }

    public int addUsrename(String username){
       String query = "UPDATE personne SET username=? WHERE idPersonne=?";

       PreparedStatement preparedStatement = conn.getConn(query);
       conn.setStringValue(preparedStatement, 1, username);
       conn.setStringValue(preparedStatement, 2, user.getIdPersonne());
       int returnValue = conn.executeUpdate(preparedStatement);  
       conn.closeStatmnt(preparedStatement);
           if (returnValue == 0) return 0;
            else return -1;
    }


    public void displayInfoUser(){
  
        profile.setUserid(getUserIdPersonne());
        profile.setName(getUserNom()+" "+getUserPrenom());
        profile.setPosition(getUserPosition());
        profile.setEmail(getUserEmail());
        profile.setPhone(getUserPhone());
        profile.setBirthday(getUserDateN());
        profile.setPhoto(getUserPhoto());
        profile.setAddress(getUserAdresse());
        profile.setSalary(getUserSalaire());
        profile.setJoindate(getUserDateDebut());
    }

 
    
}
