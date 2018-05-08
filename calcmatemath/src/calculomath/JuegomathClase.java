package calculomath;
import javax.swing.JOptionPane;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

public class JuegomathClase {

	public static void main(String[] args) {

		String orden1= " ",orden2=" ";
		int a=0, b=0, c=0, d=0, e=0, i=0, j=0, k=0, l=0, x=0, val5=0,val9=0, val10=100, val31=0, val14=0,calct=0,calct2=0,calct3=0;
		int puntaje4=0, z=1;
		String usu1 = JOptionPane.showInputDialog("Bienvenido al JUEGO MATEMÁTICO"+" \n¿Cual es tu Nombre?");
		JOptionPane.showMessageDialog(null, "Hola "+ usu1 +" Vamos a jugar... ");
		ArrayList <Participante> grupo;
		grupo = new ArrayList<Participante>();
        
//se presenta y resuelve la operación
		String[] menu3 = {"Suma","Resta"};
        String resp3 =(String) JOptionPane.showInputDialog(null,"Seleccione","OPERACIÓN",JOptionPane.DEFAULT_OPTION,null, menu3,menu3[0]);
        Random r = new Random();
        if(resp3.equals("Suma")) {
        	orden2=" +";
//        	Random r = new Random();
    		calct = r.nextInt(500)+ r.nextInt(500);
    		calct2 = r.nextInt(400)+ r.nextInt(400);
    		String val20 = JOptionPane.showInputDialog("Resuelve:\n " +"   "+ calct + "\n"+ orden2 + " "+calct2+" \n¿Cual es el resultado?");
    		val5= Integer.parseInt(val20);
    		calct3=calct2+calct;
        }else {
        	orden2=" -";
//        	Random r = new Random();
    		calct = r.nextInt(500)+ r.nextInt(500);
    		calct2 = r.nextInt(100)+ r.nextInt(100);
    		String val20 = JOptionPane.showInputDialog("Resuelve:\n " +"   "+ calct + "\n"+ orden2 + "   "+calct2+" \n¿Cual es el resultado?");
    		val5= Integer.parseInt(val20);
    		calct3=calct-calct2;
        }
//se realizan las comparaciones y se da el puntaje 
//    		int calct3=calct2+calct;
    		if (calct3 == val5) {
    			   			
    			JOptionPane.showMessageDialog(null,"Lo hiciste perfecto!!! 9 puntos muy bien!!!");
    			puntaje4=9;
    			    			
    		}else {
    			
    			JOptionPane.showMessageDialog(null,"ohh no!  fallaste, veamos en dónde ...");
//se identifica en que parte de la operacion fallo	    						
    			int valaunidad = val5 % 10;
    			int vala7 = val5 / 10;
    			int valacentena = vala7 / 10;
    			int valadecena = vala7 % 10;

    			int valbunidad = calct3 % 10;
    			int valb7 = calct3 / 10;
    			int valbcentena = valb7 / 10;
    			int valbdecena = valb7 % 10;			
    			
    			int puntaje1=0;
    			int puntaje2=0;
    			int puntaje3=0;
    			
    			
    			if (valaunidad == valbunidad){
    				
    				JOptionPane.showMessageDialog(null,"Las unidades estan bien, 3 puntos");
    				puntaje1 = 3;
    			}else {
    				JOptionPane.showMessageDialog(null,"Fallaste en las unidades, 0 puntos");
    			}
    			
    			if (valadecena  == valbdecena ){
    				
    				JOptionPane.showMessageDialog(null,"Las decenas estan bien, 3 puntos");
    				puntaje2 = 3;
    			}else {
    				JOptionPane.showMessageDialog(null,"Sumaste mal las decenas, 0 puntos");
    			}
    			
    			if (valacentena == valbcentena){
    				JOptionPane.showMessageDialog(null,"Las centenas estan bien, 3 puntos");
    				puntaje3 = 3;
    			}else {
    				JOptionPane.showMessageDialog(null,"Sumaste mal las centenas, 0 puntos");
    			}
    			puntaje4=puntaje1+puntaje2+puntaje3;
    		}
            Participante part1= new Participante(usu1,puntaje4);
            grupo.add(part1);
            
        while(val10>0) {
//se ofrece la opción de modificar, eliminar,  ordenar o terminar 
        	
        String[] menu = {"Modficar nombre.","Eliminar usuario.","Ordenar Usuarios.","Buscar usuario.","Agregar nuevo usuario.","Volver a Jugar.","Salir."};
        String resp =(String) JOptionPane.showInputDialog(null,"Seleccione","JUEGO MATEMÁTICO",JOptionPane.DEFAULT_OPTION,null, menu,menu[0]);
        if(resp.equals("Modficar nombre.")) {
        	val10=1;
        }else if(resp.equals("Eliminar usuario.")) {
        		val10=2;
        	}else if(resp.equals("Ordenar Usuarios.")) {
        			val10=3;
        		}else if(resp.equals("Buscar usuario.")) {
        				val10=4;
        			}else if(resp.equals("Agregar nuevo usuario.")) {
        					val10=5;
        				}else if(resp.equals("Volver a Jugar.")) {
        						val10=6;
        					}else if(resp.equals("Salir.")) {
            					val10=0;
            					}
        			
		if(val10==1) {
// se inicia el proceso de modificación del  nombre	
			String val6 = JOptionPane.showInputDialog("Que usuario desea modificar.");
	        int val35=0;
			for (Participante elemento:grupo) {
	        	if(elemento.getNom().equals(val6)) {
	        		JOptionPane.showMessageDialog(null,"Usuario a Modificar: "+ elemento.getNom() + " puntaje: " + elemento.getPuntos());
	        		val35=1;
	        	}
	    	}if(val35==1){
	        for (Participante elemento:grupo) {
	        	if(elemento.getNom().equals(val6)) {
	        		String val7 = JOptionPane.showInputDialog("Escriba el nuevo nombre:");
	        		elemento.setNom(val7);
	        		JOptionPane.showMessageDialog(null,"Usuario Modificado: "+ elemento.getNom() + " puntaje: " + elemento.getPuntos());
	        	}
	    	}
	    	}else {
	    		JOptionPane.showMessageDialog(null,"Usuario no existe");
	    	}
	    }
		else if(val10==2) {
//inicia proceso de eliminación
			String val12 = JOptionPane.showInputDialog("Que usuario desea eliminar.");
	        val31=0;
	        for (Participante elemento:grupo) {
	        	if(elemento.getNom().equals(val12)) {
	        		JOptionPane.showMessageDialog(null,"El usuario " +val12 + " fue eliminado");
	        		grupo.remove(elemento);
	        		val31=1;
	        	}
	    	}if(val31==0) {
	    		JOptionPane.showMessageDialog(null,"El usuario no existe");
	    	}
	    	JOptionPane.showMessageDialog(null,"Continuemos...");
		}else if(val10==3){
				String[] menu2 = {"Ascendente.","Descendente."};
				String resp2 =(String) JOptionPane.showInputDialog(null,"Como desea ordenar:","Menu",JOptionPane.DEFAULT_OPTION,null, menu2,menu2[0]);
				if(resp2.equals("Ascendente.")) {
					val9=1;
		        }else {
		    
		        	val9=2;
		        }
		        if(val9==1) {
		        		Collections.sort(grupo);
		        		orden1=" ";
		        		for (Participante elemento:grupo) {
		        			orden1 += elemento + "\n";
		        		}JOptionPane.showMessageDialog(null,orden1);
		       	}
		        else {
		        		orden1=" ";
		        		Collections.reverse(grupo);
		        		for (Participante elemento:grupo) {
		        			orden1 += elemento + "\n";
		        		}JOptionPane.showMessageDialog(null,orden1);
		        }
	    }else if(val10==4) {
			String val13 = JOptionPane.showInputDialog("Que usuario desea buscar?");
			int val30=0;
	    	for (Participante elemento:grupo) {
	        	if(elemento.getNom().equals(val13)) {
	        		val30=1;
	        		JOptionPane.showMessageDialog(null,"Usuario buscado:\n "+ elemento.getNom() + " puntaje: " + elemento.getPuntos());
	        	}
	    	}if(val30==0) {
	    	JOptionPane.showMessageDialog(null,"El Usuario No existe");
	    	}
		}else if(val10==5) {
				String val11 = JOptionPane.showInputDialog("Nombre usuario Nuevo:");
				int val29=0;
				for (Participante elemento:grupo) {
		        	if(elemento.getNom().equals(val11)) {
		        		JOptionPane.showMessageDialog(null,"Nombre de usuario ya existe");
		        		val29=1;
		        	}
				}if(val29==0) {	
				JOptionPane.showMessageDialog(null,val11 + " a Jugar ");
				b=b+1;
//se presenta y resuelve la operación	
				String[] menu4 = {"Suma","Resta"};
		        String resp4 =(String) JOptionPane.showInputDialog(null,"Seleccione","OPERACIÓN",JOptionPane.DEFAULT_OPTION,null, menu4,menu4[0]);
		        if(resp4.equals("Suma")) {
		        	orden2=" +";
		    		calct = r.nextInt(500)+ r.nextInt(500);
		    		calct2 = r.nextInt(400)+ r.nextInt(400);
		    		String val20 = JOptionPane.showInputDialog("Resuelve:\n " +"   "+ calct + "\n"+ orden2 + " "+calct2+" \n¿Cual es el resultado?");
		    		val5= Integer.parseInt(val20);
		    		calct3=calct2+calct;
		        }else {
		        	orden2=" -";
		    		calct = r.nextInt(500)+ r.nextInt(500);
		    		calct2 = r.nextInt(100)+ r.nextInt(100);
		    		String val20 = JOptionPane.showInputDialog("Resuelve:\n " +"   "+ calct + "\n"+ orden2 + " "+calct2+" \n¿Cual es el resultado?");
		    		val5= Integer.parseInt(val20);
		    		calct3=calct-calct2;
		        }
				   	if (calct3 == val5) {
	        		JOptionPane.showMessageDialog(null,"Lo hiciste perfecto!!! 9 puntos muy bien!!!");
	        		puntaje4=9;
    			
	        	}else {
	        		JOptionPane.showMessageDialog(null,"ohh no!  fallaste, veamos en dónde ...");
//se identifica en que parte de la operacion fallo	    						
	        		int valaunidad = val5 % 10;
	        		int vala7 = val5 / 10;
	        		int valacentena = vala7 / 10;
	        		int valadecena = vala7 % 10;

	        		int valbunidad = calct3 % 10;
	        		int valb7 = calct3 / 10;
	        		int valbcentena = valb7 / 10;
	        		int valbdecena = valb7 % 10;			
    			
	        		int puntaje1=0;
	        		int puntaje2=0;
	        		int puntaje3=0;
    			
	        		if (valaunidad == valbunidad){
	        			JOptionPane.showMessageDialog(null,"Las unidades estan bien, 3 puntos");
	        			puntaje1 = 3;
	        		}else {
	        			JOptionPane.showMessageDialog(null,"Fallaste en las unidades, 0 puntos");
	        		}
	        		if (valadecena  == valbdecena ){
	        			JOptionPane.showMessageDialog(null,"Las decenas estan bien, 3 puntos");
	        			puntaje2 = 3;
	        		}else {
	        			JOptionPane.showMessageDialog(null,"Sumaste mal las decenas, 0 puntos");
	        		}
	        		if (valacentena == valbcentena){
	        			JOptionPane.showMessageDialog(null,"Las centenas estan bien, 3 puntos");
	        			puntaje3 = 3;
	        		}else {
	        			JOptionPane.showMessageDialog(null,"Sumaste mal las centenas, 0 puntos");
	        		}			
	        		puntaje4=puntaje1+puntaje2+puntaje3;
	        	}
            
	        		grupo.add(new Participante(val11,puntaje4));
				}
		}else if(val10==6) {
			val14=0;
			String val15 = JOptionPane.showInputDialog("Escribe tu usuario:");
			for (Participante elemento:grupo) {
				if(elemento.getNom().equals(val15)) {
					JOptionPane.showMessageDialog(null,val15 + " a Jugar ");
					b=b+1;
//se presenta y resuelve la operación	
					String[] menu5 = {"Suma","Resta"};
			        String resp5 =(String) JOptionPane.showInputDialog(null,"Seleccione","OPERACIÓN",JOptionPane.DEFAULT_OPTION,null, menu5,menu5[0]);
			        if(resp5.equals("Suma")) {
			        	orden2=" +";
			    		calct = r.nextInt(500)+ r.nextInt(500);
			    		calct2 = r.nextInt(400)+ r.nextInt(400);
			    		String val20 = JOptionPane.showInputDialog("Resuelve:\n " +"   "+ calct + "\n"+ orden2 + " "+calct2+" \n¿Cual es el resultado?");
			    		val5= Integer.parseInt(val20);
			    		calct3=calct2+calct;
			        }else {
			        	orden2=" -";
			    		calct = r.nextInt(500)+ r.nextInt(500);
			    		calct2 = r.nextInt(100)+ r.nextInt(100);
			    		String val20 = JOptionPane.showInputDialog("Resuelve:\n " +"   "+ calct + "\n"+ orden2 + " "+calct2+" \n¿Cual es el resultado?");
			    		val5= Integer.parseInt(val20);
			    		calct3=calct-calct2;
			        }
					if (calct3 == val5) {
						JOptionPane.showMessageDialog(null,"Lo hiciste perfecto!!! 9 puntos muy bien!!!");
						puntaje4=9;
		
					}else {
						JOptionPane.showMessageDialog(null,"ohh no!  fallaste, veamos en dónde ...");
//se identifica en que parte de la operacion fallo	    						
						int valaunidad = val5 % 10;
						int vala7 = val5 / 10;
						int valacentena = vala7 / 10;
						int valadecena = vala7 % 10;

						int valbunidad = calct3 % 10;
						int valb7 = calct3 / 10;
						int valbcentena = valb7 / 10;
						int valbdecena = valb7 % 10;			
		
						int puntaje1=0;
						int puntaje2=0;
						int puntaje3=0;
		
						if (valaunidad == valbunidad){
							JOptionPane.showMessageDialog(null,"Las unidades estan bien, 3 puntos");
							puntaje1 = 3;
						}else {
							JOptionPane.showMessageDialog(null,"Fallaste en las unidades, 0 puntos");
						}
						if (valadecena  == valbdecena ){
							JOptionPane.showMessageDialog(null,"Las decenas estan bien, 3 puntos");
							puntaje2 = 3;
						}else {
							JOptionPane.showMessageDialog(null,"Sumaste mal las decenas, 0 puntos");
						}
						if (valacentena == valbcentena){
							JOptionPane.showMessageDialog(null,"Las centenas estan bien, 3 puntos");
							puntaje3 = 3;
						}else {
							JOptionPane.showMessageDialog(null,"Sumaste mal las centenas, 0 puntos");
						}			
						puntaje4=puntaje1+puntaje2+puntaje3;
					}
    
					elemento.setPuntos(puntaje4);
					val14=2;
				}
			}if(val14==0) {
				JOptionPane.showMessageDialog(null,"Usuario no existe");
			}
		}else if(val10>6) {
				JOptionPane.showMessageDialog(null,"Debe Seleccionar entre 0 y 5 ...");
			}
      }
   }
 }


