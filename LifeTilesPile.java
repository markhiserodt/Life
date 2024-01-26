import java.util.*;

public class LifeTilesPile
{
    static List<LifeTile> lifeTiles = new ArrayList<LifeTile>();
    static int c;
    public LifeTilesPile()
    {
        if ( c == 0 )
        {
            lifeTiles.add( new LifeTile( 10000 ) );
            lifeTiles.add( new LifeTile( 10000 ) );
            lifeTiles.add( new LifeTile( 10000 ) );
            lifeTiles.add( new LifeTile( 10000 ) );
            lifeTiles.add( new LifeTile( 10000 ) );
            lifeTiles.add( new LifeTile( 10000 ) );
            lifeTiles.add( new LifeTile( 10000 ) );
            lifeTiles.add( new LifeTile( 20000 ) );
            lifeTiles.add( new LifeTile( 20000 ) );
            lifeTiles.add( new LifeTile( 20000 ) );
            lifeTiles.add( new LifeTile( 20000 ) );
            lifeTiles.add( new LifeTile( 20000 ) );
            lifeTiles.add( new LifeTile( 20000 ) );
            lifeTiles.add( new LifeTile( 30000 ) );
            lifeTiles.add( new LifeTile( 30000 ) );
            lifeTiles.add( new LifeTile( 30000 ) );
            lifeTiles.add( new LifeTile( 30000 ) );
            lifeTiles.add( new LifeTile( 30000 ) );
            lifeTiles.add( new LifeTile( 40000 ) );
            lifeTiles.add( new LifeTile( 40000 ) );
            lifeTiles.add( new LifeTile( 40000 ) );
            lifeTiles.add( new LifeTile( 40000 ) );
            lifeTiles.add( new LifeTile( 50000 ) );
            lifeTiles.add( new LifeTile( 50000 ) );
            lifeTiles.add( new LifeTile( 50000 ) );
        }
        c++;
    }
    
    public LifeTile pickLifeTile()
    {
        return lifeTiles.remove( (int)(Math.random() * lifeTiles.size()) );
    }
}