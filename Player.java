import java.util.*;

public class Player
{
    private String color;
    private int money, location, bankLoans;
    static int numOfPlayers, lowestPosition;
    private SalaryCard salary;
    private StockCard stock;
    private CareerCard career;
    private HouseCard house;
    private List<LifeTile> lifeTiles = new ArrayList<LifeTile>();
    
    public Player() {
        
    }

    public Player( String c )
    {
        this.color = c;
        this.numOfPlayers++;
    } // end Player constructor: assigns color to color variable and keeps track of number of players
    
    public String getColor()
    {
        return this.color;
    } // end getColor method: returns color of player
    
    public int getMoney()
    {
        return this.money;
    } // end getMoney method: returns the amount of money a palyer has

    public int getLocation()
    {
        return this.location;
    } // end getLocation method: returns the location of a palyer on the Life board
    
    public void setLocation( int l )
    {
        this.location = l;
    } // end setLocation method: sets the location of a player to a new location on the Life board
    
    public StockCard getStockCard()
    {
        return this.stock;
    } // end getStockCard method: returns the StockCard of a player (if applicable)
    
    public void setStockCard( StockCard s )
    {
        this.stock = s;
    } // end setStockCard method: sets the StockCard of a player if purchased
    
    public CareerCard getCareerCard()
    {
        return this.career;
    } // end getCareerCard emthod: returns the CareerCard of a player
    
    public void setCareerCard( CareerCard c )
    {
        this.career = c;
    } // end setCareerCard method: sets the CareerCard of a player
    
    public SalaryCard getSalaryCard()
    {
        return this.salary;
    } // end getSalaryCard method: returns the SalaryCard of a player
    
    public void setSalaryCard( SalaryCard s )
    {
        this.salary = s;
    } // end setSalaryCard method: sets the SalaryCard of a player
    
    public HouseCard getHouseCard()
    {
        return this.house;
    } // end getHouseCard method: returns the HouseCard of a player
    
    public void setHouseCard( HouseCard h )
    {
        this.house = h;
    } // end setHouseCard method: sets the HouseCard of a player
    
    public int getLifeTiles()
    {
        return lifeTiles.size();
    } // end getLifeTiles method: returns the number of Life Tiles a player has
    
    public void addLifeTile( LifeTile l )
    {
        lifeTiles.add( l );
    } // end addLifeTile method: adds a Life Tile to a player's lifeTiles list
    
    public void removeLifeTile()
    {
        lifeTiles.remove(0);
    } // end removeLifeTile method: removes a Life Tile from a player's lifeTile list
    
    public void addMoney( int amount )
    {
        this.money += amount;
    } // end addMoney method: adds money to a player
    
    public void deductMoney( int amount )
    {
        this.money -= amount;
    } // end deductMoney method: removes money from a player
    
    public void addLoans( int num )
    {
        bankLoans += num;
    } // end addLoans method: adds a number of loans to player
    
    public void removeLoans( int num )
    {
        bankLoans -= num;
    } // end removeLoans method: removes a number of loans from a player
    
    public int getLoans()
    {
        return bankLoans;
    }
    
    public int spin()
    {
        int spin = (int) (Math.random()*10 + 1);
        System.out.println( "You spun: " + spin + "\n");
        return spin;
    } // end spin method: returns a random number between 1 and 10 for a player to move
    
    public String toString()
    {
        String str = color + " player has: " + "$" + money + "\n" +
               "Is on location: " + location + "\n" +
               "Has " + lifeTiles.size() + " life tiles" + "\n" +
               "Has " + bankLoans + " bank loans" + "\n";
        if ( career != null )
            str += "\nHas career: " + career.getCareer() + "\n";
        if ( salary != null )
            str += "Gets paid: $" + salary.getValue() + "\n";
        if ( house != null )
            str += "Has house: " + house.getDescription() + "\n";
        if ( stock != null )
            str += "Has stock: " + stock.getValue();
            
        return str;
    } // end toString method: prints out a player's money, location, number of Life Tiles, number of bank loans, career, house, and stocks
    
} // end Player class