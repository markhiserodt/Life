import java.util.*;

public class StopCareer extends Stop
{
    SalaryCardsDeck salaries = new SalaryCardsDeck();
    CareerCardsDeck careers = new CareerCardsDeck();
    Scanner reader = new Scanner( System.in );
    public void getAction( Player i )
    {
        System.out.println( "You hit a stop on location 11\nNow pick your career!\n" );
        i.setCareerCard( careers.pickCareer() );
        System.out.println( "Your career is: " + i.getCareerCard().getCareer() );
        i.setSalaryCard( salaries.pickSalary() );
        System.out.println( "Your salary is: " + i.getSalaryCard().getValue() + "\n" );
        System.out.println( "I hope you are happy with your new career!" );
        reader.nextLine();
        System.out.println( "\u000c" );
    }
}