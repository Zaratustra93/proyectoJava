import java.util.Scanner;


public class TestCorredor {

	
	public void view()
	{
		
		System.out.println(" 1.Inscribir corredor(máximo 3 corredores Comenzar.) \n"
				+ " 2Llegada de corredor.\n 3Finalizar carrera.\n 4 Ver Corredores\n 5.Estado de la carrera\n 6.Resultado carrera \n 7.Volver al menú principal"
				+ "\n 8.Salir.");
		
	}
	
	public static void main(String[]args)
	{
		Scanner entrada=new Scanner(System.in);
		int opciones=0;
		
		TestCorredor App= new TestCorredor();
		do{
		App.view();
		System.out.println("Escribe la opcion:");
		opciones=entrada.nextInt();
		switch(opciones)
		{
		
		case 1:
			break;
			
		case 2:
			
			break;
			
		case 3:
			break;
		
		case 4:
			break;
		
		case 5:
			break;
		case 6:
			break;
		
		case 7:
			
			break;
		
		case 8:
			
			
			System.out.println("Fin de la aplicacion");
			
			break;
		default:
			
			System.out.println("No hay mas opciones en el menu.");
			
			break;
		
		
		}
		}
		while(opciones<8);
		
		
	}
	
}
