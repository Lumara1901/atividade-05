package uniderp.poo.escola.dominio;

public abstract class BaseIdentificador {

    protected int codigo;
    protected String chassi;
    
    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getChassi() {
        return chassi;
    }
    public void setChassi(String chassi) {
        this.chassi = chassi;
    }
    public BaseIdentificador(int codigo, String chassi) {
        this.codigo = codigo;
        this.chassi = chassi;
    }
   

}
