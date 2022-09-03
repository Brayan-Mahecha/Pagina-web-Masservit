
package beans;


public class Servicio {
    private int id;
    private String titulo;
    private String categoria;
    private boolean novedad;

    public Servicio(int id, String titulo, String categoria, boolean novedad) {
        this.id = id;
        this.titulo = titulo;
        this.categoria = categoria;
        this.novedad = novedad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public boolean isNovedad() {
        return novedad;
    }

    public void setNovedad(boolean novedad) {
        this.novedad = novedad;
    }

    @Override
    public String toString() {
        return "Servicio{" + "id=" + id + ", titulo=" + titulo + ", categoria=" + categoria + ", novedad=" + novedad + '}';
    }
    
}
