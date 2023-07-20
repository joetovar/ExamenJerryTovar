package ec.edu.espe.arquitectura.examen.model;


import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "empresa")
@CompoundIndex(name = "idx_empresa_typeDoc_DocId", def = "{'typeDocummentId':1, 'docummentId':1 }", unique = true)
public class empresa {


    private String ruc;
    private String razonSocial;
    private String cuentaPrincipal;
    
    @Override
    public String toString() {
        return "empresa [ruc=" + ruc + ", razonSocial=" + razonSocial + ", cuentaPrincipal=" + cuentaPrincipal + "]";
    }

    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getCuentaPrincipal() {
        return cuentaPrincipal;
    }

    public void setCuentaPrincipal(String cuentaPrincipal) {
        this.cuentaPrincipal = cuentaPrincipal;
    }

    public empresa() {
    }

    public empresa(String ruc, String razonSocial, String cuentaPrincipal) {
        this.ruc = ruc;
        this.razonSocial = razonSocial;
        this.cuentaPrincipal = cuentaPrincipal;
    }


}
