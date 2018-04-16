package rooms;

import java.util.ArrayList;

public class Bedroom extends Room{

    private BedroomType bedroomType;
    private double rate;

    public Bedroom(String name, BedroomType bedroomType, double rate) {
        super(BedroomType.getCapacity());
        this.bedroomType = bedroomType;
        this.rate = rate;
    }

    public BedroomType getBedroomType() {
        return bedroomType;
    }

    public double getRate() {
        return rate;
    }
}
