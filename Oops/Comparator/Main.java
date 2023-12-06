package Demo;

import java.util.ArrayList;
import java.util.Collections;


public class Main {
    public static void main(String[] args) {

        Laptop l1 = new Laptop("Dell",4,"i3",23000);
        Laptop l2 = new Laptop("Lenovo",4,"i5",34000);
        Laptop l3 = new Laptop("Hp",4,"i7",53000);
        Laptop l4 = new Laptop("Acer",4,"i9",85000);

        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(l1);
        laptops.add(l2);
        laptops.add(l3);
        laptops.add(l4);

        ComparatorDemo ownCompar = new ComparatorDemo();
        Collections.sort(laptops,ownCompar);

        System.out.println(laptops);

    }
}
