import java.util.*;

public class Interface
{
    Scanner reader = new Scanner( System.in );
    Bank banker = new Bank();
    
    public void getOptions( Player i )
    {
        System.out.println ( "1: Spin" );
        System.out.println ( "2: Buy Stock" );
        System.out.println ( "3: Take out a bank loan" );
        System.out.println ( "4: Pay off a bank loan\n" );
        
        doOption( i, reader.nextInt() );
        System.out.println();
    } // end getOptions method: prints out the options a player has at the beginning of each turn
    
    public void doOption( Player i, int answer )
    {
        if ( answer  == 2 )
        {
            System.out.println ( "Which stock would you like to buy?" );
            // TODO IMPLEMENT STOCK OPTIONS
            getOptions( i ); 
        }
        else if ( answer == 3 )
        {
            banker.takeLoan( i );
            getOptions( i );
        }
        else if ( answer == 4 )
        {
            banker.payOffLoan( i );
            getOptions( i );
        }
    } // nd doOption method: executes the opition chosen by the player
    
} // end Interface class