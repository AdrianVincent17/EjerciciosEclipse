package boletin;

import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Ej04 extends JFrame implements ActionListener{
	
	/*
	 * Componentes de la ventana
	 */
	
	private JLabel textocentral, horas, minutos,segundos;
	private JTextField campohora, campominuto, camposegundo;
	private JButton comprobar, reiniciar;
	private JPanel panel1;
	
	public Ej04() {
		
		//Establecemos el layout
		setLayout(new FlowLayout(FlowLayout.CENTER,50,30));
		panel1 =new JPanel();
		panel1.setLayout(new GridLayout(4,2,20,25));
		
		
		//añadimos labels botones y campos
		textocentral =new JLabel("Introduce una hora: ", JLabel.CENTER);
		add(textocentral);
		
		horas =new JLabel("Horas: ");
		panel1.add(horas);
		
		campohora= new JTextField(5); 
		panel1.add(campohora);
		
		minutos =new JLabel("Minutos: ");
		panel1.add(minutos);
		
		campominuto= new JTextField(5); 
		panel1.add(campominuto);
		
		segundos =new JLabel("Segundos: ");
		panel1.add(segundos);
		
		camposegundo= new JTextField(5); 
		panel1.add(camposegundo);
		
		comprobar = new JButton("Comprobar");
		panel1.add(comprobar);
		comprobar.addActionListener(this);
		
		reiniciar = new JButton("Reiniciar");
		panel1.add(reiniciar);
		reiniciar.addActionListener(this);
		
		add(panel1);
	}
	
	public static void main(String[] args) {
		
		Ej04 e= new Ej04();
		
		e.setVisible(true);
		e.setTitle("Comprobacion de hora");
		e.setLocationRelativeTo(null);
		e.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		e.setSize(350,320);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==comprobar) {
			
			if(campohora.getText().isEmpty() || campominuto.getText().isEmpty() || camposegundo.getText().isEmpty()){
				JOptionPane.showMessageDialog(null,"Debes completar todos los campos","Aviso",JOptionPane.WARNING_MESSAGE);
			}else {
				
				try {
				int horas=Integer.parseInt(campohora.getText());
				int minutos=Integer.parseInt(campominuto.getText());
				int segundos=Integer.parseInt(camposegundo.getText());
				String cad="";
				
				if(horas<10) {
					cad+="0"+horas+":";
					
				}else {
					cad+=horas+":";
				}
				
				if(minutos<10) {
					cad+="0"+minutos+":";
					
				}else {
					cad+=minutos+":";
				}
				
				if(segundos<10) {
					cad+="0"+segundos;
					
				}else {
					cad+=segundos;
				}
				
					if(horas<0 || horas>=24) {
						textocentral.setText("La hora "+cad+" es INCORRECTA");
					}else if(minutos<0 || minutos >=60) {
						textocentral.setText("La hora "+cad+" es INCORRECTA");
					}else if(segundos< 0 || segundos>=60) {
						textocentral.setText("La hora "+cad+" es INCORRECTA");
					}else {
						textocentral.setText("La hora "+cad+" es CORRECTA");
						
					}
				}catch(Exception lupita) {
					JOptionPane.showMessageDialog(null,"Los Valores introducidos no son validos","Error",JOptionPane.ERROR_MESSAGE);
				}
		
			}
		}
		if(e.getSource()==reiniciar) {
			campohora.setText("");
			campominuto.setText("");
			camposegundo.setText("");
			textocentral.setText("Introduce una hora: ");
		}
		
	}

}
