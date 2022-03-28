import Behaviours.ISell;

import java.util.ArrayList;

public class Shop {

    private String name;
    private ArrayList<ISell> stock;

    public Shop(String name, ArrayList<ISell> stock) {
        this.name = name;
        this.stock = stock;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<ISell> getStock() {
        return stock;
    }

    public void setStock(ArrayList<ISell> stock) {
        this.stock = stock;
    }

    public int countStock(){
        return stock.size();
    }

    public void add(ISell item){
        stock.add(item);
    }

    public void remove(ISell item){
        stock.remove(item);
    }


    public Double calculateTotalProfit(){
        Double profit = 0.00;
        for(ISell item : this.stock){
            profit += item.calculateMarkUp();
        }
        return profit;
    }
}
