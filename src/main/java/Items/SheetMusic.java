package Items;

import Instruments.InstrumentType;

public class SheetMusic extends Item{

    private InstrumentType instrumentType;

    public SheetMusic(Double buyingPrice, Double sellingPrice, String description, InstrumentType instrumentType) {
        super(buyingPrice, sellingPrice, description);
        this.instrumentType = instrumentType;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }
}
