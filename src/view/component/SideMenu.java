package view.component;

import javax.swing.*;

import java.awt.*;
import java.awt.event.MouseEvent;



public class SideMenu extends JPanel {
    // Variables declaration - do not modify                     
    private javax.swing.JLabel booklb;
    private javax.swing.JLabel dashboardlb;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logolb;
    private javax.swing.JLabel logoutlb;
    private javax.swing.JLabel memberlb;
    private javax.swing.JPanel panelMoving;
    private javax.swing.JLabel profilelb;
    private javax.swing.JLabel settinglb;
    static final String PATH = "C:\\Users\\admin\\Documents\\GL_project\\LibraryManagmntSystem2.1\\src\\icon\\"; 
    public static int selected;
    // End of variables declaration    

    public SideMenu() {
        initComponents();
        setOpaque(false);
    }

                      
    private void initComponents() {

        panelMoving = new javax.swing.JPanel();
        dashboardlb = new javax.swing.JLabel();
    
        booklb = new javax.swing.JLabel();
        memberlb = new javax.swing.JLabel();
        profilelb = new javax.swing.JLabel();
        settinglb = new javax.swing.JLabel();
        logoutlb = new javax.swing.JLabel();
        logolb = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(20,146,149));
        setForeground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(215, 630));

        panelMoving.setForeground(new java.awt.Color(255, 255, 255));
        panelMoving.setOpaque(false);

        javax.swing.GroupLayout panelMovingLayout = new javax.swing.GroupLayout(panelMoving);
        panelMoving.setLayout(panelMovingLayout);
        panelMovingLayout.setHorizontalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelMovingLayout.setVerticalGroup(
            panelMovingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 88, Short.MAX_VALUE)
        );

        dashboardlb.setBackground(new java.awt.Color(20,146,149));
        dashboardlb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        dashboardlb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        dashboardlb.setForeground(new java.awt.Color(255, 255, 255));
        dashboardlb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        dashboardlb.setIcon(new javax.swing.ImageIcon((PATH + "5.png"))); // NOI18N
        dashboardlb.setText("Dashboard");
        dashboardlb.setOpaque(true);
        dashboardlb.setPreferredSize(new java.awt.Dimension(170, 40));
        dashboardlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardlbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                dashboardlbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                dashboardlbMouseExited(evt);
            }
        });

    

        booklb.setBackground(new java.awt.Color(20,146,149));
        booklb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        booklb.setForeground(new java.awt.Color(255, 255, 255));
        booklb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        booklb.setIcon(new javax.swing.ImageIcon((PATH + "stock_1.png"))); // NOI18N
        booklb.setText("Books management");
        booklb.setOpaque(true);
        booklb.setPreferredSize(new java.awt.Dimension(170, 40));
        booklb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                booklbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                booklbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                booklbMouseExited(evt);
            }
        });

        memberlb.setBackground(new java.awt.Color(20,146,149));
        memberlb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        memberlb.setForeground(new java.awt.Color(255, 255, 255));
        memberlb.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        memberlb.setIcon(new javax.swing.ImageIcon((PATH + "10.png"))); // NOI18N
        memberlb.setText("Members  management");
        memberlb.setOpaque(true);
        memberlb.setPreferredSize(new java.awt.Dimension(170, 40));
        memberlb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                memberlbMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                memberlbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                memberlbMouseExited(evt);
            }
        });

        profilelb.setBackground(new java.awt.Color(20,146,149));
        profilelb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        profilelb.setForeground(new java.awt.Color(255, 255, 255));
        profilelb.setIcon(new javax.swing.ImageIcon((PATH + "8.png"))); // NOI18N
        profilelb.setText("Profile");
        profilelb.setOpaque(true);
        profilelb.setPreferredSize(new java.awt.Dimension(190, 40));
        profilelb.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profilelbMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profilelbMouseExited(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                profilelbMouseClicked(evt);
            }
        });

        settinglb.setBackground(new java.awt.Color(20,146,149));
        settinglb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        settinglb.setForeground(new java.awt.Color(255, 255, 255));
        settinglb.setIcon(new javax.swing.ImageIcon((PATH + "6.png"))); // NOI18N
        settinglb.setText("Settings");
        settinglb.setPreferredSize(new java.awt.Dimension(190, 40));
        settinglb.setOpaque(true);
        settinglb.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseEntered(java.awt.event.MouseEvent evt) {
              settinglbMouseEntered(evt);
          }
          public void mouseExited(java.awt.event.MouseEvent evt) {
              settinglbMouseExited(evt);
          }
          public void mouseClicked(MouseEvent evt) {
              settinglbMouseClicked(evt);
              }
         });
        
        
        
        logoutlb.setBackground(new java.awt.Color(20,146,149));
        logoutlb.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        logoutlb.setForeground(new java.awt.Color(255, 255, 255));
        logoutlb.setIcon(new javax.swing.ImageIcon((PATH + "9.png"))); // NOI18N
        logoutlb.setText("Log out");
        logoutlb.setPreferredSize(new java.awt.Dimension(190, 40));
        logoutlb.setOpaque(true);
        logoutlb.addMouseListener(new java.awt.event.MouseAdapter() {
          public void mouseEntered(java.awt.event.MouseEvent evt) {
              logoutlbMouseEntered(evt);
          }
          public void mouseExited(java.awt.event.MouseEvent evt) {
              logoutlbMouseExited(evt);
          }
          public void mouseClicked(MouseEvent evt) {
              logoutlbMouseClicked(evt);
              }
         });

        logolb.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        logolb.setForeground(new java.awt.Color(255, 255, 255));
        logolb.setIcon(new javax.swing.ImageIcon((PATH + "logo2.png"))); // NOI18N
        logolb.setMaximumSize(new java.awt.Dimension(150, 48));

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));
        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelMoving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                   
                    .addComponent(memberlb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(booklb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dashboardlb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10))
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(settinglb,  javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(logoutlb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(profilelb, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {booklb, logoutlb, memberlb, profilelb, settinglb});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panelMoving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(logolb, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(40, 40, 40)
                .addComponent(dashboardlb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(booklb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(memberlb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(profilelb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(settinglb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(logoutlb, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {logoutlb, profilelb, settinglb});

    }// </editor-fold>  
    // hover 
    private void dashboardlbMouseEntered(java.awt.event.MouseEvent evt) {                                         
        dashboardlb.setBackground(new Color(51,184,193));
    }                                        

    private void dashboardlbMouseExited(java.awt.event.MouseEvent evt) {                                        
        dashboardlb.setBackground(new Color(20,146,149));
    }                                       

    private void booklbMouseEntered(java.awt.event.MouseEvent evt) {                                    
         booklb.setBackground(new Color(51,184,193));
    }                                   

    private void memberlbMouseEntered(java.awt.event.MouseEvent evt) {                                      
        memberlb.setBackground(new Color(51,184,193));
    }                                     
                        

    private void booklbMouseExited(java.awt.event.MouseEvent evt) {                                   
        booklb.setBackground(new Color(20,146,149));
    }                                  

                                         

    private void memberlbMouseExited(java.awt.event.MouseEvent evt) {                                     
        memberlb.setBackground(new Color(20,146,149));
    }      
    
    private void profilelbMouseEntered(java.awt.event.MouseEvent evt) {                                       
        profilelb.setBackground(new Color(51,184,193));
    }                                      

    private void profilelbMouseExited(java.awt.event.MouseEvent evt) {                                      
         profilelb.setBackground(new Color(20,146,149));
    } 

    private void logoutlbMouseEntered(java.awt.event.MouseEvent evt) {                                       
        logoutlb.setBackground(new Color(51,184,193));
    }                                      

    private void logoutlbMouseExited(java.awt.event.MouseEvent evt) {                                      
         logoutlb.setBackground(new Color(20,146,149));
    } 

    private void settinglbMouseEntered(java.awt.event.MouseEvent evt) {                                       
        settinglb.setBackground(new Color(51,184,193));
    }                                      

    private void settinglbMouseExited(java.awt.event.MouseEvent evt) {                                      
         settinglb.setBackground(new Color(20,146,149));
    } 




    // clicked 
    private void dashboardlbMouseClicked(java.awt.event.MouseEvent evt) {                                         
        dashboardlb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        booklb.setBorder(null);
        memberlb.setBorder(null);
        profilelb.setBorder(null);
        logoutlb.setBorder(null);
    }                                        
                                      

    private void booklbMouseClicked(java.awt.event.MouseEvent evt) {                                    
       booklb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
       dashboardlb.setBorder(null);
       memberlb.setBorder(null);
       profilelb.setBorder(null);
       logoutlb.setBorder(null);
    }                                   

    private void memberlbMouseClicked(java.awt.event.MouseEvent evt) {                                      
       memberlb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
       dashboardlb.setBorder(null);  
       booklb.setBorder(null);
       profilelb.setBorder(null);
       logoutlb.setBorder(null);
    }                                     
    private void profilelbMouseClicked(java.awt.event.MouseEvent evt) {                                      
       profilelb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
       dashboardlb.setBorder(null);
       booklb.setBorder(null);
       memberlb.setBorder(null);
       logoutlb.setBorder(null);
    }                                     
    private void logoutlbMouseClicked(java.awt.event.MouseEvent evt) {                                      
       logoutlb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
       dashboardlb.setBorder(null);
       booklb.setBorder(null);
       memberlb.setBorder(null);
       profilelb.setBorder(null);
    }                                     

    private void settinglbMouseClicked(java.awt.event.MouseEvent evt) {                                      
        settinglb.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 1, true));
        dashboardlb.setBorder(null);
        booklb.setBorder(null);
        memberlb.setBorder(null);
        profilelb.setBorder(null);
     }                                     
 

     @Override
     protected void paintChildren(Graphics g) {
         Graphics2D g2 = (Graphics2D)g;
         //render ?
         GradientPaint cl = new GradientPaint(0,0, Color.decode("#149295"),0, getHeight(), Color.decode("#149295"));
         g2.setPaint(cl);
         g2.fillRect(0, 0, getWidth(), getHeight());
         super.paintChildren(g);
     }
     
     //setters and getters
     
    public javax.swing.JLabel getBooklb() {
        return booklb;
    }

    public javax.swing.JLabel getDashboardlb() {
        return dashboardlb;
    }

    public javax.swing.JLabel getLogoutlb() {
        return logoutlb;
    }

    public javax.swing.JLabel getMemberlb() {
        return memberlb;
    }

    public javax.swing.JLabel getProfilelb() {
        return profilelb;
    }

    public javax.swing.JLabel getSettinglb() {
        return settinglb;
    }
                   
}
