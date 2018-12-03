
/**
 * This is a player class which helps to store the data regarding the player for the lucking vending machine game.
 *
 * @author (Sunil Cyriac)
 * @version (1.1 06/09/2017)
 */

public class Player
{
    //instance varibales required to initialize the player class
    private int expenditure;
    private String playerName;
    private String prizes;       
    private int prizeWorth;    

    /**
     * Constructor for objects of class Player
     * here all the instance variables are initalized
     */ 
    public Player()
    {
        expenditure = 0;
        playerName = "";
        prizes = " ";
        prizeWorth = 0;
    }

    /**
     * Method to get the player's expenses by playing the LuckyVendingMachine game.
     * 
     * @param no parameters are passed
     * @return returns the expenditure of the player for playing the LuckyVendingMachine game
     */ 
    public int getExpenses()
    {
        return expenditure;
    }

    /**
     * Method to get the player's name used for playing the LuckyVendingMachine game.
     * 
     * @param no parameters are passed
     * @return returns the name of the player used for playing the LuckyVendingMachine game
     */ 
    public String getName()
    {
        return playerName;
    }

    /**
     * Method to get the list of prizes won by the player playing LuckyVendingMachine game.
     * 
     * @param no parameters are passed
     * @return returns the list of prizes won by the player playing LuckyVendingMachine game.
     */ 
    public String getPrize()
    {
        return prizes;
    }

    /**
     * Method to get the worth of all the prizes won by the player playing LuckyVendingMachine game.
     * 
     * @param no parameters are passed
     * @return returns the worth of all the prizes won by the player playing LuckyVendingMachine game.
     */ 
    public int getWorth()
    {
        return prizeWorth;
    }        

    /**
     * Method to store the expenses of the player by playing LuckyVendingMachine game.
     * 
     * @param expense parameter is used to pass the value of each expenses by the player playing LuckyVendingMachine game.
     * @return no values are retured.
     */ 
    public void setExpenses(int expense)
    {
        expenditure = expense;
    }

    /**
     * Method to store the name of the player by playing LuckyVendingMachine game.
     * 
     * @param name parameter is used to pass the name of the player entered in LuckyVendingMachine game.
     * @return no values are retured.
     */ 
    public void setName(String name)
    {
        playerName = name;
    }   

    /**
     * Method to store the list of prizes won by the player by playing LuckyVendingMachine game.
     * 
     * @param prize parameter is used to pass the name of the prizes won by the player playing the LuckyVendingMachine game.
     * @return no values are retured.
     */ 
    public void setPrize(String prize)
    {
        prizes = prize;
    } 

    /**
     * Method to store the total worth of the prizes won by the player by playing LuckyVendingMachine game.
     * 
     * @param worth parameter is used to pass the worth or cost of each prizes won by the player playing the LuckyVendingMachine game.
     * @return no values are retured.
     */ 
    public void setWorth(int worth)
    {
        prizeWorth = worth;
    }           
}
