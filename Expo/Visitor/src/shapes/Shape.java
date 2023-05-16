package shapes;

import visitor.Visitor;

/**
 *
 * @author cris9
 */
public interface Shape {
    void move(int x, int y);
    void draw();
    String accept(Visitor visitor);
}
