/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasohyppelymalli;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import javax.swing.JPanel;

/**
 *
 * @author Cherubi
 */
public class Pelialue extends JPanel {
    private HashMap<Hahmo, Point> hahmolista;
    
    public Pelialue() {
        this.setLayout(null);
        this.setBackground(new Color(120, 180, 250));
        
        this.hahmolista = new HashMap<Hahmo, Point>();
    }
    
    private void alustaKentta() {
        
    }
}
