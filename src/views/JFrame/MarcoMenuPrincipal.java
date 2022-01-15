package views.JFrame;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

import views.Panel.LaminaMarcoPrincipal;

public class MarcoMenuPrincipal extends JFrame{
	
	public MarcoMenuPrincipal()
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		
		Dimension sizePantalla = miPantalla.getScreenSize();
		int anchoPantalla = sizePantalla.width;
		int alturaPantalla = sizePantalla.height;
		setBounds(0 , 0 , anchoPantalla  , alturaPantalla  );
		setTitle("Marco Menu Principal");
		setVisible(true);
		add(marcoPrincipal);
	}
	
	LaminaMarcoPrincipal marcoPrincipal = new LaminaMarcoPrincipal();
}
