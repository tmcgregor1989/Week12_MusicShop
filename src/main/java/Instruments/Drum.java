package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Drum extends Instrument implements IPlay {

    private int numberOfCymbals;

    public Drum(String material, Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, int numberOfCymbals) {
        super(material, buyingPrice, sellingPrice, instrumentType);
        this.numberOfCymbals = numberOfCymbals;
    }

    public int getNumberOfCymbals() {
        return numberOfCymbals;
    }

    public void setNumberOfCymbals(int numberOfCymbals) {
        this.numberOfCymbals = numberOfCymbals;
    }

    @Override
    public String play() {
        return "Bang bang";
    }
}
