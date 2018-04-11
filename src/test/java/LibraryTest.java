import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    private Library theNewLibrary;
    private Book catcherInTheRye;
    private Book shadowDivers;

    @Before
    public void before(){
        theNewLibrary = new Library(5);
        catcherInTheRye = new Book("Catcher In THe Rye");
        shadowDivers = new Book("Shadow Divers");
    }

    @Test
    public void libraryHasEmptyBookShelf(){
        assertEquals(0, theNewLibrary.bookCount());
    }

    @Test
    public void libraryCanAddBook(){
        theNewLibrary.addBook(catcherInTheRye);
        theNewLibrary.addBook(shadowDivers);
        assertEquals(2, theNewLibrary.bookCount());
    }

    @Test
    public void libraryHasACapacity(){
        assertEquals(5, theNewLibrary.getCapacityOfLibrary());
    }

    @Test
    public void libraryCanRemoveBook(){
        assertEquals(1, theNewLibrary.bookCount());
    }


}
