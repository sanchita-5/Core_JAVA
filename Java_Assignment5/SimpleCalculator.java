import java.awt.*;
import java.awt.event.*;

class SimpleCalculator extends Frame implements ActionListener {
    TextField tf1, tf2, tfResult;
    Button add;

    SimpleCalculator() {
        setLayout(new FlowLayout());

        tf1 = new TextField(5);
        tf2 = new TextField(5);
        tfResult = new TextField(10);
        tfResult.setEditable(false);
        add = new Button("Add");

        add(tf1); add(tf2); add(add); add(tfResult);
        add.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        int a = Integer.parseInt(tf1.getText());
        int b = Integer.parseInt(tf2.getText());
        tfResult.setText(String.valueOf(a + b));
    }

    public static void main(String[] args) {
        SimpleCalculator calc = new SimpleCalculator();
        calc.setSize(300, 150);
        calc.setTitle("Calculator");
        calc.setVisible(true);
    }
}
