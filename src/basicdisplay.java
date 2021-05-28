import javax.swing.JApplet;
import java.awt.*;

public class basicdisplay extends JApplet {

    public void init() {}

    public void paint(Graphics g){
    super.paint(g);
    g.drawString("Hello Sir", 40, 40);
    }
}
