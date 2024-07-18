package main;

import java.awt.*;
import javax.swing.*;

import com.formdev.flatlaf.FlatLightLaf;

import java.awt.event.*;


import controller.BookController;
import controller.PersonController;
import model.Book;
import model.IssueBook;
import model.Member;
import model.User;
import view.AddBookPanel;
import view.AddUserPanel;
import view.AddMemberPanel;
import view.BookManagmntPanel;
import view.Dashboard;
import view.DashboardAdmin;
import view.IssueBookPanel;
import view.MemberManagmntPanel;

import view.Profile;
import view.ReturnBookPanel;
import view.SettingsPanel;
import view.UserManagmntPanel;
import view.component.ComfirmExit;

import view.component.SideMenu;
import view.component.SideMenuAdmin;
import view.component.AddUsername;
import view.component.ChangePassword;

public class MainFrame extends JFrame {
   
    public static CardLayout cardLayout = new CardLayout();
    public static JPanel cardPanel = new JPanel(cardLayout);
    
    public static Member member;
    public static AddMemberPanel addMemberPanel;
    public static PersonController memberController;

    public static AddUserPanel addUserPanel;
    public static PersonController userController;

    public static IssueBookPanel issueBookPanel;
    public static IssueBook issueBook;
    public static BookController issueBookController;
    
    public static AddBookPanel addBookPanel;
    public static Book book;
    public static BookController bookController;

    public MainFrame(User user, Profile profile, String type){
       addBookPanel = new AddBookPanel();
       book = new Book();
       bookController = new BookController(book, addBookPanel);
       
       member = new Member();
       addMemberPanel = new AddMemberPanel();
       memberController = new PersonController(addMemberPanel);
       
       addUserPanel = new AddUserPanel();
       userController = new PersonController(addUserPanel);
       
       issueBookPanel = new IssueBookPanel();
       issueBook = new IssueBook(member, book);
       issueBookController = new BookController(issueBook, issueBookPanel);

       ReturnBookPanel returnBookPanel =  new ReturnBookPanel();
       BookController returnBookController = new BookController(returnBookPanel);
       
       MemberManagmntPanel memberManagmntPanel = new MemberManagmntPanel();
       BookManagmntPanel bookManagmntPanel = new BookManagmntPanel();
       UserManagmntPanel userManagmntPanel = new UserManagmntPanel();
       SettingsPanel settingsPanel = new SettingsPanel();

       SideMenu sideMenu = new SideMenu();
       Dashboard dashboard = new Dashboard(user.getPrenom());
   
       SideMenuAdmin sideMenuAdmin = new SideMenuAdmin();
    
       DashboardAdmin dashboardAdmin = new DashboardAdmin();

       if(type.equals("librarian")) cardPanel.add(dashboard, "dashboard");
       else if(type.equals("admin")) {
        cardPanel.add(dashboardAdmin, "dashboardAdmin");
        cardPanel.add(addUserPanel, "addUserPanel");
        cardPanel.add(userManagmntPanel, "userManagmnt");
    }

       
       cardPanel.add(addBookPanel, "addBookPanel");
       cardPanel.add(profile, "profile");
       cardPanel.add(addMemberPanel, "addMemberPanel");
       cardPanel.add(issueBookPanel, "issueBookPanel");
       cardPanel.add(returnBookPanel, "returnBookPanel");
       cardPanel.add(memberManagmntPanel, "memberManagmnt");
       cardPanel.add(bookManagmntPanel, "bookManagmnt");
       cardPanel.add(settingsPanel, "settings");
      

        sideMenu.getDashboardlb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "dashboard");

                addMemberPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                cardLayout.show(cardPanel, "dashboard");
                super.mouseClicked(e);
         }
       });
            }
            });
        sideMenu.getMemberlb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "memberManagmnt");
                Member [] members = memberController.getMembersByNameASC();
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
                memberManagmntPanel.getSortingComboBox().setSelectedIndex(0);
                
            }
            });

        sideMenu.getBooklb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "bookManagmnt");
                Book [] books = bookController.getBookByTitleASC();
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
            }
            });

        sideMenu.getProfilelb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "profile");
            }
            });
        sideMenu.getLogoutlb().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ComfirmExit comfirmExit =  new ComfirmExit();
                comfirmExit.exitbtn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                       comfirmExit.dispose();
                       dispose();
                      
                       new Login().setVisible(true);;
                        
                    }
                });
                comfirmExit.cancelbtn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                       comfirmExit.dispose();  
                    }
                });
                
                    super.mouseClicked(e);
               }
            
        });
         sideMenu.getSettinglb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "settings");
            }
            });
            
        sideMenuAdmin.getDashboardlb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "dashboardAdmin");

                addMemberPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                cardLayout.show(cardPanel, "dashboardAdmin");
                super.mouseClicked(e);
         }
       });
            }
            });

        sideMenuAdmin.getUserlb().addMouseListener(new MouseAdapter() {
                public void mouseClicked(MouseEvent e){
                    cardLayout.show(cardPanel, "userManagmnt");
                    User [] users = userController.getUsersByNameASC();
                    userManagmntPanel.getTable().setModel(userController.getUserModel(users));
                     
                }
                });

        sideMenuAdmin.getMemberlb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "memberManagmnt");
                Member [] members = memberController.getMembersByNameASC();
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
                memberManagmntPanel.getSortingComboBox().setSelectedIndex(0);
                
            }
            });

        sideMenuAdmin.getBooklb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "bookManagmnt");
                Book [] books = bookController.getBookByTitleASC();
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
            }
            });

        sideMenuAdmin.getProfilelb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "profile");
            }
            });
        sideMenuAdmin.getSettinglb().addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent e){
                cardLayout.show(cardPanel, "settings");
            }
            });
        sideMenuAdmin.getLogoutlb().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                ComfirmExit comfirmExit =  new ComfirmExit();
                comfirmExit.exitbtn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                       comfirmExit.dispose();
                       dispose();
                      
                       new Login().setVisible(true);;
                        
                    }
                });
                comfirmExit.cancelbtn.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mouseClicked(MouseEvent e) {
                       comfirmExit.dispose();  
                    }
                });
                
                    super.mouseClicked(e);
               }
            
        });
        dashboard.getAddBook().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cardLayout.show(cardPanel, "addBookPanel");
                super.mouseClicked(e);
            }
        });
        dashboard.getAddMember().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               memberController.emptyFields();
               addMemberPanel.getTitlelb().setText("Add Member");
               addMemberPanel.getaddMemberbtn().setText("Add Member");

               addMemberPanel.getaddMemberbtn().addMouseListener(new MouseAdapter() {
                     @Override
                     public void mouseClicked(MouseEvent e) {
                         if (MainFrame.addMemberPanel.getaddMemberbtn().getText()== "Add Member"){
                             int result =  memberController.addMember();
                             if (result == 0) memberController.emptyFields();
                              JOptionPane.showMessageDialog(MainFrame.this, 
                         "Member added successfully", 
                           "Success",JOptionPane.INFORMATION_MESSAGE);
                             MainFrame.setCardPanel("memberManagmnt");
                             Member [] members = memberController.getMembersByNameASC();
                             memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
                         }
                         super.mouseClicked(e);
                      }
                    });

               addMemberPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
               @Override
               public void mouseClicked(MouseEvent e) {
                  cardLayout.show(cardPanel, "dashboard");
                  super.mouseClicked(e);
         }
       });
               cardLayout.show(cardPanel, "addMemberPanel");
                super.mouseClicked(e);
            }
        });
        dashboard.getIssueBook().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cardLayout.show(cardPanel, "issueBookPanel");
                super.mouseClicked(e);
            }
        });
        dashboard.getReturnBook().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cardLayout.show(cardPanel, "returnBookPanel");
                super.mouseClicked(e);
            }
        });
     
       dashboardAdmin.getAddUser().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               MainFrame.setCardPanel("addUserPanel");
               //addUserPanel.getTitlelb().setText("Add Librarian");
               addUserPanel.getAddUserBtn().setText("Add Librarian");

               addUserPanel.getAddUserBtn().addMouseListener(new MouseAdapter() {
                     @Override
                     public void mouseClicked(MouseEvent e) {
                         if (addUserPanel.getAddUserBtn().getText()== "Add Librarian"){
                             int result =  userController.addLibrarian();
                             if (result == 0) {
                              JOptionPane.showMessageDialog(MainFrame.this, 
                         "User added successfully", 
                           "Success",JOptionPane.INFORMATION_MESSAGE);
                             MainFrame.setCardPanel("userManagmnt");}
                             
                         }
                         super.mouseClicked(e);
                      }
                    });

               addUserPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                      cardLayout.show(cardPanel, "dashboardAdmin");
                      super.mouseClicked(e);
         }
       });
                super.mouseClicked(e);
            }
        });
        dashboardAdmin.getAddMember().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               memberController.emptyFields();
               addMemberPanel.getTitlelb().setText("Add Member");
               addMemberPanel.getaddMemberbtn().setText("Add Member");

               addMemberPanel.getaddMemberbtn().addMouseListener(new MouseAdapter() {
                     @Override
                     public void mouseClicked(MouseEvent e) {
                         if (MainFrame.addMemberPanel.getaddMemberbtn().getText()== "Add Member"){
                             int result =  memberController.addMember();
                             if (result == 0){ memberController.emptyFields();
                              JOptionPane.showMessageDialog(MainFrame.this, 
                         "Member added successfully", 
                           "Success",JOptionPane.INFORMATION_MESSAGE);
                             MainFrame.setCardPanel("memberManagmnt");
                             Member [] members = memberController.getMembersByNameASC();
                             memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
                         }}
                         super.mouseClicked(e);
                      }
                    });

               addMemberPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                      cardLayout.show(cardPanel, "dashboardAdmin");
                      super.mouseClicked(e);
         }
       });
               cardLayout.show(cardPanel, "addMemberPanel");
                super.mouseClicked(e);
            }
        });

        dashboardAdmin.getAddBook().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                bookController.emptyFields();
                addBookPanel.getTitlelb().setText("Add Book");
                addBookPanel.getAddBookBtn().setText("Add Book");
                cardLayout.show(cardPanel, "addBookPanel");

                addBookPanel.getAddBookBtn().addMouseListener(new MouseAdapter() {
                @Override
                public void mouseClicked(MouseEvent e) {
                   int result = bookController.AddBook();
                   if (result == 0){
                       bookController.emptyFields();
                       JOptionPane.showMessageDialog(MainFrame.this, 
                       "Yaay ! Book added susccessfully ! ", 
                       "Success",JOptionPane.INFORMATION_MESSAGE);
                       setCardPanel("bookManagmnt");
                   }else{
                       JOptionPane.showMessageDialog(MainFrame.this, 
                       "The book already exist!", 
                       "Error",JOptionPane.ERROR_MESSAGE);
                   }
                   super.mouseClicked(e);
                 }
                });
                addBookPanel.getCancelbtn().addMouseListener(new MouseAdapter() {
                  @Override
                  public void mouseClicked(MouseEvent e) {
                     cardLayout.show(cardPanel, "dashboardAdmin");
                     super.mouseClicked(e);
                }
                });
                super.mouseClicked(e);
            }
        });
        dashboardAdmin.getDeleteBook().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
              
                setCardPanel("bookManagmnt");
                Book [] books = bookController.getBookByTitleASC();
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
                super.mouseClicked(e);
            }
        });
        dashboardAdmin.getDeleteMember().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setCardPanel("memberManagmnt");
                Member [] members = memberController.getMembersByNameASC();
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
                memberManagmntPanel.getSortingComboBox().setSelectedIndex(0);
            }
        });
        dashboard.getDeleteMember().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                setCardPanel("memberManagmnt");
                Member [] members = memberController.getMembersByNameASC();
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
                memberManagmntPanel.getSortingComboBox().setSelectedIndex(0);
            }
        });
     
     
       
    
        issueBookPanel.getComfirmBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               int result= issueBookController.issueBook();
               if(result == 0){
                issueBookController.emptyIssueBookFields();
                JOptionPane.showMessageDialog(MainFrame.this, 
                "Yaay ! Book issued susccessfully ! ", 
                "Success",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(result == -1){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "The book doesn't exist!", 
                    "Error",JOptionPane.ERROR_MESSAGE);
               }
               else if(result == -2){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "No member with this ID!", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
               else if(result == -3){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "He already have this book with him!", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
               else if(result == -4){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "Enter a positive number for Due in! we can't go back in time!", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
               else if(result == -5){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "Who can read a book in 0 days!?", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
               else if(result == -6){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "Fill in all the fields!", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
           
             super.mouseClicked(e);
         }
       });
        issueBookPanel.getCancelBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cardLayout.show(cardPanel, "dashboard");
             super.mouseClicked(e);
         }
       });
            returnBookPanel.getComfirmBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               int result= returnBookController.returnBook();
               returnBookController.emptyReturnBookFields();
               if(result == 0){
                JOptionPane.showMessageDialog(MainFrame.this, 
                "Yaay ! Book returned susccessfully ! ", 
                "Success",JOptionPane.INFORMATION_MESSAGE);
               }
               else if(result == -1){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "no such issue!", 
                    "Error",JOptionPane.ERROR_MESSAGE);
               }
               else if(result == -2){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "this book doesn't exist!", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
               else if(result == -3){
                JOptionPane.showMessageDialog(MainFrame.this, 
                    "No member with this ID!", 
                    "Try again",JOptionPane.ERROR_MESSAGE);
               }
               
             super.mouseClicked(e);
         }
       });
        returnBookPanel.getCancelBtn().addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
               cardLayout.show(cardPanel, "dashboard");
             super.mouseClicked(e);
         }
       });
       
       userManagmntPanel.getSortingComboBox().addItemListener(new ItemListener() {
        public void itemStateChanged(ItemEvent e) {
           if(userManagmntPanel.getSortingComboBox().getSelectedIndex() == 1){
              User [] users = userController.getUsersByNameASC();
              userManagmntPanel.getTable().setModel(userController.getUserModel(users));
            }
           else if (userManagmntPanel.getSortingComboBox().getSelectedIndex() == 2){
              User [] users = userController.getUsersByNameDESC();
              userManagmntPanel.getTable().setModel(userController.getUserModel(users));
            }
           
           else if (userManagmntPanel.getSortingComboBox().getSelectedIndex() == 3){
              User [] users = userController.getRecentlyJoinedUsers();
              userManagmntPanel.getTable().setModel(userController.getUserModel(users));
            }
           
        };
     });
     userManagmntPanel.getSearchtf().addKeyListener(new KeyAdapter() {
         public void keyReleased(KeyEvent e) {
           User [] users = userController.searchUsers(userManagmntPanel.getSearchtf().getText());
              userManagmntPanel.getTable().setModel(userController.getUserModel(users));
         };
     });


       memberManagmntPanel.getSortingComboBox().addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
             if(memberManagmntPanel.getSortingComboBox().getSelectedIndex() == 1){
                Member [] members = memberController.getMembersByNameASC();
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
              }
             else if (memberManagmntPanel.getSortingComboBox().getSelectedIndex() == 2){
                Member [] members = memberController.getMembersByNameDESC();
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
              }
             else if (memberManagmntPanel.getSortingComboBox().getSelectedIndex() == 3){
                Member [] members = memberController.getRecentlyJoinedMembers();
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
              }
             else if (memberManagmntPanel.getSortingComboBox().getSelectedIndex() == 4){
                Member [] members = memberController.getMostActiveMembers();
                memberManagmntPanel.getTable().setModel(memberController.getActiveMemberModel(members));
              }
              
          };
       });
    
       memberManagmntPanel.getSearchtf().addKeyListener(new KeyAdapter() {
           public void keyReleased(KeyEvent e) {
             Member [] members = memberController.searchMembers(memberManagmntPanel.getSearchtf().getText());
                memberManagmntPanel.getTable().setModel(memberController.getMemberModel(members));
           };
       });

       
        bookManagmntPanel.getSortingComboBox().addItemListener(new ItemListener() {
          public void itemStateChanged(ItemEvent e) {
             if(bookManagmntPanel.getSortingComboBox().getSelectedIndex() == 1){
                Book [] books = bookController.getBookByTitleASC();
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
              }
             else if (bookManagmntPanel.getSortingComboBox().getSelectedIndex() == 2){
                Book [] books = bookController.getBookByTitleDESC();
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
              }
             else if (bookManagmntPanel.getSortingComboBox().getSelectedIndex() == 3){
                Book [] books = bookController.getRecentlyAddedBooks();
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
              }
             else if (bookManagmntPanel.getSortingComboBox().getSelectedIndex() == 4){
                Book [] books = bookController.getMostBorrowedBooks();
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
              }
              
          };
       });
       bookManagmntPanel.getSearchtf().addKeyListener(new KeyAdapter() {
           public void keyReleased(KeyEvent e) {
             Book [] books = bookController.searchBooks(bookManagmntPanel.getSearchtf().getText());
                bookManagmntPanel.getTable().setModel(bookController.getModel(books));
           };
       });
       settingsPanel.getChangePwd().addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
             new ChangePassword(user).setVisible(true);
             super.mouseClicked(e);
         }
       });
       settingsPanel.getAddUsername().addMouseListener(new MouseAdapter() {
         @Override
         public void mouseClicked(MouseEvent e) {
             new AddUsername(user).setVisible(true);
             super.mouseClicked(e);
         }
       });
         
      setLayout(new BorderLayout(0, 0));
      
       if(type.equals("librarian")) add(sideMenu, BorderLayout.WEST);
       else if(type.equals("admin")) add(sideMenuAdmin, BorderLayout.WEST);
       
       add(cardPanel, BorderLayout.CENTER);
    
       setTitle("NorthWay Library");
       setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
       setSize(980, 650);
       setResizable(false);
       setLocationRelativeTo(null);
       setVisible(true);
    }

    public static void setCardPanel(String pan){
        cardLayout.show(cardPanel, pan);
    }
    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
 }       catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );}
        new MainFrame(new User(), new Profile(), "librarian").setVisible(true);
    }
}
