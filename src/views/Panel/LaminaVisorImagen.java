package views.Panel;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class LaminaVisorImagen extends JPanel
{
	/**
	 * Camilo Castro
	 */
	private static final long serialVersionUID = 1L;
	
	public LaminaVisorImagen()
	{
		mensaje = new JLabel("Mensaje");
		mensaje.setText("Mensaje");
		add(mensaje);
	}
	private JLabel mensaje;
}
