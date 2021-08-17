
package user_interface;

import classes.ContainerPaints;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 *
 * @author LENOVO
 */
public class gallery extends javax.swing.JFrame{
    
    private static final Color COLOR_APP = new Color(99,4,75);
	private JFrame ventana;
	final private ArrayList<ContainerPaints> listImg;
	private JPanel nav;
	private JPanel contendorBotones;
	private ContainerPaints foto;
        
    public gallery() {
		listImg = new ArrayList<ContainerPaints>();
		windowConfig();
		componentsConfig();
		ventana.setVisible(true);
	}

	private void windowConfig() {
		ventana = new JFrame();
		ventana.setSize(1200, 600);
		ventana.setTitle("Galería");
		ventana.setLocationRelativeTo(null);
		ventana.setResizable(false);
		ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		ventana.getContentPane().setBackground(COLOR_APP);
	}

	private void componentsConfig() {

		contendorBotones = new JPanel(new GridLayout(5, 1));
		JScrollPane scrol = new JScrollPane(contendorBotones);
		
		JButton btnAlegria = new JButton();
		btnAlegria.setText("Rafael");
		btnAlegria.setForeground(Color.getHSBColor(99,4,75));
		///*---->Evento Local<------ */
		btnAlegria.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foto.cambiarImagen("src/images/m_paint1.jpg");
				ventana.paintComponents(ventana.getGraphics());
			}
		});
		contendorBotones.add(btnAlegria);
		
		JButton btnAmigos = new JButton();
		btnAmigos.setText("Vincent");
		btnAmigos.setForeground(Color.getHSBColor(99,4,75));
		///*---->Evento Local<------ */
		btnAmigos.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foto.cambiarImagen("src/images/m_paint2.jpg");
				ventana.paintComponents(ventana.getGraphics());
			}
		});
		contendorBotones.add(btnAmigos);
		
		JButton btnCielo = new JButton();
		btnCielo.setText("Rembrandt");
		btnCielo.setForeground(Color.getHSBColor(99,4,75));
		///*---->Evento Local<------ */
		btnCielo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foto.cambiarImagen("src/images/m_paint3.jpg");
				ventana.paintComponents(ventana.getGraphics());
			}
		});
		contendorBotones.add(btnCielo);
		
		
		JButton btnSonrisa = new JButton();
		btnSonrisa.setText("Artist");
		btnSonrisa.setForeground(Color.getHSBColor(99,4,75));
		///*---->Evento Local<------ */
		btnSonrisa.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foto.cambiarImagen("src/images/m_paint4.jpg");
				ventana.paintComponents(ventana.getGraphics());
			}
		});
                contendorBotones.add(btnSonrisa);
                
                
                JButton jButton_Return = new JButton();
		jButton_Return.setText("Return");
		jButton_Return.setForeground(Color.getHSBColor(99,4,75));
		///*---->Evento Local<------ */
		jButton_Return.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				foto.cambiarImagen("src/images/nofoto.gif");
				ventana.paintComponents(ventana.getGraphics());
			}
                        

                    
		});
		contendorBotones.add(jButton_Return);
                
		ventana.add(scrol, BorderLayout.LINE_START);

		foto = new ContainerPaints("src/images/nofoto.gif");
		foto.setBorder(BorderFactory.createMatteBorder(15, 15, 15, 15, COLOR_APP));
		ventana.add(foto, BorderLayout.CENTER);
	}
}        
        
        

    
    
    

