import java.util.Comparator;

public class SortByName implements Comparator<Card>{
   
    public int compare(Card a, Card b)
    {
        return a.name.compareTo (b.name);
        
    }
}

