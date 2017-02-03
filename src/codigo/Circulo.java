/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
 *
 * @author Pablo
 */
public class Circulo extends Ellipse2D.Double{
    
    Color color = null;
    
    boolean relleno = false;
    
    //Constructor 
    public Circulo (int _posX, int _posY, int _radio, Color _color, boolean _relleno){
        //Invoca a la clase donde se extiende (super)
        //Siempre que creas un constructor se crea un super implicito
        //super();
        this.x = _posX;
        this.y = _posY;
        this.width = _radio;
        this.height = _radio;
        this.color = _color;
        this.relleno = _relleno;
        
    }
    
    public void dibujate( Graphics2D g2){
        g2.setColor(color);
        if (relleno){
            g2.fill(this);        
        }
        else{
            g2.draw(this);
        }
        
    }
    
}
