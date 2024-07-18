package view.component;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JOptionPane;

import controller.PersonController;
import model.User;

public class ChangePassword extends javax.swing.JFrame {

    public ChangePassword(User user) {
        initComponents(user);
    }                  
    private void initComponents(User user) {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        oldpasswordtf = new javax.swing.JPasswordField();
        newpasswordtf = new javax.swing.JPasswordField();
        comfirmpasswordtf = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        comfirmBtn = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JLabel();
        wrongPwdmsg = new javax.swing.JLabel();
        pwdDontMatchmsg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(333,100);
        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 164, 173));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Change Password");

        jLabel2.setBackground(new java.awt.Color(31, 164, 173));
        jLabel2.setForeground(new java.awt.Color(31, 164, 173));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("____________________________________________________________________________________________");
        
        oldpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109,109,109), 1, true));
        oldpasswordtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                oldpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109,109,109), 1, true));
                wrongPwdmsg.setText("");
                super.keyTyped(e);
            }
            });
        newpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109,109,109), 1, true));    
        newpasswordtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                newpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109,109,109), 1, true));
                pwdDontMatchmsg.setText("");
                super.keyTyped(e);
            }
            });
        comfirmpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109,109,109), 1, true));    
        comfirmpasswordtf.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {
                comfirmpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(109,109,109), 1, true));
                pwdDontMatchmsg.setText("");
                super.keyTyped(e);
            }
            });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Enter your old Password :");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Enter a new Password : ");
        jLabel4.setAutoscrolls(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Comfirm your Password :");
        jLabel5.setAutoscrolls(true);

        comfirmBtn.setBackground(new java.awt.Color(31, 164, 173));
        comfirmBtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comfirmBtn.setForeground(new java.awt.Color(255, 255, 255));
        comfirmBtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        comfirmBtn.setText("Comfirm");
        comfirmBtn.setOpaque(true);
        comfirmBtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String oldPwd = user.getPwd();
                String saltedEnteredOldpwd = oldpasswordtf.getText() +user.getSalt();
                if (PersonController.isMatched(saltedEnteredOldpwd, oldPwd)){
                String newpwd = newpasswordtf.getText();
                String comfirmpwd = comfirmpasswordtf.getText();


                if(newpwd.equals(comfirmpwd)){
                    PersonController personController = new PersonController(user);
                    int result = personController.changePassword(newpwd);
                    if (result == 0){
                        oldpasswordtf.setText("");
                        newpasswordtf.setText("");
                        comfirmpasswordtf.setText("");
                         JOptionPane.showMessageDialog(ChangePassword.this, 
                    "Password updated successfully! \nBe sure to remember it or else you'll be doomed..", 
                    "Sucess",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    }
                }else{
                    newpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
                    comfirmpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
                    pwdDontMatchmsg.setText("Password doesn't match");
                }
                super.mouseClicked(e);
            }
            else{
                oldpasswordtf.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 0), 1, true));
                wrongPwdmsg.setText("Passwords incorrect");
            }
        }
        });


        cancelbtn.setBackground(new java.awt.Color(153, 153, 153));
        cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
        cancelbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cancelbtn.setText("Cancel");
        cancelbtn.setOpaque(true);
        cancelbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                dispose();
                super.mouseClicked(e);
            }
        });
       
        
        
        wrongPwdmsg.setForeground(new java.awt.Color(255, 0, 0));
        wrongPwdmsg.setText("");
        
        
        pwdDontMatchmsg.setForeground(new java.awt.Color(255, 0, 0));
        pwdDontMatchmsg.setText("");
    

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                        .addComponent(comfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(comfirmpasswordtf)
                            .addComponent(newpasswordtf)
                            .addComponent(oldpasswordtf)
                            .addComponent(wrongPwdmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pwdDontMatchmsg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(55, 55, 55))
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelbtn, comfirmBtn});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oldpasswordtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addComponent(wrongPwdmsg, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newpasswordtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addComponent(comfirmpasswordtf, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pwdDontMatchmsg)
                .addGap(70, 70, 70)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(comfirmBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(86, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        


    // Variables declaration - do not modify                     
    private javax.swing.JLabel cancelbtn;
    private javax.swing.JLabel comfirmBtn;
    private javax.swing.JPasswordField comfirmpasswordtf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField newpasswordtf;
    private javax.swing.JPasswordField oldpasswordtf;
    private javax.swing.JLabel pwdDontMatchmsg;
    private javax.swing.JLabel wrongPwdmsg;
    // End of variables declaration  
    
    
    public javax.swing.JLabel getCancelbtn() {
        return cancelbtn;
    }

    public javax.swing.JLabel getComfirmBtn() {
        return comfirmBtn;
    }
    public javax.swing.JLabel getWrongPwdMsg() {
        return wrongPwdmsg;
    }
    public javax.swing.JLabel getPwdDontMatchMsg() {
        return pwdDontMatchmsg;
    }

    public javax.swing.JPasswordField getComfirmpasswordtf() {
        return comfirmpasswordtf;
    }

    public javax.swing.JPasswordField getNewpasswordtf() {
        return newpasswordtf;
    }

    public javax.swing.JPasswordField getOldpasswordtf() {
        return oldpasswordtf;
    }
}

