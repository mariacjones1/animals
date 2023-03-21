package zoo;
import animals.*;
import exceptions.GenderException;
import exceptions.VomitException;

public class Main {
    public static void main(String[] args) {
        Cat cosmo = new Cat();
        cosmo.name = "Cosmo";
        cosmo.colour = "black";
        cosmo.age = 16;
        cosmo.gender = "male";
        try {
            cosmo.eat("chicken");
        }
        catch (VomitException ve) {
            System.out.println(cosmo.name + " has vomited :(");
        }
        cosmo.sleep();

        Bat betty = new Bat();
        betty.name = "Betty";
        betty.colour = "brown";
        betty.age = 2;
        betty.gender = "female";
        betty.eat("insect");
        try {
            System.out.println(betty.reproduce("pup"));
        }
        catch (GenderException ge) {
            System.out.println(betty.name + " cannot give birth as he is male.");
        }

        Crow chloe = new Crow();
        chloe.name = "Chloe";
        chloe.colour = "purple";
        chloe.age = 5;
        chloe.eat("worm");
        chloe.reproduce("chick");
        chloe.excrete();

        Llama larry = new Llama();
        larry.name = "Larry";
        larry.colour = "pink";
        larry.age = 3;
        larry.gender = "male";
        larry.eat("grass");
        try {
            larry.reproduce("cria");
        }
        catch (GenderException ge) {
            System.out.println(larry.name + " cannot give birth as he is male.");
        }

        System.out.println("My name is " + cosmo.name + ". I am " + cosmo.age + " years old and have " + cosmo.colour + " fur. I ate " + cosmo.lastAte + " for breakfast.");
        try {
            cosmo.eat("chicken");
        }
        catch (VomitException ve) {
            System.out.println(cosmo.name + " has vomited :(");
        }
        try {
            cosmo.eat("salmon");
        }
        catch (VomitException ve) {
            System.out.println(cosmo.name + " has vomited :(");
        }
        System.out.println(cosmo.name + " just ate some " + cosmo.lastAte + ".");
    }
}