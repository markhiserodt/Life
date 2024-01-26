public class HouseCard extends Card
{
    private int value, badSellValue, evenSellValue, goodSellValue;
    private String description;
    private int lowOdds, highOdds;
    
    
    public HouseCard( String d, int v, int b, int e, int g, int l, int h )
    {
        description = d;
        value = v;
        badSellValue = b;
        evenSellValue = e;
        goodSellValue = g;
        lowOdds = l;
        highOdds = h;
    }
    
    public int getValue()
    {
        return value;
    }
    
    public String getDescription()
    {
        return description;
    }
    
    public int getBadSellValue()
    {
        return badSellValue;
    }
    
    public int getEvenSellValue()
    {
        return evenSellValue;
    }
    
    public int getGoodSellValue()
    {
        return goodSellValue;
    }
    
    public int getLowOdds()
    {
        return lowOdds;
    }
    
    public int getHighOdds()
    {
        return highOdds;
    }
    
    public String toString()
    {
        return "Name: " + description + "\n" +
               "Price: " + value + "\n" +
               "Odds: " + "1-" + (lowOdds - 1) + ": " + badSellValue + "\n" +
               "      " + lowOdds + "-" + highOdds + ": " + evenSellValue + "\n" +
               "      " + (highOdds + 1) + "-" + "10" + ": " + goodSellValue;
               
    }
}