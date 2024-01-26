import java.util.*;

public class PlayerList
{
    static List<Player> players = new ArrayList<Player>();
    
    public void addPlayer( Player i )
    {
        players.add( i );
    } // end addPlayer method: adds player to players List
    
    public void removePlayer( Player i )
    {
        for ( int j = 0; j < players.size(); j++ )
        {
            if ( players.get(j).equals(i) )
                players.remove(j);
        } // end for loop: removes player from players List
        
    }
    
    public Player getPlayer( int i )
    {
        return players.get(i);
    } // end getPlayer method: returns specific Player object
    
    public int getSize()
    {
        return players.size();
    } // end getSize method: returns the number of players in player List
    
}