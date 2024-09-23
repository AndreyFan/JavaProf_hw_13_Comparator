package de.telran.hw_13_16sept_Comparator;

import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Rieltor {
//   1. Вы автоматизируете бизнес риелторов. у вас есть класс:
//    public class House {
//        int area; //площадь дома
//        int price; // цена
//        String city; // город
//        boolean hasFurniture; //продается с мебелью
//    }
//    По умолчанию в вашем информационном хранилище дома сортируются по цене.
//
//    Но иногда клиент хочет видеть информацию о домах в конкретном городе и осортированную по цене.
//    Реализуйте компаратор, который вы можете применить для показа клиенту в требуемом им формате.
//
//    А если клиенту неожиданно захочет увидеть информацию, отсортированную в формате:
//            "город - площадь дома", что вы будете делать?
public static void main(String[] args) {
    Set<House> houseSet=new TreeSet<>();
    houseSet.add(new House(55,650,"Berlin", true));
    houseSet.add(new House(75, 720, "Munchen", false));
    houseSet.add(new House(87,180,"Bremen", true));
    houseSet.add(new House(125, 245, "Bremen-Hafen", false));
    houseSet.add(new House(278,1650,"Berlin", false));
    houseSet.add(new House(65, 478, "Munchen", false));
    System.out.println(houseSet);  // Убедимся что дома сортируются по цене
    System.out.println();
    // Реализуем показ домов по городам с сортировкой по цене внутри города
    // для этого сам компаратор мы реализовали в классе CitySort

    Set<House> setCity = new TreeSet<>(new CitySort());
    setCity.addAll(houseSet);
    System.out.println("показ домов по городам с сортировкой по цене внутри города:  ");
    for(House house: setCity){
        System.out.println(house);
    }

    // Реализуем показ домов по городам с сортировкой по площади внутри города
    // для этого сам компаратор мы реализовали в классе   CityAriaSort

    Set<House> setCityAria = new TreeSet<>(new CityAriaSort());
    setCityAria.addAll(houseSet);
    System.out.println();
    System.out.println("показ домов по городам с сортировкой по площади внутри города:  ");
    for(House house: setCityAria){
        System.out.println(house);
    }

}
}
