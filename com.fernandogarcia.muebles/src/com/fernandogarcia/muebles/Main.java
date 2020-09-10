package com.fernandogarcia.muebles;

import java.util.Scanner;

import controlador.Metodos;
import modelo.Mueble;

public class Main {
	
	 //el array publico
    public static Mueble [] arrayMuebles=new Mueble[20];

	public static void main(String[] args) {
		
		
		 Scanner lector=new Scanner(System.in);
	        
	        Mueble m1=new Mueble("T1055","taula", 900, 1.60, 0.80, 0.90,true);
	        Mueble m2=new Mueble("S2001","sofà", 1200, 2.90, 0.90, 1.20,false);
	        Mueble m3=new Mueble("A3001","aparador", 1500, 3.20, 0.45, 1.80,false);
	        Mueble m4=new Mueble("T1234","tauleta", 80, 0.80, 0.35, 0.50,false);
	        Mueble m5=new Mueble("R8000","rinconera", 120, 0.50, 0.45, 1.20,true);
	        Mueble m6=new Mueble("M2444","moble bany", 150, 0.50, 0.45, 0.80,true);

	        //meto los muebles en el array
	        arrayMuebles[0]=m1;
	        arrayMuebles[1]=m2;
	        arrayMuebles[2]=m3;
	        arrayMuebles[3]=m4;
	        arrayMuebles[4]=m5;
	        arrayMuebles[5]=m6;

	        int option=0;

	        do{
	            System.out.println();
	            System.out.println("MENU PRINCIPAL");
	            System.out.println("====================");
	            System.out.println("1.-Listar Muebles");
	            System.out.println("2.-Informe  Muebles ");
	            System.out.println("3.-Calcular el volumen de un mueble");
	            System.out.println("4.-Alta nuevo Mueble");
	            System.out.println("0.-Salir");


	            System.out.print("Inserta una opcion valida: ");

	            option=lector.nextInt();
	            lector.nextLine();

	            System.out.println("");
	            switch(option){
	                case 1:
	                    //listar muebles
	                    Metodos.listarMuebles();
	                    break;
	                case 2:
	                    //Informe de muelbes
	                	 Metodos.informeMuebles("T1055");
	                    break;
	                case 3:
	                    //volumen
	                	 Metodos.volumenMuebles();
	                    break;
	                case 4:
	                    //Alta
	                	 Metodos.AltaNuevoMueble();
	                    break;

	                case 0:
	                    System.out.println("Aplicacion finalizada.");
	                    break;
	                default:
	                    break;
	            }

	        }while (option!=0);


	    	}

}
