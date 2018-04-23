

public class PremiumCard extends Card implements Comparable<Card>
{
    //protected String name;
    public String email;
    public double balance;
    
        public PremiumCard( int ID, double points, String name, String email, double balance )
    {
        super(ID,points);
        this.email=email;
        this.name=name;
        this.balance=balance;
    }
    
    public double calcPoint(double purchaseTotal)
    {
         if (purchaseTotal<40 && balance<1000)
        {
            return purchaseTotal*0.025;
        }
        else
        {
            return purchaseTotal*0.03;            
        }
    }
    public String cardDetailString(){
        return "==============================\nType: Premium\tCard ID: "+ID +"\tPoints: " +points+"\tname: "+name+"\t\tEmail: "+email+"\tBalance: "+balance+"\n";
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
        return email;
    }
    public double balance(){
        return balance;
    }
}
