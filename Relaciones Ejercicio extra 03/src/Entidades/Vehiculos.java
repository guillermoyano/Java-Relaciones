package Entidades;

public class Vehiculos {
    
    private String marca, modelo, chasis, color, tipo;
    private Integer anio, motor;

    public Vehiculos() {
    }

    public Vehiculos(String marca, String modelo, String chasis, String color, String tipo, Integer anio, Integer motor) {
        this.marca = marca;
        this.modelo = modelo;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
        this.anio = anio;
        this.motor = motor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getChasis() {
        return chasis;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Integer getAnio() {
        return anio;
    }

    public void setAnio(Integer anio) {
        this.anio = anio;
    }

    public Integer getMotor() {
        return motor;
    }

    public void setMotor(Integer motor) {
        this.motor = motor;
    }
    
}
