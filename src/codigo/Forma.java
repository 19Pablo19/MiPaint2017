/*
 * La clase forma es la clase comun a todos los objetos graficos
que estamos creando
contiene los metodos comunes de pintado y de calculo de poscicion de los vertices
y en las propiedades comunes de todos los obejtos graficos que estamos creando:
el color, el relleno, la posicion, w e y  y el numero de veces
 */
package codigo;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Polygon;

/**
 *
 * @author Pablo ALcazar
 */
public class Forma extends Polygon{
    
    Color color = null;
    boolean relleno = false;
    int x = 0;
    int y = 0;
    int numLados;
    
    
    public Forma (int _posX, int _posY, int [] _puntosX, int [] _puntosY, Color _color, boolean _relleno, int _numLados){
       
        super(_puntosX, _puntosY, _numLados);
        
        numLados = _numLados;
        this.x = _posX;
        this.y = _posY;
        calculaVertices(1);

        color = _color;
        relleno = _relleno;
    }
    
    public void dibujate(Graphics2D g2, int posY){
        
        
        int radio = this.y - posY;

        calculaVertices(radio);
        
       
        
        g2.setColor(color);
        if (relleno){
            g2.fill(this);
        }
        else {
            g2.draw(this);
        }
        
    }
    
    
    private void calculaVertices(int _radio){
        //_ para asignar un valor solo a este metodo
        
         for (int i=0; i<numLados; i++){
            this.xpoints[i] = (int) (this.x + _radio*Math.cos(2*Math.PI*(i+12)/npoints));
            this.ypoints[i] = (int) (this.y + _radio*Math.sin(2*Math.PI*(i+12)/npoints));
        }
    }
  
}