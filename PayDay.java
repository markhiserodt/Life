public class PayDay implements BoardSquares
{
    public void getAction( Player i )
    {
        i.addMoney( i.getSalaryCard().getValue() );
    }
    
    public String toString()
    {
        return "PayDay!";
    }
}