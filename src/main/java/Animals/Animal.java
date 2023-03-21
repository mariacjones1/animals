package Animals;

import Exceptions.*;

public abstract class Animal {
    /////////////////////Attributes/////////////////////
    public String colour;
    public static int age;
    public static String lastAte;
    public String name;
    public String gender;

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
