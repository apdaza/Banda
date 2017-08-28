/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaletoria.logica;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;

/**
 *
 * @author Estudiantes
 */
public class Bajo extends Instrumento{

    @Override
    public void dibujar(Graphics g) {
        System.out.println("Dibujando el bajo");
        Image img = new ImageIcon(this.getClass().getResource("../imagenes/bajo.png")).getImage();
        g.drawImage(img, 0, 0, null);
    }

    @Override
    public void tocar() {
        System.out.println("Tocando el bajo");
    }
    
}
