/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileysnake;

import environment.Environment;
import grid.Grid;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;

/**
 *
 * @author Lauchlan
 */
class TrapHouse extends Environment {

    private Grid grid;
    private SnakeClass miley;

    public TrapHouse() {
        grid = new Grid(30, 25, 20, 20, new Point(10, 50), Color.BLACK);
        miley = new SnakeClass(Direction.LEFT, grid);
    }

    @Override
    public void initializeEnvironment() {
    }
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
            System.out.println("draw");
            miley.draw(graphics);
        }

    }
}
