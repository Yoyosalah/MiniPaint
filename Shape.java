/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Youss
 */
public interface Shape {
    // set and get position
    public void setPosition(Point position);
    public Point getPostion();
    // update shape properties
    public void setProperties(Map<String,Double> properties);
    public Map<String,Double> getProperties();
    // colorize
    public void setColor(Color color);
    public void setFillColor(Color color);
    public Color getFillColor();
    // redraw shape on the canvas
    public void draw(java.awt.Graphics canvas);
    
}
