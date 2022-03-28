package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Trumpet extends Instrument implements IPlay, ISell {

    private int numberOfValves;

    public Trumpet(String material, Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, int numberOfValves) {
        super(material, buyingPrice, sellingPrice, instrumentType);
        this.numberOfValves = numberOfValves;
    }

    public int getNumberOfValves() {
        return numberOfValves;
    }

    public void setNumberOfValves(int numberOfValves) {
        this.numberOfValves = numberOfValves;
    }

    @Override
    public String play() {
        return "Toot Toot";
    }

    @Override
    public Double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }
}
