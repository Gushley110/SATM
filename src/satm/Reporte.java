package satm;

import java.sql.Date;

public class Reporte {
    
    private Integer id;
    private Date fechaEntrada;
    private Date fechaSalida;
    private String tipoPago;
    private Double pagoxserv;
    private Double pagoAdelanto;
    private Integer idUsuario;
    private Integer idVehiculo;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public Double getPagoxserv() {
        return pagoxserv;
    }

    public void setPagoxserv(Double pagoxserv) {
        this.pagoxserv = pagoxserv;
    }

    public Double getPagoAdelanto() {
        return pagoAdelanto;
    }

    public void setPagoAdelanto(Double pagoAdelanto) {
        this.pagoAdelanto = pagoAdelanto;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdVehiculo() {
        return idVehiculo;
    }

    public void setIdVehiculo(Integer idVehiculo) {
        this.idVehiculo = idVehiculo;
    }

}
