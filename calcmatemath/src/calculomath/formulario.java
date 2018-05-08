package calculomath;

import java.awt.Component;
import javax.swing.JFrame;  //IMPORTA EL PAQUETE DEL FRAME

public class formulario {

	JFrame form;

	 
	 public formulario() {
	  
	  form = new JFrame("Personal Date");//NOMBRE DEL FRAME O FORMULARIO
	  form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	   
	 
	//DIMENSIONES DEL FRAME
	//AJUSTA EL TAMAÑO DEL FORMULARIO
	  form.setSize(300, 300);  //ANCHO Y LARGO DEL FORMULARIO
	  form.setResizable(false); //ESTATICO
	  form.setLocationRelativeTo(form.getParent());
	  form.setVisible(true);  //VISIBLE   
	 }
	
}
