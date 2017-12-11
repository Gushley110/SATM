package satm;

import java.sql.Date;

public class Reporte {
    
    private Date fechaEntrada;
    private Date fechaSalida;
    private String descFalla;
    private int pagoxserv;
    private int pagoAdelanto;

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
    
    public String getDescFalla() {
        return descFalla;
    }

    public void setDescFalla(String descFalla) {
        this.descFalla = descFalla;
    }

    public int getPagoxserv() {
        return pagoxserv;
    }

    public void setPagoxserv(int pagoxserv) {
        this.pagoxserv = pagoxserv;
    }

    public int getPagoAdelanto() {
        return pagoAdelanto;
    }

    public void setPagoAdelanto(int pagoAdelanto) {
        this.pagoAdelanto = pagoAdelanto;
    }

}
