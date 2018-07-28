import java.awt.*;
import java.applet.Applet;

public class Appl extends Applet
{
    private int a,b;

    public void init()
    {
        a=Integer.parseInt(getParameter("par1"));
        b=Integer.parseInt(getParameter("par2"));
    }

    public void paint(Graphics g) {
        g.setFont(new Font("Arial", Font.BOLD, 12));
        g.setColor(Color.RED);

        g.drawString("Parameters are " + a + " and " + b, 10, 30);

        g.setFont(new Font("Times New Roman", Font.BOLD, 18));
        g.setColor(Color.BLUE);

        g.drawString("Code Base :" + getCodeBase().toString(), 10, 60);
        g.drawString("Document Base : " + getDocumentBase().toString(), 10, 90);
    }
}
