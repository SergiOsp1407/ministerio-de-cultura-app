
package classes;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

/**
 *
 * @author LENOVO
 */

@SuppressWarnings("serial")
public class ContainerPaints extends JPanel {
    
    private Image img = null;
	private ImageIcon icono;
        
        //Constructor

	public ContainerPaints(String urlFondo) {
		icono = new ImageIcon(urlFondo);        
		img = icono.getImage();      
	}

	public void cambiarImagen(String urlFondo) {
		icono = new ImageIcon(urlFondo);        
		img = icono.getImage();     
	}

	protected void paintComponent(Graphics g){
		g.drawImage(img, 1, 1, getWidth(),getHeight(),this);
		setOpaque(false);
	}
    
}
