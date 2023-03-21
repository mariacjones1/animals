package Animals;

import Exceptions.*;

public class Cat extends Mammal {
    /////////////////////Attributes/////////////////////


    ////////////////////Constructors////////////////////


    //////////////////////Methods//////////////////////
    public String eat(String food) throws VomitException {
        if (!food.equals(lastAte)) {
            lastAte = food;
            return lastAte;
        } else {
            throw new VomitException();
        }
    }
}
