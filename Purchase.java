


public class Purchase 
{
    public int reciept_ID;
    public Card card;
    public String time;
    public double[] purchaseDetails;
    public String[] cats;
    
    public Purchase(int reciept_ID,Card card,String time,double[] purchaseDetails)
    {
        this.reciept_ID = reciept_ID;
        this.card = card;
        this.time = time;
        this.purchaseDetails = purchaseDetails;
        card.points += card.calcPoint(total());
        
        cats=new String[]{"Meat", "Drinks", "Vegetables", "Seafood", "Bread"};
    }
    
    public double total()
    {
        double total=0;
        
        for (Double value : purchaseDetails)
        {
            total+=value;
        }
        return total;
    }
    
    public String recieptString()
    {
        String reciept="";
        reciept+="Recipt ID:"+reciept_ID+" \n"+ "Card ID: ";
        if (card.ID==0)
        {
            reciept+="0(Cash)\n";
        }
        else
        {
            reciept+=card.ID+"\n";
        }
        reciept+="Purchase Time:"+time+" \n=============================\n";
        
        for(int i = 0;i<purchaseDetails.length;i++)
        {
            reciept+=cats[i]+"     \t"+purchaseDetails[i]+"\n";
        }
        
        reciept+="=============================\n";
        reciept+="total: \t"+total()+"\n";
        reciept+="Points Earned:"+card.calcPoint(total())+"\n";
        reciept+="Current Points:"+card.points+"\n";
        return reciept;
    }
}
