/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileysnake;

import grid.Grid;
import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;
import java.awt.Color;
import java.awt.Image;

/**
 *
 * @author Lauchlan
 */
public class Snake {

    /**
     * @return the HEAD_POSITION
     */
    public static int getHEAD_POSITION() {
        return HEAD_POSITION;
    }

    /**
     * @param aHEAD_POSITION the HEAD_POSITION to set
     */
    public static void setHEAD_POSITION(int aHEAD_POSITION) {
        HEAD_POSITION = aHEAD_POSITION;
    }
//    private Object cellData;
    private final Image poison_1;
    private final Image apple_1;
    private final Image head_1;

    public Snake(Direction direction, Grid grid, MoveValidatorIntf validator) {
        this.direction = direction;
        this.grid = grid;
        this.validator = validator;

        //create the snake body
        body = new ArrayList<>();
        body.add(new Point(5, 15));
        body.add(new Point(5, 14));
        body.add(new Point(5, 13));
        body.add(new Point(4, 13));
        body.add(new Point(3, 13));

        head_1 = ResourceTools.loadImageFromResource("mileysnake/head_1.png");
        poison_1 = ResourceTools.loadImageFromResource("mileysnake/poison_alpha.png");
        apple_1 = ResourceTools.loadImageFromResource("mileysnake/shinny_apple.png");

    }
    
    
    public void resetMiley(){
        body = new ArrayList<>();
        body.add(new Point(3, 15));
        body.add(new Point(3, 15));
        body.add(new Point(3, 15));
        body.add(new Point(3, 15));
        body.add(new Point(3, 15));
    }

    private static int HEAD_POSITION = 0;

    private Direction direction = Direction.LEFT;
    private ArrayList<Point> body;
    private Grid grid;
    private Color bodyColor = new Color(51, 51, 51);
    private final MoveValidatorIntf validator;
    private int growthCounter;

    private int getHealth;
    private int setHealth;

    public void draw(Graphics graphics) {
        graphics.setColor(getBodyColor());

        for (int i = 0; i < body.size(); i++) {
            if (i == HEAD_POSITION) {
                graphics.drawImage(head_1,
                        grid.getCellSystemCoordinate(body.get(i).x, body.get(i).y).x,
                        grid.getCellSystemCoordinate(body.get(i).x, body.get(i).y).y,
                        grid.getCellWidth(),
                        grid.getCellHeight(),
                        null);

            } else {
                graphics.fillOval(getGrid().getCellSystemCoordinate(getBody().get(i)).x,
                        getGrid().getCellSystemCoordinate(getBody().get(i)).y,
                        getGrid().getCellWidth(),
                        getGrid().getCellHeight());
            }

        }

    }

    public void move() {
        //make a copy of the current head location
        Point newHead = new Point(getHead());

        if (getDirection() == Direction.LEFT) {
            newHead.x--;
        } else if (getDirection() == Direction.RIGHT) {
            newHead.x++;
        } else if (getDirection() == Direction.UP) {
            newHead.y--;
        } else if (getDirection() == Direction.DOWN) {
            newHead.y++;
        }

        //add new head
        getBody().add(HEAD_POSITION, validator.validateMove(newHead));

        //grow miley
        if (growthCounter > 0) {
            growthCounter--;
        } else {
            body.remove(body.size() - 1);
        }


    }

    public Point getHead() {
        return getBody().get(HEAD_POSITION);
    }

    /**
     * @return the direction
     */
    public Direction getDirection() {
        return direction;
    }

    /**
     * @param direction the direction to set
     */
    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    /**
     * @return the body
     */
    public ArrayList<Point> getBody() {
        return body;
    }

    /**
     * @param body the body to set
     */
    public void setBody(ArrayList<Point> body) {
        this.body = body;
    }

    /**
     * @return the grid
     */
    public Grid getGrid() {
        return grid;
    }

    /**
     * @param grid the grid to set
     */
    public void setGrid(Grid grid) {
        this.grid = grid;
    }

    /**
     * @return the bodyColor
     */
    public Color getBodyColor() {
        return bodyColor;
    }

    /**
     * @param bodyColor the bodyColor to set
     */
    public void setBodyColor(Color bodyColor) {
        this.bodyColor = bodyColor;
    }

    /**
     * @return the growthCounter
     */
    public int getGrowthCounter() {
        return growthCounter;
    }

    /**
     * @param growthCounter the growthCounter to set
     */
    public void setGrowthCounter(int growthCounter) {
        this.growthCounter = growthCounter;
    }

    /**
     * @return the growthCounter
     */
    public void addGrowthCounter(int growth) {
        this.growthCounter += growth;
    }

    /**
     * @return the getHealth
     */
    public int getGetHealth() {
        return getHealth;
    }

    /**
     * @param getHealth the getHealth to set
     */
    public void setGetHealth(int getHealth) {
        this.getHealth = getHealth;
    }

    /**
     * @return the setHealth
     */
    public int getSetHealth() {
        return setHealth;
    }

    /**
     * @param setHealth the setHealth to set
     */
    public void setSetHealth(int setHealth) {
        this.setHealth = setHealth;
    }

}
