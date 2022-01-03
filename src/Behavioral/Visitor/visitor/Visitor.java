package Behavioral.Visitor.visitor;

import Behavioral.Visitor.shapes.Circle;
import Behavioral.Visitor.shapes.CompoundShape;
import Behavioral.Visitor.shapes.Dot;
import Behavioral.Visitor.shapes.Rectangle;

public interface Visitor {
    String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
}