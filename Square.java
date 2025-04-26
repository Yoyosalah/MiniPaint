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
public class Square extends Shapes {
    public Square(double side,Point position) {
        this.properties = new HashMap<>();
        this.position = position;
        this.properties.put("side",side);
        this.color = Color.BLACK;
        this.fillColor = Color.GREEN;
    }
    
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2D = (Graphics2D) canvas;
        double side = properties.get("side");
        
        Rectangle2D.Double square = new Rectangle2D.Double(position.x-side/2, position.y-side/2, side, side);
        
        g2D.setColor(this.fillColor);
        g2D.fill(square);
        g2D.setColor(this.color);
        g2D.draw(square);
    }
    
}
