import java.util.Scanner;

public class BlueSquareTeacher extends BlueSquare
{
    Scanner reader = new Scanner( System.in );
    CareerCardsDeck careers = new CareerCardsDeck();
    
    public void getAction( Player i )
    {
        System.out.println( "Would you like to pick a new career? (1 for yes, 2 for no)" );
        String answer = reader.nextLine();
        if ( answer.equals( "1" ) )
        {
            i.setCareerCard ( careers.pickCareer() );
            System.out.println( "Your new career is: " + i.getCareerCard().getCareer() );
            
        }
        else
            System.out.println( "You decided to keep your career as: " + i.getCareerCard().getCareer() );
        
    }
    
}