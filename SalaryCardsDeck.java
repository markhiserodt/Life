import java.util.*;

public class SalaryCardsDeck
{
    static List<SalaryCard> salaries = new ArrayList<SalaryCard>();
    static int c;
    SalaryCardsDeck()
    {
        if ( c == 0 )
        {
            salaries.add( new SalaryCard( 10000 ) );
            salaries.add( new SalaryCard( 20000 ) );
            salaries.add( new SalaryCard( 30000 ) );
            salaries.add( new SalaryCard( 40000 ) );
            salaries.add( new SalaryCard( 50000 ) );
            salaries.add( new SalaryCard( 60000 ) );
            salaries.add( new SalaryCard( 70000 ) );
            salaries.add( new SalaryCard( 80000 ) );
            salaries.add( new SalaryCard( 90000 ) );
            salaries.add( new SalaryCard( 100000 ) );
        }
        c++;
    }
    
    public SalaryCard pickSalary()
    {
        return salaries.remove( (int)(Math.random() * salaries.size()) ); 
    }
    
    public void addSalary( SalaryCard s )
    {
        salaries.add( s );
    }
    
    public void tradeSalaries( Player i, Player j )
    {
        SalaryCard temp = i.getSalaryCard();
        i.setSalaryCard( j.getSalaryCard() );
        j.setSalaryCard( temp );
    }
}