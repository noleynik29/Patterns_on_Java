package Structural.Adapter.adapters;

import Structural.Adapter.round.RoundPeg;
import Structural.Adapter.square.SquarePeg;

public class RoundPegAdapter extends SquarePeg {
    private RoundPeg peg;

    public RoundPegAdapter(RoundPeg peg) {
        this.peg = peg;
    }

    @Override
    public double getWidth() {
        double result;
        result = peg.getRadius()*2;
        return result;
    }
}
