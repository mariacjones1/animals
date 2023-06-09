package animals;

import exceptions.*;

public abstract class Animal {
    /////////////////////Attributes/////////////////////
    public static String colour;
    public static int age;
    public static String lastAte;
    public static String name;
    public static String gender;

    ////////////////////Constructors////////////////////


    //////////////////////Methods//////////////////////
    public abstract String eat(String food) throws VomitException;

    public boolean sleep() {
        boolean awake = false;
        return awake;
    }

    public abstract String reproduce(String baby) throws GenderException;

    public static String respire() {
        return "CO2";
    }

    public static String excrete() {
        return "Poop.";
    }

    public static int getAge() {
        return age;
    }

}
