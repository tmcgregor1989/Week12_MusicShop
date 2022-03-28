package Instruments;

import Behaviours.ISell;

public abstract class Instrument implements ISell {

    private String material;
    private Double buyingPrice;
    private Double sellingPrice;
    private InstrumentType instrumentType;

    public Instrument(String material, Double buyingPrice, Double sellingPrice, InstrumentType instrumentType) {
        this.material = material;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.instrumentType = instrumentType;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public Double getBuyingPrice() {
        return buyingPrice;
    }

    public void setBuyingPrice(Double buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public Double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(Double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public InstrumentType getInstrumentType() {
        return instrumentType;
    }

    public void setInstrumentType(InstrumentType instrumentType) {
        this.instrumentType = instrumentType;
    }

    @Override
    public Double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }
}
