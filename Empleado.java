
public abstract class Empleado{
	public String nombre;
	public String apellido;
	public String num_seguro;
	public Empleado(String n, String a, String num){
		nombre = n;
		apellido = a;
		num_seguro = num;
	}
	public abstract float ingresos();
	public String getNombre(){
		return nombre;
	}
	public String getApellido(){
		return apellido;
	}
	public String getNumSeguro(){
		return num_seguro;
	}
	public String getString(){
		return "Nombre: "+getNombre() +", Apellido: "+getApellido()+", Numero de Seguro social: "+getNumSeguro();  
	}
}