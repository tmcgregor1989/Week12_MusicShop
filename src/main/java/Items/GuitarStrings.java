package Items;

import Instruments.GuitarType;

public class GuitarStrings extends Item{

    private GuitarType guitarType;

    public GuitarStrings(Double buyingPrice, Double sellingPrice, String description, GuitarType guitarType) {
        super(buyingPrice, sellingPrice, description);
        this.guitarType = guitarType;
    }

    public GuitarType getGuitarType() {
        return guitarType;
    }

    public void setGuitarType(GuitarType guitarType) {
        this.guitarType = guitarType;
    }
}
