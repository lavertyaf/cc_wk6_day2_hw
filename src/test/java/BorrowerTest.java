import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BorrowerTest {

    private Borrower newBorrower;
    private Book shadowDivers;
    private BookShelf bookShelf


    @Before
    public void before(){
        newBorrower = new Borrower();
    }

    @Test
    public void borrowerHasEmptyCollection(){
        assertEquals(0, newBorrower.bookCount());
    }


    @Test
    public void canMoveABook(){
        newBorrower.addABook(bookShelf);
        assertEquals(1, newBorrower.bookCount());
    }
}
