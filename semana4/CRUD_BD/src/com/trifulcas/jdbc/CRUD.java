package com.trifulcas.jdbc;

import java.sql.*;
import java.util.Scanner;

public class CRUD {

	public static void main(String[] args) {
		// Constantes
		final String cadConexion = "jdbc:mysql://localhost:3306/";
		final String bd = "empresa";
		final String usuario = "root";
		final String pass = "";
		
		try {
			Class.forName("com.mysql.jdbc.Driver").getDeclaredConstructor().newInstance();
			Connection con = DriverManager.getConnection(cadConexion + bd, usuario, pass);
			Statement stmt;
			PreparedStatement pstmt;
			ResultSet rs;
			Scanner scan = new Scanner(System.in);
			int resTabla, res, proveedor_id, id;
			String tabla = "", nombre, codigo, precioString, nif, direccion;
			Double precio;
			
			// Selección de tabla
			do {
				System.out.println("/----------------------------/");
				System.out.println("Escoja tabla:");
				System.out.println("1.- Productos");
				System.out.println("2.- Proveedores");
				System.out.println("0.- Salir");
				
				resTabla = Integer.parseInt(scan.nextLine());
				
				if(resTabla == 1) {
					tabla = "productos";
				} else if(resTabla == 2) {
					tabla = "proveedores";
				}
				
				if(resTabla != 0) {
					// Selección CRUD
					do {
						System.out.println("/----------------------------/");
						System.out.println("Escoja opción para " + tabla + ":");
						System.out.println("1.- Ver registros");
						System.out.println("2.- Añadir registro");
						System.out.println("3.- Modificar registro");
						System.out.println("4.- Eliminar registro");
						System.out.println("0.- Salir");
						res = scan.nextInt();
						scan.nextLine();
			
						switch (res) {
							// READ
							case 1:
								stmt = con.createStatement();
								rs = stmt.executeQuery("SELECT * FROM " + tabla);
								while (rs.next()) {
									if(tabla.equals("productos")) {
										System.out.println(rs.getInt("producto_id") + "  " + rs.getString("nombre") + "  " + rs.getString("codigo") + "  " + rs.getString("precio") + "  " + rs.getString("proveedor_id"));
									} else if(tabla.equals("proveedores")) {
										System.out.println(rs.getInt("proveedor_id") + "  " + rs.getString("nombre") + "  " + rs.getString("nif") + "  " + rs.getString("direccion"));
									}
								}
								break;
							// CREATE
							case 2:
								if(tabla.equals("productos")) {
									System.out.println("Introduzca el nombre del producto: ");
									nombre = scan.nextLine();
									System.out.println("Introduzca el código del producto: ");
									codigo = scan.nextLine();
									System.out.println("Introduzca el precio del producto: ");
									precioString = scan.nextLine();
									precio = Double.parseDouble(precioString);
									System.out.println("Introduzca el ID del proveedor del producto: ");
									proveedor_id = scan.nextInt();
									
									pstmt = con.prepareStatement("INSERT INTO productos (nombre, codigo, precio, proveedor_id) VALUES (?, ?, ?, ?)");
									pstmt.setString(1, nombre);
									pstmt.setString(2, codigo);
									pstmt.setDouble(3, precio);
									pstmt.setInt(4, proveedor_id);
									pstmt.execute();
									System.out.println("Producto añadido.");
								} else if(tabla.equals("proveedores")) {
									System.out.println("Introduzca el nombre del proveedor: ");
									nombre = scan.nextLine();
									System.out.println("Introduzca el NIF del proveedor: ");
									nif = scan.nextLine();
									System.out.println("Introduzca la dirección del proveedor: ");
									direccion = scan.nextLine();
									
									pstmt = con.prepareStatement("INSERT INTO proveedores (nombre, nif, direccion) VALUES (?, ?, ?)");
									pstmt.setString(1, nombre);
									pstmt.setString(2, nif);
									pstmt.setString(3, direccion);
									pstmt.execute();
									System.out.println("Proveedor añadido.");
								}
								break;
							// UPDATE
							case 3:
								if(tabla.equals("productos")) {
									System.out.println("Introduzca el id producto que quiere modificar: ");
									id = Integer.parseInt(scan.nextLine());
									
									stmt = con.createStatement();
									rs = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE producto_id = " + id);
									
									if(rs.next()) {
										System.out.println("Introduzca el nombre del producto (nombre actual = " + rs.getString("nombre") + "):");
										nombre = scan.nextLine();
										System.out.println("Introduzca el código del producto (código actual = " + rs.getString("codigo") + "):");
										codigo = scan.nextLine();
										System.out.println("Introduzca el precio del producto (precio actual = " + rs.getString("precio") + "):");
										precioString = scan.nextLine();
										precio = Double.parseDouble(precioString);
										System.out.println("Introduzca el ID del proveedor del producto (id del proveedor actual = " + rs.getString("proveedor_id") + "):");
										proveedor_id = scan.nextInt();
										
										pstmt = con.prepareStatement("UPDATE productos SET nombre = ?, codigo = ?, precio = ?, proveedor_id = ? WHERE producto_id = ?");
										pstmt.setString(1, nombre);
										pstmt.setString(2, codigo);
										pstmt.setDouble(3, precio);
										pstmt.setInt(4, proveedor_id);
										pstmt.setInt(5, id);
										pstmt.execute();
										System.out.println("Producto actualizado.");
										
									} else {
										System.out.println("No hay ningún producto con ese id.");
									}
									
								} else if(tabla.equals("proveedores")) {
									System.out.println("Introduzca el id del proveedor que quiere modificar: ");
									id = Integer.parseInt(scan.nextLine());
									
									stmt = con.createStatement();
									rs = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE proveedor_id = " + id);
									
									if(rs.next()) {
										System.out.println("Introduzca el nombre del proveedor (nombre actual = " + rs.getString("nombre") + "):");
										nombre = scan.nextLine();
										System.out.println("Introduzca el NIF del proveedor (NIF actual = " + rs.getString("nif") + "):");
										nif = scan.nextLine();
										System.out.println("Introduzca la dirección del proveedor (dirección actual = " + rs.getString("direccion") + "):");
										direccion = scan.nextLine();
										
										pstmt = con.prepareStatement("UPDATE proveedores SET nombre = ?, nif = ?, direccion = ? WHERE proveedor_id = ?");
										pstmt.setString(1, nombre);
										pstmt.setString(2, nif);
										pstmt.setString(3, direccion);
										pstmt.setInt(4, id);
										pstmt.execute();
										System.out.println("Proveedor actualizado.");
									} else {
										System.out.println("No hay ningún proveedor con ese id.");
									}
								}
								break;
							// DELETE
							case 4:
								if(tabla.equals("productos")) {
									System.out.println("Introduzca el id producto que quiere eliminar: ");
									id = Integer.parseInt(scan.nextLine());
									
									stmt = con.createStatement();
									rs = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE producto_id = " + id);
									
									if(rs.next()) {
										System.out.println("El producto que va a eliminar es: " + rs.getInt("producto_id") + "  " + rs.getString("nombre") + "  " + rs.getString("codigo") + "  " + rs.getString("precio") + "  " + rs.getString("proveedor_id"));
										
										pstmt = con.prepareStatement("DELETE FROM productos WHERE producto_id = ?");
										pstmt.setInt(1, id);
										pstmt.execute();
										System.out.println("Producto eliminado.");
									} else {
										System.out.println("No hay ningún producto con ese id.");
									}
									
								} else if(tabla.equals("proveedores")) {
									System.out.println("Introduzca el id del proveedor que quiere eliminar: ");
									id = Integer.parseInt(scan.nextLine());
									
									stmt = con.createStatement();
									rs = stmt.executeQuery("SELECT * FROM " + tabla + " WHERE proveedor_id = " + id);
									
									if(rs.next()) {
										System.out.println("El proveedor que va a eliminar es: " + rs.getInt("proveedor_id") + "  " + rs.getString("nombre") + "  " + rs.getString("nif") + "  " + rs.getString("direccion"));
									
										pstmt = con.prepareStatement("DELETE FROM proveedores WHERE proveedor_id = ?");
										pstmt.setInt(1, id);
										pstmt.execute();
										System.out.println("Proveedor eliminado.");
									} else {
										System.out.println("No hay ningún proveedor con ese id.");
									}
								}
								break;								
						}
						
					} while (res != 0);
					
				}
				
			} while (resTabla != 0);
			
			con.close();
			scan.close();
			
		} catch (Exception e) {
			
			System.out.println(e);
			
		}
		
	}

}
