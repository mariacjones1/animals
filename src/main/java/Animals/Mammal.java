package Animals;

import Exceptions.GenderException;

public abstract class Mammal extends Animal {
    /////////////////////Attributes/////////////////////


    ////////////////////Constructors////////////////////


    //////////////////////Methods//////////////////////
    public String reproduce(String baby) throws GenderException {
        if (this.gender.equals("male")) {
            throw new GenderException();
        } else {
            return this.name + " has given birth to a " + baby + ".";
        }
    }


}
