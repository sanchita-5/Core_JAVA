import java.awt.*;
import java.awt.event.*;

class LoginForm extends Frame implements ActionListener {
    TextField user, pass;
    Button login;

    LoginForm() {
        setLayout(new FlowLayout());

        add(new Label("Username:"));
        user = new TextField(10);
        add(user);

        add(new Label("Password:"));
        pass = new TextField(10);
        pass.setEchoChar('*');
        add(pass);

        login = new Button("Login");
        add(login);

        login.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (user.getText().equals("admin") && pass.getText().equals("1234")) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
    }

    public static void main(String[] args) {
        LoginForm f = new LoginForm();
        f.setSize(250, 200);
        f.setTitle("Login Form");
        f.setVisible(true);
    }
}
