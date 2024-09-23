package de.telran.hw_13_16sept_Comparator;

import java.util.Comparator;

public class CitySort implements Comparator<House> {
    // Компаратор для сортировки по городу и цене
    @Override
        public int compare(House h1, House h2) {
            // Сначала сортируем по городу
           int cityCompare = h1.city.compareTo(h2.city);
            if (cityCompare != 0) {
               return cityCompare;
           }
           // Если города одинаковые, сортируем по цене
            return Integer.compare(h1.price, h2.price);
        }
    }

