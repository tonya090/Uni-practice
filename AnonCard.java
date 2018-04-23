


public class AnonCard extends Card implements Comparable<Card>
{
    
    public AnonCard( int ID, double points)
    {
        super(ID,points);
    }
    
    public double calcPoint(double purchaseTotal)
    {
        return purchaseTotal*0.01;
    }
    
    public String cardDetailString(){
        return "==============================\nType: Anon\tCard ID: "+ID +"\tPoints: " +points+"\n";
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
}
