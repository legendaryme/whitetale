package whiteTale;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Time;
import java.util.ArrayList;

/**
 * Created on 18/03/2017.
 */
public class WhiteTale implements ActionListener {

    public final int TILE_WIDTH = 250, TILE_HEIGHT = 450;

    public static WhiteTale dttwt;

    public ArrayList<Tile> tiles;

    public Renderer renderer;

    public WhiteTale(){

        JFrame frame = new JFrame();

        Timer timer = new Timer(20, this);

        renderer = new Renderer();

        frame.setSize(TILE_WIDTH*3,TILE_HEIGHT*3);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        timer.start();
    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public void render(Graphics g){
        for (Tile tile : tiles){
            g.setColor(Color.BLACK);
            g.setColor(Color.BLACK);
            g.drawRect(tile.x * TILE_WIDTH, tile.y * TILE_HEIGHT - tile.animateY, TILE_WIDTH, TILE_HEIGHT);
            g.fillRect(tile.x * TILE_WIDTH, tile.y * TILE_HEIGHT - tile.animateY, TILE_WIDTH, TILE_HEIGHT);
        }
    }

    public static void main(String[] args) {

        dttwt = new WhiteTale();
    }


    public void repaint(Graphics g) {
    }

}
