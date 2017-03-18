package whiteTile;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.Random;

/**
 * Created on 18/03/2017.
 */
public class WhiteTile implements ActionListener, MouseListener {

    public final static int TILE_WIDTH = 250, TILE_HEIGHT = 250;

    public static WhiteTile dttwt;

    public ArrayList<Tile> tiles;

    public Renderer renderer;

    public Random random;

    public int score, milSecDelay;

    public boolean delay;

    public WhiteTile(){

        JFrame frame = new JFrame("White tale");

        Timer timer = new Timer(20, this);

        tiles = new ArrayList<Tile>();
        renderer = new Renderer();
        random = new Random();

        frame.setSize(TILE_WIDTH*3,TILE_HEIGHT*3);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        start();
        timer.start();
    }

    public void start(){
        for (int x = 0; x<3; x++){
            for (int y = 0; y<4; y++){
                boolean canBeBlack = true;
                for (Tile tile : tiles){
                    if (tile.y == y && tile.black){
                        canBeBlack = false;
                    }
                }
                if (!canBeBlack){
                    tiles.add(new Tile(x,y, false));
                }
                else{
                    tiles.add(new Tile(x,y, random.nextInt(3) == 0 || x == 2));
                }

            }
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }


    public void render(Graphics g){
        for (Tile tile : tiles){
            g.setColor(tile.black ? Color.BLACK: Color.WHITE);
            g.fillRect(tile.x * TILE_WIDTH, tile.y * TILE_HEIGHT - tile.animateY, TILE_WIDTH, TILE_HEIGHT);
            g.setColor(tile.black ? Color.WHITE: Color.BLACK);
            g.drawRect(tile.x * TILE_WIDTH+1, tile.y * TILE_HEIGHT - tile.animateY-1, TILE_WIDTH-1, TILE_HEIGHT-1);
        }
    }

    public static void main(String[] args) {

        dttwt = new WhiteTile();
    }


    public void repaint(Graphics g) {
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        for (int i = 0; i < tiles.size(); i++){
            Tile tile = tiles.get(i);

            if (tile.pointInTile(e.getX(), e.getY())){
                if (tile.black){
                    tile.animateY -= TILE_HEIGHT;
                    tile.y++;

                    for

                }
                else {
                    gameOver = true;
                }
            }
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}