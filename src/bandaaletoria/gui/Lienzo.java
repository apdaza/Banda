/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bandaaletoria.gui;

import bandaaletoria.logica.Banda;
import bandaaletoria.logica.Guitarra;
import bandaaletoria.logica.Instrumento;
import java.awt.Canvas;
import java.awt.Graphics;
import java.util.Random;

/**
 *
 * @author estudiantes
 */
public class Lienzo extends Canvas{

    @Override
    public void paint(Graphics g) {
        Banda b = new Banda();
        Random rn = new Random();
        int cantidadMusicos = rn.nextInt(15);
        b.crearBanda(cantidadMusicos);
        b.presentarbanda(g);
    }
    
    
    
}
