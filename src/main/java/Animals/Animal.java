package Animals;

import Exceptions.GenderException;

public abstract class Animal {
    /////////////////////Attributes/////////////////////
    public String colour;
    public int age;
    public String lastAte;
    public String name;
    public String gender;

    ////////////////////Constructors////////////////////


    //////////////////////Methods//////////////////////
    public abstract String eat(String food);

    public void sleep(int time) {

    }

    public abstract String reproduce(String baby) throws GenderException;

    public void respire() {

    }

    public String excrete() {
        return "Poop.";
    }

}
