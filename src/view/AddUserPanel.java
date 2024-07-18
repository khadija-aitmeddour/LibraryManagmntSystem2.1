package view;

import javax.swing.*;

public class AddUserPanel extends JPanel{

        public AddUserPanel() {
            initComponents();
            }
    
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
        private void initComponents() {
    
            titlelb = new javax.swing.JLabel();
            jLabel2 = new javax.swing.JLabel();
            jLabel3 = new javax.swing.JLabel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            jLabel8 = new javax.swing.JLabel();
            jLabel9 = new javax.swing.JLabel();
            fnametf = new javax.swing.JTextField();
            lnametf = new javax.swing.JTextField();
            addresstf = new javax.swing.JTextField();
            emailtf = new javax.swing.JTextField();
            phonetf = new javax.swing.JTextField();
            addUserbtn = new javax.swing.JLabel();
            cancelbtn = new javax.swing.JLabel();
            monthcb = new javax.swing.JComboBox();
            daycb = new javax.swing.JComboBox();
            yearcb = new javax.swing.JComboBox();
            jLabel10 = new javax.swing.JLabel();
            positiontf = new javax.swing.JTextField();
            salarytf = new javax.swing.JTextField();
            jLabel11 = new javax.swing.JLabel();
    
            setBackground(new java.awt.Color(255, 255, 255));
            setPreferredSize(new java.awt.Dimension(750, 650));
    
            titlelb.setBackground(new java.awt.Color(255, 255, 255));
            titlelb.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
            titlelb.setForeground(new java.awt.Color(31, 164, 173));
            titlelb.setText("Add Librarian");
    
            jLabel2.setBackground(new java.awt.Color(31, 164, 173));
            jLabel2.setForeground(new java.awt.Color(31, 164, 173));
            jLabel2.setText("__________________________________________________________________________________________________");
    
            jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel3.setForeground(new java.awt.Color(51, 51, 51));
            jLabel3.setText("First Name");
            jLabel3.setAutoscrolls(true);
    
            jLabel4.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel4.setForeground(new java.awt.Color(51, 51, 51));
            jLabel4.setText("Last Name");
            jLabel4.setAutoscrolls(true);
    
            jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel5.setForeground(new java.awt.Color(51, 51, 51));
            jLabel5.setText("BirthDay");
            jLabel5.setAutoscrolls(true);
    
            jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel6.setForeground(new java.awt.Color(51, 51, 51));
            jLabel6.setText("Address");
            jLabel6.setAutoscrolls(true);
    
            jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel8.setForeground(new java.awt.Color(51, 51, 51));
            jLabel8.setText("Email");
            jLabel8.setAutoscrolls(true);
    
            jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel9.setForeground(new java.awt.Color(51, 51, 51));
            jLabel9.setText("Phone");
            jLabel9.setAutoscrolls(true);
    
            fnametf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    fnametfActionPerformed(evt);
                }
            });
    
            lnametf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    lnametfActionPerformed(evt);
                }
            });
    
            addresstf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    addresstfActionPerformed(evt);
                }
            });
    
            emailtf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    emailtfActionPerformed(evt);
                }
            });
    
            phonetf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    phonetfActionPerformed(evt);
                }
            });
    
            addUserbtn.setBackground(new java.awt.Color(31, 164, 173));
            addUserbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            addUserbtn.setForeground(new java.awt.Color(255, 255, 255));
            addUserbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            addUserbtn.setText("Add Librarian");
            addUserbtn.setOpaque(true);
    
            cancelbtn.setBackground(new java.awt.Color(153, 153, 153));
            cancelbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
            cancelbtn.setForeground(new java.awt.Color(255, 255, 255));
            cancelbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
            cancelbtn.setText("Cancel");
            cancelbtn.setOpaque(true);
    
            monthcb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            monthcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
    
            daycb.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
            daycb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
    
            yearcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2015", "2014", "2013", "2012", "2011", "2010", "2009", "2008", "2007", "2006", "2005", "2004", "2003", "2002", "2001", "2000", "1999", "1998", "1997", "1996", "1995", "1994", "1993", "1992", "1991", "1990", "1989", "1988", "1987", "1986", "1985", "1984", "1983", "1982", "1981", "1980", "1979", "1978", "1977", "1976", "1975", "1974", "1973", "1972", "1971", "1970", "1969", "1968", "1967", "1966", "1965", "1964", "1963", "1962", "1961", "1960", "1959", "1958", "1957", "1956", "1955", "1954", "1953", "1952", "1951", "1950", "1949", "1948", "1947", "1946", "1945", "1944", "1943", "1942", "1941", "1940", "1939", "1938", "1937", "1936", "1935", "1934", "1933", "1932", "1931", "1930" }));
    
            jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel10.setForeground(new java.awt.Color(51, 51, 51));
            jLabel10.setText("Position");
            jLabel10.setAutoscrolls(true);
    
            positiontf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    positiontfActionPerformed(evt);
                }
            });
    
            salarytf.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    salarytfActionPerformed(evt);
                }
            });
    
            jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 13)); // NOI18N
            jLabel11.setForeground(new java.awt.Color(51, 51, 51));
            jLabel11.setText("Salary");
            jLabel11.setAutoscrolls(true);
    
            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
            this.setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(60, 60, 60)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(titlelb, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(addUserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(fnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phonetf, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(monthcb, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(daycb, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(yearcb, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(positiontf, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salarytf, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addContainerGap(100, Short.MAX_VALUE))
            );
    
            layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jLabel3, jLabel5, jLabel6, jLabel8, jLabel9});
    
            layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addresstf, emailtf, fnametf, lnametf, phonetf});
    
            layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addUserbtn, cancelbtn});
    
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(titlelb, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addGap(60, 60, 60)
                                    .addComponent(jLabel2)))
                            .addGap(13, 13, 13)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(fnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lnametf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(monthcb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(daycb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(yearcb, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addresstf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(emailtf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phonetf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(positiontf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(15, 15, 15)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(salarytf, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(50, 50, 50)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(addUserbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancelbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(191, 191, 191)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(149, Short.MAX_VALUE))
            );
    
            layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {daycb, lnametf, monthcb, yearcb});
    
        }// </editor-fold>                        
    
        private void fnametfActionPerformed(java.awt.event.ActionEvent evt) {                                        
            // TODO add your handling code here:
        }                                       
    
        private void lnametfActionPerformed(java.awt.event.ActionEvent evt) {                                        
            // TODO add your handling code here:
        }                                       
    
        private void addresstfActionPerformed(java.awt.event.ActionEvent evt) {                                          
            // TODO add your handling code here:
        }                                         
    
        private void emailtfActionPerformed(java.awt.event.ActionEvent evt) {                                        
            // TODO add your handling code here:
        }                                       
    
        private void phonetfActionPerformed(java.awt.event.ActionEvent evt) {                                        
            // TODO add your handling code here:
        }                                       
    
        private void positiontfActionPerformed(java.awt.event.ActionEvent evt) {                                           
            // TODO add your handling code here:
        }                                          
    
        private void salarytfActionPerformed(java.awt.event.ActionEvent evt) {                                         
            // TODO add your handling code here:
        }                                        
    
    
        // Variables declaration - do not modify                     
        private javax.swing.JLabel addUserbtn;
        private javax.swing.JTextField addresstf;
        private javax.swing.JLabel cancelbtn;
        private javax.swing.JComboBox daycb;
        private javax.swing.JTextField emailtf;
        private javax.swing.JTextField fnametf;
        private javax.swing.JLabel titlelb;
        private javax.swing.JLabel jLabel10;
        private javax.swing.JLabel jLabel11;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JTextField lnametf;
        private javax.swing.JComboBox monthcb;
        private javax.swing.JTextField phonetf;
        private javax.swing.JTextField positiontf;
        private javax.swing.JTextField salarytf;
        private javax.swing.JComboBox yearcb;
        // End of variables declaration                   
    
        public javax.swing.JLabel getAddUserBtn() {
            return addUserbtn;
        }
        public javax.swing.JLabel getTitlelb() {
            return titlelb;
        }
        public javax.swing.JTextField getAddresstf() {
            return addresstf;
        }
    
        public javax.swing.JLabel getCancelbtn() {
            return cancelbtn;
        }
    
        public javax.swing.JComboBox getDaycb() {
            return daycb;
        }
    
        public javax.swing.JTextField getEmailtf() {
            return emailtf;
        }
    
        public javax.swing.JTextField getFnametf() {
            return fnametf;
        }
    
        public javax.swing.JTextField getLnametf() {
            return lnametf;
        }
    
        public javax.swing.JTextField getPositiontf() {
            return this.positiontf;
        }
    
        public javax.swing.JTextField getSalarytf() {
            return this.salarytf;
        }
    
        public javax.swing.JComboBox getMonthcb() {
            return monthcb;
        }
    
        public javax.swing.JTextField getPhonetf() {
            return phonetf;
        }
    
        public javax.swing.JComboBox getYearcb() {
            return yearcb;
        }
    
        
    }
     

