package Items;

public class DrumSticks extends Item{

    private DrumStickType drumStickType;

    public DrumSticks(Double buyingPrice, Double sellingPrice, String description, DrumStickType drumStickType) {
        super(buyingPrice, sellingPrice, description);
        this.drumStickType = drumStickType;
    }

    public DrumStickType getDrumStickType() {
        return drumStickType;
    }

    public void setDrumStickType(DrumStickType drumStickType) {
        this.drumStickType = drumStickType;
    }
}
