package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Guitar extends Instrument implements IPlay {

    private GuitarType guitarType;

    public Guitar(String material, Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, GuitarType guitarType) {
        super(material, buyingPrice, sellingPrice, instrumentType);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }

    public String play(){
        return "strum strum";
    }

}
