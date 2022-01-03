package Behavioral.Visitor.shapes;

import Behavioral.Visitor.visitor.Visitor;

public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
