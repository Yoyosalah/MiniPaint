/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Rectangle2D;
import java.util.HashMap;

/**
 *
 * @author Youss
 */
public class Rectangle extends Shapes{
    public Rectangle(double width,double height,Point position) {
        this.properties = new HashMap<>();
        this.position = position;
        this.properties.put("width",width);
        this.properties.put("height",height);
        this.color = Color.BLACK;
        this.fillColor = Color.BLUE;
    }
    
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2D = (Graphics2D) canvas;
        double width = properties.get("width");
        double height = properties.get("height");
        
        Rectangle2D.Double rectangle = new Rectangle2D.Double(position.x - width / 2, position.y - height / 2, width, height);
        g2D.setColor(this.fillColor);
        g2D.fill(rectangle);
        g2D.setColor(this.color);
        g2D.draw(rectangle);
    }
    
    
}
