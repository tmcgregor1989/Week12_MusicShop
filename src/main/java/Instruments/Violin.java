package Instruments;

import Behaviours.IPlay;
import Behaviours.ISell;

public class Violin extends Instrument implements IPlay {

    private String bowMaterial;


    public Violin(String material, Double buyingPrice, Double sellingPrice, InstrumentType instrumentType, String bowMaterial) {
        super(material, buyingPrice, sellingPrice, instrumentType);
        this.bowMaterial = bowMaterial;
    }

    public String getBowMaterial() {
        return bowMaterial;
    }

    public void setBowMaterial(String bowMaterial) {
        this.bowMaterial = bowMaterial;
    }

    @Override
    public String play() {
        return "Screeeech!";
    }
}
