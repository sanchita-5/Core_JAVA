import java.awt.*;
import java.awt.Frame;

class SmileyFace extends Frame {
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.fillOval(100, 100, 200, 200); // Face

        g.setColor(Color.BLACK);
        g.fillOval(150, 150, 20, 20);   // Left eye
        g.fillOval(230, 150, 20, 20);   // Right eye

        g.drawArc(150, 200, 100, 50, 0, -180); // Smile
    }

    public static void main(String[] args) {
        SmileyFace f = new SmileyFace();
        f.setSize(400, 400);
        f.setTitle("Smiley Face");
        f.setVisible(true);
    }
}
