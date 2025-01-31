package lesson2;

import java.util.List;

public class Park {
    private List<Attraction> attraction;

    public Park(List<Attraction> attraction) {
        this.attraction = attraction;
    }

    @Override
    public String toString() {
        return "Park{" +
                "attraction=" + attraction +
                '}';
    }
}
