package clases.cifo.com;

public class Program {

	public static void main(String[] args) {
		// Pruebas de clase Empleados
		Empleados empleado1 = new Empleados("Jesús", "123456789");
		empleado1.setSueldo(1000);
		System.out.println(empleado1.sueldoNeto());
		
		Empleados empleado2 = new Empleados("Jaime", "987654321");
		empleado2.setSueldo(10000);
		System.out.println(empleado2.sueldoNeto());
	}

}
