package Bridge;

import Bridge.Brands.Dansicons;
import Bridge.Brands.Everlast;
import Bridge.Buildings.Appartament;
import Bridge.Buildings.–°ountryHouse;

public class BridgeApp {
    public static void main(String[] args) {
        Building building = new –°ountryHouse(new Everlast());
        building.getDetails();
    }
}
