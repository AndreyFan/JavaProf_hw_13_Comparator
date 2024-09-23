package de.telran.hw_13_16sept_Comparator;

import java.util.Objects;

public class House implements Comparable<House>{
       int area; //площадь дома
        int price; // цена
       String city; // город
      boolean hasFurniture; //продается с мебелью

    public House(int area, int price, String city, boolean hasFurniture) {
        this.area = area;
        this.price = price;
        this.city = city;
        this.hasFurniture = hasFurniture;
    }

    @Override
    public int compareTo(House o) {
        if (this.price<o.price) return -1;
        else if (this.price>o.price) return 1;
        else  return 0;
    }

    @Override
    public String toString() {
        return "House{" +
                "area=" + area +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", hasFurniture=" + hasFurniture +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof House house)) return false;
        return area == house.area && price == house.price && hasFurniture == house.hasFurniture && Objects.equals(city, house.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(area, price, city, hasFurniture);
    }
}
