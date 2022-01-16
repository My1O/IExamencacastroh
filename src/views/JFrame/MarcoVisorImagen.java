package views.JFrame;
import java.awt.Color;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

import views.Panel.LaminaVisorImagen;

public class MarcoVisorImagen extends JFrame implements ActionListener{
	public MarcoVisorImagen()
	{
		initPantalla();
		
	}
	public void initPantalla()
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		setLayout(null);
       	setBounds(350,200,350,400 );
		setTitle("Marco Visor Imagen");
		setVisible(true);
		setForeground(Color.green);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		add(visor);
		
		Image miIcono = miPantalla.getImage("src/imagenes/home.png");
		setIconImage(miIcono);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		initPantalla();
	}
	LaminaVisorImagen visor = new LaminaVisorImagen();
	private JLabel image;
}
