import java.awt.geom.Rectangle2D;
public class paddleee {
    private Rectangle2D.Double pad1;
    private Rectangle2D.Double pad2;
    public static final int WIDTH = 90;
    public static final int HEIGHT = 20;

    private final int[] yPositions = {10, 70, 130, 200, 270,330,390};
    private int pos = 4;

    public paddleee() {
        super();
        pad1 = new Rectangle2D.Double(10, 250, HEIGHT, WIDTH);
        pad2 = new Rectangle2D.Double(610, 250, HEIGHT, WIDTH);
    }

    public void ar1() {
        if( pos > 0 ) {
            pos--;
            pad1.y = yPositions[pos];
        }
    }
    public void aw2() {
        if( pos < 6) {
            pos++;
            pad1.y = yPositions[pos];
        }
    }
    public void az2() {
        if( pos > 0 ) {
            pos--;
            pad2.y = yPositions[pos];
        }
    }
    public void ac2() {
        if( pos < 6 ) {
            pos++;
            pad2.y = yPositions[pos];
        }
    }
    public double b1(){
        return pad1.x;
    }
    public double b2(){
        return pad2.x;
    }
    public Rectangle2D.Double getRectangle1() {
        return pad1;
    }
    public Rectangle2D.Double getRectangle2() {
        return pad2;
    }
    public boolean check1( int x, int y) {
        return pad1.contains(x,y);
    }
    public boolean check2( int x, int y) {
        return pad2.contains(x,y);
    }
}