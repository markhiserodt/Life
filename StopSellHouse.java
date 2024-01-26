import java.util.*;

public class StopSellHouse extends Stop
{
    HouseCardsDeck houses = new HouseCardsDeck();
    Scanner reader = new Scanner( System.in );
    public void getAction( Player i )
    {
        System.out.println ( "Would you like to sell your house? (1 for yes, 2 for no)" );
        if ( reader.nextInt() == 1 )
        {
            int spin = i.spin();
            HouseCard house = i.getHouseCard();
            if ( spin < house.getLowOdds() )
                i.addMoney( house.getBadSellValue() );
            else if ( spin <= house.getHighOdds() )
                i.addMoney( house.getEvenSellValue() );
            else
                i.addMoney( house.getGoodSellValue() );
            i.setHouseCard( null );
            houses.addHouse( house );
            
            StopBuyHouse houseSquare = new StopBuyHouse();
            houseSquare.getAction( i );
        }
        
    }
    
    public String toString()
    {
        return "You have just sold your old home, and purchased a new one!";
    }
}