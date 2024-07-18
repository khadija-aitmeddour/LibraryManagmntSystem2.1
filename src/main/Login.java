package main;
import java.awt.*;
import java.awt.event.*;


import javax.swing.*;

import com.formdev.flatlaf.FlatLightLaf;

import controller.PersonController;
import model.User;
import view.Profile;


public class Login extends JFrame {

    public Login() {
        initComponents();
        setLocationRelativeTo(null);
        hide.setVisible(false);
        
      
    }
          
    private void initComponents() {

        container = new JPanel();
        coverLabel = new JLabel();
        coverPanel = new JPanel();
        jLabel1 = new JLabel();
        jLabel2 = new JLabel();
        jLabel3 = new JLabel();
        hide = new JLabel();
        jLabel5 = new JLabel();
        jLabel6 = new JLabel();
        jLabel7 = new JLabel();
        usernametf = new JTextField();
        jLabel9 = new JLabel();
        pwdtf = new JPasswordField();
        show = new JLabel();
        loginButton = new JButton();
        jCheckBox1 = new JCheckBox();
        jLabel4 = new JLabel();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        container.setBackground(new java.awt.Color(255, 255, 255));
        container.setPreferredSize(new java.awt.Dimension(750, 400));

        coverLabel.setIcon(new ImageIcon(getClass().getResource("/icon/coverPicc.png"))); // NOI18N

        coverPanel.setBackground(new java.awt.Color(20,146,149));
        coverPanel.setAutoscrolls(true);
        coverPanel.setPreferredSize(new java.awt.Dimension(370, 370));
        coverPanel.setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel1.setText("Login");
        coverPanel.add(jLabel1);
        jLabel1.setBounds(0, 60, 370, 43);

        jLabel2.setBackground(new java.awt.Color(255, 102, 102));
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
            public void mousePressed(MouseEvent evt) {
                jLabel2MousePressed(evt);
            }
        });
        coverPanel.add(jLabel2);
        jLabel2.setBounds(331, 0, 39, 33);

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(199, 246, 250));
        jLabel3.setText("Username");
        jLabel3.setAutoscrolls(true);
        coverPanel.add(jLabel3);
        jLabel3.setBounds(50, 120, 316, 18);

        hide.setHorizontalAlignment(SwingConstants.CENTER);
        hide.setIcon(new ImageIcon(getClass().getResource("/icon/show.png"))); // NOI18N
        hide.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                hideMouseClicked(evt);
               pwdtf.setEchoChar('*');
            }
        });
        coverPanel.add(hide);
        hide.setBounds(280, 210, 41, 40);
        hide.setVisible(false);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(199, 246, 250));
        jLabel5.setText("Password");
        jLabel5.setAutoscrolls(true);
        coverPanel.add(jLabel5);
        jLabel5.setBounds(50, 190, 316, 18);

        jLabel6.setHorizontalAlignment(SwingConstants.CENTER);
        jLabel6.setIcon(new ImageIcon(getClass().getResource("/icon/8.png"))); // NOI18N
        coverPanel.add(jLabel6);
        jLabel6.setBounds(280, 140, 41, 40);

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("_____________________________________________");
        jLabel7.setAutoscrolls(true);
        coverPanel.add(jLabel7);
        jLabel7.setBounds(50, 155, 240, 20);

        usernametf.setBackground(new java.awt.Color(20,146,149));
        usernametf.setFont(usernametf.getFont());
        usernametf.setForeground(new java.awt.Color(255, 255, 255));
        usernametf.setBorder(null);
        usernametf.setCaretColor(new java.awt.Color(255, 255, 255));
        usernametf.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        usernametf.setOpaque(false);
        usernametf.setPreferredSize(new java.awt.Dimension(0, 40));
        usernametf.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                usernametfActionPerformed(evt);
            }
        });
        coverPanel.add(usernametf);
        usernametf.setBounds(50, 140, 240, 30);

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("_____________________________________________");
        jLabel9.setAutoscrolls(true);
        coverPanel.add(jLabel9);
        jLabel9.setBounds(50, 225, 240, 20);

        pwdtf.setBackground(new java.awt.Color(20,146,149));
        pwdtf.setFont(pwdtf.getFont());
        pwdtf.setForeground(new java.awt.Color(255, 255, 255));
        pwdtf.setBorder(null);
        pwdtf.setCaretColor(new java.awt.Color(255, 255, 255));
        pwdtf.setOpaque(false);
        coverPanel.add(pwdtf);
        pwdtf.setBounds(50, 210, 220, 30);

        show.setHorizontalAlignment(SwingConstants.CENTER);
        show.setIcon(new ImageIcon(getClass().getResource("/icon/hide.png"))); // NOI18N
        show.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                showMouseClicked(evt);
                pwdtf.setEchoChar((char) 0);
            }
        });
        coverPanel.add(show);
        show.setBounds(280, 210, 41, 40);
        show.setVisible(true);

        loginButton.setBackground(new java.awt.Color(255, 255, 255));
        loginButton.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        loginButton.setForeground(new java.awt.Color(20,146,149));
        loginButton.setText("Login");
        loginButton.setBorder(null);
        loginButton.setBorderPainted(false);
        coverPanel.add(loginButton);
        loginButton.setBounds(50, 310, 270, 40);
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               String email = usernametf.getText();
               String pwd = String.valueOf(pwdtf.getPassword());
               Profile profile = new Profile();
               User user = new User(email, pwd);
               personController = new PersonController(user, profile);
               int result = personController.getAuthenticatedUser();
       
               if (result != -1 && user != null){
                   if(result == 1){
                       MainFrame.setCardPanel("dashboard");
                       MainFrame mf = new MainFrame(personController.getUser(), profile, "librarian");
                      
                       dispose();
                }else if(result == 2){
                       MainFrame mf = new MainFrame(personController.getUser(), profile, "admin");
                       MainFrame.setCardPanel("dashboardAdmin");
                       dispose();
               }}else{
                JOptionPane.showMessageDialog(Login.this, 
                    "Email or password incorrect", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
                
            }
        });
        jCheckBox1.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(255, 255, 255));
        jCheckBox1.setText("remember me");
        jCheckBox1.setOpaque(false);
        jCheckBox1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jCheckBox1ActionPerformed(evt);
            }
        });
        coverPanel.add(jCheckBox1);
        jCheckBox1.setBounds(50, 260, 130, 23);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Forgot Password?");
        jLabel4.addMouseListener(new MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        coverPanel.add(jLabel4);
        jLabel4.setBounds(220, 265, 100, 15);

        GroupLayout containerLayout = new GroupLayout(container);
        container.setLayout(containerLayout);
        containerLayout.setHorizontalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(coverLabel, GroupLayout.PREFERRED_SIZE, 343, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(coverPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        containerLayout.setVerticalGroup(
            containerLayout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(containerLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(coverLabel, GroupLayout.PREFERRED_SIZE, 329, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(coverPanel, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(container, GroupLayout.DEFAULT_SIZE, 766, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(container, GroupLayout.DEFAULT_SIZE, 421, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void jLabel2MousePressed(MouseEvent evt) {                                     
        // TODO add your handling code here:
    }                                    

    private void jLabel2MouseExited(MouseEvent evt) {                                    
        jLabel2.setBackground(new Color(20,146,149));

    }                                   

    private void jLabel2MouseEntered(MouseEvent evt) {                                     
        jLabel2.setBackground(Color.RED);
        jLabel2.setOpaque(true);
    }                                    

    private void jLabel2MouseClicked(MouseEvent evt) {                                     
        System.exit(0);
    }                                    
    
    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {                                     
        JOptionPane.showMessageDialog(Login.this, 
                    "Sorry, can't do anything about that!", 
                    "Try again",JOptionPane.INFORMATION_MESSAGE);
    } 
    private void usernametfActionPerformed(ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void hideMouseClicked(MouseEvent evt) {                                  
        hide.setVisible(false);
        show.setVisible(true);
    }                                 

    private void showMouseClicked(MouseEvent evt) {                                  
        hide.setVisible(true);
        show.setVisible(false);
       
    }                                 

    private void jCheckBox1ActionPerformed(ActionEvent evt) {   
        if (jCheckBox1.isSelected()){                                        
        JOptionPane.showMessageDialog(Login.this, 
        "Remember, that I'll never remember you!", 
        "warning",JOptionPane.WARNING_MESSAGE);
    }}                              

    private void jLabel4MouseEntered(MouseEvent evt) {                                     
        jLabel4.setForeground(Color.decode("#16767D"));
    }                                    

    private void jLabel4MouseExited(MouseEvent evt) {                                    
        jLabel4.setForeground(Color.decode("#FFFFFF"));
    }                                   
      
    
    

    // Variables declaration - do not modify                     
    private JPanel container;
    private JLabel coverLabel;
    private JPanel coverPanel;
    private JLabel hide;
    private JButton loginButton;
    private JCheckBox jCheckBox1;
    private JLabel jLabel1;
    private JLabel jLabel2;
    private JLabel jLabel3;
    private JLabel jLabel4;
    private JLabel jLabel5;
    private JLabel jLabel6;
    private JLabel jLabel7;
    private JLabel jLabel9;
    private JPasswordField pwdtf;
    private JLabel show;
    private JTextField usernametf;
    private PersonController personController;

    
    // End of variables declaration     
    
    public static void main(String args[]) {
       
          try {
           UIManager.setLookAndFeel(new FlatLightLaf());
}       catch( Exception ex ) {
           System.err.println( "Failed to initialize LaF" );}
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Login().setVisible(true);
            }
        });
    }
   

   
    
}



