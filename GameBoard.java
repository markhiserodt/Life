public class GameBoard
{
    private BoardSquares[] gameBoard = new BoardSquares[SQUARES];
    private Player[] playerBoard = new Player[SQUARES];
    static final int SQUARES = 132;
    
    Interface options = new Interface();
    
    public GameBoard()
    {
        gameBoard[1] = new CollectSquare( 20000 );
        gameBoard[2] = new PaySquare( 5000 );
        gameBoard[3] = new LifeSquare();
        gameBoard[4] = new CollectSquare( 5000 );
        gameBoard[5] = new CollectSquare( 5000 );
        gameBoard[6] = new LifeSquare();
        gameBoard[7] = new PaySquare( 5000 );
        gameBoard[8] = new LifeSquare();
        gameBoard[9] = new PaySquare(5000);
        gameBoard[10] = new LifeSquare();
        gameBoard[11] = new StopCareer();
        gameBoard[12] = new PayDay();
        gameBoard[13] = new LifeSquare();
        gameBoard[14] = new CollectSquare( 5000 );
        gameBoard[15] = new LifeSquare();
        gameBoard[16] = new PaySquare( 5000, "Doctor" );
        gameBoard[17] = new CollectSquare( 10000 );
        gameBoard[18] = new LifeSquare();
        gameBoard[19] = new LifeSquare();
        gameBoard[20] = new PayDay();
        gameBoard[21] = new PaySquare( 15000 );
        gameBoard[22] = new Stop();
        gameBoard[23] = new PaySquare( 10000 );
        gameBoard[24] = new LifeSquare();
        gameBoard[25] = new PaySquare( 10000, "Salesperson" );
        gameBoard[26] = new PaySquare( 10000 );
        gameBoard[27] = new PaySquare( 10000, "Computer Consultant" );
        gameBoard[28] = new PaySquare( 20000, "Teacher" );
        gameBoard[29] = new PayDay();
        gameBoard[30] = new PaySquare( 9999, "Accountant" );
        gameBoard[31] = new CollectSquare( 50000 );
        gameBoard[32] = new LifeSquare();
        gameBoard[33] = new StopBuyHouse();
        gameBoard[34] = new PayDay();
        gameBoard[35] = new LifeSquare();
        gameBoard[36] = new LifeSquare();
        gameBoard[37] = new PaySquare( 5000, "Salesperson" );
        gameBoard[38] = new LifeSquare();
        gameBoard[39] = new CollectSquare( 10000 );
        gameBoard[40] = new PayDay();
        gameBoard[41] = new LifeSquare();
        gameBoard[42] = new PaySquare( 20000, "Athlete" );
        gameBoard[43] = new LifeSquare();
        gameBoard[44] = new PaySquare( 5000, "Entertainer" );
        gameBoard[45] = new PaySquare( 40000 );
        gameBoard[46] = new PaySquare( 5000, "Salesperson" );
        gameBoard[47] = new LifeSquare();
        gameBoard[48] = new LifeSquare();
        gameBoard[49] = new LifeSquare();
        gameBoard[50] = new PayDay();
        gameBoard[51] = new PaySquare( 15000 );
        gameBoard[52] = new LifeSquare();
        gameBoard[53] = new LifeSquare();
        gameBoard[54] = new LifeSquare();
        gameBoard[55] = new LifeSquare();
        gameBoard[56] = new PayDay();
        gameBoard[57] = new PaySquare( 25000, "Computer Consultant" );
        gameBoard[58] = new PaySquare( 20000, "Teacher" );
        gameBoard[59] = new LifeSquare();
        gameBoard[60] = new PaySquare( 20000, "Artist" );
        gameBoard[61] = new PayDay();
        gameBoard[62] = new LifeSquare();
        gameBoard[63] = new CollectSquare( 10000 );
        gameBoard[64] = new LifeSquare();
        gameBoard[65] = new LifeSquare();
        gameBoard[66] = new PaySquare( 9999, "Accountant" );
        gameBoard[67] = new PaySquare( 25000, "Athlete" );
        gameBoard[68] = new PaySquare( 25000, "Computer Consultant" );
        gameBoard[69] = new PayDay();
        gameBoard[70] = new LifeSquare();
        gameBoard[71] = new StopSellHouse();
        gameBoard[72] = new PaySquare( 5000, "Teacher" );
        gameBoard[73] = new CollectSquare( 80000 );
        gameBoard[74] = new PaySquare( 15000, "Entertainer" );
        gameBoard[75] = new PayDay();
        gameBoard[76] = new LifeSquare();
        gameBoard[77] = new PaySquare( 35000, "Artist" );
        gameBoard[78] = new LifeSquare();
        gameBoard[79] = new PaySquare( 25000, "Salesperson" );
        gameBoard[80] = new CollectSquare( 75000 );
        gameBoard[81] = new PayDay();
        gameBoard[82] = new PaySquare( 25000, "Artist" );
        gameBoard[83] = new LifeSquare();
        gameBoard[84] = new CollectSquare( 95000 );
        gameBoard[85] = new PaySquare( 5000, "Teacher" );
        gameBoard[86] = new LifeSquare();
        gameBoard[87] = new PaySquare( 90000 );
        gameBoard[88] = new PayDay();
        gameBoard[89] = new PaySquare( 50000 );
        gameBoard[90] = new CollectSquare( 100000 );
        gameBoard[91] = new LifeSquare();
        gameBoard[92] = new PaySquare( 30000, "Athlete" );
        gameBoard[93] = new LifeSquare();
        gameBoard[94] = new PaySquare( 125000 );
        gameBoard[95] = new PayDay();
        gameBoard[96] = new PaySquare( 25000, "Doctor" );
        gameBoard[97] = new PaySquare( 9999, "Accountant" );
        gameBoard[98] = new PaySquare( 30000, "Salesperson" );
        gameBoard[99] = new PaySquare( 35000, "Athlete" );
        gameBoard[100] = new LifeSquare();
        gameBoard[101] = new LifeSquare();
        gameBoard[102] = new PayDay();
        gameBoard[103] = new PaySquare( 100000, "Entertainer" );
        gameBoard[104] = new LifeSquare();
        gameBoard[105] = new LifeSquare();
        gameBoard[106] = new LifeSquare();
        gameBoard[107] = new PaySquare( 100000, "Doctor" );
        gameBoard[108] = new PaySquare( 50000, "Teacher" );
        gameBoard[109] = new PayDay();
        gameBoard[110] = new PaySquare( 9999, "Accountant" );
        gameBoard[111] = new LifeSquare();
        gameBoard[112] = new LifeSquare();
        gameBoard[113] = new PaySquare( 125000, "Artist" );
        gameBoard[114] = new LifeSquare();
        gameBoard[115] = new LifeSquare();
        gameBoard[116] = new PayDay();
        gameBoard[117] = new LifeSquare();
        gameBoard[118] = new LifeSquare();
        gameBoard[119] = new PaySquare( 65000, "Athlete" );
        gameBoard[120] = new LifeSquare();
        gameBoard[121] = new PayDay();
        gameBoard[122] = new LifeSquare();
        gameBoard[123] = new LifeSquare();
        gameBoard[124] = new LifeSquare();
        gameBoard[125] = new PaySquare( 45000, "Computer Consultant" );
        gameBoard[126] = new LifeSquare();
        gameBoard[127] = new PayDay();
        gameBoard[128] = new PaySquare( 35000, "Entertainer" );
        gameBoard[129] = new PaySquare( 45000, "Computer Consultant" );
        gameBoard[130] = new CollectSquare( 20000 );
        gameBoard[131] = new LifeSquare();
        
    } // adds GameBoard constructor: adds Square objects to gameboard Array List
    
    public void doAction( Player i )
    {
        gameBoard[i.getLocation()].getAction( i );
        System.out.println( gameBoard[i.getLocation()] );
    } // end doAction method: executes action of a specific Square
    
    public void checkPayDay( Player i, int spin )
    {
        for ( int j = i.getLocation() + 1; j < i.getLocation() + spin; j++ )
        {
            if (gameBoard[j] instanceof Stop )
                break;
            
            if (gameBoard[j] instanceof PayDay )
            {
                System.out.println ( "You passed a PayDay!\n" );
                gameBoard[j].getAction( i );
            }
        }
        
    } // end checkPayDay method: checks to see if a player passes/lands on a PayDay Square
    
    public boolean checkStop( Player i, int spin )
    {
        for ( int j = i.getLocation() + 1; j <= i.getLocation() + spin; j++ )
        {
            if ( gameBoard[j] instanceof Stop )
            {
                gameBoard[j].getAction( i );
                i.setLocation( j );
                return true;
            }
        }
        return false;
    } // end checkStop method: checks to see if a player passes/lands on a Stop Square
    
    public void movePlayer( Player i, int spin )
    {
        checkPayDay( i, spin );
        if (  checkStop( i, spin ) )
        {
            System.out.println( i );
            options.getOptions( i );
            movePlayer( i, i.spin() );
        } 
        else 
        {
            if ( playerBoard[i.getLocation() + spin] == null )
            {
                playerBoard[i.getLocation() + spin] = i;
                i.setLocation( i.getLocation() + spin );
            }
            else 
            {
                playerBoard[i.getLocation() + spin + 1] = i;
                i.setLocation( i.getLocation() + spin + 1);
            }
            playerBoard[i.getLocation() - spin] = null;
        }
    } // end movePlayer method: switches a player's current position to null and new position to the player object
    
} // end GameBoard class