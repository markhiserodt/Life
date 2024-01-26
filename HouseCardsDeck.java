import java.util.*;

public class HouseCardsDeck
{
    static private List<HouseCard> houses = new ArrayList<HouseCard>();
    static private int c;
    
    public HouseCardsDeck()
    {
        if ( c == 0 )
        {
            houses.add( new HouseCard( "Split-Level", 40000, 20000, 40000, 60000, 5, 8 ) );
            houses.add( new HouseCard( "Mobile Home", 60000, 30000, 60000, 80000, 4, 7 ) );
            houses.add( new HouseCard( "Log Cabin", 80000, 70000, 80000, 100000, 4, 8 ) );
            houses.add( new HouseCard( "Cozy Condo", 100000, 90000, 110000, 125000, 5, 8  ) );
            houses.add( new HouseCard( "Dutch Colonial", 120000, 100000, 130000, 150000, 3, 8 ) );
            houses.add( new HouseCard( "Beach House", 140000, 100000, 130000, 150000, 3, 8 ) );
            houses.add( new HouseCard( "Farm House", 160000, 140000, 180000, 200000, 3, 7 ) );
            houses.add( new HouseCard( "Tudor", 180000, 170000, 215000, 250000, 3, 9 ) );
            houses.add( new HouseCard( "Victorian", 200000, 180000, 225000, 300000, 3, 8 ) );
        }
        c++;
    }
    
    public HouseCard pickHouse()
    {
        return houses.remove( (int)(Math.random() * houses.size()) );
    }
    
    public void addHouse( HouseCard c )
    {
        houses.add( c );
    }
    
}