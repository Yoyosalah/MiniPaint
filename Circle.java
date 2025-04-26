/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.Shape;
import java.util.HashMap;
import java.util.Map;
import java.awt.geom.*;

/**
 *
 * @author Youss
 */
public class Circle extends Shapes {
    public Circle(double radius,Point position) {
        this.properties = new HashMap<>();
        this.position = position;
        this.properties.put("radius",radius);
        this.color = Color.BLACK;
        this.fillColor = Color.RED;
    }
    
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2D = (Graphics2D) canvas;
        double radius = properties.get("radius");
        
        Ellipse2D.Double circle = new Ellipse2D.Double(position.x - radius, position.y - radius, 2*radius, 2*radius);
        g2D.setColor(this.fillColor);
        g2D.fill(circle);
        g2D.setColor(this.color);
        g2D.draw(circle);
        
    }

    
    
}
