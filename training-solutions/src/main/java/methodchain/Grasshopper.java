package methodchain;

public class Grasshopper {
    private int position;

    public Grasshopper hopOnce(Direction direction){
        if(direction == Direction.NEGATIVE){
            --position;
        } else if(direction == Direction.POSITIVE){
            ++position;
        }
        return this;
    }

    public void moveFromZeroToThreeWithFiveHops(){
        this.hopOnce(Direction.NEGATIVE)
            .hopOnce(Direction.POSITIVE)
            .hopOnce(Direction.POSITIVE)
            .hopOnce(Direction.POSITIVE)
            .hopOnce(Direction.POSITIVE);
    }

    public int getPosition() {
        return position;
    }
}
