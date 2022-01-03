package Structural.Adapter;

import Structural.Adapter.adapters.RoundPegAdapter;
import Structural.Adapter.adapters.SquarePegAdapter;
import Structural.Adapter.round.RoundHole;
import Structural.Adapter.round.RoundPeg;
import Structural.Adapter.square.SquareHole;
import Structural.Adapter.square.SquarePeg;

public class Main {
    public static void main(String[] args) {

        RoundHole hole = new RoundHole(5);
        RoundPeg rpeg = new RoundPeg(5);
        if (hole.fits(rpeg)) {
            System.out.println("Round peg r5 fits round hole r5.");
        }

        SquarePeg smallSqPeg = new SquarePeg(2);
        SquarePeg largeSqPeg = new SquarePeg(20);

        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square peg w2 fits round hole r5.");
        }
        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5.");
        }

        //////////////////////////////////////

        SquareHole squareHole = new SquareHole(10);
        SquarePeg squarePeg = new SquarePeg(10);
        if (squareHole.fits(squarePeg)){
            System.out.println("Square peg w10 fits square hole w10.");
        }

        RoundPeg smallRoundPeg = new RoundPeg(4);
        RoundPeg largeRoundPeg = new RoundPeg(10);

        RoundPegAdapter smallRoundPegAdapter = new RoundPegAdapter(smallRoundPeg);
        RoundPegAdapter largeRoundPegAdapter = new RoundPegAdapter(largeRoundPeg);

        if (squareHole.fits(smallRoundPegAdapter)) {
            System.out.println("Round peg r4 fits square hole w10.");
        }
        if (!squareHole.fits(largeRoundPegAdapter)) {
            System.out.println("Round peg r10 does not fit into square hole w10.");
        }
    }
}
