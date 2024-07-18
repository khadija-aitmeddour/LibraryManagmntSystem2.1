package view;

import java.awt.event.*;
import java.awt.*;
import java.util.Hashtable;

import javax.swing.*;

import controller.BookController;


public class AddBookPanel extends javax.swing.JPanel {

    
    public AddBookPanel() {
        initComponents();
    }
                                                 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        isbntf = new javax.swing.JTextField();
        titletf = new javax.swing.JTextField();
        yeartf = new javax.swing.JTextField();
        pagetf = new javax.swing.JTextField();
        authortf = new javax.swing.JTextField();
        editortf = new javax.swing.JTextField();
        //divcb = new javax.swing.JComboBox();
        subDivcb = new javax.swing.JComboBox();
        jLabel12 = new javax.swing.JLabel();
        sectioncb = new javax.swing.JComboBox();
        addbookbtn = new javax.swing.JLabel();
        cancelbtn = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setPreferredSize(new java.awt.Dimension(750, 650));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(31, 164, 173));
        jLabel1.setText("Add Book");

        jLabel2.setBackground(new java.awt.Color(31, 164, 173));
        jLabel2.setForeground(new java.awt.Color(31, 164, 173));
        jLabel2.setText("____________________________________________________________________________________________");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Isbn");
        jLabel3.setAutoscrolls(true);

        jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Tiltle");
        jLabel4.setAutoscrolls(true);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Year");
        jLabel5.setAutoscrolls(true);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Page Number");
        jLabel6.setAutoscrolls(true);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Author");
        jLabel8.setAutoscrolls(true);

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("Editor");
        jLabel9.setAutoscrolls(true);

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Division");
        jLabel10.setAutoscrolls(true);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("Subdivision");
        jLabel11.setAutoscrolls(true);

        //subDivcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select subdivision number", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("Section");
        jLabel12.setAutoscrolls(true);

        //sectioncb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select section number", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        String [] classes = BookController.getClasses();
        divcb = new JComboBox(classes);
        divcb.putClientProperty("JComboBox.isTableCellEditor", Boolean.TRUE);

        //stock the divisions of each class in an array
        String[] class1 = BookController.getDivisions(1);
        String[] class2 = BookController.getDivisions(2);
        String[] class3 = BookController.getDivisions(3);
        String[] class4 = BookController.getDivisions(4);
        String[] class5 = BookController.getDivisions(5);
        String[] class6 = BookController.getDivisions(6);
        String[] class7 = BookController.getDivisions(7);
        String[] class8 = BookController.getDivisions(8);
        String[] class9 = BookController.getDivisions(9);
        String[] class10 = BookController.getDivisions(10);
        
         //stock the sections of division 1 in a table
        String[] div10 = BookController.getSections(10);
        String[] div11 = BookController.getSections(11);
        String[] div12 = BookController.getSections(12);
        String[] div13 = BookController.getSections(13);
        String[] div14 = BookController.getSections(14);
        String[] div15 = BookController.getSections(15);
        String[] div16 = BookController.getSections(16);
        String[] div17 = BookController.getSections(17);
        String[] div18 = BookController.getSections(18);
        String[] div19 = BookController.getSections(19);
        
        subItems.put(classes[0], class1);
        subItems.put(classes[1], class2);
        subItems.put(classes[2], class3);
        subItems.put(classes[3], class4);
        subItems.put(classes[4], class5);
        subItems.put(classes[5], class6);
        subItems.put(classes[6], class7);
       
        
        subItems.put(class1[0], div10);
        subItems.put(class1[1], div11);
        subItems.put(class1[2], div12);
        subItems.put(class1[3], div13);
        subItems.put(class1[4], div14);
        subItems.put(class1[5], div15);
        subItems.put(class1[6], div16);
        subItems.put(class1[7], div17);
        subItems.put(class1[8], div18);
        

        divcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = (String)divcb.getSelectedItem();
                Object o = subItems.get( item );
        
                if (o == null)
                {
                    subDivcb.setModel( new DefaultComboBoxModel() );
                }
                else
                {
                    subDivcb.setModel( new DefaultComboBoxModel( (String[])o ) );
                    sectioncb.setModel( new DefaultComboBoxModel());
                }
                    }
        });

         subDivcb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String item = (String)subDivcb.getSelectedItem();
                Object o = subItems.get( item );
        
                if (o == null)
                {
                    sectioncb.setModel( new DefaultComboBoxModel());
                }
                else
                {
                    sectioncb.setModel( new DefaultComboBoxModel( (String[])o ) );
                }
                    }
        });

        addbookbtn.setBackground(new java.awt.Color(31, 164, 173));
        addbookbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addbookbtn.setForeground(new java.awt.Color(255, 255, 255));
        addbookbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        addbookbtn.setText("Add Book");
        addbookbtn.setOpaque(true);
        addbookbtn.addMouseListener(new MouseAdapter() {   
         @Override
         public void mouseEntered(MouseEvent e) {
             addbookbtn.setBackground(new Color(71,204,213));
             super.mouseEntered(e);
         }
         @Override
         public void mouseExited(MouseEvent e) {
             addbookbtn.setBackground(new Color(31, 164, 173));
             super.mouseEntered(e);
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
         public void mouseEntered(MouseEvent e) {
             cancelbtn.setBackground(new Color(183, 183, 183));
             super.mouseEntered(e);
         }
         @Override
         public void mouseExited(MouseEvent e) {
             cancelbtn.setBackground(new Color(153, 153, 153));
             super.mouseEntered(e);
         }
          
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(addbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(isbntf, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(titletf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(yeartf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pagetf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(authortf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(editortf, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(divcb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(subDivcb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sectioncb, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 590, Short.MAX_VALUE))
                .addContainerGap(100, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel10, jLabel11, jLabel12, jLabel3, jLabel5, jLabel6, jLabel8, jLabel9});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {authortf, divcb, editortf, isbntf, pagetf, sectioncb, subDivcb, titletf, yeartf});

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbookbtn, cancelbtn});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel2)))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(isbntf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(titletf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yeartf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pagetf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(authortf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editortf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(divcb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(subDivcb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sectioncb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(129, Short.MAX_VALUE))
        );
    }// </editor-fold>                    

    
    // Variables declaration - do not modify                     
    private javax.swing.JLabel addbookbtn;
    private javax.swing.JTextField authortf;
    private javax.swing.JLabel cancelbtn;
    private javax.swing.JTextField editortf;
    private javax.swing.JTextField isbntf;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField pagetf;
    private javax.swing.JComboBox sectioncb;
    private javax.swing.JComboBox subDivcb;
    private javax.swing.JComboBox divcb;
    private javax.swing.JTextField titletf;
    private javax.swing.JTextField yeartf;                
    private Hashtable<String, String[]> subItems = new Hashtable<String, String[]>();
                   

    

    public JLabel getAddBookBtn() {
        return addbookbtn;
    }
    public JLabel getTitlelb() {
        return jLabel1;
    }
    public JLabel getCancelbtn() {
        return cancelbtn;
    }
    
    public JTextField getAuthortf() {
        return authortf;
    }
    
    
    public JTextField getEditortf() {
        return editortf;
    }
    
    public JTextField getIsbntf() {
        return isbntf;
    }

    public JTextField getPagetf() {
        return pagetf;
    }
    
    public JTextField getTitletf() {
        return titletf;
    }
    
    public JTextField getYeartf() {
        return yeartf;
    }
        
    public JComboBox getDivcb() {
        return divcb;
    }

    public JComboBox getSubDivcb() {
        return subDivcb;
    }

    public JComboBox getSectioncb() {
        return sectioncb;
    }

    }