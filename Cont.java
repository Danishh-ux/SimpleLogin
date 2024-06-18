import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Cont implements ActionListener {

    static public Container m1() {
        JFrame frame = new JFrame();
        Container c = frame.getContentPane();
        frame.setLayout(new GridLayout(20, 02));

        JLabel lblusername = new JLabel("Username");
        JLabel lblpassword = new JLabel("Password");
        JTextField txtusername = new JTextField();

        JPasswordField txtpassword = new JPasswordField();
        txtpassword.setEchoChar('*');

        JButton submit = new JButton("Submit");
        JButton cancel = new JButton("Cancel");

        c.add(lblusername);
        c.add(txtusername);
        c.add(lblpassword);
        c.add(txtpassword);

        JFrame frame2 = new JFrame();
        frame2.setLayout(new GridLayout(1, 2));

        Container c2 = frame2.getContentPane();

        c2.add(cancel);
        c2.add(submit);
        c.add(c2);

        JLabel msg = new JLabel("");
        msg.setBackground(null);
        c.add(msg);

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        submit.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                msg.setText("Invalid Password");
            }
        });

        return c;
    }

    public static void main(String[] args) {

        JFrame frame = new JFrame("Login");

        frame.setLayout(new BorderLayout());

        JLabel north = new JLabel("Welcome to the login page");
        north.setFont(new Font("serif", Font.BOLD, 50));
        north.setHorizontalAlignment(JLabel.CENTER);

        JLabel south = new JLabel();
        JLabel east = new JLabel(
                "                                             ");
        JLabel west = new JLabel(
                "                                             ");

        frame.add(north, BorderLayout.NORTH);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(m1(), BorderLayout.CENTER);

        frame.setSize(400, 400);
        frame.pack();
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}