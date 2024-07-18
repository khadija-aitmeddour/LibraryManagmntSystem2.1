package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import controller.PersonController;
import main.Login;
import main.MainFrame;
import model.Member;
import model.User;

public class UserManagmntPanel extends JPanel{
 
    public UserManagmntPanel() {
           initComponents();
       }

   
       @SuppressWarnings("unchecked")
       // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
       private void initComponents() {
   
           jLabel1 = new javax.swing.JLabel();
           jLabel2 = new javax.swing.JLabel();
           jLabel3 = new javax.swing.JLabel();
           searchtf = new javax.swing.JTextField();
           SortingComboBox = new javax.swing.JComboBox();
           jScrollPane1 = new javax.swing.JScrollPane();
           table = new javax.swing.JTable();
           adduserbtn = new javax.swing.JLabel();
           deleteuser = new javax.swing.JLabel();
           edituser = new javax.swing.JLabel();
   
           setBackground(new java.awt.Color(255, 255, 255));
           setPreferredSize(new java.awt.Dimension(750, 650));
   
           jLabel1.setBackground(new java.awt.Color(255, 255, 255));
           jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
           jLabel1.setForeground(new java.awt.Color(31, 164, 173));
           jLabel1.setText("Staff MANAGMENT");
   
           jLabel2.setBackground(new java.awt.Color(31, 164, 173));
           jLabel2.setForeground(new java.awt.Color(31, 164, 173));
           jLabel2.setText("____________________________________________________________________________________________");
   
           jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
           jLabel3.setForeground(new java.awt.Color(51, 51, 51));
           jLabel3.setText("Search member");
           jLabel3.setMaximumSize(new java.awt.Dimension(148, 30));
           jLabel3.setPreferredSize(new java.awt.Dimension(148, 30));
   
   
           SortingComboBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
           SortingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sort by : ", "Name (A-Z) ", "Name (Z-A)", "Recently joined"}));
       
   
           table.setPreferredSize(new java.awt.Dimension(690, 200));
           jScrollPane1.setViewportView(table);
   
           adduserbtn.setBackground(new java.awt.Color(31, 164, 173));
           adduserbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           adduserbtn.setForeground(new java.awt.Color(255, 255, 255));
           adduserbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           adduserbtn.setText("Add Librarian");
           adduserbtn.setOpaque(true);
           adduserbtn.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                PersonController userController = new PersonController(MainFrame.addUserPanel);
                userController.emptyUserFields();
                MainFrame.addUserPanel.getAddUserBtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (MainFrame.addUserPanel.getAddUserBtn().getText()== "Add Librarian"){
                        int result =  userController.addLibrarian();
                        if (result == 0){ 
                        userController.emptyUserFields();
                         JOptionPane.showMessageDialog(UserManagmntPanel.this, 
                    "User added successfully", 
                      "Success",JOptionPane.INFORMATION_MESSAGE);
                      MainFrame.setCardPanel("userManagmnt");
                      
                      User [] users = userController.getUsersByNameASC();
                      table.setModel(userController.getUserModel(users));
                    }
                    }
                super.mouseClicked(e);
             }
           });
                MainFrame.addUserPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                      MainFrame.setCardPanel("userManagmnt");
                      super.mouseClicked(e);
                  }
               }); 
                MainFrame.addUserPanel.getTitlelb().setText("Add Librarian");
                MainFrame.addUserPanel.getAddUserBtn().setText("Add Librarian");
                MainFrame.setCardPanel("addUserPanel");
                super.mouseClicked(e);
             }
           });
   
           deleteuser.setBackground(new java.awt.Color(242, 29, 37));
           deleteuser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           deleteuser.setForeground(new java.awt.Color(255, 255, 255));
           deleteuser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           deleteuser.setText("Delete Librarian");
           deleteuser.setOpaque(true);
           deleteuser.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
               int selectedRow = table.getSelectedRow();
               String idPersonne = (String)table.getValueAt(selectedRow, 0);
               User user = PersonController.getLibrarianFromDB(idPersonne);
               PersonController userController = new PersonController(user, MainFrame.addUserPanel);
               int answer = JOptionPane.showConfirmDialog(UserManagmntPanel.this, "Are you sure you wanna get rid of this loyal member?");
               if (answer == JOptionPane.YES_OPTION) {
                    int result =  userController.deleteLibrarian();
                    if (result == 0) JOptionPane.showMessageDialog(UserManagmntPanel.this, 
                    "Member deleted successfully", 
                    "Success",JOptionPane.INFORMATION_MESSAGE);
                    User [] users = userController.getUsersByNameASC();
                    table.setModel(userController.getUserModel(users));
                }
             }
           });
   
           edituser.setBackground(new java.awt.Color(253, 103, 47));
           edituser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           edituser.setForeground(new java.awt.Color(255, 255, 255));
           edituser.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           edituser.setText("Edit Librarian");
           edituser.setOpaque(true);
           edituser.addMouseListener(new MouseAdapter() {
              @Override
              public void mouseClicked(MouseEvent e) {
               int selectedRow = table.getSelectedRow();
               if(selectedRow != -1){
                    String idPersonne = (String)table.getValueAt(selectedRow, 0);
                    User user = PersonController.getLibrarianFromDB(idPersonne);
                    MainFrame.addUserPanel.getTitlelb().setText("Edit Librarian");
                    MainFrame.addUserPanel.getAddUserBtn().setText("Edit Librarian");
                    MainFrame.addUserPanel.getFnametf().setText(user.getPrenom());
                    MainFrame.addUserPanel.getLnametf().setText(user.getNom());
                    MainFrame.addUserPanel.getYearcb().setSelectedItem(""+user.getDateN().charAt(0)+user.getDateN().charAt(1)+user.getDateN().charAt(2)+user.getDateN().charAt(3));
                    MainFrame.addUserPanel.getMonthcb().setSelectedIndex(Integer.parseInt(""+user.getDateN().charAt(5)+user.getDateN().charAt(6)) - 1);
                    MainFrame.addUserPanel.getDaycb().setSelectedItem(""+user.getDateN().charAt(8)+user.getDateN().charAt(9));
                    MainFrame.addUserPanel.getAddresstf().setText(user.getAdresse());
                    MainFrame.addUserPanel.getEmailtf().setText(user.getEmail());
                    MainFrame.addUserPanel.getPositiontf().setText(user.getPosition());
                    MainFrame.addUserPanel.getPhonetf().setText(user.getPhone());
                    MainFrame.addUserPanel.getSalarytf().setText(""+user.getSalaire());
                    PersonController userController = new PersonController(user, MainFrame.addUserPanel);
                    MainFrame.addUserPanel.getAddUserBtn().addMouseListener(new MouseAdapter() {
                     @Override
                     public void mouseClicked(MouseEvent e) {
                        if (MainFrame.addUserPanel.getAddUserBtn().getText()== "Edit Librarian"){
                            int result =  userController.editLibrarian();
                            if (result == 0) {
                                     userController.emptyUserFields();
                                  JOptionPane.showMessageDialog(UserManagmntPanel.this, 
                                   "User infos updated successfully", 
                                     "Success",JOptionPane.INFORMATION_MESSAGE);
                                 MainFrame.setCardPanel("userManagmnt");
                                 User [] users = userController.getUsersByNameASC();
                                 table.setModel(userController.getUserModel(users));}
                                 else 
                                 JOptionPane.showMessageDialog(UserManagmntPanel.this, 
                                   "Doesn't work like this!", 
                                     "Error",JOptionPane.ERROR_MESSAGE);
                        }
                        super.mouseClicked(e);
                    }
                    });
                    MainFrame.addUserPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                    @Override
                     public void mouseClicked(MouseEvent e) {
                        MainFrame.setCardPanel("userManagmnt");
                        super.mouseClicked(e);
                    }
                    });
                    MainFrame.setCardPanel("addUserPanel");
                    super.mouseClicked(e);
               }else{
                JOptionPane.showMessageDialog(UserManagmntPanel.this, 
                                   "Please select a User", 
                                     "Error",JOptionPane.ERROR_MESSAGE);
               }
            }
            });
   
           javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
           this.setLayout(layout);
           layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                   .addGap(30, 30, 30)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                       .addGroup(layout.createSequentialGroup()
                           .addComponent(deleteuser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(edituser, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(42, 42, 42)
                           .addComponent(adduserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addGroup(layout.createSequentialGroup()
                           .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(17, 17, 17)
                           .addComponent(SortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addContainerGap(30, Short.MAX_VALUE))
           );
   
           layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {adduserbtn, deleteuser, edituser});
   
           layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                   .addGap(10, 10, 10)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                           .addGap(60, 60, 60)
                           .addComponent(jLabel2))
                       .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(22, 22, 22)
                   .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(10, 10, 10)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                       .addGroup(layout.createSequentialGroup()
                           .addGap(1, 1, 1)
                           .addComponent(searchtf, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                       .addComponent(SortingComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addGap(22, 22, 22)
                   .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                   .addGap(40, 40, 40)
                   .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                       .addComponent(adduserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(deleteuser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(edituser, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addContainerGap(175, Short.MAX_VALUE))
           );
   
           layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {adduserbtn, deleteuser, edituser});
   
       }                                             
   
   
       // Variables declaration - do not modify                     
       private javax.swing.JComboBox SortingComboBox;
       private javax.swing.JLabel adduserbtn;
       private javax.swing.JLabel deleteuser;
       private javax.swing.JLabel edituser;
       private javax.swing.JLabel jLabel1;
       private javax.swing.JLabel jLabel2;
       private javax.swing.JLabel jLabel3;
       private javax.swing.JScrollPane jScrollPane1;
       private javax.swing.JTextField searchtf;
       private javax.swing.JTable table;
       // End of variables declaration                   
   
              


    public JTable getTable(){
        return this.table;
    }
    public JComboBox getSortingComboBox(){
        return this.SortingComboBox;
    }
    public JTextField getSearchtf(){
        return this.searchtf;
    }
    public javax.swing.JLabel getAddBtn() {
        return  adduserbtn;
    }
}