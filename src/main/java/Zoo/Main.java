package Zoo;
import Animals.*;
import Interfaces.Flying;

public class Main {
    public static void main(String[] args) {
        Cat cosmo = new Cat();
        cosmo.name = "Cosmo";
        cosmo.colour = "black";
        cosmo.age = 16;
        cosmo.eat("chicken");
        cosmo.sleep(3);

        Bat betty = new Bat();
        betty.name = "Betty";
        betty.colour = "brown";
        betty.age = 2;
        betty.eat("insect");
        betty.reproduce("pup");

        Crow chloe = new Crow();
        chloe.name = "Chloe";
        chloe.colour = "purple";
        chloe.age = 5;
        chloe.eat("worm");
        chloe.reproduce("chick");
        chloe.excrete();
    }
}