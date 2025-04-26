/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.geom.Line2D;
import java.util.HashMap;

/**
 *
 * @author Youss
 */
public class LineSegment extends Shapes{
    public LineSegment(double x1, double y1, double x2, double y2) {
        this.properties = new HashMap<>();
        this.properties.put("x1",x1);
        this.properties.put("y1",y1);
        this.properties.put("x2",x2);
        this.properties.put("y2",y2);
        this.fillColor = Color.BLACK;
    }
    
    @Override
    public void draw(Graphics canvas) {
        Graphics2D g2D = (Graphics2D) canvas;
        
        Line2D.Double line = new Line2D.Double(properties.get("x1"),properties.get("y1"),properties.get("x2"),properties.get("y2"));
        
        g2D.setColor(this.color);
        g2D.draw(line);
    }
    
}
