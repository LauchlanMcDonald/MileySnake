/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileysnake;

import environment.Environment;
import grid.Grid;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 *
 * @author Lauchlan
 */
class TrapHouse extends Environment implements CellDataProviderIntf, MoveValidatorIntf {

    private Grid grid;
    private SnakeClass miley;
    private Barrier barrier;
    private ArrayList<Barrier> barriers;

    public TrapHouse() {

        grid = new Grid(30, 25, 20, 20, new Point(0, 0), new Color(220,220,220));
        miley = new SnakeClass(Direction.LEFT, grid, this);
        barrier = new Barrier(0, 0, Color.BLACK, this);
 background = ResourceTools.loadImageFromResource("MileySnake/Miley Cyrus.png");
        this.setBackground(background);
//<editor-fold defaultstate="collapsed" desc="Barriers">
        barriers = new ArrayList<>();
        barriers.add(new Barrier(0, 0, Color.GREEN, this));
        barriers.add(new Barrier(1, 0, Color.GREEN, this));
        barriers.add(new Barrier(2, 0, Color.GREEN, this));
        barriers.add(new Barrier(3, 0, Color.GREEN, this));
        barriers.add(new Barrier(4, 0, Color.GREEN, this));
        barriers.add(new Barrier(0, 1, Color.GREEN, this));
        barriers.add(new Barrier(0, 2, Color.GREEN, this));
        barriers.add(new Barrier(0, 3, Color.GREEN, this));
        barriers.add(new Barrier(0, 4, Color.GREEN, this));
        barriers.add(new Barrier(0, 5, Color.GREEN, this));
        barriers.add(new Barrier(0, 6, Color.GREEN, this));
        barriers.add(new Barrier(0, 7, Color.GREEN, this));
        barriers.add(new Barrier(5, 0, Color.GREEN, this));
        barriers.add(new Barrier(6, 0, Color.GREEN, this));
        barriers.add(new Barrier(7, 0, Color.GREEN, this));
        barriers.add(new Barrier(8, 0, Color.GREEN, this));
        barriers.add(new Barrier(0, 8, Color.GREEN, this));
        barriers.add(new Barrier(0, 9, Color.GREEN, this));
        barriers.add(new Barrier(0, 10, Color.GREEN, this));
        barriers.add(new Barrier(0, 11, Color.GREEN, this));
        barriers.add(new Barrier(0, 12, Color.GREEN, this));
        barriers.add(new Barrier(0, 13, Color.GREEN, this));
        barriers.add(new Barrier(0, 14, Color.GREEN, this));
        barriers.add(new Barrier(9, 0, Color.GREEN, this));
        barriers.add(new Barrier(10, 0, Color.GREEN, this));
        barriers.add(new Barrier(11, 0, Color.GREEN, this));
        barriers.add(new Barrier(12, 0, Color.GREEN, this));
        barriers.add(new Barrier(13, 0, Color.GREEN, this));
        barriers.add(new Barrier(14, 0, Color.GREEN, this));
        barriers.add(new Barrier(15, 0, Color.GREEN, this));
        barriers.add(new Barrier(16, 0, Color.GREEN, this));
        barriers.add(new Barrier(17, 0, Color.GREEN, this));
        barriers.add(new Barrier(18, 0, Color.GREEN, this));
        barriers.add(new Barrier(19, 0, Color.GREEN, this));
        barriers.add(new Barrier(20, 0, Color.GREEN, this));
        barriers.add(new Barrier(21, 0, Color.GREEN, this));
        barriers.add(new Barrier(22, 0, Color.GREEN, this));
        barriers.add(new Barrier(23, 0, Color.GREEN, this));
        barriers.add(new Barrier(24, 0, Color.GREEN, this));
        barriers.add(new Barrier(25, 0, Color.GREEN, this));
        barriers.add(new Barrier(26, 0, Color.GREEN, this));
        barriers.add(new Barrier(27, 0, Color.GREEN, this));
        barriers.add(new Barrier(28, 0, Color.GREEN, this));
        barriers.add(new Barrier(29, 0, Color.GREEN, this));
        barriers.add(new Barrier(0, 15, Color.GREEN, this));
        barriers.add(new Barrier(0, 16, Color.GREEN, this));
        barriers.add(new Barrier(0, 17, Color.GREEN, this));
        barriers.add(new Barrier(0, 18, Color.GREEN, this));
        barriers.add(new Barrier(0, 19, Color.GREEN, this));
        barriers.add(new Barrier(0, 20, Color.GREEN, this));
        barriers.add(new Barrier(0, 21, Color.GREEN, this));
        barriers.add(new Barrier(0, 22, Color.GREEN, this));
        barriers.add(new Barrier(0, 23, Color.GREEN, this));
        barriers.add(new Barrier(0, 24, Color.GREEN, this));
        barriers.add(new Barrier(1, 24, Color.GREEN, this));
        barriers.add(new Barrier(2, 24, Color.GREEN, this));
        barriers.add(new Barrier(3, 24, Color.GREEN, this));
        barriers.add(new Barrier(4, 24, Color.GREEN, this));
        barriers.add(new Barrier(5, 24, Color.GREEN, this));
        barriers.add(new Barrier(6, 24, Color.GREEN, this));
        barriers.add(new Barrier(7, 24, Color.GREEN, this));
        barriers.add(new Barrier(8, 24, Color.GREEN, this));
        barriers.add(new Barrier(9, 24, Color.GREEN, this));
        barriers.add(new Barrier(10, 24, Color.GREEN, this));
        barriers.add(new Barrier(11, 24, Color.GREEN, this));
        barriers.add(new Barrier(12, 24, Color.GREEN, this));
        barriers.add(new Barrier(13, 24, Color.GREEN, this));
        barriers.add(new Barrier(14, 24, Color.GREEN, this));
        barriers.add(new Barrier(15, 24, Color.GREEN, this));
        barriers.add(new Barrier(16, 24, Color.GREEN, this));
        barriers.add(new Barrier(17, 24, Color.GREEN, this));
        barriers.add(new Barrier(18, 24, Color.GREEN, this));
        barriers.add(new Barrier(19, 24, Color.GREEN, this));
        barriers.add(new Barrier(20, 24, Color.GREEN, this));
        barriers.add(new Barrier(21, 24, Color.GREEN, this));
        barriers.add(new Barrier(22, 24, Color.GREEN, this));
        barriers.add(new Barrier(23, 24, Color.GREEN, this));
        barriers.add(new Barrier(24, 24, Color.GREEN, this));
        barriers.add(new Barrier(25, 24, Color.GREEN, this));
        barriers.add(new Barrier(26, 24, Color.GREEN, this));
        barriers.add(new Barrier(27, 24, Color.GREEN, this));
        barriers.add(new Barrier(28, 24, Color.GREEN, this));
        barriers.add(new Barrier(29, 24, Color.GREEN, this));
        barriers.add(new Barrier(29, 1, Color.GREEN, this));
        barriers.add(new Barrier(29, 2, Color.GREEN, this));
        barriers.add(new Barrier(29, 3, Color.GREEN, this));
        barriers.add(new Barrier(29, 4, Color.GREEN, this));
        barriers.add(new Barrier(29, 5, Color.GREEN, this));
        barriers.add(new Barrier(29, 6, Color.GREEN, this));
        barriers.add(new Barrier(29, 7, Color.GREEN, this));
        barriers.add(new Barrier(29, 8, Color.GREEN, this));
        barriers.add(new Barrier(29, 9, Color.GREEN, this));
        barriers.add(new Barrier(29, 10, Color.GREEN, this));
        barriers.add(new Barrier(29, 11, Color.GREEN, this));
        barriers.add(new Barrier(29, 12, Color.GREEN, this));
        barriers.add(new Barrier(29, 13, Color.GREEN, this));
        barriers.add(new Barrier(29, 14, Color.GREEN, this));
        barriers.add(new Barrier(29, 15, Color.GREEN, this));
        barriers.add(new Barrier(29, 16, Color.GREEN, this));
        barriers.add(new Barrier(29, 17, Color.GREEN, this));
        barriers.add(new Barrier(29, 18, Color.GREEN, this));
        barriers.add(new Barrier(29, 19, Color.GREEN, this));
        barriers.add(new Barrier(29, 20, Color.GREEN, this));
        barriers.add(new Barrier(29, 21, Color.GREEN, this));
        barriers.add(new Barrier(29, 22, Color.GREEN, this));
        barriers.add(new Barrier(29, 23, Color.GREEN, this));
        barriers.add(new Barrier(29, 24, Color.GREEN, this));
//</editor-fold>

    }

    @Override
    public void initializeEnvironment() {
//        background = ResourceTools.loadImageFromResource("MileySnake/Miley Cyrus.png");
//        this.setBackground(background);

    }
    Image background;
    int moveDelay = 0;
    int moveDelayLimit = 4;

    @Override
    public void timerTaskHandler() {
//        System.out.println("timer " + ++counter);

        if (miley != null) {
            if (moveDelay >= moveDelayLimit) {
                miley.move();
                moveDelay = 0;
            } else {
                moveDelay++;
            }
        }

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
//        System.out.println("Key Character " + e.getKeyChar());
//        System.out.println("Key Code " + e.getKeyCode());

        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            miley.setDirection(Direction.LEFT);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            miley.setDirection(Direction.RIGHT);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            miley.setDirection(Direction.UP);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            miley.setDirection(Direction.DOWN);
        }

    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            miley.setDirection(Direction.LEFT);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            miley.setDirection(Direction.RIGHT);
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            miley.setDirection(Direction.UP);
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            miley.setDirection(Direction.DOWN);
        }

    }

    @Override
    public void environmentMouseClicked(MouseEvent e
    ) {
        System.out.println("Mouse clicked at " + e.getPoint());
        System.out.println("Mouse clicked at " + grid.getCellLocationFromSystemCoordinate(e.getPoint()));

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (grid != null) {
            
            grid.paintComponent(graphics);
        }
        if (miley != null) {
            miley.draw(graphics);
        }

        if (barriers != null) {
            for (int i = 0; i < barriers.size(); i++) {
                barriers.get(i).draw(graphics);
            }

            barrier.draw(graphics);
        }
        
    }

//<editor-fold defaultstate="collapsed" desc="CellDataProviderIntf">
    @Override
    public int getCellWidth() {
        return grid.getCellWidth();
    }

    @Override
    public int getCellHeight() {
        return grid.getCellHeight();
    }

    @Override
    public int getSystemCoordX(int x, int y) {
        return grid.getCellSystemCoordinate(x, y).x;
    }

    @Override
    public int getSystemCoordY(int x, int y) {
        return grid.getCellSystemCoordinate(x, y).y;

    }
//</editor-fold>

    @Override
    public Point validateMove(Point proposedLocation) {
        //if the x value of the head location is less than 0
        if (proposedLocation.x < 0) {
            //if above the middl of the grid, go down, else go up
            //
            System.out.println("OUT OF BOUNDS");
        }

        return proposedLocation;
    }

}
