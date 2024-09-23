package de.telran.hw_13_16sept_Comparator;

import java.util.Comparator;

public class CityAriaSort implements Comparator<House>{

        @Override
        public int compare(House h1, House h2) {
            // Сначала сортируем по городу
            int cityCompare = h1.city.compareTo(h2.city);
            if (cityCompare != 0) {
                return cityCompare;
            }
            // Если города одинаковые, сортируем по площади
            return Integer.compare(h1.area, h2.area);
        }
    }

