import java.util.Scanner;

public class practica1 {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		/*
		 * Aplicacion para el cálculo de media
		 */
		
		int x,y,media;
		
		System.out.println("Introduce el primer numero:");
		x=teclado.nextInt();
		System.out.println("Introduce el segundo numero:");
		y=teclado.nextInt();
		
		media=(x+y)/2;
		System.out.println("La media es:"+media);
		
		
		
		
		
		
	}

}
