public class CollectSquare extends OrangeSquare
{
    private int value;
    public CollectSquare( int v )
    {
        value = v;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public void getAction( Player i )
    {
        i.addMoney( value );
    }
    
    public String toString()
    {
        return "You get $" + value;
    }
}