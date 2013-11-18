/*4.	Cree una clase llamada Corredor, que permita manejar la información de una atleta del que interesa conocer:
	nombre, sexo, fecha de nacimiento,  (utilice la clase Fecha creada en un anterior ejercicio), y tiempo empleado (clase Hora).
	La clase debe manejar eficientemente la información y ocultarla perfectamente.	
	a.	Constructor que inicialice todos los datos.
	b.	Método que retorne cuantos corredores existen en un determinado momento.
	c.	Método toString.
	d.	Método que retorne un boolean para saber si el corredor es mayor de edad.
	e.	Métodos set’s y get’s
	*/
/*AMPLIADO:
 	Class Carrera.java:

-	Crea un menú con los siguientes opciones:
1.	Inscribir corredor (Máximo 3 corredores)
2.	Comenzar carrera
3.	Llegada de corredor
4.	Finalizar carrera
5.	Ver
	5.1 Corredores
	5.2 Estado de la carrera
	5.3 Resultado de la carrera (Listado en orden de llegada)
	5.4 Volver al menú principal
6.	Salir

-	La clase Corredor será usada por Carrera y a su vez ésta por TestCarrera

Class Corredor.java:
-	El tiempo NO será inicializado en el constructor
-	Implementar los métodos:
	o	IniCarrera: Inicializa la carrera para un corredor. Se guardará el momento de inicio
	o	FinCarrera: Toma el tiempo de finalización y calcula el tiempo de la carrera para el corredor

-	Atributos de tiempo:
	o	Hora momentoInicio,momentoFin,tiempoCarrera
	
-	En cualquier momento tendremos que saber cuántos corredores hay todavía en carrera
-	Habrá un atributo “numCorredor”, inicializado en el constructor, que comenzará en 1 y se incrementará con el siguiente corredor.
-	Habrá un atributo “posición” inicialmente a 0 que indique la posición de la carrera

 */

public class Corredor {

	
	private String sexo;
	private String nombre;
	private String fecha_de_nacimiento;
	
	/*Constructor vacío*/
	public Corredor (){
		sexo = "Desconocido";
		nombre = "Desconocido";
		fecha_de_nacimiento = "Desconocido";
	}
	
	public Corredor(String sexo,String nombre,String fecha_de_nacimiento)
	{
		
		this.sexo=sexo;
		this.nombre=nombre;
		this.fecha_de_nacimiento=fecha_de_nacimiento;
		
	}
	
	public void setSexo(String sexo)
	{
		
		this.sexo=sexo;
		
	}
	public String getSexo()
	{
		
		return this.sexo;
		
	}
	
	public void setNombre(String nombre)
	{
		
		this.nombre=nombre;
		
	}
	public String getNombre()
	{
		
		return this.nombre;
		
	}
	

	
	
}
