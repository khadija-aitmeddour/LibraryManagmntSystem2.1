package view;

import java.awt.event.*;

import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controller.BookController;
import main.MainFrame;
import model.Book;
import model.Member;

public class BookManagmntPanel extends javax.swing.JPanel {

   
    public BookManagmntPanel() {
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
           addbookbtn = new javax.swing.JLabel();
           deletebook = new javax.swing.JLabel();
           editbook = new javax.swing.JLabel();
   
           setBackground(new java.awt.Color(255, 255, 255));
           setPreferredSize(new java.awt.Dimension(750, 650));
   
           jLabel1.setBackground(new java.awt.Color(255, 255, 255));
           jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 20)); // NOI18N
           jLabel1.setForeground(new java.awt.Color(31, 164, 173));
           jLabel1.setText("BOOKS MANAGMENT");
   
           jLabel2.setBackground(new java.awt.Color(31, 164, 173));
           jLabel2.setForeground(new java.awt.Color(31, 164, 173));
           jLabel2.setText("____________________________________________________________________________________________");
   
           jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 15)); // NOI18N
           jLabel3.setForeground(new java.awt.Color(51, 51, 51));
           jLabel3.setText("Search book");
           jLabel3.setMaximumSize(new java.awt.Dimension(148, 30));
           jLabel3.setPreferredSize(new java.awt.Dimension(148, 30));
   
   
           SortingComboBox.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
           SortingComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Sort by : ", "Name (A-Z) ", "Name (Z-A)", "Recently joined", "Most Active" }));
       
   
           table.setPreferredSize(new java.awt.Dimension(690, 200));
           jScrollPane1.setViewportView(table);
   
           addbookbtn.setBackground(new java.awt.Color(31, 164, 173));
           addbookbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           addbookbtn.setForeground(new java.awt.Color(255, 255, 255));
           addbookbtn.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           addbookbtn.setText("Add Book");
           addbookbtn.setOpaque(true);
           addbookbtn.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
                BookController bookController = new BookController(MainFrame.addBookPanel);
                MainFrame.addBookPanel.getAddBookBtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (MainFrame.addBookPanel.getAddBookBtn().getText()== "Add Book"){
                        int result =  bookController.AddBook();
                        if (result == 0) {bookController.emptyFields();
                         JOptionPane.showMessageDialog(BookManagmntPanel.this, 
                    "Book added successfully", 
                      "Success",JOptionPane.INFORMATION_MESSAGE);
                        MainFrame.setCardPanel("bookManagmnt");
                        Book [] books = bookController.getBookByTitleASC();
                        table.setModel(bookController.getModel(books));}
                    }
                super.mouseClicked(e);
             }
           });
                MainFrame.addBookPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                      MainFrame.setCardPanel("bookManagmnt");
                      super.mouseClicked(e);
                  }
               }); 
                MainFrame.addBookPanel.getTitlelb().setText("Add Book");
                MainFrame.addBookPanel.getAddBookBtn().setText("Add Book");
                MainFrame.setCardPanel("addBookPanel");
                super.mouseClicked(e);
             }
           });
   
           deletebook.setBackground(new java.awt.Color(242, 29, 37));
           deletebook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           deletebook.setForeground(new java.awt.Color(255, 255, 255));
           deletebook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           deletebook.setText("Delete Book");
           deletebook.setOpaque(true);
           deletebook.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
               int selectedRow = table.getSelectedRow();
               String idPersonne = (String)table.getValueAt(selectedRow, 0);
               Book book = BookController.getBookFromDB(idPersonne);
               BookController bookController = new BookController(book, MainFrame.addBookPanel);
               int answer = JOptionPane.showConfirmDialog(BookManagmntPanel.this, "Are you sure you wanna delete such a precious book?");
               if (answer == JOptionPane.YES_OPTION) {
                    int result =  bookController.deleteBook();
                    if (result == 0) JOptionPane.showMessageDialog(BookManagmntPanel.this, 
                    "Book deleted successfully", 
                    "Success",JOptionPane.INFORMATION_MESSAGE);
                    Book [] books = bookController.getBookByTitleASC();
                    table.setModel(bookController.getModel(books));}
             }
           });
   
           editbook.setBackground(new java.awt.Color(253, 103, 47));
           editbook.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
           editbook.setForeground(new java.awt.Color(255, 255, 255));
           editbook.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
           editbook.setText("Edit Book");
           editbook.setOpaque(true);
           editbook.addMouseListener(new MouseAdapter() {
             @Override
             public void mouseClicked(MouseEvent e) {
               int selectedRow = table.getSelectedRow();
               if(selectedRow != -1){
               String isbn = (String)table.getValueAt(selectedRow, 0);
               Book book = BookController.getBookFromDB(isbn);
              
               MainFrame.addBookPanel.getTitlelb().setText("Edit Book");
               MainFrame.addBookPanel.getAddBookBtn().setText("Edit Book");
               MainFrame.addBookPanel.getIsbntf().setText(book.getIsbn());
               MainFrame.addBookPanel.getTitletf().setText(book.getTitre());
               MainFrame.addBookPanel.getYeartf().setText(""+book.getAnneePub());
               MainFrame.addBookPanel.getPagetf().setText(""+book.getNbPages());
               MainFrame.addBookPanel.getAuthortf().setText(book.getNomAuteur());
               MainFrame.addBookPanel.getEditortf().setText(book.getNomEditeur());
               MainFrame.addBookPanel.getSectioncb().setSelectedItem(""+book.getIdSection());
               int idDiv = BookController.getIdDivition(book.getIdSection());
               MainFrame.addBookPanel.getDivcb().setSelectedItem(""+idDiv);
               String idClass = ""+BookController.getIdClass(idDiv);
               MainFrame.addBookPanel.getSubDivcb().setSelectedItem(idClass);
               BookController bookController = new BookController(book, MainFrame.addBookPanel);
               MainFrame.addBookPanel.getAddBookBtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                    if (MainFrame.addBookPanel.getAddBookBtn().getText()== "Edit Book"){
                        int result =  bookController.editBook();
                        if (result == 0) {bookController.emptyFields();
                         JOptionPane.showMessageDialog(BookManagmntPanel.this, 
                    "Book infos updated successfully", 
                    "Success",JOptionPane.INFORMATION_MESSAGE);
                        MainFrame.setCardPanel("booksManagmnt");
                        Book [] books = bookController.getBookByTitleASC();
                        table.setModel(bookController.getModel(books));}
                    }
                    super.mouseClicked(e);
             }
           });
               MainFrame.addBookPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                      MainFrame.setCardPanel("bookManagmnt");
                      super.mouseClicked(e);
                  }
               });
               MainFrame.setCardPanel("addBookPanel");
                 super.mouseClicked(e);
                }else{
                    JOptionPane.showMessageDialog(BookManagmntPanel.this, 
                                       "Please select a book", 
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
                           .addComponent(deletebook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                           .addComponent(editbook, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                           .addGap(42, 42, 42)
                           .addComponent(addbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
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
   
           layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addbookbtn, deletebook, editbook});
   
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
                       .addComponent(addbookbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(deletebook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                       .addComponent(editbook, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                   .addContainerGap(175, Short.MAX_VALUE))
           );
   
           layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addbookbtn, deletebook, editbook});
   
       }                                             
   
   
       // Variables declaration - do not modify                     
       private javax.swing.JComboBox SortingComboBox;
       private javax.swing.JLabel addbookbtn;
       private javax.swing.JLabel deletebook;
       private javax.swing.JLabel editbook;
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
        return  addbookbtn;
    }
}