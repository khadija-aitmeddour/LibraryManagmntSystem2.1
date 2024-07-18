package view;

import javax.swing.*;
import java.awt.*;

public class Dashboard extends JPanel {
    private String name;
   
    public Dashboard(String name) {
        this.name = name;
        initComponents();
    }

                           
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addBook = new javax.swing.JLabel();
        returnBook = new javax.swing.JLabel();
        addMember = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        sanction = new javax.swing.JLabel();
        issueBook = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 164, 173));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("welcome back " +name+"!");
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
        addBook.setBounds(110, 270, 530, 35);

        returnBook.setBackground(new java.awt.Color(255, 255, 255));
        returnBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        returnBook.setForeground(new java.awt.Color(51, 51, 51));
        returnBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        returnBook.setText("Return Book");
        returnBook.setBorder(new javax.swing.border.LineBorder(Color.decode("#F5B642"), 2, true));
         returnBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                returnBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                returnBookMouseExited(evt);
            }
        });
        returnBook.setOpaque(true);
        add(returnBook);
        returnBook.setBounds(110, 390, 530, 35);

        addMember.setBackground(new java.awt.Color(31, 164, 173));
        addMember.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        addMember.setForeground(new java.awt.Color(255, 255, 255));
        addMember.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addMember.setText("Add Member");
        addMember.setOpaque(true);
        addMember.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addMemberMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addMemberMouseExited(evt);
            }
        });
        add(addMember);
        addMember.setBounds(110, 210, 530, 35);

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
        //sanction.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(253, 103, 47), 2, true));
        sanction.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                sanctionMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                sanctionMouseExited(evt);
            }


        });
        sanction.setOpaque(true);
        add(sanction);
        sanction.setBounds(110, 450, 530, 35);

        issueBook.setBackground(new java.awt.Color(255, 255, 255));
        issueBook.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        issueBook.setForeground(new java.awt.Color(51, 51, 51));
        issueBook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        issueBook.setText("Issue Book");
        issueBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 164, 173), 2, true));
        issueBook.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                issueBookMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                issueBookMouseExited(evt);
            }


        });
        issueBook.setOpaque(true);
        add(issueBook);
        issueBook.setBounds(110, 330, 530, 35);
    }// </editor-fold>                        

    private void addMemberMouseEntered(java.awt.event.MouseEvent evt) {                                       
        addMember.setBackground(new Color(71,204,213));
    }                                      

    private void addMemberMouseExited(java.awt.event.MouseEvent evt) {                                      
        addMember.setBackground(new Color(31,164,173));
    }                                     

    private void addBookMouseEntered(java.awt.event.MouseEvent evt) {                                     
        addBook.setBackground(new Color(71,204,213));
        addBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71,204,213), 2, true));
        addBook.setForeground(new Color(255,255,255));
    }                                    

    private void addBookMouseExited(java.awt.event.MouseEvent evt) {                                    
        addBook.setBackground(new Color(255,255,255));
        addBook.setForeground(new Color(0,0,0));
        addBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 164, 173), 2, true));
    }                                   
    private void issueBookMouseEntered(java.awt.event.MouseEvent evt) {                                       
        issueBook.setBackground(new Color(71,204,213));
        issueBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(71,204,213), 2, true));
        issueBook.setForeground(new Color(255,255,255));
    } 
    private void issueBookMouseExited(java.awt.event.MouseEvent evt) {                                    
        issueBook.setBackground(new Color(255,255,255));
        issueBook.setForeground(new Color(0,0,0));
        issueBook.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(31, 164, 173), 2, true));
    }     
    private void returnBookMouseEntered(java.awt.event.MouseEvent evt) {                                       
        returnBook.setBackground(Color.decode("#F5B642"));
        returnBook.setBorder(new javax.swing.border.LineBorder(Color.decode("#F5B642"), 2, true));
        returnBook.setForeground(new Color(255,255,255));
    } 
    private void returnBookMouseExited(java.awt.event.MouseEvent evt) {                                    
        returnBook.setBackground(new Color(255,255,255));
        returnBook.setForeground(new Color(0,0,0));
        
    }     
    private void sanctionMouseEntered(java.awt.event.MouseEvent evt) {                                       
        sanction.setBackground(Color.decode("#F21D25"));
        
    } 
    private void sanctionMouseExited(java.awt.event.MouseEvent evt) {                                    
        sanction.setBackground(new Color(253,103,47));
        
        
    }     


    // Variables declaration - do not modify                     
    private javax.swing.JLabel addBook;
    private javax.swing.JLabel addMember;
    private javax.swing.JLabel issueBook;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel returnBook;
    private javax.swing.JLabel sanction;
    // End of variables declaration      
    
    public JLabel getAddBook(){
        return this.addBook;
    }
    public JLabel getAddMember(){
        return this.addMember;
    }
    public JLabel getDeleteMember(){
        return this.sanction;
    }
    public JLabel getIssueBook(){
        return this.issueBook;
    }
    public JLabel getReturnBook(){
        return this.returnBook;
    }

}

