package views.Panel;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class LaminaMarcoPrincipal extends JPanel

{
	public LaminaMarcoPrincipal()
	
	{
		miPantalla = Toolkit.getDefaultToolkit(); 
		miIcono = miPantalla.getImage("home.png");
		imageIcono = new ImageIcon(miIcono) ;
		
	}
	
	private Toolkit miPantalla;
	private Image miIcono;
	private ImageIcon imageIcono;
	
}
