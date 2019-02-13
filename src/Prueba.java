import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

class ConversorTemperaturas{
	
	public double centigradosAFahrenheit(double gradosC){
		return gradosC*1.8+32;
	}
	public double fahrenheitACentigrados(double gradosF){
		return (gradosF-32)/1.8;
	}
}

class Ventana extends JFrame implements ActionListener{
	JTextField cajaEntrada, cajaSalida;
	JComboBox comboEntrada, comboSalida;
	public Ventana(){
		//configuracion ventana
				getContentPane().setLayout(null);
				setDefaultCloseOperation(EXIT_ON_CLOSE);
				setTitle("Convertidor de Temperaturas");
				setSize(280,150);
				setLocationRelativeTo(null);
				setVisible(true);
				JPanel panel=new JPanel();
				panel.setSize(280,150);
				panel.setLayout(null);
				
				JLabel lblConvertir=new JLabel("Convertir: ");
				lblConvertir.setBounds(10,10,60,30);
				panel.add(lblConvertir);
				
				cajaEntrada=new JTextField();
				cajaEntrada.setBounds(70,10,70,30);
				panel.add(cajaEntrada);
				
				String datos[]= {"Fahrenheit", "Centigrados"};
				comboEntrada=new JComboBox(datos);
				comboEntrada.addActionListener(this);
				comboEntrada.setBounds(150,10,100,30);
				panel.add(comboEntrada);
				
				JLabel lblA=new JLabel("A: ");
				lblA.setBounds(10,60,20,30);
				panel.add(lblA);
				
				comboSalida=new JComboBox(datos);
				comboSalida.setBounds(40,60,100,30);
				comboSalida.addActionListener(this);
				panel.add(comboSalida);
				
				cajaSalida=new JTextField();
				cajaSalida.setBounds(150,60,100,30);
				cajaSalida.setEditable(false);
				panel.add(cajaSalida);
				
				add(panel);
				
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try {
			double dato=Double.parseDouble(cajaEntrada.getText());
			if(comboEntrada.getSelectedIndex()==0) {
				if (comboSalida.getSelectedIndex()==0) {
					cajaSalida.setText(cajaEntrada.getText());
				}	
				}
			if(comboEntrada.getSelectedIndex()==1) {
				if (comboSalida.getSelectedIndex()==1) {
					cajaSalida.setText(cajaEntrada.getText());
				}	
				}
			}catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(this,"Debes ingresar NUMEROS CORRECTOS");
			}
		
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
