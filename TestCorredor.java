import java.util.Scanner;


public class TestCorredor {

	
	public void view()
	{
		
		System.out.println(" 1.Inscribir corredor(máximo 3 corredores ) \n"
				+ " 2.Comenzar.\n 3.Llegada de corredor\n 4.Finalizar carrera:"
				+ "\n 5.Ver"
				+"\n 6.Salir");
		
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
				
			System.out.println("Fin de programa!");
			
			break;
	
		default:
			
			System.out.println("No hay mas opciones en el menu.");
			
			break;
		
		
		}
		}
		while(opciones<6);
		
		
	}
	
}


