/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasohyppelymalli;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.JPanel;

/**
 *
 * @author Cherubi
 */
public class Hahmo extends JPanel {
    public BufferedImage kuva;
    public int leveys, korkeus;
    
    public Hahmo(String kuvanimi) {
        this.leveys = 50;
        this.korkeus = 50;
        
        try {
            this.kuva = ImageIO.read( new File(kuvanimi) );
        } catch (Exception e) {
            System.out.println("Kuvan " + kuvanimi + " avaaminen ei onnistunut.");
            e.printStackTrace();
        }
    }
    
    @Override
    public void paintComponent(Graphics g) {
        g.drawImage(kuva, 0, 0, leveys, korkeus, this);
    }
}
