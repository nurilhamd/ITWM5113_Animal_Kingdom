import java.awt.*;

public class WhiteTiger extends Tiger {
    boolean hasInfected;

    public WhiteTiger(){
        hasInfected=false;
    }


    public Color getColor() {
        return Color.WHITE;
    }

    //"tgr" if it hasn’t infected another Critter yet, “TGR” if it has infected.
    public String toString() {
        if (hasInfected){
            return super.toString();
        } else {
            return "tgr";
        }
    }

    // Same as with the tiger
    public Action getMove(CritterInfo info) {
        if (info.getFront()==Neighbor.OTHER){
            hasInfected=true;
        }
        return super.getMove(info);

    }
}
