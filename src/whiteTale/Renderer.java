package whiteTale;

import javax.swing.*;
import java.awt.*;

public class Renderer extends JPanel{

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        if (WhiteTale.wt != null){
            WhiteTale.wt.render(g);
        }
        WhiteTale.wt.render(g);
    }
}
