import java.util.Scanner;

public class Ahorcado {

    public static void main(String[] args) {
            Integer a;
            Integer b;
            Integer opcion;
            Integer resultado;
            do{
            System.out.println("Ingrese su operación /n 1 para sumar /n 2 para
            restar /n 3 para multiplicar /n 4 para dividir");
            opcion = teclado.next();
            }while(opcion < 1 && opcion > 4)

            System.out.println("Ingrese el primer numero");
            a = teclado.next();
            System.out.println("Ingrese el segundo numero");
            a = teclado.next();


            
    switch (opcion){
		case 2: 
			resultado = a1.suma();
			break;
		case 3: 
			resultado = a1.resta();
			break;
		case 4: 
			resultado = a1.multiplica();
			break;
		case 1:
			resultado = a1.divide();
			break;
			
	           default: 
			System.out.println("OPCION INVALIDA.");
			return;
		}
		System.out.println("Resultado: " +resultado);

} 
