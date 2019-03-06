import org.springframework.context.annotation.Bean;

/**
 *  Created by Chad Wyngaard on 3/2/2019
 *  Part of question 3
 */


public class AnimalConfigure {

    @Bean(name= "animals")
    public Creatures getOldAnimals()
    {
        return new Animal();
    }

}
