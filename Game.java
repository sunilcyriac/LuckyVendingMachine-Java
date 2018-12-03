
import java.util.*;

/**
 * This is game class and it helps for playing the lucking vending machine game using player and lucky number generator classes as objects here.
 *
 * @author (Sunil Cyriac scyr0001@student.monash.edu)
 * @version (1.1 06/08/2017)
 */

public class Game
{
    private Scanner input; 
    private Player gamePlayer;
    private LuckyGuessGenerator randomNumberLogic; 
    private boolean isPlayerSetup;

    /**
     * Constructor for objects of class Game
     * Instance variables needed to create the game object are initialized with this
     */ 
    public Game()
    {
        input = new Scanner(System.in);
        randomNumberLogic = new LuckyGuessGenerator();
        isPlayerSetup = false;//used to check whether the player is setup
    }

    /**
     * This is displayMenu method, this displays the main menu of the LuckyVendingMachine
     * @param no parameters are passed
     * @return no values are returned
     */ 
    private void displayMenu()
    {
        System.out.println("Welcome to the Lucky Vending Machine\n");
        System.out.println("====================================\n");
        System.out.println("(1) Set Up New Player\n");
        System.out.println("(2) Guess and Win a Prize\n");
        System.out.println("(3) What Have I Won So Far?\n");
        System.out.println("(4) Display Game Help\n");
        System.out.println("(5) Quit Game\n");
        System.out.println("Choose an option :");
    }

    /**
     * This is enterName method, this method is used to setup the player name to play the LuckyVendingMachine game
     * @param no parameters are passed
     * @return no values are returned
     */ 
    private void enterName()
    {
        System.out.println("Enter Player's Name : ");        
        String name = input.nextLine();
        if (name.matches(".*[^a-zA-Z].*")) 
            System.out.println("\nPlease choose option 1 again & re-enter the name without special characters or numbers\n\n"); 
        else
        {               
            gamePlayer = new Player();
            gamePlayer.setName(name);//set the player name to player class using the player object
            isPlayerSetup = true;//set as true once the player is setup
            System.out.println("\nHello " + gamePlayer.getName() + " let's try your luck!!\n");
        }
    }

    /**
     * This is helpMenu method, this method is used to display the help menu and some instructions to player to play the LuckyVendingMachine game
     * @param no parameters are passed
     * @return no values are returned
     */ 
    private void helpMenu()
    {
        System.out.println("\n***********************************\n");
        System.out.println("Welcome to the Lucky Vending Machine\n");
        System.out.println("====================================");
        System.out.println("Hey PAL!! Wanna try some luck???\n\nIf yes then you are in the right place, You just need to:");
        System.out.println("1. Register your name\n2. Just guess a number between 1 to 5\n3. If you are lucky you may win some prizes, these can be collected from the reception\n");
        System.out.println("Following are the options available for you to play the game");
        System.out.println("(1) Set Up New Player");
        System.out.println("(2) Guess and Win a Prize");
        System.out.println("(3) What Have I Won So Far?");
        System.out.println("(4) Display Game Help");
        System.out.println("(5) Quit Game");
        System.out.println("\n***********************************\n\n");
    }

    /**
     * This is numberGuess method, 
     * This method is used to take the input from user which are numbers, it allows the users to guess the numbers and compete with the machine's guesses
     * @param no parameters are passed
     * @return no values are returned
     */ 
    private void numberGuess()
    {
        int guessNumber;
        if (isPlayerSetup)
        {
            do
            {   
                System.out.println("\n\nYou can choose a number and win a prize as below list\n");
                prizeTable();
                System.out.println("Guess a number between 1-5 :");               
                guessNumber = input.nextInt();//User input for guess number is taken here
                if (guessNumber > 5 || guessNumber <= 0)//checks whether the number entered is greater than 5 or less than 0
                {
                    System.out.println("ERROR!! Please guess only a number between 1-5\n");
                }
                else
                {
                    gamePlayer.setExpenses(gamePlayer.getExpenses() + guessNumber);//uses mutator method from player class to store the expenses of the player for playing the game
                    int myNumber = randomNumberLogic.generateRandomNumber();
                    System.out.println("Your guess is: " + guessNumber);
                    System.out.println("My guess is: " + myNumber);
                    if (guessNumber == myNumber)//to check the guessed number by player (myNumber) is matching the system generated number (guessNumber)
                    {
                        if (guessNumber == 1)
                        {      
                            System.out.println("Congrats " + gamePlayer.getName() +  ", You won a PEN, worth $10\n");
                            gamePlayer.setPrize(gamePlayer.getPrize() + " PEN");//uses mutator method of player class and stores the list of prizes won by the player
                            gamePlayer.setWorth(gamePlayer.getWorth() + 10);//uses mutator method of player class and stores the worth of prizes won by the player
                        }
                        if (guessNumber == 2)
                        {      
                            System.out.println("Congrats " + gamePlayer.getName() +  ", You won a BOOK, worth $20\n");
                            gamePlayer.setPrize(gamePlayer.getPrize() + " BOOK");//uses mutator method of player class and stores the prizes won by the player
                            gamePlayer.setWorth(gamePlayer.getWorth() + 20);//uses mutator method of player class and stores the worth of prizes won by the player
                        }
                        if (guessNumber == 3)
                        {      
                            System.out.println("Congrats " + gamePlayer.getName() +  ", You won a DVD, worth $30\n");
                            gamePlayer.setPrize(gamePlayer.getPrize() + " DVD");//uses mutator method of player class and stores the prizes won by the player
                            gamePlayer.setWorth(gamePlayer.getWorth() + 30);//uses mutator method of player class and stores the worth of prizes won by the player
                        }
                        if (guessNumber == 4)
                        {      
                            System.out.println("Congrats " + gamePlayer.getName() +  ", You won a MOUSE, worth $40\n");
                            gamePlayer.setPrize(gamePlayer.getPrize() + " MOUSE");//uses mutator method of player class and stores the prizes won by the player
                            gamePlayer.setWorth(gamePlayer.getWorth() + 40);//uses mutator method of player class and stores the worth of prizes won by the player
                        }
                        if (guessNumber == 5)
                        {      
                            System.out.println("Congrats " + gamePlayer.getName() +  ", You won a KEYBOARD, worth $50\n");
                            gamePlayer.setPrize(gamePlayer.getPrize() + " KEYBOARD");//uses mutator method of player class and stores the prizes won by the player
                            gamePlayer.setWorth(gamePlayer.getWorth() + 50);//uses mutator method of player class and stores the worth of prizes won by the player
                        }
                    }
                    else
                        System.out.println(gamePlayer.getName() +", Tough Luck Pal!! Give a try once more if you like\n");

                }

            } while(guessNumber > 5 || guessNumber<= 0);//This loop continues until the user enters the guess number only between 1 to 5
        }
        else
        {
            System.out.println("\nError: player has not been set up!\n");
            System.out.println("***********************************\n");
        }
    }

    /**
     * This is playGame method, 
     * this method allows as to start & play the LuckyVendingMachine game
     * (Note: in the Game class all the methods except the playGame method are kept private to keep the interface simple, for comments on each methods and its code
     * please check the code)
     * @param no parameters are passed
     * @return no values are returned
     */
    public void playGame()
    {               
        int option;
        do{
            do {
                displayMenu();
                option = input.nextInt();
                input.nextLine();
                if (option > 5 || option <= 0) 
                {
                    System.out.println("Error: Only choose 1-5\n");
                    System.out.println("***********************************\n");
                }
            }
            while(option > 5 || option <=0);//This loop continues until the user enters the correct input which is the number between 1 to 5

            switch (option)
            {
                case 1: enterName(); break;               

                case 2: numberGuess(); break;

                case 3: prizeList(); break;

                case 4: helpMenu(); break;

                case 5: quitGame(); break;

                default:break; 
            }
        } while(option <= 4);//This loop continues until the user quits the game by opting option 5
    }

    /**
     * This is prizeList method, 
     * This method list the prizes won by the player by playing the LuckyVendingMachine game
     * @param no parameters are passed
     * @return no values are returned
     */
    private void prizeList()
    {
        if (isPlayerSetup)
        {
            if (gamePlayer.getPrize().equals(" "))
            {
                System.out.println("Sorry you have not won any prizes so far!!!!\n");
                System.out.println("You have spent a total amount of $" + gamePlayer.getExpenses() + "\n\n");
            }
            else
            {
                System.out.println("\nPlayer " + gamePlayer.getName() + " has won these prizes :\n" );
                System.out.println(gamePlayer.getPrize());//uses the accessor method of Player class to get the prize list of the player
                System.out.println("\nPrizes worth a total of $" + gamePlayer.getWorth());
                System.out.println("\nYou have spent a total amount of $" + gamePlayer.getExpenses() + "\n\n");
            }
        }
        else
        {
            System.out.println("Error: player has not been set up!\n");
            System.out.println("***********************************\n");
        }
    }

    /**
     * This is prizeTable method, 
     * This method list the table of prizes, its worth and cost to the player for playing the game
     * @param no parameters are passed
     * @return no values are returned
     */
    private void prizeTable()
    {
        System.out.println("************************************************************************************\n");
        System.out.println("Guess no                   Price Won           Price Worth         Cost to the player\n");
        System.out.println("1                              Pen                $10                     $1\n");
        System.out.println("2                              Book               $20                     $2\n");
        System.out.println("3                              DVD                $30                     $3\n");
        System.out.println("4                             Mouse               $40                     $4\n");
        System.out.println("5                            Keyboard             $50                     $5\n");
        System.out.println("************************************************************************************\n\n");
    }

    /**
     * This is quitGame method, 
     * This method allows a player to quit the game
     * @param no parameters are passed
     * @return no values are returned
     */
    private void quitGame()
    {
        System.out.println("Do you really want to quit Y/N?");
        String exitOption = input.next();
        if (exitOption.equals("Y"))
        {
            System.out.println("If you have won some prizes Don't forget to collect it from our reception");
            System.out.println("If not Don't worry you can always come back & try one more time\n");
            System.out.println("Good Bye!!! Thank You for playing");
        }
        else
            playGame();
    }

} 
