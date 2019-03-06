import com.sun.javafx.css.CalculatedValue;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 *  Created by Chad Wyngaard on 3/2/2019
 *  Part of question 3
 */



public class AnimalTest {
    private Creatures creature;

    @BeforeMethod
    public void setUp() {

        ApplicationContext animal = new AnnotationConfigApplicationContext(AnimalConfigure.class);
        creature = (Creatures) animal.getBean("animals");

    }

    @AfterMethod
    public void tearDown() {
    }

    @Test
    public void testSpeak() {
        String result = creature.speak("Cat", "Meow");
        Assert.assertEquals(result, "Animal name: Cat Animal sound: Meow", "Animal information");
    }

    @Test
    public void testLegs() {
        String result = creature.legs("Snake",0);
        Assert.assertEquals(result, "Animal name: Snake Number of legs animal has: " + 0, "Animal information");

    }

    @Test
    public void testType() {
        String result = creature.type("Whale", " Sea");
        Assert.assertEquals(result, "Animal name: Whale The type of creature: Sea: ", "Animal information");

    }
}