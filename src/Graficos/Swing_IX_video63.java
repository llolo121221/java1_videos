/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.imageio.*;

/**
 *
 * @author Santy
 */
public class Swing_IX_video63 {
    public static void main(String[] args) {
        
        MarcoImagen ca = new MarcoImagen();
        
       
    }
}

class MarcoImagen extends JFrame{
    public MarcoImagen(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(200,200,800,800);
        setTitle("Marco Imagen");
        laminaImagen ca= new laminaImagen();
        add(ca);
        ca.setBackground(new Color(180,210,255));
        setVisible(true);
    }
}

class laminaImagen extends JPanel{
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2=(Graphics2D) g;
        
        //File MiImagen=new File("src/graficos/loro.jpg");
        try{
        imagen=ImageIO.read(new File("src/graficos/loro.jpg"));
        }catch(IOException e){
            System.out.println("no se encontro la imagen");
        }
        
        g.drawImage(imagen, 0, 0, null);
        
        Rectangle2D rectangulo=new Rectangle2D.Double(0,200,400,400);
        g2.fill(rectangulo);
        g.copyArea(0, 0, 200, 200, 150, 300);
        g2.setColor(new Color(255,255,255));
        g2.fill(new Rectangle2D.Double(50,250,100,100));
        Color color=new Color(0,0,0).brighter();
        g2.setPaint(color);
        g2.drawString("cuadrado 100x100", 50, 290);
        
        
        
        
        
    }
    private Image imagen;
}
