import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PageNumberTests {
    @Test
    public void numberVerify1() {
        PageNumber pageNumber = new PageNumber();
        int allNews = 10;
        int newsPerPage = 10;
        int expected = 1;
        assertEquals(expected, pageNumber.calcPages(allNews, newsPerPage));
    }

    @Test
    public void numberVerify2() {
        PageNumber pageNumber = new PageNumber();
        int allNews = 15;
        int newsPerPage = 10;
        int expected = 2;
        assertEquals(expected, pageNumber.calcPages(allNews, newsPerPage));
    }

    @Test
    public void numberVerify3() {
        PageNumber pageNumber = new PageNumber();
        int allNews = 3;
        int newsPerPage = 10;
        int expected = 1;
        assertEquals(expected, pageNumber.calcPages(allNews, newsPerPage));
    }

    @Test
    public void numberVerify4() {
        PageNumber pageNumber = new PageNumber();
        int allNews = 1003;
        int newsPerPage = 10;
        int expected = 101;
        assertEquals(expected, pageNumber.calcPages(allNews, newsPerPage));
    }

    @Test
    public void numberVerify5() {
        PageNumber pageNumber = new PageNumber();
        int allNews = 0;
        int newsPerPage = 10;
        int expected = 0;
        assertEquals(expected, pageNumber.calcPages(allNews, newsPerPage));
    }
}
