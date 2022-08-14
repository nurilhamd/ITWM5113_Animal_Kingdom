import java.awt.*;

public class Bear extends Critter {
    private boolean polar;
    private int moves;

    public Bear(boolean polar){
        this.polar=polar;
        getColor();
    }

    // Get color for the polar bear when it is true; white else black
    public Color getColor() {
        if (this.polar){
            return Color.WHITE;
        } else {
            return Color.BLACK;
        }
    }

    public String toString(){
        if (moves%2==0){
            return "/";
        } else {
            return "\\";
        }

    }
    // Avoid if any obstacle is in front
    public Action getMove(CritterInfo info){

        moves++;
        if(info.getFront()==Neighbor.OTHER){
            return Action.INFECT;
        } else if (info.getFront()==Neighbor.EMPTY){
            return Action.HOP;
        } else {
            return super.getMove(info);
        }
    }

}
