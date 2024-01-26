import java.util.*;

public class PaySquare extends OrangeSquare
{
    private int value;
    private String career;
    private PlayerList players = new PlayerList();
    private String description;
    public PaySquare( int v )
    {
        value = v;
        description = "You have to pay $" + value + "!";
    }
    
    public PaySquare( int v, String c )
    {
        value = v;
        career = c;
        description = "You have to pay $" + value + " to " + career + "!";
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void getAction( Player i )
    {
        i.deductMoney( value );
        
        if ( i.getCareerCard() != null )
        {
            for ( int j = 0; j < players.getSize(); j++ )
            {
                if ( players.getPlayer( j ).getCareerCard() != null )
                {
                    if ( players.getPlayer(j).getCareerCard().getCareer().equals( career ) )
                    {
                        players.getPlayer(j).addMoney( value );
                    }
                }
            }
        }
    }
    
    public String toString()
    {
        return description;
    }
}