/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

/**
 *
 * @author Pablo
 */
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;


public class Triangulo extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    public int x=0;
    public int y=0;
    
    public Triangulo (int _x, int _y, int _width,  Color _color, boolean _relleno){
        //Numero de puntos de la figura
        this.npoints = 3;
        
        this.x = _x;
        this.y = _y;
        
        this.xpoints[0] = _x ;
        this.ypoints[0] = _y - _width/2; 

        this.xpoints[1] = _x + _width/2;
        this.ypoints[1] = _y + _width/2;
 
        this.xpoints[2] = _x - _width/2;
        this.ypoints[2] = _y + _width/2;
        
        this.color = _color;
        this.relleno = _relleno;
        
    }
        public void dibujate(Graphics2D g2, int posX){
            g2.setColor(this.color);
            if (this.relleno) {
                g2.fill(this);
            } else {
                g2.draw(this);
            }
    }
        
        public void redimension(int nuevoAncho){
        this.xpoints[0] = x ;
        this.ypoints[0] = y - nuevoAncho/2; 

        this.xpoints[1] = x + nuevoAncho/2;
        this.ypoints[1] = y + nuevoAncho/2;
 
        this.xpoints[2] = x - nuevoAncho/2;
        this.ypoints[2] = y + nuevoAncho/2;
        }
}
