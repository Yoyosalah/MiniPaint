package lab6;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */

/**
 *
 * @author Youss
 */
public interface DrawingEngine {
    // Manage shapes objects
    public void addShape(Shape shape);
    public void removeShape(Shape shape);
    
    // return the created shapes objects
    public Shape[] getShapes();
    // redraw all shapes on the canvas
    public void refresh(java.awt.Graphics canvas);
}
