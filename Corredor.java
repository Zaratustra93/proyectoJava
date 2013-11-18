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
