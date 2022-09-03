
package beans;

import java.sql.Date;


public class Alquiler {
    private int id;
    private int username;
    private Date fecha;

    public Alquiler(int id, int username, Date fecha) {
        this.id = id;
        this.username = username;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "id=" + id + ", username=" + username + ", fecha=" + fecha + '}';
    }
    
}

