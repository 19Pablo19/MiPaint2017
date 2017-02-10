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


public class Rombo extends Polygon{
    
    public Color color = null;
    public boolean relleno = false;
    
    public int x = 0;
    public int y = 0;
 
    
    public Rombo (int _x, int _y, int _height, int _width, Color _color, boolean _relleno){
        //Numero de puntos de la figura
        this.npoints = 4;
        
        this.xpoints[0] = _x ;
        this.ypoints[0] = _y + _height; //o width; 

        this.xpoints[1] = _x - _width; //o width/2;
        this.ypoints[1] = _y;
 
        this.xpoints[2] = _x;
        this.ypoints[2] = _y - _height; //o width;
        
        this.xpoints[3] = _x + _width; //o width/2;
        this.ypoints[3] = _y;
        
        
        
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
        
        public void redimension(int nuevoAncho, int nuevoAlto){
        
          
                    
            
            
            this.xpoints[0] = x ;             
        this.ypoints[0] = y + nuevoAlto; //o width; 

        this.xpoints[1] = x - nuevoAncho; //o width/2;
        this.ypoints[1] = y;
 
        this.xpoints[2] = x;
        this.ypoints[2] = y - nuevoAlto; //o width;
        
        this.xpoints[3] = x + nuevoAncho; //o width/2;
        this.ypoints[3] = y;
        }
        
}
