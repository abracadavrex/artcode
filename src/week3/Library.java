package week3;

public class Library {
    Book[] books = new Book[3];
    String name;

    public void fillLibrary (Book book, Book book2, Book book3){

    }

    public void showBooks(){
        for (int i = 0; i < books.length; i++){
            System.out.println(books[i].getInfo());
        }
    }
}
