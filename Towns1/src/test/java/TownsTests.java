import org.junit.Test;

import static org.junit.Assert.*;

public class TownsTests {
    @Test
    public void compareTest() {
        Towns towns = new Towns();
        String firstWord = "Обь";
        String secondWord = "Борисов";
        char expected = 'Б';
        assertEquals(expected, towns.compareSymbols(firstWord, secondWord));
    }
}
