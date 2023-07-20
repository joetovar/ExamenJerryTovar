package ec.edu.espe.arquitectura.examen.model;

import java.math.BigDecimal;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "pagoRol")
@CompoundIndex(name = "idx_pagoRol_typeDoc_DocId", def = "{'typeDocummentId':1, 'docummentId':1 }", unique = true)
public class pagoRol {

@Id
    private String mes;
    private String fechaProceso;
    private String rucEmpresa;
    private String cuentaPrincipal;
    private BigDecimal valorTotal;
    private BigDecimal ValorReal;
    
    public pagoRol() {
    }
    
    @Override
    public String toString() {
        return "pagoRol [mes=" + mes + ", fechaProceso=" + fechaProceso + ", rucEmpresa=" + rucEmpresa
                + ", cuentaPrincipal=" + cuentaPrincipal + ", valorTotal=" + valorTotal + ", ValorReal=" + ValorReal
                + "]";
    }
    public String getMes() {
        return mes;
    }
    public void setMes(String mes) {
        this.mes = mes;
    }
    public String getFechaProceso() {
        return fechaProceso;
    }
    public void setFechaProceso(String fechaProceso) {
        this.fechaProceso = fechaProceso;
    }
    public String getRucEmpresa() {
        return rucEmpresa;
    }
    public void setRucEmpresa(String rucEmpresa) {
        this.rucEmpresa = rucEmpresa;
    }
    public String getCuentaPrincipal() {
        return cuentaPrincipal;
    }
    public void setCuentaPrincipal(String cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
    }
    public BigDecimal getValorTotal() {
        return valorTotal;
    }
    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }
    public BigDecimal getValorReal() {
        return ValorReal;
    }
    public void setValorReal(BigDecimal valorReal) {
        ValorReal = valorReal;
    }
    
    


}
