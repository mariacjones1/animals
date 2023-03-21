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

    public void sleep(int time) {

    }

    public abstract String reproduce(String baby) throws GenderException;

    public void respire() {

    }

    public String excrete() {
        return "Poop.";
    }

    public static int getAge() {
        return age;
    }

}
