package ActTabs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*Autor: BYO*/
public class DriverBD {

     protected String URL, IP, BD, USER, PASS, STAT;
     Connection CONX;

     DriverBD() {
          STAT = "NO";
     }

     public void DriverBDVarSet(String IP, String BD, String USER, String PASS) {
          this.IP = IP;
          this.BD = BD;
          this.URL = "jdbc:mysql://" + IP + "/" + BD;
          this.USER = USER;
          this.PASS = PASS;
     }

     public Connection Conectar() throws ClassNotFoundException, SQLException {
          Class.forName("com.mysql.jdbc.Driver");
          CONX = DriverManager.getConnection(URL, USER, PASS);
          this.STAT = "SI";
          return this.CONX;
     }

     public void Desconectar() throws SQLException {
          this.CONX.close();
          STAT = "NO";
     }

     public void EjecutarQuery(String QUERY) throws SQLException {
          Statement QUERYEX = CONX.createStatement();
          QUERYEX.executeUpdate(QUERY);
     }

     public void AltaAlum(String CARNET, String NOMBRE, String APELLIDO, String DPI, String DEPARTAMENTO, String MUNICIPIO, String ZONA) throws SQLException {
          Statement QUERY = CONX.createStatement();
          QUERY.executeUpdate("INSERT INTO `umg`.`alumno` (`Carnet`, `Nombre`, `Apellido`, `DPI`, `Departamento`, `Municipio`, `Zona`) VALUES ('" + CARNET + "', '" + NOMBRE + "', '" + APELLIDO + "', '" + DPI + "', '" + DEPARTAMENTO + "', '" + MUNICIPIO + "', '" + ZONA + "');");
          QUERY.close();
     }

     public void AltaAsig(String CARNET, String ID_CURSO, String SECCION, String HORARIO, String CATEDRATICO) throws SQLException {
          Statement QUERY = CONX.createStatement();
          QUERY.executeUpdate("INSERT INTO `umg`.`asignacion` (`Carnet`, `Id_Curso`, `Seccion`, `Horario`, `Catedratico`) VALUES ('" + CARNET + "', '" + ID_CURSO + "', '" + SECCION + "', '" + HORARIO + "', '" + CATEDRATICO + "');");
          QUERY.close();
     }

     public void AltaCurso(String ID_CURSO, String NOMBRE, String CREDITOS) throws SQLException {
          Statement QUERY = CONX.createStatement();
          QUERY.executeUpdate("INSERT INTO `umg`.`curso` (`Id_Curso`, `Nombre`, `Creditos`) VALUES ('" + ID_CURSO + "', '" + NOMBRE + "', '" + CREDITOS + "');");
          QUERY.close();
     }

     public void Baja(String TABLA, String LLAVEP, String VALOR) throws SQLException {
          Statement QUERY = CONX.createStatement();
          QUERY.executeUpdate("DELETE FROM `" + BD + "`.`" + TABLA + "` WHERE `" + TABLA + "`.`" + LLAVEP + "` = " + VALOR);
          QUERY.close();
     }

     public String ConsultaAsignacion(String CARNET) throws SQLException {
          String CAD = null;
          Statement QUERY = CONX.createStatement();
          ResultSet GETNALUM = QUERY.executeQuery("SELECT Nombre FROM `alumno` WHERE `Carnet` = " + CARNET);
          while (GETNALUM.next()) {
               CAD = GETNALUM.getString(1);
          }
          ResultSet GETAALUM = QUERY.executeQuery("SELECT Apellido FROM `alumno` WHERE `Carnet` = " + CARNET);
          CAD = CAD + " ";
          while (GETAALUM.next()) {
               CAD = CAD + GETAALUM.getString(1);
          }
          ResultSet GETNCURSO = QUERY.executeQuery("SELECT Nombre FROM `curso` WHERE `Id_curso` IN (SELECT Id_Curso FROM `asignacion` WHERE `Carnet` = " + CARNET + ")");
          CAD = CAD + " se asignó a los cursos: \n";
          while (GETNCURSO.next()) {
               CAD = CAD + GETNCURSO.getString(1) + "\n";
          }
          QUERY.close();
          GETNALUM.close();
          GETAALUM.close();
          GETNCURSO.close();
          return CAD;
     }

     public String ConsultaSeccion() throws SQLException {
          String CAD = "";
          Statement QUERY = CONX.createStatement();
          ResultSet GETNUMALUM = QUERY.executeQuery("SELECT curso.Nombre ,asignacion.Seccion ,COUNT(*) AS Numero FROM curso ,asignacion, alumno WHERE curso.Id_Curso = asignacion.Id_Curso AND asignacion.Carnet = alumno.Carnet GROUP BY curso.Nombre, asignacion.Seccion");
          while (GETNUMALUM.next()) {
               CAD = CAD + GETNUMALUM.getString(1) + ", sección ";
               CAD = CAD + GETNUMALUM.getString(2) + " = ";
               CAD = CAD + GETNUMALUM.getString(3);
               CAD = CAD + "\n";
          }
          return CAD;
     }
     
     public String ConsultaDepto(String ID_CURSO) throws SQLException{
          String CAD = "";
          Statement QUERY = CONX.createStatement();
          ResultSet GETDEPTO = QUERY.executeQuery("SELECT alumno.Departamento, COUNT(*) AS Numero FROM asignacion, alumno WHERE asignacion.Id_Curso = "+ID_CURSO+" AND asignacion.Carnet = alumno.Carnet GROUP BY alumno.Departamento");
          while(GETDEPTO.next()){
               CAD = CAD + "En el departamento de " + GETDEPTO.getString(1) +" hay "+ GETDEPTO.getString(2) + " estudiantes.\n";
          }
          if ("".equals(CAD)){
               CAD = "No hay estudiantes de este curso";
          }
          return CAD;
     }
    
     public ResultSet GetComboItems() throws SQLException{
          Statement QUERY = CONX.createStatement();
          ResultSet GETITEMS = QUERY.executeQuery("SELECT Id_Curso, Nombre FROM curso");
          return GETITEMS;
     }

     public String getStat() {
          return STAT;
     }
}
