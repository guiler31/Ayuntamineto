package Codigo;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Arrays;
import java.util.Date;
import java.util.Properties;

public class ModeloBBDD implements Modelo {

	private VistaWB vista;
	private Properties datos;
	private File miFichero;
	private InputStream entrada;
	private final String FILE = "Fichero.ini";
	private Connection conexion;
	private Statement stmt;
	public String tabla[][] = null;
	public String tabla2[][] = null;

	public void Conexion(String bd, String login, String pwd) {
		try {

			Class.forName("com.mysql.jdbc.Driver");
			conexion = DriverManager.getConnection(bd, login, pwd);
			System.out.println(" - Conexion con MySQL establecida -");

		} catch (Exception e) {
			System.out.println("- Error de Conexion con MySQL -");
			e.printStackTrace();
		}
	}

	public void Consulta(String Query) {
		vista.clear_Table();
		String query = Query;

		try {
			PreparedStatement stmt = conexion.prepareStatement(query);

			int cont = 0;

			ResultSet rset = stmt.executeQuery(query);
			ResultSetMetaData rsmd = rset.getMetaData();
			while (rset.next()) {
				cont += 1;
				System.out.println(rset);
			}
			rset = stmt.executeQuery(query);

			int cont2 = 0;
			tabla = new String[cont][rsmd.getColumnCount()];
			// System.out.println("-----------------------");
			// System.out.println(rsmd.getColumnCount());

			while (rset.next()) {
				String fila[] = new String[rsmd.getColumnCount()];
				fila[0] = rset.getString("id");
				fila[1] = rset.getString("nombre");
				fila[2] = rset.getString("apellidos");
				fila[3] = rset.getString("tipo");
				fila[4] = rset.getString("cif");
				fila[5] = rset.getString("referenciaCatastral");
				fila[6] = rset.getString("local");
				fila[7] = rset.getString("tipoSuelo");
				fila[8] = rset.getString("emplazamiento");
				fila[9] = rset.getString("fechaInicio");
				fila[10] = rset.getString("fechaSolicitud");
				fila[11] = rset.getString("cuota");
				fila[12] = rset.getString("fotoJustificantePago");
				fila[13] = rset.getString("fotoEscritura");
				fila[15] = rset.getString("fotoModelo036");
				fila[16] = rset.getString("fotoPlanos");
				fila[17] = rset.getString("fotoCD");
				fila[18] = rset.getString("fotoMemoria");
				fila[19] = rset.getString("fotoFotografia");
				fila[20] = rset.getString("fotocopiaDni");
				fila[21] = rset.getString("certColegioOficial");
				fila[22] = rset.getString("certModelo1");
				fila[23] = rset.getString("certModelo2");
				fila[24] = rset.getString("fotoLicenciaObra");
				fila[25] = rset.getString("fotoOtrasAutorizaciones");
				fila[26] = rset.getString("descripcion");
				fila[27] = rset.getString("interesado.nombre");
				fila[28] = rset.getString("interesado.apellidos");
				fila[29] = rset.getString("interesado.cif");
				fila[30] = rset.getString("interesado.direccion");
				fila[31] = rset.getString("interesado.municipio");
				fila[32] = rset.getString("interesado.codigoPostal");
				fila[33] = rset.getString("interesado.telefonoMovil");
				fila[34] = rset.getString("interesado.telefonoFijo");
				fila[35] = rset.getString("interesado.fax");
				fila[36] = rset.getString("interesado.email");

				tabla[cont2] = fila;

				cont2++;

			}
			vista.RellenarTabla(tabla);
			vista.setDatosTabla();
			rset.close();
			stmt.close();
		} catch (SQLException s) {
			s.printStackTrace();
		}

	}

	public void refrescar() {

		this.Consulta(
				"SELECT * FROM actividad join relintrep on actividad.idIntRep = relintrep.id JOIN interesado on relintrep.idInteresado = interesado.id");
	}


	public String[][] getTabla() {
		tabla2 = new String[tabla.length][5];
		//System.out.println(tabla[0].length);
		for (int i = 0; i < tabla.length; i++) {

			for (int j = 0; j < tabla[i].length; j++) {
				if (j < 5) {
					tabla2[i][j] = tabla[i][j];
				}
				System.out.println(tabla[i][j]);
			}
		}
		return tabla2;
	}

	public void setTabla(String[][] tabla) {
		this.tabla = tabla;
	}

	@Override
	public void setVista(Vista vista) {
		this.vista = (VistaWB) vista;
	}

}
