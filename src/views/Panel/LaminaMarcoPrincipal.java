package views.Panel;

import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.ImageIcon;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

public class LaminaMarcoPrincipal extends JPanel{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	JMenu menu = new JMenu();
	
	Toolkit miPantalla = Toolkit.getDefaultToolkit();
	Image miIcono = miPantalla.getImage("home.png");
	ImageIcon imageIcono = new ImageIcon(miIcono) ;
	
	
	JMenuItem menuItem = new JMenuItem("Aplicacion", imageIcono);
	JMenuItem menuItem2 = new JMenuItem("Miscelaneo", imageIcono);
	
	public LaminaMarcoPrincipal()
	{
		add(menu);
		add(menuItem);
		add(menuItem2);
			
	}
}
