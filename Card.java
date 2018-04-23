

public class Card implements Comparable<Card>
{
    protected int ID;
    protected double points;
    public String name="";
    
    public Card ( int ID, double points)
    {
        this.ID = ID;
        this.points = points;
    }
    
    public double calcPoint(double purchaseTotal)
    {
        return 0;
    }
    
    public String cardDetailString(){
        return "==============================\nType: Cash\tCard ID: "+ID +"\tPoints: " +points+"\n";
    }
    
    public static int SortByName (Card a, Card b){
        return a.name.compareTo (b.name);
    }
    
    public boolean equals (Card other)
    {
        return this.name.equals (other.name);
    }
    
    public int compareTo(Card other){
        return name.compareTo(other.name);
    }

    public String email(){
        return "";
    }
    public double balance(){
        return 0;
    }
}
