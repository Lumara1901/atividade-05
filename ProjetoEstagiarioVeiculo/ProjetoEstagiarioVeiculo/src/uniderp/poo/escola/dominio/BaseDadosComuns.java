package uniderp.poo.escola.dominio;

public abstract class BaseDadosComuns extends BaseIdentificador {

    protected String nome;
    protected String modelo; 
    protected int anoFabricacao;
    protected int anoModelo;
    protected String fabricante;
    protected String nomeProprietario;

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    public int getAnoFabricacao() {
        return anoFabricacao;
    }
    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }
    public int getAnoModelo() {
        return anoModelo;
    }
    public void setAnoModelo(int anoModelo) {
        this.anoModelo = anoModelo;
    }
    public String getFabricante() {
        return fabricante;
    }
    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }
    public String getNomeProprietario() {
        return nomeProprietario;
    }
    public void setNomeProprietario(String nomeProprietario) {
        this.nomeProprietario = nomeProprietario;
    }
    public BaseDadosComuns(int codigo, String chassi, String nome, String modelo, int anoFabricacao, int anoModelo,
            String fabricante, String nomeProprietario) {
        super(codigo, chassi);
        this.nome = nome;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.anoModelo = anoModelo;
        this.fabricante = fabricante;
        this.nomeProprietario = nomeProprietario;
    }
    
}