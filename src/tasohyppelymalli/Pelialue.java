/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasohyppelymalli;

import java.awt.Color;
import java.awt.Point;
import java.util.HashMap;
import java.util.Scanner;
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
        String kentta = "";
        kentta += "iiiiiiii" + "\n";
        kentta += "iiiiiiii" + "\n";
        kentta += "imipimii" + "\n";
        kentta += "iimmmiii" + "\n";
        kentta += "iiiiiiii" + "\n";
        
        Scanner lukija = new Scanner(kentta);
        int x = 0, y = 0;
        while (lukija.hasNextLine()) {
            String rivi = lukija.nextLine();
            for (char c : rivi.toCharArray()) {
                if (c == 'c') {}
                if (c == 'm') {
                    hahmolista.put(new Maapala(), new Point(x, y));
                }
                if (c == 'p') {
                    
                }
                
                x += 50; //hahmojen leveys
            }
            
            y += 50; //hahmojen korkeus
            x = 0;
        }
    }
}
