package Bridge.Buildings;

import Bridge.Brand;
import Bridge.Building;

public class –°ountryHouse extends Building {
    public –°ountryHouse(Brand brand) {
        super(brand);
    }

    @Override
    public void getType() {
        System.out.println("–°ountry House");
    }
}
