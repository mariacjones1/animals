package Animals;

public abstract class Bird extends Animal {
    /////////////////////Attributes/////////////////////


    ////////////////////Constructors////////////////////


    //////////////////////Methods//////////////////////
    public String reproduce(String baby) {
        return this.name + " has laid an egg with a baby " + this.getClass();
    }


}
