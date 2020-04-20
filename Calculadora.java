import java.util.Scanner;

public class Ahorcado {


            Integer a;
            Integer b;
            Integer opcion;
            Integer resultado;

private Ahorcado (Integer a,Integer b){
		this.a = a;
		this.b = b;		
	}
	
	private Integer suma() {
		return a + b;
		
	}
	private Integer resta() {
		return a - b;
		
	}
	private Integer divide() {
		return a/b;
		
	}
	private Integer multiplica() {
		return a * b;
		
	}
	

            do{

            System.out.println("Ingrese su operación /n 1 para        		 sumar /n 2 para
            restar /n 3 para multiplicar /n 4 para dividir");
            opcion = teclado.next();

            }while(opcion < 1 && opcion > 4)

            System.out.println("Ingrese el primer numero");
            a = teclado.next();
            System.out.println("Ingrese el segundo numero");
            b = teclado.next();


            
    switch (opcion){

		case 4: 
			resultado= suma();
			break;
		case 3: 
			resultado = resta();
			break;
		case 2: 
			resultado = divide();
			break;
		case 1 :
			resultado = multiplica();
			break;
			
	           default: 
			System.out.println("OPCION INVALIDA.");
			return;
		}
		System.out.println("Resultado: " +resultado);

} 
