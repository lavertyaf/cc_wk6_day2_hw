import com.sun.org.apache.xpath.internal.operations.Bool;

import java.util.ArrayList;

public class Library {

    private ArrayList<Book> bookShelf;
    private Integer capacity;

    public Library(Integer capacity){
        this.bookShelf = new ArrayList<>();
        this.capacity = capacity;
    }

    public int bookCount(){
        return bookShelf.size();
    }

    public void addBook(Book bookObj) {
        if (bookShelf.size() <= capacity) {
            this.bookShelf.add(bookObj);
        }
    }

    public int getCapacityOfLibrary(){
        return this.capacity;
    }

    public Book removeABook(){
        return this.bookShelf.remove(0);
    }



}
