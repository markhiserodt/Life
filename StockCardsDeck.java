import java.util.*;

public class StockCardsDeck
{
    static List<StockCard> stocks = new ArrayList<StockCard>();
    static int c;
    StockCardsDeck()
    {
        if ( c == 0 )
        {
            stocks.add( new StockCard( 1 ) );
            stocks.add( new StockCard( 2 ) );
            stocks.add( new StockCard( 3 ) );
            stocks.add( new StockCard( 4 ) );
            stocks.add( new StockCard( 5 ) );
            stocks.add( new StockCard( 6 ) );
            stocks.add( new StockCard( 7 ) );
            stocks.add( new StockCard( 8 ) );
            stocks.add( new StockCard( 9 ) );
            stocks.add( new StockCard( 10 ) );
        }
        c++;
    }
    
    public StockCard pickStock( int v )
    {
        int temp = 0;
        for ( int i = 0; i < stocks.size(); i++ )
        {
            if ( v == stocks.get( i ).getValue() ) temp = i;
            
        }
        return stocks.remove( temp );
    }
    
}