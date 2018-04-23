

public class BasicCard extends Card implements Comparable<Card>
{
    //protected String name;
    public String email;
    public double balance;
    
    public BasicCard( int ID, double points, String name, String email, double balance )
    {
        super(ID,points);
        this.email=email;
        this.name=name;
        this.balance=balance;
    }
    
    public double calcPoint(double purchaseTotal)
    {
        if (balance<500)
        {
            return purchaseTotal*0.015;
        }
        else
        {
            return purchaseTotal*0.02;            
        }
        
    }
    
    public String cardDetailString(){
        return "==============================\nType: Basic\tCard ID: "+ID +"\tPoints: " +points+"\tname: "+name+"\t\tEmail: "+email+"\tBalance: "+balance+"\n";
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
