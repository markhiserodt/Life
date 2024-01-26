import java.util.*;

public class Life
{
   public static void main (String [] args)
   {
       GameBoard gameBoard = new GameBoard();
       PlayerList players = new PlayerList();
       Interface options = new Interface();
       Scanner reader = new Scanner( System.in );
       
       players.addPlayer( new Player( "Orange" ) );
       players.addPlayer( new Player( "Blue" ) );

       int lowestPosition = 1;
       
       // while ( Player.lowestPosition < GameBoard.SQUARES )
       while ( lowestPosition < GameBoard.SQUARES )
       {
           for ( int i = 0; i < players.getSize(); i++ )
           {
               Player current = players.getPlayer(i);
               System.out.println ( current );
               options.getOptions( current );
               gameBoard.movePlayer( current, current.spin() );
               gameBoard.doAction( current );
               System.out.println ( current );
               reader.nextLine();
               System.out.print ( "\u000c" );
               System.out.print ( "------------------------------------\n" );
           } // end for loop: executes the options each player has at the beginning of each turn
           
           for ( int i = 0; i < lowestPosition; i++ )
           {
               if ( players.getPlayer(i).getLocation() < lowestPosition ) {
                lowestPosition = players.getPlayer(i).getLocation();
               }
           } // end for loop: keeps track of last player to end game
           
       }
       
   } // end main method
   
} // end Life class