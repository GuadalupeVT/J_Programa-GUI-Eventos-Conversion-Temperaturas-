import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;

import javax.swing.*;

class ConversorTemperaturas{
	
	public double centigradosAFahrenheit(double gradosC){
		return gradosC*1.8+32;
	}
	public double fahrenheitACentigrados(double gradosF){
		return (gradosF-32)/1.8;
	}
	public double fahrenheitAKelvin (double gradosF) {
		return (gradosF+459.67)/1.8;
	}
	public double kelvinAFahrenheit(double gradosK) {
		return ((9/5)*gradosK)-459.67;
	}
	public double fahrenheitARankine(double gradosF) {
		return gradosF+459.67;
	}
	public double rankineAFahrenheit(double gradosR) {
		return gradosR-459.67;
	}
	public double fahrenheitAReamur(double gradosF) {
		return (gradosF-32)/2.25;
	}
	public double reamurAfahrenheit(double gradosRe) {
		return (2.25*gradosRe)+32;
	}
	public double centigradosAKelvin(double gradosC) {
		return gradosC+273.15;
	}
	public double kelvinACentigrados(double gradosK) {
		return gradosK -273.15;
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
				setSize(300,150);
				setLocationRelativeTo(null);
				setVisible(true);
				JPanel panel=new JPanel();
				panel.setSize(300,150);
				panel.setLayout(null);
				
				JLabel lblConvertir=new JLabel("Convertir: ");
				lblConvertir.setBounds(10,10,60,30);
				panel.add(lblConvertir);
				
				cajaEntrada=new JTextField();
				cajaEntrada.setBounds(70,10,80,30);
				panel.add(cajaEntrada);
				
				String datos[]= {"Selecciona opcion...","Centigrados","Fahrenheit","Kelvin","Rankine","Reamur"};
				comboEntrada=new JComboBox(datos);
				comboEntrada.addActionListener(this);
				comboEntrada.setBounds(150,10,100,30);
				panel.add(comboEntrada);
				
				JLabel lblA=new JLabel("A: ");
				lblA.setBounds(10,60,20,30);
				panel.add(lblA);
				
				comboSalida=new JComboBox();
				comboSalida.addItem("Selecciona opcion...");
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
		
			DecimalFormat formatoNumeros=new DecimalFormat("############0.0##");
			String vectorC[]= {"Selecciona opcion...","Fahrenheit","Kelvin"};
			String vectorF[]= {"Selecciona opcion...","Centigrados","Kelvin","Rankine","Reamur"};
			String vectorK[]= {"Selecciona opcion...","Fahrenheit","Centigrados"};
			String vectorR[]= {"Selecciona opcion...","Fahrenheit"};
			String vectorRe[]= {"Selecciona opcion...","Fahrenheit"};
			
			//Conversiones de Centigrados
			if (e.getSource()==comboEntrada&&comboEntrada.getSelectedItem().equals("Centigrados")) {
				comboSalida.removeAllItems();
				cajaSalida.setText("");
				for (String x : vectorC) {
					comboSalida.addItem(x);
				}
			}
			
			//Conversiones de Fahrenheit
			if (e.getSource()==comboEntrada&&comboEntrada.getSelectedItem().equals("Fahrenheit")) {
				comboSalida.removeAllItems();
				cajaSalida.setText("");
				for (String x : vectorF) {
					comboSalida.addItem(x);
				}
			}
			if (e.getSource()==comboEntrada&&comboEntrada.getSelectedItem().equals("Kelvin")) {
				comboSalida.removeAllItems();
				cajaSalida.setText("");
				for (String x : vectorK) {
					comboSalida.addItem(x);
				}
			}
			if (e.getSource()==comboEntrada&&comboEntrada.getSelectedItem().equals("Rankine")) {
				comboSalida.removeAllItems();
				cajaSalida.setText("");
				for (String x : vectorR) {
					comboSalida.addItem(x);
				}
			}
			if (e.getSource()==comboEntrada&&comboEntrada.getSelectedItem().equals("Reamur")) {
				comboSalida.removeAllItems();
				cajaSalida.setText("");
				for (String x : vectorRe) {
					comboSalida.addItem(x);
				}
			}
			
			
			try {
				double dato=Double.parseDouble(cajaEntrada.getText());
				
				
				if(comboEntrada.getSelectedItem().equals("Centigrados")&&comboSalida.getSelectedItem().equals("Fahrenheit")) {
					double resul=new ConversorTemperaturas().centigradosAFahrenheit(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				
				if(comboEntrada.getSelectedItem().equals("Fahrenheit")&&comboSalida.getSelectedItem().equals("Centigrados")) {
					double resul=new ConversorTemperaturas().fahrenheitACentigrados(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				
				if(comboEntrada.getSelectedItem().equals("Fahrenheit")&&comboSalida.getSelectedItem().equals("Kelvin")) {
					double resul=new ConversorTemperaturas().fahrenheitAKelvin(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				if(comboEntrada.getSelectedItem().equals("Kelvin")&&comboSalida.getSelectedItem().equals("Fahrenheit")) {
					double resul=new ConversorTemperaturas().kelvinAFahrenheit(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				if(comboEntrada.getSelectedItem().equals("Fahrenheit")&&comboSalida.getSelectedItem().equals("Rankine")) {
					double resul=new ConversorTemperaturas().fahrenheitARankine(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				if(comboEntrada.getSelectedItem().equals("Rankine")&&comboSalida.getSelectedItem().equals("Fahrenheit")) {
					double resul=new ConversorTemperaturas().rankineAFahrenheit(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				if(comboEntrada.getSelectedItem().equals("Fahrenheit")&&comboSalida.getSelectedItem().equals("Reamur")) {
					double resul=new ConversorTemperaturas().fahrenheitAReamur(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				if(comboEntrada.getSelectedItem().equals("Reamur")&&comboSalida.getSelectedItem().equals("Fahrenheit")) {
					double resul=new ConversorTemperaturas().reamurAfahrenheit(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				if(comboEntrada.getSelectedItem().equals("Centigrados")&&comboSalida.getSelectedItem().equals("Kelvin")) {
					double resul=new ConversorTemperaturas().centigradosAKelvin(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
				if(comboEntrada.getSelectedItem().equals("Kelvin")&&comboSalida.getSelectedItem().equals("Centigrados")) {
					double resul=new ConversorTemperaturas().kelvinACentigrados(dato);
					cajaSalida.setText(formatoNumeros.format(resul)+"");
				}
			
			
	}catch(NumberFormatException e1) {
				JOptionPane.showMessageDialog(this,"Debes ingresar NUMEROS CORRECTOS");
			}catch(NullPointerException e2) {
				JOptionPane.showMessageDialog(this,"Elige una opcion");
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
