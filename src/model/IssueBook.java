package model;

public class IssueBook {
   private Member member;
   private Book book;
   private String isssueDate;
   private String dueDate;
   
   public IssueBook(Member member, Book book){
    this.member = member;
    this.book = book;
   }

   public Member getMember(){
    return this.member;
   }
   public Book getIsbn(){
    return this.book;
   }
   public String getIssueDate(){
    return this.isssueDate;
   }
   public String getDueDate(){
    return this.dueDate;
   }
}
