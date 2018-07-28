import java.applet.*;
import java.awt.*;
import java.awt.event.*;
/*
<applet code="aplet.class" width="1000" height="500"></applet>
*/

public class NewtonApplet extends Applet implements ActionListener {

    private Button b1, b2;
    private TextField t0, t1, t2, t3, t4, t5;

    public void init() {
        b1 = new Button("Calculate");
        b2 = new Button("Clear");
        t0 = new TextField(5);
        t1 = new TextField(5);
        t2 = new TextField(5);
        t3 = new TextField(5);
        t4 = new TextField(5);
        t5 = new TextField(10);
        add(t3);
        add(new Label(" X^3"));

        add(t2);
        add(new Label("+ X^2"));

        add(t1);
        add(new Label("+ X^1"));

        add(t0);
        add(new Label("+ X^0"));

        add(new Label("X value"));
        add(t4);

        add(b1);
        add(b2);

        add(new Label("Calculated Root:"));
        add(t5);
        b1.addActionListener(this);
        b2.addActionListener(this);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == b1) {
            double fx;
            double dfx;
            double x;
            double cx3;
            double cx2;
            double cx1;
            double cx0;
            cx3 = Double.parseDouble(t3.getText());
            cx2 = Double.parseDouble(t2.getText());
            cx1 = Double.parseDouble(t1.getText());
            cx0 = Double.parseDouble(t0.getText());
            x = Double.parseDouble(t4.getText());
            dfx = ((cx3 * 3) * Math.pow(x, 2) + (cx2 * 2) * Math.pow(x, 1) + (cx1 * 1) * Math.pow(x, 0));
            fx = ((cx3) * Math.pow(x, 3) + (cx2) * Math.pow(x, 2) + (cx1) * Math.pow(x, 1) + (cx0) * Math.pow(x, 0));
            double y = x - (fx / dfx);
            t5.setText(String.valueOf(y));
        }

        if (ae.getSource() == b2) {
            t1.setText("");
            t2.setText("");
            t3.setText("");
            t4.setText("");
            t5.setText("");
        }

    }
}
