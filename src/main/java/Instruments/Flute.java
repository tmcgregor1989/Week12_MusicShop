package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Flute extends Instrument implements IPlay {

    private Double length;

    public Flute(String material, Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, Double length) {
        super(material, buyingPrice, sellingPrice, instrumentType);
        this.length = length;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    @Override
    public String play() {
        return "hoo hoo";
    }

}
