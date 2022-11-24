package Entidades;

import java.util.Date;

public class Poliza {
    
    private Clientes cliente;
    private Vehiculos vehiculos;
    private Integer numPoliza, cantCuotas, montoGranizo;
    private Date inicio, fin;
    private Long montoAsegurado;
    private Boolean granizo;
    private FormPago formaDePago;
    private TipoCobertura tipoCobertura;

    public Poliza() {
    }

    public Poliza(Clientes cliente, Vehiculos vehiculos, Integer numPoliza, Integer cantCuotas, Integer montoGranizo, Date inicio, Date fin, Long montoAsegurado, Boolean granizo, FormPago formaDePago, TipoCobertura tipoCobertura) {
        this.cliente = cliente;
        this.vehiculos = vehiculos;
        this.numPoliza = numPoliza;
        this.cantCuotas = cantCuotas;
        this.montoGranizo = montoGranizo;
        this.inicio = inicio;
        this.fin = fin;
        this.montoAsegurado = montoAsegurado;
        this.granizo = granizo;
        this.formaDePago = formaDePago;
        this.tipoCobertura = tipoCobertura;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public Vehiculos getVehiculos() {
        return vehiculos;
    }

    public void setVehiculos(Vehiculos vehiculos) {
        this.vehiculos = vehiculos;
    }

    public Integer getNumPoliza() {
        return numPoliza;
    }

    public void setNumPoliza(Integer numPoliza) {
        this.numPoliza = numPoliza;
    }

    public Integer getCantCuotas() {
        return cantCuotas;
    }

    public void setCantCuotas(Integer cantCuotas) {
        this.cantCuotas = cantCuotas;
    }

    public Integer getMontoGranizo() {
        return montoGranizo;
    }

    public void setMontoGranizo(Integer montoGranizo) {
        this.montoGranizo = montoGranizo;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public Long getMontoAsegurado() {
        return montoAsegurado;
    }

    public void setMontoAsegurado(Long montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    public Boolean getGranizo() {
        return granizo;
    }

    public void setGranizo(Boolean granizo) {
        this.granizo = granizo;
    }

    public FormPago getFormaDePago() {
        return formaDePago;
    }

    public void setFormaDePago(FormPago formaDePago) {
        this.formaDePago = formaDePago;
    }

    public TipoCobertura getTipoCobertura() {
        return tipoCobertura;
    }

    public void setTipoCobertura(TipoCobertura tipoCobertura) {
        this.tipoCobertura = tipoCobertura;
    }
    
    

    

}
