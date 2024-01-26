import java.util.Scanner;

public class BlueSquareTradeSalary extends BlueSquare
{
    Scanner reader = new Scanner( System.in );
    PlayerList players = new PlayerList();
    SalaryCardsDeck salaries = new SalaryCardsDeck();
    
    public void getAtion( Player i )
    {
        System.out.println( "Would you like to trade salary cards with another player? (1 for yes, 2 for no)" );
        int answer = reader.nextInt();
        if ( answer == 1 )
        {
            System.out.println( "Here is a list of possibly salary cards to trade:" );
            for ( int j = 0; j < players.getSize(); j++ )
            {
                System.out.print( j+1 + ". " + players.getPlayer(j).getSalaryCard().getValue() );
                
            }
            System.out.println( "Enter the number of the salary card you would like to trade with: " );
            int salary = reader.nextInt();
            salaries.tradeSalaries( i, players.getPlayer( salary - 1 ) );
            System.out.println( "Your new salary is: " + i.getSalaryCard().getValue() );
            
        }
        else
            System.out.println( "You decided to keep your salary as: " + i.getSalaryCard().getValue() );
        
    }
    
}