import java.awt.*;
import java.awt.event.*;

class ColorChanger extends Frame implements ActionListener {
    Button red, green, blue;

    ColorChanger() {
        setLayout(new FlowLayout());

        red = new Button("Red");
        green = new Button("Green");
        blue = new Button("Blue");

        add(red); add(green); add(blue);

        red.addActionListener(this);
        green.addActionListener(this);
        blue.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == red)
            setBackground(Color.RED);
        else if (e.getSource() == green)
            setBackground(Color.GREEN);
        else if (e.getSource() == blue)
            setBackground(Color.BLUE);
    }

    public static void main(String[] args) {
        ColorChanger f = new ColorChanger();
        f.setSize(300, 200);
        f.setTitle("Color Changer");
        f.setVisible(true);
    }
}
