package view;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.*;

import controller.PersonController;
import main.Login;
import main.MainFrame;
import model.Member;

public class MemberManagmntPanel extends JPanel{
 
    public MemberManagmntPanel() {
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
           addmemberbtn = new javax.swing.JLabel();
           deletemember = new javax.swing.JLabel();
           editmember = new javax.swing.JLabel();
   
           setBackground(new java.awt.Color(255, 255, 255));
           setPreferredSize(new java.awt.Dimension(750, 650));
   
           jLabel1.setBackground(new java.awt.Color(255, 255, 255));
           jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
           jLabel1.setForeground(new java.awt.Color(31, 164, 173));
           jLabel1.setText("MEMBER MANAGMENT");
   
           jLabel2.setBackground(new java.awt.Color(31, 164, 173));
           jLabel2.setForeground(new java.awt.Color(31, 164, 173));
           jLabel2.setText("____________________________________________________________________________________________");
   
           jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
           jLabel3.setForeground(new java.awt.Color(51, 51, 51));
           jLabel3.setText("Search member");
           jLabel3.setMaximumSize(new java.awt.Dimension(148, 30));
           jLabel3.setPreferredSize(new java.awt.Dimension(148, 30));
   
   
           SortingComboBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
           SortingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sort by : ", "Name (A-Z) ", "Name (Z-A)", "Recently joined", "Most Active" }));
       
   
           table.setPreferredSize(new java.awt.Dimension(690, 200));
           jScrollPane1.setViewportView(table);
   
           addmemberbtn.setBackground(new java.awt.Color(31, 164, 173));
           addmemberbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           addmemberbtn.setForeground(new java.awt.Color(255, 255, 255));
           addmemberbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           addmemberbtn.setText("Add Member");
           addmemberbtn.setOpaque(true);
           addmemberbtn.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                PersonController memberController = new PersonController(MainFrame.addMemberPanel);
                MainFrame.addMemberPanel.getaddMemberbtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (MainFrame.addMemberPanel.getaddMemberbtn().getText()== "Add Member"){
                        int result =  memberController.addMember();
                        if (result == 0) {memberController.emptyFields();
                         JOptionPane.showMessageDialog(MemberManagmntPanel.this, 
                    "Member added successfully", 
                      "Success",JOptionPane.INFORMATION_MESSAGE);
                        MainFrame.setCardPanel("memberManagmnt");
                        Member [] members = memberController.getMembersByNameASC();
                        table.setModel(memberController.getMemberModel(members));}
                    }
                super.mouseClicked(e);
             }
           });
                MainFrame.addMemberPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                      MainFrame.setCardPanel("memberManagmnt");
                      super.mouseClicked(e);
                  }
               }); 
                MainFrame.addMemberPanel.getTitlelb().setText("Add Member");
                MainFrame.addMemberPanel.getaddMemberbtn().setText("Add Member");
                MainFrame.setCardPanel("addMemberPanel");
                super.mouseClicked(e);
             }
           });
   
           deletemember.setBackground(new java.awt.Color(242, 29, 37));
           deletemember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           deletemember.setForeground(new java.awt.Color(255, 255, 255));
           deletemember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           deletemember.setText("Delete Member");
           deletemember.setOpaque(true);
           deletemember.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
               int selectedRow = table.getSelectedRow();
               String idPersonne = (String)table.getValueAt(selectedRow, 0);
               Member member = PersonController.getMemberFromDB(idPersonne);
               PersonController memberController = new PersonController(member, MainFrame.addMemberPanel);
               int answer = JOptionPane.showConfirmDialog(MemberManagmntPanel.this, "Are you sure you wanna get rid of this loyal member?");
               if (answer == JOptionPane.YES_OPTION) {
                    int result =  memberController.deleteMember();
                    if (result == 0) JOptionPane.showMessageDialog(MemberManagmntPanel.this, 
                    "Member deleted successfully", 
                    "Success",JOptionPane.INFORMATION_MESSAGE);
                    Member [] members = memberController.getMembersByNameASC();
                    table.setModel(memberController.getMemberModel(members));}
             }
           });
   
           editmember.setBackground(new java.awt.Color(253, 103, 47));
           editmember.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           editmember.setForeground(new java.awt.Color(255, 255, 255));
           editmember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           editmember.setText("Edit Member");
           editmember.setOpaque(true);
           editmember.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
               int selectedRow = table.getSelectedRow();
               if(selectedRow != -1){
               String idPersonne = (String)table.getValueAt(selectedRow, 0);
               Member member = PersonController.getMemberFromDB(idPersonne);
              
               MainFrame.addMemberPanel.getTitlelb().setText("Edit Member");
               MainFrame.addMemberPanel.getaddMemberbtn().setText("Edit Member");
               MainFrame.addMemberPanel.getFnametf().setText(member.getPrenom());
               MainFrame.addMemberPanel.getLnametf().setText(member.getNom());
               MainFrame.addMemberPanel.getYearcb().setSelectedItem(""+member.getDateN().charAt(0)+member.getDateN().charAt(1)+member.getDateN().charAt(2)+member.getDateN().charAt(3));
               MainFrame.addMemberPanel.getMonthcb().setSelectedIndex(Integer.parseInt(""+member.getDateN().charAt(5)+member.getDateN().charAt(6)) - 1);
               MainFrame.addMemberPanel.getDaycb().setSelectedItem(""+member.getDateN().charAt(8)+member.getDateN().charAt(9));
               MainFrame.addMemberPanel.getAddresstf().setText(member.getAdresse());
               MainFrame.addMemberPanel.getEmailtf().setText(member.getEmail());
               MainFrame.addMemberPanel.getPhonetf().setText(member.getPhone());
               PersonController memberController = new PersonController(member, MainFrame.addMemberPanel);
               MainFrame.addMemberPanel.getaddMemberbtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (MainFrame.addMemberPanel.getaddMemberbtn().getText()== "Edit Member"){
                        int result =  memberController.editMember();
                        if (result == 0) memberController.emptyFields();
                         JOptionPane.showMessageDialog(MemberManagmntPanel.this, 
                    "Member infos updated successfully", 
                    "Success",JOptionPane.INFORMATION_MESSAGE);
                        MainFrame.setCardPanel("memberManagmnt");
                        Member [] members = memberController.getMembersByNameASC();
                        table.setModel(memberController.getMemberModel(members));
                    }
                    super.mouseClicked(e);
             }
           });
               MainFrame.addMemberPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                      MainFrame.setCardPanel("memberManagmnt");
                      super.mouseClicked(e);
                  }
               });
               MainFrame.setCardPanel("addMemberPanel");
                 super.mouseClicked(e);
                }else{
                    JOptionPane.showMessageDialog(MemberManagmntPanel.this, 
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
                           .addComponent(deletemember, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(editmember, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(42, 42, 42)
                           .addComponent(addmemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
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
   
           layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addmemberbtn, deletemember, editmember});
   
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
                       .addComponent(addmemberbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(deletemember, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(editmember, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addContainerGap(175, Short.MAX_VALUE))
           );
   
           layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addmemberbtn, deletemember, editmember});
   
       }                                             
   
   
       // Variables declaration - do not modify                     
       private javax.swing.JComboBox SortingComboBox;
       private javax.swing.JLabel addmemberbtn;
       private javax.swing.JLabel deletemember;
       private javax.swing.JLabel editmember;
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
        return  addmemberbtn;
    }
}