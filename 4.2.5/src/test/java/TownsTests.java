import org.junit.Test;

import static org.junit.Assert.*;

public class TownsTests {
    Towns towns = new Towns();
    @Test
    public void compareTest() {
        String firstWord = "Борисов";
        String secondWord = "Обь";
        char expected = 'б';
        assertEquals(expected, towns.compareSymbols(firstWord, secondWord));
    }
}
