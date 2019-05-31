/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasohyppelymalli;

import javax.swing.JFrame;

/**
 *
 * @author Cherubi
 */
public class HyppelyIkkuna extends JFrame implements Runnable {
    
    
    @Override
    public void run() {
        this.setTitle("Hyppelypeli");
        this.setSize(400, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
