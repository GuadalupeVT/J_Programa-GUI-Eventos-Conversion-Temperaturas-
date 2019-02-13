import java.awt.FlowLayout;

import javax.swing.*;

class ConversorTemperaturas{
	
	public double centigradosAFahrenheit(double gradosC){
		return gradosC*1.8+32;
	}
	public double fahrenheitACentigrados(double gradosF){
		return (gradosF-32)/1.8;
	}
}

class Ventana extends JFrame {
	JTextField cajaEntrada, cajaSalida;
	public Ventana(){
		//configuracion ventana
				getContentPane().setLayout(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setTitle("Eventos cajas");
				setSize(300,300);
				setLocationRelativeTo(null);
				setVisible(true);
				JPanel panel=new JPanel();
				panel.setSize(300,300);
				panel.setLayout(null);
				
				JLabel lblConvertir=new JLabel("Convertir: ");
				lblConvertir.setBounds(10,10,80,10);
				panel.add(lblConvertir);
				
				cajaEntrada=new JTextField();
				
				
				add(panel);
				
	}
}

public class Prueba {

	public static void main(String[] args) {
SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new Ventana();
				
			}
		});

	}

}
