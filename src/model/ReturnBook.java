package model;

public class ReturnBook {
 private String idMember;
   private String isbn;
   private String returnDate;
   
   public ReturnBook(String idMember, String isbn, String returnDate){
    this.idMember = idMember;
    this.isbn = isbn;
    this.returnDate = returnDate;
   }

   public String getIdMember(){
    return this.idMember;
   }
   public String getIsbn(){
    return this.isbn;
   }
   public String getReurnDate(){
    return this.returnDate;
   }
}