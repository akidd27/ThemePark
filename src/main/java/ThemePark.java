import attractions.Attraction;
import behaviours.IReviewed;
import stalls.Stall;
import people.Visitor;

import java.util.ArrayList;

public class ThemePark {

    private ArrayList<Attraction> attractions;
    private ArrayList<Stall> stalls;

    public ThemePark() {
        this.attractions = new ArrayList<>();
        this.stalls = new ArrayList<>();
    }

    public ArrayList<IReviewed> getAllReviewed(){
        ArrayList reviewables = new ArrayList<IReviewed>();
        reviewables.addAll(attractions);
        reviewables.addAll(stalls);
        return reviewables;
    }

    public void visit(Visitor visitor, Attraction attraction){
        attraction.incrementVisitCount();
        visitor.addAttraction(attraction);
    }
}
