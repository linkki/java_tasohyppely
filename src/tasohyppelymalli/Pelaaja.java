/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasohyppelymalli;

import java.awt.Point;
import java.util.HashMap;

/**
 *
 * @author Cherubi
 */
public class Pelaaja extends Hahmo {
    private HashMap<Hahmo, Point> hahmot;
    
    public Pelaaja(HashMap<Hahmo, Point> hahmot) {
        super("Pelihahmo.png");
        
        this.hahmot = hahmot;
    }
}
