package ec.edu.espe.arquitectura.examen.model;


import java.math.BigDecimal;

import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pagoRol")
@CompoundIndex(name = "idx_pagoRol_typeDoc_DocId", def = "{'typeDocummentId':1, 'docummentId':1 }", unique = true)
public class empleadosPago {


    private String numeroCuenta;
    private BigDecimal valor;
    private String estado;
    
    public empleadosPago() {
    }
    
    @Override
    public String toString() {
        return "empleadosPago [numeroCuenta=" + numeroCuenta + ", valor=" + valor + ", estado=" + estado + "]";
    }
    public String getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(String numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public BigDecimal getValor() {
        return valor;
    }
    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}