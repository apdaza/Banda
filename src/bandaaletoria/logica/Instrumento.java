/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaletoria.logica;

import java.awt.Graphics;

/**
 *
 * @author Estudiantes
 */
public abstract class Instrumento {
    
    public abstract void dibujar(Graphics g, int x, int y);
    
    public abstract void tocar();
    
}
