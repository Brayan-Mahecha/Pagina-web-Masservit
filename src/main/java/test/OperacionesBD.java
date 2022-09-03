
package test;
import beans.Servicio;
import connection.DBConnection;
import java.sql.ResultSet;
import java.sql.Statement;
public class OperacionesBD {
    public static void main(String[] args) {
     listarServicio();   
    }
    public static void actualizarServicio (int id, String categoria){
        DBConnection con = new DBConnection();
        String sql = "UPDATE servicio SET categoria= '"+categoria+"'WHERE id= "+id;
        try {
            Statement st = con.getConnection().createStatement();
            st.executeUpdate(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
        con.desconectar();
        }
    }
    public static void listarServicio (){
        DBConnection con = new DBConnection();
        String sql = "SELECT * FROM servicio";
        try {
            Statement st = con.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                int id=rs.getInt("id");
                String titulo=rs.getString("titulo");
                String categoria=rs.getString("categoria");
                boolean novedad=rs.getBoolean("novedad");
                Servicio servicios = new Servicio (id,titulo,categoria,novedad);
                System.out.println(servicios.toString());
            }
            st.executeQuery(sql);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
        finally{
        con.desconectar();
        }
    
    }
}
