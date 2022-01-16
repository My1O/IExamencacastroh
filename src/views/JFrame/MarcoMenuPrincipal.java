package views.JFrame;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import views.Panel.LaminaMarcoPrincipal;

public class MarcoMenuPrincipal extends JFrame implements ActionListener{
	
	public MarcoMenuPrincipal()
	{
		Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Image miIcono = miPantalla.getImage("src/imagenes/home.png");
		Image miIcono2 = miPantalla.getImage("src/imagenes/setting.png");
		Image miIcono3 = miPantalla.getImage("src/imagenes/salir.png");
		Image miIcono4 = miPantalla.getImage("src/imagenes/visor.png");
		ImageIcon icono = new ImageIcon(miIcono2);
		ImageIcon icono2 = new ImageIcon(miIcono3);
		ImageIcon icono3 = new ImageIcon(miIcono4);
		setIconImage(miIcono);
		
		init();
		//JMenuBar creado y asociado al JFrame
		menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		//primer JMenu y lo pasamos como parametro al menuBar
		MenuMDI = new JMenu("Menu");
		menuBar.add(MenuMDI);
		
		//segundo objeto de JMenu y asociado al primer JMenu creado
		menuAplicacion = new JMenu("Aplicacion");
		menuMiscelaneos = new JMenu("Miscelaneo");
		MenuMDI.add(menuAplicacion);
		MenuMDI.add(menuMiscelaneos);
		//creamos los MenuItems y asociamos a los MENU correspondientes	
		Configurar = new JMenuItem("Configurar",icono);
		menuAplicacion.add(Configurar);
		Salir = new JMenuItem("Salir", icono2);
		menuAplicacion.add(Salir);
		Salir.addActionListener(this);
		visorImagenes = new JMenuItem("Visor Imagenes",icono3);
		menuMiscelaneos.add(visorImagenes);
		visorImagenes.addActionListener(this);
		add(marcoPrincipal);
	}
	
	public void init()
	{
		setLayout(null);
        Toolkit miPantalla = Toolkit.getDefaultToolkit();
		Dimension sizePantalla = miPantalla.getScreenSize();
		int anchoPantalla = sizePantalla.width;
		int alturaPantalla = sizePantalla.height;
		setBounds(0 , 0 , anchoPantalla  , alturaPantalla  );
		setTitle("Marco Menu Principal");
		setVisible(true);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == Salir)
		{
			System.exit(0);
		}
		if (e.getSource() == visorImagenes)
		{
			MarcoVisorImagen visorImagen = new MarcoVisorImagen();
			visorImagen.initPantalla();
		}	
	}
	
	LaminaMarcoPrincipal marcoPrincipal = new LaminaMarcoPrincipal();
	private JMenuBar menuBar;
	private JMenu MenuMDI;
	private JMenu menuAplicacion ;
	private JMenuItem Configurar;
	private JMenuItem Salir;
	private JMenu menuMiscelaneos;
	private JMenuItem visorImagenes;
	
	
}
