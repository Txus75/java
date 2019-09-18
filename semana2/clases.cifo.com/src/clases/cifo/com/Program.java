package clases.cifo.com;

public class Program {

	public static void main(String[] args) {
		// Pruebas de clase Empleados
		Empleados empleado1 = new Empleados("Jesús", "123456789");
		empleado1.setSueldo(1000);
		System.out.println("El sueldo neto de empleado1 es:");
		System.out.println(empleado1.sueldoNeto());
		
		Empleados empleado2 = new Empleados("Jaime", "987654321");
		empleado2.setSueldo(10000);
		System.out.println("El sueldo neto de empleado2 es:");
		System.out.println(empleado2.sueldoNeto());
		
		// Prueba de clsae Administracin
		Administracion administrador1 = new Administracion("Pedro", "789654123", "Contabilidad");
		administrador1.setSueldo(100);
		System.out.println("El sueldo neto de administrador1 es:");
		System.out.println(administrador1.sueldoNeto());
		
		// Prueba de clase Gerente
		Gerente gerente1 = new Gerente("Luis", "852369741", "Administración", 100);
		gerente1.setSueldo(100000);
		System.out.println("El sueldo neto de gerente1 es:");
		System.out.println(gerente1.sueldoNeto());
		
		// Prueba de clase Direccion
		Direccion direccion1 = new Direccion("Marcos", "111111111", 5000);
		direccion1.setSueldo(10000000);
		System.out.println("El sueldo neto de direccion11 es:");
		System.out.println(direccion1.sueldoNeto());
	}

}
