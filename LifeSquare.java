public class LifeSquare extends OrangeSquare
{
    LifeTilesPile lifeTiles = new LifeTilesPile();
    private String description = "LifeTile!";
    
    public void getAction( Player i )
    {
        i.addLifeTile( lifeTiles.pickLifeTile() );
    }
    
    public String toString()
    {
        return description;
    }
}
