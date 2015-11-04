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

    Grid grid;
    
    
    public TrapHouse() {
        grid = new Grid(30, 25, 20, 20, new Point(10, 50), Color.BLACK);
        
    }

    @Override
    public void initializeEnvironment() {
    }

    @Override
    public void timerTaskHandler() {
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
        System.out.println("Mouse clicked at " + e.getPoint());
        System.out.println("Mouse clicked at " + grid.getCellLocationFromSystemCoordinate(e.getPoint()));
        

    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if(grid != null) {
            grid.paintComponent(graphics);
        }
    }
}
