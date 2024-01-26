import java.util.*;

public class StopBuyHouse extends Stop
{
    HouseCardsDeck houses = new HouseCardsDeck();
    Scanner reader = new Scanner( System.in );
    public void getAction( Player i )
    {
        System.out.println( "Which house would you like to buy?" );
        HouseCard house1 = houses.pickHouse();
        HouseCard house2 = houses.pickHouse();
        System.out.println( house1 );
        System.out.println( "or" );
        System.out.println( house2 );
        System.out.println( "Enter 1 for " + house1.getDescription() + " or 2 for " + house2.getDescription() );
        System.out.println( "or 3 for neither" );
        int num = reader.nextInt();
        if ( num == 1 )
        {
            i.setHouseCard( house1 );
            i.deductMoney( house1.getValue() );
            houses.addHouse( house2 );
        }
        else if ( num == 2 )
        {
            i.setHouseCard( house2 );
            i.deductMoney( house2.getValue() );
            houses.addHouse( house1 );
        }
    }
    
    public String toString()
    {
        return "Welcome to your new home!";
    }
}