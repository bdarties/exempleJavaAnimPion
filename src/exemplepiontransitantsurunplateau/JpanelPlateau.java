/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplepiontransitantsurunplateau;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JPanel;

/**
 *
 * @author benoit
 */
public class JpanelPlateau extends JPanel {
    public int x = 5;
    public int y = 10;

    private Image img;

    public JpanelPlateau() {
        //img = Toolkit.getDefaultToolkit().createImage("./images/test.png");
        this.setBackground(Color.red);
    }

    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g); //To change body of generated methods, choose Tools | Templates.
        g.setColor(Color.blue);
        g.fillOval(x, y, 20, 20);
    }
    
    
}
