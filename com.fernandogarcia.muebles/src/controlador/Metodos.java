package controlador;

import com.fernandogarcia.muebles.Main;
import modelo.Mueble;

public class Metodos {
	
	 //array listar Muebles
    public static void listarMuebles() {
    	
        boolean encontrado=false;
        
        for (int i = 0; i < Main.arrayMuebles.length;i++) {
            if (Main.arrayMuebles[i]!=null) {
                encontrado=true;
                System.out.println(Main.arrayMuebles[i].toString());
                System.out.println("----------------------------");
            }
        }
        if (!encontrado) {
            System.out.println("no se encontro nimguno");
        }
    }

    //Informes
    public static void informeMuebles(String codigo) {

    	System.out.println("Falta por terminar");
    }
    
    
    //Volumen
    public static void volumenMuebles() {
        double largo=0.00,ancho=0.00,alto=0.00;
        for (int i = 0; i < Main.arrayMuebles.length;i++) {
            if(Main.arrayMuebles[i]!=null) {
                largo+=Main.arrayMuebles[i].getMedidas()[0];
                ancho+=Main.arrayMuebles[i].getMedidas()[1];
                alto+=Main.arrayMuebles[i].getMedidas()[2];
            }
        }
        System.out.println("La media de volumen es :"+(largo*ancho*alto));

    }

    public static void AltaNuevoMueble() {

        boolean encontrado=false;
        for (int i = 0; i < Main.arrayMuebles.length; i++) {
            if (Main.arrayMuebles[i]==null) {
                encontrado=true;
                Mueble m=new Mueble();
                Main.arrayMuebles[i]=m;
                break;
            }
        }
        if (!encontrado) {
            System.out.println("El esta todo lleno");
        }
    }

}
