public class Retirement extends Stop
{
    public void getAction( Player i )
    {
        System.out.println( "You've retired!\nFirst, you've paid off your bank loans of: " + i.getLoans() );
        i.removeLoans( i.getLoans() );
        
        int spin = i.spin();
        HouseCard house = i.getHouseCard();
        if ( spin < house.getLowOdds() )
        {
            i.addMoney( house.getBadSellValue() );
            System.out.println( "Second, you've sold your house for a value of: " + house.getBadSellValue() );
        }
        else if ( spin <= house.getHighOdds() )
        {
            i.addMoney( house.getEvenSellValue() );
            System.out.println( "Second, you've sold your house for a value of: " + house.getEvenSellValue() );
        }
        else
        {
            i.addMoney( house.getGoodSellValue() );
            System.out.println( "Second, you've sold your house for a value of: " + house.getGoodSellValue() );
        }
        i.setHouseCard( null );
        
        i.setCareerCard( null );
        i.setSalaryCard( null );
        // i.setInsurance( null );
        
        System.out.print( "If you think you have the most money, go to the Millionaire Estate.\nOtherwise, go to the Countryside Acres. (1 for Millionaire Estate, 2 for Countryside Acres" );
        
    }
    
}