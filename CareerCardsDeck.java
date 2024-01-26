import java.util.*;

public class CareerCardsDeck
{
    static List<CareerCard> careers = new ArrayList<CareerCard>();
    static int c = 0;
    public CareerCardsDeck()
    {
        if ( c == 0 )
        {
            careers.add( new CareerCard( "Accountant" ) );
            careers.add( new CareerCard( "Artist" ) );
            careers.add( new CareerCard( "Athlete" ) );
            careers.add( new CareerCard( "Computer Consultant" ) );
            careers.add( new CareerCard( "Doctor" ) );
            careers.add( new CareerCard( "Entertainer" ) );
            careers.add( new CareerCard( "Police Officer" ) );
            careers.add( new CareerCard( "Salesperson" ) );
            careers.add( new CareerCard( "Teacher" ) );
        }
        c++;
    }
    
    public CareerCard pickCareer()
    {
        return careers.remove( (int)(Math.random() * careers.size()) );
    }
    
}