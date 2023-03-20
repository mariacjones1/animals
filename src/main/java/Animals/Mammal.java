package Animals;

public abstract class Mammal extends Animal {
    /////////////////////Attributes/////////////////////


    ////////////////////Constructors////////////////////


    //////////////////////Methods//////////////////////
    public String reproduce(String baby) {
        return this.name + " has given birth to a " + baby;
    }


}
