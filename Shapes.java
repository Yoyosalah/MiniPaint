/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab6;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.util.Map;

/**
 *
 * @author Youss
 */
public abstract class Shapes implements Shape {
    protected Point position;
    protected Map<String,Double> properties;
    protected Color color;
    protected Color fillColor;
    
    
    @Override
    public void setPosition(Point position) {
        this.position = position;
    }

    @Override
    public Point getPostion() {
        return this.position;
    }

    @Override
    public void setProperties(Map<String, Double> properties) {
        this.properties = properties;
    }

    @Override
    public Map<String, Double> getProperties() {
        return this.properties;
    }

    @Override
    public void setColor(Color color) {
        this.color = color;
    }

    @Override
    public void setFillColor(Color color) {
        this.fillColor = color;
    }

    @Override
    public Color getFillColor() {
        return this.fillColor;
    }

}
