package uniderp.poo.escola.dominio;


public class Aviao extends BaseVeiculo {

    private int assentos;
    private String numeroDeSerie;
    private String nomeDoPiloto;
    private Float alcanceMax;
    private Float altitudeMax;
    private Float velocidadeMax;
    private int capacidadeTotal;
    private String nomePiloto;
    public int getAssentos() {
        return assentos;
    }
    public void setAssentos(int assentos) {
        this.assentos = assentos;
    }
    public String getNumeroDeSerie() {
        return numeroDeSerie;
    }
    public void setNumeroDeSerie(String numeroDeSerie) {
        this.numeroDeSerie = numeroDeSerie;
    }
    public String getNomeDoPiloto() {
        return nomeDoPiloto;
    }
    public void setNomeDoPiloto(String nomeDoPiloto) {
        this.nomeDoPiloto = nomeDoPiloto;
    }
    public Float getAlcanceMax() {
        return alcanceMax;
    }
    public void setAlcanceMax(Float alcanceMax) {
        this.alcanceMax = alcanceMax;
    }
    public Float getAltitudeMax() {
        return altitudeMax;
    }
    public void setAltitudeMax(Float altitudeMax) {
        this.altitudeMax = altitudeMax;
    }
    public Float getVelocidadeMax() {
        return velocidadeMax;
    }
    public void setVelocidadeMax(Float velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }
    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }
    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }
    
    public Aviao(int codigo, String chassi, String nome, String modelo, int anoFabricacao, int anoModelo,
            String fabricante, String nomeProprietario, String modelo2, int eixos, double pesoLiquido, double pesoTotal,
            int portas, int rodas, String tipoCombustivel, String estadoUF, String cidadeUF, String tipoVeiculo,
            int qtdeMotores, int qtdeOcupantes, int assentos, String numeroDeSerie, String nomeDoPiloto,
            Float alcanceMax, Float altitudeMax, Float velocidadeMax, int capacidadeTotal) {
        super(codigo, chassi, nome, modelo, anoFabricacao, anoModelo, fabricante, nomeProprietario, modelo2, eixos,
                pesoLiquido, pesoTotal, portas, rodas, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes);
        this.assentos = assentos;
        this.numeroDeSerie = numeroDeSerie;
        this.nomeDoPiloto = nomeDoPiloto;
        this.alcanceMax = alcanceMax;
        this.altitudeMax = altitudeMax;
        this.velocidadeMax = velocidadeMax;
        this.capacidadeTotal = capacidadeTotal;
    }
    @Override
    public void Imprimir() {
        System.out.println("\n\n");
        System.out.println("------------------------");
        System.out.println("Avião:");
        System.out.println("Código: " +this.codigo);
        System.out.println("Chassi: " +this.chassi);
        System.out.println("Nome: " +this.nome);
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Ano do Modelo: " +this.anoModelo);
        System.out.println("Ano de fabricacão: " +this.anoFabricacao);
        System.out.println("Fabricante: " +this.fabricante);
        System.out.println("Nome do Proprietário: " +this.nomeProprietario);
        System.out.println("Eixos: " +this.eixos);
        System.out.println("Peso Liquido: " +this.pesoLiquido);
        System.out.println("Peso Total: " +this.pesoTotal);
        System.out.println("Quantidade de Portas: " +this.portas);
        System.out.println("Quantidade de rodas: " +this.rodas);
        System.out.println("Tipo de Combustível: " +this.tipoCombustivel);
        System.out.println("Estado: " +this.estadoUF);
        System.out.println("Cidade: " +this.cidadeUF);
        System.out.println("Tipo de Veículo: " +this.tipoVeiculo);
        System.out.println("Quantidade de Motores: " +this.qtdeMotores);
        System.out.println("Quantidade de Ocupantes: " +this.qtdeOcupantes);
        System.out.println("Assentos: " +this.assentos);
        System.out.println("Nome do Piloto" +this.nomePiloto);
        System.out.println("Número de Série: " +this.numeroDeSerie);
        System.out.println("Alcance Máximo: " +this.alcanceMax);
        System.out.println("Altitude Máxima: " +this.altitudeMax);
        System.out.println("Velocidade Máxima: " +this.velocidadeMax);
        System.out.println("Capacidade Total: " +this.capacidadeTotal);
        System.out.println("------------------------");
    }
    @Override
    public String toString() {
        return "Aviao [assentos=" + assentos + ", numeroDeSerie=" + numeroDeSerie + ", nomeDoPiloto=" + nomeDoPiloto +", alcanceMax=" + alcanceMax
                + ", altitudeMax=" + altitudeMax + ", velocidadeMax=" + velocidadeMax + ", capacidadeTotal="
                + capacidadeTotal + "]";
    } 
}
