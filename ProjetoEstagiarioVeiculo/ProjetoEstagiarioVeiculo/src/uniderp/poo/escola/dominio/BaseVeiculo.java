package uniderp.poo.escola.dominio;

public abstract class BaseVeiculo extends BaseDadosComuns implements IImpressao {

    protected String modelo;
    protected int eixos;
    protected double pesoLiquido;
    protected double pesoTotal;
    protected int portas;
    protected int rodas;
    protected String tipoCombustivel;
    protected String estadoUF;
    protected String cidadeUF;
    protected String tipoVeiculo;
    protected int qtdeMotores;
    protected int qtdeOcupantes;
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getEixos() {
        return eixos;
    }
    public void setEixos(int eixos) {
        this.eixos = eixos;
    }
    public double getPesoLiquido() {
        return pesoLiquido;
    }
    public void setPesoLiquido(double pesoLiquido) {
        this.pesoLiquido = pesoLiquido;
    }
    public double getPesoTotal() {
        return pesoTotal;
    }
    public void setPesoTotal(double pesoTotal) {
        this.pesoTotal = pesoTotal;
    }
    public int getPortas() {
        return portas;
    }
    public void setPortas(int portas) {
        this.portas = portas;
    }
    public int getRodas() {
        return rodas;
    }
    public void setRodas(int rodas) {
        this.rodas = rodas;
    }
    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getEstadoUF() {
        return estadoUF;
    }
    public void setEstadoUF(String estadoUF) {
        this.estadoUF = estadoUF;
    }
    public String getCidadeUF() {
        return cidadeUF;
    }
    public void setCidadeUF(String cidadeUF) {
        this.cidadeUF = cidadeUF;
    }
    public String getTipoVeiculo() {
        return tipoVeiculo;
    }
    public void setTipoVeiculo(String tipoVeiculo) {
        this.tipoVeiculo = tipoVeiculo;
    }
    public int getQtdeMotores() {
        return qtdeMotores;
    }
    public void setQtdeMotores(int qtdeMotores) {
        this.qtdeMotores = qtdeMotores;
    }
    public int getQtdeOcupantes() {
        return qtdeOcupantes;
    }
    public void setQtdeOcupantes(int qtdeOcupantes) {
        this.qtdeOcupantes = qtdeOcupantes;
    }
    public BaseVeiculo(int codigo, String chassi, String nome, String modelo, int anoFabricacao, int anoModelo,
            String fabricante, String nomeProprietario, String modelo2, int eixos, double pesoLiquido, double pesoTotal,
            int portas, int rodas, String tipoCombustivel, String estadoUF, String cidadeUF, String tipoVeiculo,
            int qtdeMotores, int qtdeOcupantes) {
        super(codigo, chassi, nome, modelo, anoFabricacao, anoModelo, fabricante, nomeProprietario);
        modelo = modelo2;
        this.eixos = eixos;
        this.pesoLiquido = pesoLiquido;
        this.pesoTotal = pesoTotal;
        this.portas = portas;
        this.rodas = rodas;
        this.tipoCombustivel = tipoCombustivel;
        this.estadoUF = estadoUF;
        this.cidadeUF = cidadeUF;
        this.tipoVeiculo = tipoVeiculo;
        this.qtdeMotores = qtdeMotores;
        this.qtdeOcupantes = qtdeOcupantes;
    }
    
}