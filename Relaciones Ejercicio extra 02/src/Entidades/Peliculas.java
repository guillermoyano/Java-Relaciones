/*
de las películas nos interesa saber
el título, duración, edad mínima y director
*/
package Entidades;

public class Peliculas {

    private String título, director;
    private Integer duracion, edadMinima;

    public Peliculas() {
        this.título = "Kung Fu Panda";
        this.director = "Chin Chu Lancha";
        this.duracion = 95;
        this.edadMinima = 7;
    }

    public Peliculas(String título, String director, Integer duracion, Integer edadMinima) {
        this.título = título;
        this.director = director;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
    }

    public String getTítulo() {
        return título;
    }

    public void setTítulo(String título) {
        this.título = título;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }

    public Integer getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(Integer edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public String toString() {
        return "Peliculas{" + "t\u00edtulo=" + título + ", director=" + director + ", duracion=" + duracion + ", edadMinima=" + edadMinima + '}';
    }
    
    
}
