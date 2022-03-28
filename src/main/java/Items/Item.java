package Items;

import Behaviours.ISell;

public abstract class Item implements ISell {
    private Double buyingPrice;
    private Double sellingPrice;
    private String description;

    public Item(Double buyingPrice, Double sellingPrice, String description) {
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
        this.description = description;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public Double calculateMarkUp() {
        return getSellingPrice() - getBuyingPrice();
    }
}
