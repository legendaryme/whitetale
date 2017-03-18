package whiteTale;

import javax.swing.*;

/**
 * Created on 18/03/2017.
 */
public class WhiteTale {

    public final int TILE_WIDTH = 250, TILE_HEIGHT = 450;

    public static WhiteTale dttwt;

    public WhiteTale(){

        JFrame frame = new JFrame();
        frame.setSize(TILE_WIDTH*3,TILE_HEIGHT*3);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }



    public static void main(String[] args) {

        dttwt = new WhiteTale();
    }

}
