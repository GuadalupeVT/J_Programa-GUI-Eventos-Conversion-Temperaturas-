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
	JComboBox comboEntrada, comboSalida;
	public Ventana(){
		//configuracion ventana
				getContentPane().setLayout(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setTitle("Convertidor de Temperaturas");
				setSize(300,300);
				setLocationRelativeTo(null);
				setVisible(true);
				JPanel panel=new JPanel();
				panel.setSize(300,300);
				panel.setLayout(null);
				
				JLabel lblConvertir=new JLabel("Convertir: ");
				lblConvertir.setBounds(10,10,60,30);
				panel.add(lblConvertir);
				
				cajaEntrada=new JTextField();
				cajaEntrada.setBounds(70,10,70,30);
				panel.add(cajaEntrada);
				
				String datos[]= {"Fahrenheit", "Centigrados"};
				comboEntrada=new JComboBox(datos);
				comboEntrada.setBounds(150,10,100,30);
				panel.add(comboEntrada);
				
				JLabel lblA=new JLabel("A: ");
				lblA.setBounds(10,60,20,30);
				panel.add(lblA);
				
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
