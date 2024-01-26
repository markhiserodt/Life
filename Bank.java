import java.util.*;

public class Bank
{
    Scanner reader = new Scanner( System.in );
    public void takeLoan( Player i )
    {
        System.out.println( "How many loans would you like? ($20,000 each, must pay back $25,000)" );
        int num = reader.nextInt();
        i.addMoney( 20000 * num );
        i.addLoans( num );
        System.out.println ( "You now have: $" + i.getMoney() );
    } // end takeLoan method: calculates the amount of loans a player is taking
    
    public void payOffLoan( Player i )
    {
        System.out.println( "How many loans would you like to pay off?" );
        int num = reader.nextInt();
        System.out.println( "That will cost you $" + 25000 * num );
        System.out.println( "Are you sure? (1 for yes, 2 for no)" );
        if ( reader.nextInt() == 1 )
        {
            i.deductMoney( 25000 * num );
            i.removeLoans( num );
        }
        else 
            payOffLoan( i );
    } // end payOffLoan method: enables a player to pay off loans previously taken
    
} // end Bank class