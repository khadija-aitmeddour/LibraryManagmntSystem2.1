package view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;

public class DashboardAdmin extends JPanel {
    
   
    public DashboardAdmin() {
        initComponents();
    }

                           
     @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addBook = new javax.swing.JLabel();
        deleteBook = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sanction = new javax.swing.JLabel();
        addmember = new javax.swing.JLabel();
        adduser1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 164, 173));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("welcome back Boss!");
        jLabel1.setPreferredSize(new java.awt.Dimension(750, 50));
        add(jLabel1);
        jLabel1.setBounds(0, 70, 750, 50);

        jLabel2.setFont(new java.awt.Font("Monospaced", 0, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("What do you want to do?");
        jLabel2.setMaximumSize(new java.awt.Dimension(148, 30));
        jLabel2.setPreferredSize(new java.awt.Dimension(148, 30));
        add(jLabel2);
        jLabel2.setBounds(0, 170, 750, 30);

        addBook.setBackground(new java.awt.Color(255, 255, 255));
        addBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addBook.setForeground(new java.awt.Color(51, 51, 51));
        addBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addBook.setText("Add Book");
        addBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 164, 173), 2, true));
        addBook.setOpaque(true);
        addBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addBookMouseExited(evt);
            }
        });
        add(addBook);
        addBook.setBounds(120, 330, 500, 35);

        deleteBook.setBackground(new java.awt.Color(255, 255, 255));
        deleteBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        deleteBook.setForeground(new java.awt.Color(51, 51, 51));
        deleteBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        deleteBook.setText("Delete Book");
        deleteBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 103, 47), 2, true));
        deleteBook.setOpaque(true);
        deleteBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                deleteBookMouseEntered(evt);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                deleteBookMouseExited(e);
                super.mouseExited(e);
            }
        });
        add(deleteBook);
        deleteBook.setBounds(120, 390, 500, 35);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(31, 164, 173));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("______________________________________________________________________________________");
        jLabel3.setToolTipText("");
        add(jLabel3);
        jLabel3.setBounds(0, 100, 750, 30);

        sanction.setBackground(new java.awt.Color(253, 103, 47));
        sanction.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        sanction.setForeground(new java.awt.Color(255, 255, 255));
        sanction.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        sanction.setText("Delete Member");
        sanction.setOpaque(true);
        sanction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sanctionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sanctionMouseExited(evt);
            }
        });
        add(sanction);
        sanction.setBounds(120, 450, 500, 35);

        addmember.setBackground(new java.awt.Color(31, 164, 173));
        addmember.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addmember.setForeground(new java.awt.Color(255, 255, 255));
        addmember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addmember.setText("Add Member");
        addmember.setOpaque(true);
        addmember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addmemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addmemberMouseExited(evt);
            }
        });
        add(addmember);
        addmember.setBounds(120, 270, 500, 35);

        adduser1.setBackground(new java.awt.Color(31, 164, 173));
        adduser1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        adduser1.setForeground(new java.awt.Color(255, 255, 255));
        adduser1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adduser1.setText("Add User");
        adduser1.setOpaque(true);
        adduser1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                adduser1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                adduser1MouseExited(evt);
            }
        });
        add(adduser1);
        adduser1.setBounds(120, 210, 500, 35);
    }// </editor-fold>                        

    private void addBookMouseEntered(java.awt.event.MouseEvent evt) {                                     
        addBook.setBackground(new Color(71,204,213));
        addBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71,204,213), 2, true));
        addBook.setForeground(new Color(255,255,255));
    }                                    

    private void addBookMouseExited(java.awt.event.MouseEvent evt) {                                    
        addBook.setBackground(new Color(255,255,255));
        addBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31,164,173), 2, true));
        addBook.setForeground(new Color(0,0,0));
    }                                   

    private void deleteBookMouseEntered(java.awt.event.MouseEvent evt) {                                        
        deleteBook.setBackground(Color.decode("#F21D25"));
        deleteBook.setBorder(new javax.swing.border.LineBorder(Color.decode("#F21D25"), 2, true));
        deleteBook.setForeground(new Color(255,255,255));
    }                                       
    private void deleteBookMouseExited(java.awt.event.MouseEvent evt) {                                        
        deleteBook.setBackground(Color.decode("#FFFFFF"));
        deleteBook.setBorder(new javax.swing.border.LineBorder(new Color(253, 103, 47), 2, true));
        deleteBook.setForeground(new Color(0,0,0));
    }                                       

    private void addmemberMouseEntered(java.awt.event.MouseEvent evt) {                                       
        addmember.setBackground(new Color(71,204,213));
    }                                      

    private void addmemberMouseExited(java.awt.event.MouseEvent evt) {                                      
        addmember.setBackground(new Color(31,164,173));
    }                                     

    private void adduser1MouseEntered(java.awt.event.MouseEvent evt) {                                      
        adduser1.setBackground(new Color(71,204,213));
    }                                     

    private void adduser1MouseExited(java.awt.event.MouseEvent evt) {                                     
       adduser1.setBackground(new Color(31,164,173));
    }                 

    private void sanctionMouseEntered(java.awt.event.MouseEvent evt) {                                       
        sanction.setBackground(Color.decode("#F21D25"));
    
    } 
    private void sanctionMouseExited(java.awt.event.MouseEvent evt) {                                    
        sanction.setBackground(new Color(253,103,47));
    }

    // Variables declaration - do not modify                     
    private javax.swing.JLabel addBook;
    private javax.swing.JLabel addmember;
    private javax.swing.JLabel adduser1;
    private javax.swing.JLabel deleteBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel sanction;
    // End of variables declaration 
    
     
    public JLabel getAddUser(){
        return this.adduser1;
    }
    public JLabel getAddMember(){
        return this.addmember;
    }
    public JLabel getAddBook(){
        return this.addBook;
    }
    public JLabel getDeleteBook(){
        return this.deleteBook;
    }
    public JLabel getDeleteMember(){
        return this.sanction;
    }

}
