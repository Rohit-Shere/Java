package com.company;


class Library{
    String [] book;
   int no_of_books;
     Library(){
        this.book= new String[100];
        this.no_of_books=0;

    }
    public void addBook(String book){
         this.book[no_of_books]=book;
         no_of_books++;
        System.out.println(book+"is added to library.");
    }
    public void issueBook(String book){
         for (int i=0;i<this.book.length;i++){
             if (this.book[i].equals(book)){
                 System.out.println("The book has been issued");
                 this.book[i]=null;
                 return;
             }
        }
        System.out.println("The book doesn't exist.");
    }
    public void isBookAvailable(){
         for (String book : this.book){
             if (book==null){
                 continue;
             }
             System.out.println("* "+book );
         }
    }

    public void returnBook (String book){
         addBook(book);
    }
}
public class chw_51_OnlineLibrary {
    public static void main(String[] args) {
        Library l1=new Library();
        l1.addBook("Rich Dad Poor Dad");
        l1.addBook("Chhava");
        l1.addBook("Dark Horse");
        l1.addBook("3 Idiots");
        l1.addBook("I love nature");
        l1.addBook("Three things to do");

        l1.isBookAvailable();
        l1.issueBook("Chhava");
        l1.isBookAvailable();
        l1.returnBook("Chhava");
        l1.isBookAvailable();

    }
}
