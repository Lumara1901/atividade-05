package uniderp.poo.escola.dominio;

public abstract class BaseVeiculosRodoviario extends BaseVeiculo{

    protected String codigoRenavam;
    protected String placa;
    
    public String getCodigoRenavam() {
        return codigoRenavam;
    }
    public void setCodigoRenavam(String codigoRenavam) {
        this.codigoRenavam = codigoRenavam;
    }
    public String getPlaca() {
        return placa;
    }
    public void setPlaca(String placa) {
        this.placa = placa;
    }
    public BaseVeiculosRodoviario(int codigo, String chassi, String nome, String modelo, int anoModelo,
    int anoFabricacao, String fabricante, String nomeProprietario, String modelo2, int eixos,
    double pesoLiquido, double pesoTotal, int portas, int rodas, String tipoCombustivel, String estadoUF,
    String cidadeUF, String tipoVeiculo, int qtdeMotores, int qtdeOcupantes, String codigoRenavam,
    String placa) {
        super(codigo, chassi, nome, modelo, anoModelo, anoFabricacao, fabricante, nomeProprietario, modelo2, eixos,
        pesoLiquido, pesoTotal, portas, rodas, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
        qtdeOcupantes);
this.codigoRenavam = codigoRenavam;
this.placa = placa;
    }
}
    
