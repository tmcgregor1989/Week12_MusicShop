package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Piano extends Instrument implements IPlay {

    private PianoType pianoType;

    public Piano(String material, Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, PianoType pianoType) {
        super(material, buyingPrice, sellingPrice, instrumentType);
        this.pianoType = pianoType;
    }

    public PianoType getPianoType() {
        return pianoType;
    }

    public void setPianoType(PianoType pianoType) {
        this.pianoType = pianoType;
    }

    @Override
    public String play() {
        return "tinkle tinkle";
    }

}
