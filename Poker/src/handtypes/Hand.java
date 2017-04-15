package handtypes;

import java.util.ArrayList;
import poker.Card;

public abstract class Hand implements Comparable {
    
    public abstract double getPoints();

    @Override
    public int compareTo(Object o) {
        Hand other =  (Hand)o;
        return (int)(1000000 * (other.getPoints() - this.getPoints()));
    }
    
    public abstract ArrayList<Card> generateHand();
    
}