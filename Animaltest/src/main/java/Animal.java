import java.util.ArrayList;

/**
 *  Created by Chad Wyngaard on 3/2/2019
 *  Part of question 3
 */


public class Animal implements Creatures {



    @Override
    public String speak(String name, String sound) {
        return "Animal name: " + name + " Animal sound " + sound;
    }

    @Override
    public String legs(String name, int feet) {
        return "Animal name " + name + " Number of legs animal has: " + feet;
    }

    @Override
    public String type(String name, String creature) {
        return "Animal name: " + name + "The type of creature: " + creature;
    }
}
