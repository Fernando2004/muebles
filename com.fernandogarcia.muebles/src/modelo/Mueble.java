package modelo;

import java.util.Arrays;
import java.util.Scanner;

public class Mueble {
	
	
	  Scanner lector=new Scanner(System.in);
	    private String codigo;
	    private String nombre;
	    private double precio;
	    private double[]medidas=new double[3];
	    private boolean fragil=false;
	    private String fragiles;


	    public Mueble() {
	    }
	    

	    public Mueble(String codigo, String nombre, double precio, double largo,double ancho,double alto, boolean fragil) {
			super();
			this.codigo = codigo;
			this.nombre = nombre;
			this.precio = precio;
			this.medidas[0]=largo;
	        this.medidas[1]=ancho;
	        this.medidas[2]=alto;
			this.fragil = fragil;
		}



		
	     /*public Mueble(String codigo, String nombre, double precio, double largo,double ancho,double alto, boolean fragil) {
	    	 super(); 
	        System.out.println("Introduce el codigo");
	        this.codigo=lector.nextLine();
	        System.out.println("Introduce el nombre");
	        this.nombre=lector.nextLine();
	        System.out.println("Introduce el precio");
	        this.precio=lector.nextDouble();
	        System.out.println("Introduce el largo");
	        this.medidas[0]=lector.nextDouble();
	        System.out.println("Introduce el ancho");
	        this.medidas[1]=lector.nextDouble();
	        System.out.println("Introduce el alto");
	        this.medidas[2]=lector.nextDouble();
	        System.out.println("Dime si es fragil (si/no)");


	        //-----------------------------------------------


	        //guardamos la respuesta del usuario
	        String respuesta = lector.nextLine();
	        if (respuesta.equalsIgnoreCase("si"))
	            this.fragil = true;
	        else
	            this.fragil = false;




	        //guardamos la respuesta
	        this.fragiles=lector.nextLine();
			if (fragiles.equalsIgnoreCase("si"))
				this.fragil=true;
			else
				this.fragil=false;

	    }*/

	    //constructores
	    public Mueble(String codigo,String nombre,double largo,double ancho,double alto){
	        this.codigo=codigo;
	        this.nombre=nombre;
	        this.medidas[0]=largo;
	        this.medidas[1]=ancho;
	        this.medidas[2]=alto;
	    }

	    //setter y getter
	    public Scanner getLector() {
	        return lector;
	    }
	    public void setLector(Scanner lector) {
	        this.lector = lector;
	    }

	    public String getCodigo() {
	        return codigo;
	    }

	    public void setCodigo(String codigo) {
	        this.codigo = codigo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double[] getMedidas() {
	        return medidas;
	    }

	    public void setMedidas(double[] medidas) {
	        this.medidas = medidas;
	    }

	    public boolean isFragil() {
	        return fragil;
	    }

	    public void setFragil(boolean fragil) {
	        this.fragil = fragil;
	    }


	    public String toString() {
	        return 	"\nCodigo\t" + codigo +
	                "\nNombre\t" + nombre +
	                "\nPrecio\t" + precio +
	                "\nMedidas\t"+ Arrays.toString(medidas) +
	                "\nFragil\t" + fragil;


	    }

}
