/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasohyppelymalli;

import javax.swing.JFrame;
import javax.swing.Timer;

/**
 *
 * @author Cherubi
 */
public class HyppelyIkkuna extends JFrame implements Runnable {
    private Pelialue pelialue;
    
    @Override
    public void run() {
        this.setTitle("Hyppelypeli");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        
        this.pelialue = new Pelialue();
        this.add(pelialue);
        
        Timer ajastin = new Timer(50, this.pelialue);
        ajastin.setRepeats(true);
        ajastin.start();
    }
}
