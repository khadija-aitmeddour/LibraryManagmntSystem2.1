package view;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.JLabel;
import javax.swing.JPanel;


public class SettingsPanel extends JPanel{
    public SettingsPanel(){
        initComponents();
    }

 @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addUsername = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        changepwd = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(750, 650));
        setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 164, 173));
        jLabel1.setText("SITTINGS");
        add(jLabel1);
        jLabel1.setBounds(30, 11, 280, 87);

        jLabel2.setBackground(new java.awt.Color(31, 164, 173));
        jLabel2.setForeground(new java.awt.Color(31, 164, 173));
        jLabel2.setText("____________________________________________________________________________________________");
        add(jLabel2);
        jLabel2.setBounds(30, 71, 680, 14);
        
        changepwd.setBackground(new Color(240,240,240));
        addUsername.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        addUsername.setText(" Add username");
        addUsername.setBorder(null);
        addUsername.setOpaque(true);
        addUsername.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                addUsername.setBackground(new Color(230,230,230));
                super.mouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                addUsername.setBackground(new Color(240,240,240));
                super.mouseExited(e);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                addUsername.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 130, 130), 1, true));
                changepwd.setBorder(null);
                super.mouseClicked(e);
            }
        });
        add(addUsername);
        addUsername.setBounds(30, 140, 390, 40);
        add(jSeparator1);
        jSeparator1.setBounds(30, 180, 390, 10);
        
        changepwd.setBackground(new Color(240,240,240));
        changepwd.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        changepwd.setText(" Change password");
        changepwd.setBorder(null);
        changepwd.setOpaque(true);
        changepwd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                changepwd.setBackground(new Color(230,230,230));
                super.mouseEntered(e);
            }
            @Override
            public void mouseExited(MouseEvent e) {
                changepwd.setBackground(new Color(240,240,240));
                super.mouseExited(e);
            }
            @Override
            public void mouseClicked(MouseEvent e) {
                changepwd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(130, 130, 130), 1, true));
                addUsername.setBorder(null);
                super.mouseClicked(e);
            }
        });
        add(changepwd);
        changepwd.setBounds(30, 210, 390, 40);
        add(jSeparator2);
        jSeparator2.setBounds(30, 250, 390, 2);

        jLabel3.setBackground(new java.awt.Color(31, 164, 173));
        jLabel3.setForeground(new java.awt.Color(31, 164, 173));
        jLabel3.setText("____________________________________________________________________________________________");
        add(jLabel3);
        jLabel3.setBounds(30, 71, 680, 14);
    }// </editor-fold>                                                         

                 
    // Variables declaration - do not modify                     
    private javax.swing.JLabel addUsername;
    private javax.swing.JLabel changepwd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    // End of variables declaration   
    
    public JLabel getChangePwd(){
        return changepwd;
    }
    public JLabel getAddUsername(){
        return addUsername;
    }
}
