package view;

import java.awt.Graphics;
import javax.swing.JPanel;
import java.awt.Image;
import javax.swing.ImageIcon;

public class LogoPanel extends JPanel{
    private Image imagen;
    
    public LogoPanel(String rutaImagen){
        try{
            imagen = new ImageIcon(getClass().getResource(rutaImagen)).getImage();
        }catch(Exception e){
            System.err.println("Error al cargar la imagen "+e.getMessage());
        }
    }
    
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        if(imagen != null){
            g.drawImage(imagen,0,0,this.getWidth(),this.getHeight(),this);
        }
    }
}
