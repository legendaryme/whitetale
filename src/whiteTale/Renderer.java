package whiteTale;

import javax.swing.*;
import java.awt.*;

/**
 * Created on 19/03/2017.
 */
public class Renderer extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        WhiteTale.dttwt.repaint(g);
    }
}
