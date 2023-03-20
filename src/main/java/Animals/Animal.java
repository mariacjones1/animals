package Animals;

public abstract class Animal {
    /////////////////////Attributes/////////////////////
    public String colour;
    public int age;
    public String lastAte;
    public String name;

    ////////////////////Constructors////////////////////


    //////////////////////Methods//////////////////////
    public abstract String eat(String food);

    public void sleep(int time) {

    }

    public abstract String reproduce(String baby);

    public void respire() {

    }

    public String excrete() {
        return "Poop.";
    }

}
