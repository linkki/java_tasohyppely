/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasohyppelymalli;

import java.awt.Point;
import java.awt.event.ActionEvent;
import java.util.HashMap;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.KeyStroke;

/**
 *
 * @author Cherubi
 */
public class Pelaaja extends Hahmo {
    private HashMap<Hahmo, Point> hahmot;
    private HashMap<String, Boolean> nappaimet;
    
    public Pelaaja(HashMap<Hahmo, Point> hahmot) {
        super("Pelihahmo.png");
        
        this.hahmot = hahmot;
        
        listaaNappaimetJaSeuraukset();
    }
    
    private void listaaNappaimetJaSeuraukset() {
        this.nappaimet = new HashMap<String, Boolean>();
        
        this.nappaimet.put("oikealle", false);
        this.nappaimet.put("vasemmalle", false);
        this.nappaimet.put("ylös", false);
        
        InputMap syy = getInputMap(WHEN_IN_FOCUSED_WINDOW);
        ActionMap seuraus = getActionMap();
        
        Action oikeallePainallus = new AbstractAction() {
            public void actionPerformed(ActionEvent ae) {
                nappaimet.put("oikealle", true);
                System.out.println("Nuoli oikealle pohjassa");
            }
        };
        syy.put(KeyStroke.getKeyStroke("RIGHT"), "oikealle");
        seuraus.put("oikealle", oikeallePainallus);
    }
}
