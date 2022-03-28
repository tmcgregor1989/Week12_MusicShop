import Behaviours.ISell;
import Instruments.*;
import Items.DrumStickType;
import Items.DrumSticks;
import Items.GuitarStrings;
import Items.SheetMusic;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

public class ShopTest {
    Piano piano;
    Piano piano2;
    Guitar guitar;
    Guitar guitar2;
    Violin violin;
    Violin violin2;
    Trumpet trumpet;
    Trumpet trumpet2;
    Drum drum;
    Drum drum2;
    Flute flute;
    Flute flute2;
    GuitarStrings guitarStrings;
    GuitarStrings guitarStrings2;
    DrumSticks drumSticks;
    DrumSticks drumSticks2;
    SheetMusic sheetMusic;
    SheetMusic sheetMusic2;
    ArrayList<ISell> stock;
    Shop shop;


    @Before
    public void before(){
        piano = new Piano("Mahogany", 100.00, 150.00, InstrumentType.PERCUSSION, PianoType.BABYGRAND);
        piano2 = new Piano("MDF", 50.00, 75.00, InstrumentType.PERCUSSION, PianoType.ELECTRIC);
        guitar = new Guitar("Rose Wood", 150.00, 300.00, InstrumentType.STRING, GuitarType.BASS);
        guitar2 = new Guitar("Beech Wood", 200.00, 300.00, InstrumentType.STRING, GuitarType.ACOUSTIC);
        violin = new Violin("Teak", 500.00, 1000.00, InstrumentType.STRING, "horse hair");
        violin2 = new Violin("Plastic", 7.50, 100.00, InstrumentType.STRING, "nylon");
        trumpet = new Trumpet("Brass", 350.00, 760.00, InstrumentType.BRASS, 3);
        trumpet2 = new Trumpet("Brass", 150.00, 660.00, InstrumentType.BRASS, 2);
        flute = new Flute("stainless steel", 75.00, 3000.00, InstrumentType.WOODWIND, 100.0);
        flute2 = new Flute("copper", 75.00, 300.00, InstrumentType.WOODWIND, 50.5);
        drum = new Drum("cow hide", 5000.00, 5000.50, InstrumentType.PERCUSSION, 3);
        drum2 = new Drum("plastic", 17.00, 90.00, InstrumentType.PERCUSSION, 1);
        guitarStrings = new GuitarStrings(3.50, 15.00, "Super Slinky", GuitarType.BASS);
        guitarStrings2 = new GuitarStrings(6.50, 12.75, "Medium Slinky", GuitarType.ACOUSTIC);
        sheetMusic = new SheetMusic(1.50, 12.00, "Metallica: Ride The Lightning", InstrumentType.BRASS);
        sheetMusic2 = new SheetMusic(12.10, 13.20, "KISS: Greatest Hits", InstrumentType.WOODWIND);
        drumSticks = new DrumSticks(1.00, 2.00, "cheap drumsticks", DrumStickType.WOODEN);
        stock = new ArrayList<>(Arrays.asList(guitar, violin, violin2, trumpet, flute, flute2, drum, drum2, guitarStrings, guitarStrings2, sheetMusic));
        shop = new Shop("Music Shop Pun", stock);
    }

    @Test
    public void canAddItemsToStock(){
        shop.add(guitar2);
        shop.add(drumSticks);
        assertEquals(13, shop.countStock());
    }

    @Test
    public void canRemoveItems(){
        shop.remove(violin2);
        assertEquals(10, shop.countStock());
    }

    @Test
    public void canCalculateTotalProfit(){
        assertEquals(4404.25, shop.calculateTotalProfit(), 0.0);
    }
}
