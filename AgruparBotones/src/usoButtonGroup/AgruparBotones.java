package usoButtonGroup;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class AgruparBotones extends JFrame implements ActionListener{
	
	//private JButton btnAceptar,btnCancelar;
	
	public AgruparBotones(String titulo) {
		
		//Creación de páneles
		Container principal = getContentPane();
		JPanel panel1 = new JPanel();
		JPanel radioPanel = new JPanel();
		JPanel panelImagen = new JPanel();
		JPanel panel2 = new JPanel();
		
        //Creación de los RadioButtons
        JRadioButton birdButton = new JRadioButton("Bird");
        birdButton.setMnemonic(KeyEvent.VK_B);
        birdButton.setActionCommand("bird");
        birdButton.setSelected(true);

        JRadioButton catButton = new JRadioButton("Cat");
        catButton.setMnemonic(KeyEvent.VK_C);
        catButton.setActionCommand("cat");

        JRadioButton dogButton = new JRadioButton("Dog");
        dogButton.setMnemonic(KeyEvent.VK_D);
        dogButton.setActionCommand("dog");

        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        rabbitButton.setMnemonic(KeyEvent.VK_R);
        rabbitButton.setActionCommand("rabbit");

        JRadioButton pigButton = new JRadioButton("Pig");
        pigButton.setMnemonic(KeyEvent.VK_P);
        pigButton.setActionCommand("pig");

        // se agreg1an los JRadioButton al ButtonsGroup
        ButtonGroup btgAnimalitos = new ButtonGroup();

        btgAnimalitos.add(birdButton);
        btgAnimalitos.add(catButton);
        btgAnimalitos.add(dogButton);
        btgAnimalitos.add(rabbitButton);
        btgAnimalitos.add(pigButton);

        //creando y obteniendo imagen desde su ubicación en src
        JLabel imagen = new JLabel(new ImageIcon("src/cotorro.jpg"));
        
        // agregando un layout al radioPanel y añadiendo los componentes al radioPanel
        radioPanel.setLayout(new GridLayout(0,1));
        
        radioPanel.add(birdButton);
        radioPanel.add(catButton);
        radioPanel.add(dogButton);
        radioPanel.add(rabbitButton);
        radioPanel.add(pigButton);
        
        // asignando un color al radioPanel
        radioPanel.setBackground(Color.RED);
        
        //creando  los botones
        JButton btnAceptar = new JButton("Aceptar");
        JButton btnCancelar = new JButton("Cancelar");
        
        // agregando los botones al panel2
        panel2.add(btnAceptar);
        panel2.add(btnCancelar);
        
        // agragando la imagen al panelImagen
        panelImagen.add(imagen);
        
        // agrgando radioPanel y panelImagen al panel1
        panel1.add(radioPanel);
        panel1.add(panelImagen);
        
        // agrgando el panel1 y panel2 al panel principal
        principal.add(panel1, BorderLayout.CENTER);
        principal.add(panel2, BorderLayout.SOUTH);

        principal.setBackground(Color.RED);

        pack();

        setTitle(titulo);
    }

    public void actionPerformed(ActionEvent e) {
        System.out.println("Evento producido por " + e.getActionCommand());
    }

	public static void main(String[] args) {
		 WindowListener l = new WindowAdapter() {
	            public void windowClosing(WindowEvent e) {
	                System.exit(0);
	            }
	        };

	        JFrame frame = new AgruparBotones("Curso de Java: Agrupar Botones");
	        frame.addWindowListener(l);

	        frame.pack();
	        frame.setVisible(true);

	}

}