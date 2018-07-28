import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Appl2 extends Applet
{
    public void init() {
        TextField in = new TextField(10);
        Button calc = new Button("Calculate");
        Button clear=new Button("Clear");
        TextField out = new TextField(100);

        out.setEditable(false);
        this.add(new Label("Enter N    "));
        this.add(in);
        this.add(new Label("N! is      "));
        this.add(out);
        this.add(calc);
        this.add(clear);

        Fact cf = new Fact(in, out);
        calc.addActionListener(cf);
        clear.addActionListener(cf);
    }
}
class Fact implements ActionListener {
    private TextField in;
    private TextField out;

    Fact(TextField in, TextField out) {
        this.in = in;
        this.out = out;
    }

    public void actionPerformed(ActionEvent actionEvent) {
        if (actionEvent.getActionCommand().equals("Calculate")) {
            int n = Integer.parseInt(in.getText());
            long fact = 1;
            for (int i = 1; i <= n; i++)
                fact = fact * i;
            out.setText("" + fact);
        } else {
            in.setText("");
            out.setText("");
        }
    }
}