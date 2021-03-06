import java.util.Random;

/**
 * This class helps to generate the random number between 1 to 5 for the lucky vending machine game.
 *
 * @author (Sunil Cyriac, scyr0001@student.monash.edu)
 * @version (1.1 06/09/2017)
 */

public class LuckyGuessGenerator
{    
    private Random random; //declare the instance varibale required to initialize the random generator logic

    /**
     * Constructor for objects of class LuckyGuessGenerator
     */ 
    public LuckyGuessGenerator()
    {
        random = new Random();
    }

    /**
     * Method to generate the random numbers between 1 to 5
     * 
     * @param  no parameters are passed
     * @return the random number generated by program between 1 to 5
     */
    public int generateRandomNumber()
    {
        int guessNumber = random.nextInt(5) + 1; //random.nextInt(5) generates a random number b/w 0 to 4 then with an addition 1 to each random number we get a random number b/w 1 to 5
        return guessNumber;
    }

}
