package controlador;

import java.sql.*;

public class GestorBD {
	
	//Metodo para "Select"
	public ResultSet execSQL1(String consulta){
		ResultSet resultado= null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Nombre base de datos online
			String DB= "sql11467512";
			//Usuario de la base de datos online
			String user="sql11467512";
			//Contrasena de la base de datos online
			String pass="QG3lKfvmIl";
			//Direccion de la pagina web
			String url="jdbc:mysql://sql11.freesqldatabase.com:3306/"+DB+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
			
			//Ser realiza la conexion
			Connection conn=DriverManager.getConnection(url,user,pass);
			
			//Crear un Statement, para realizar consulta
			Statement st=conn.createStatement();
			
			//Realiza la consulta y la guarda en resultado
			resultado= st.executeQuery(consulta);
			
		} catch(ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
		return resultado; 
	}
	
	//Metodo para "Insert", "Update" y "Delete"
	public void execSQL2(String consulta){
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			//Nombre base de datos online
			String DB= "sql11467512";
			//Usuario de la base de datos online
			String user="sql11467512";
			//Contrasena de la base de datos online
			String pass="QG3lKfvmIl";
			//Direccion de la pagina web
			String url="jdbc:mysql://sql11.freesqldatabase.com:3306/"+DB+"?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC&useSSL=false";
			
			//Se realiza la conexion
			Connection conn=DriverManager.getConnection(url,user,pass);
			
			//Crear un Statement, para realizar consulta
			Statement st=conn.createStatement();
			
			//Realizar la consulta de insercion, actualizacion o borrado
			st.executeUpdate(consulta);
			
			//Cierre de conexion
			conn.close();
			
		} catch(ClassNotFoundException e1) {
			System.out.println(e1.getMessage());
		} catch(SQLException se) {
			System.out.println(se.getMessage());
		} catch(Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
}
