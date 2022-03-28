import Instruments.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class InstrumentTest {

    Piano piano;
    Guitar guitar;
    Violin violin;


    @Before
    public void before(){
        piano = new Piano("Mahogany", 100.00, 150.00, InstrumentType.PERCUSSION, PianoType.BABYGRAND);
        guitar = new Guitar("Rose Wood", 150.00, 300.00, InstrumentType.STRING, GuitarType.BASS);
        violin = new Violin("Teak", 500.00, 1000.00, InstrumentType.STRING, "horse hair");

    }

    @Test
    public void canCalculateMarkUp(){
        assertEquals(500.00, violin.calculateMarkUp(), 0.0);
    }

    @Test
    public void canPlay(){
        assertEquals("tinkle tinkle", piano.play());
    }



}
