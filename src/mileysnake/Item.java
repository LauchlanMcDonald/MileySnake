/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mileysnake;

import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author Lauchlan
 */
public class Item {

    Item(Point randomGridLocation) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void draw(Graphics graphics) {
        if (image != null) {
            graphics.drawImage(image, cellData.getSystemCoordX(x, getY()), cellData.getSystemCoordY(x, getY()), cellData.getCellWidth(), cellData.getCellHeight(), null);
        }
    }

    public Item(int x, int y, boolean alive, String type, CellDataProviderIntf cellData) {
        this.x = x;
        this.y = y;
        this.type = type;
        this.cellData = cellData;
        this.alive = true;

        if (type.equals(Item.ITEM_TYPE_POISON)) {
            this.image = ResourceTools.loadImageFromResource("mileysnake/skull_crossbones.png");
        } else if (type.equals(Item.ITEM_TYPE_FOOD)) {
            this.image = ResourceTools.loadImageFromResource("mileysnake/blue_pill.png");
        }
    }

    public Item(Point location, boolean alive, String type, CellDataProviderIntf cellData) {
        this.x = location.x;
        this.y = location.y;
        this.type = type;
        this.cellData = cellData;
        this.alive = true;

        if (type.equals(Item.ITEM_TYPE_POISON)) {
            this.image = ResourceTools.loadImageFromResource("mileysnake/skull_crossbones.png");
        } else if (type.equals(Item.ITEM_TYPE_FOOD)) {
            this.image = ResourceTools.loadImageFromResource("mileysnake/blue_pill.png");
        }
    }

    private int x, y;
    private boolean alive;
    private String type;
    private Image image;
    private CellDataProviderIntf cellData;

    public static final String ITEM_TYPE_FOOD = "FOOD";
    public static final String ITEM_TYPE_POISON = "POISON";

    /**
     * @return the x
     */
    public Point getLocation() {
        return new Point(x, getY());
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @return the type
     */
    public String getType() {
        return type;
    }

    /**
     * @return the image
     */
    public Image getImage() {
        return image;
    }

    /**
     * @param image the image to set
     */
    public void setImage(Image image) {
        this.image = image;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the alive
     */
    public boolean isAlive() {
        return alive;
    }

    /**
     * @param alive the alive to set
     */
    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @param x the x to set
     */
    public void setLocation(Point location) {
        this.x = location.x;
        this.y = location.y;
    }

}
