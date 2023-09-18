package uniderp.poo.escola.dominio;

public class Onibus extends BaseVeiculosRodoviario{

    private int capacidadeTotal;
    private Boolean arCondicionado;
    private Boolean wifi;
    private Boolean banheiro;
    private Boolean acessibilidade;

    public int getCapacidadeTotal() {
        return capacidadeTotal;
    }

    public void setCapacidadeTotal(int capacidadeTotal) {
        this.capacidadeTotal = capacidadeTotal;
    }

    public Boolean getArCondicionado() {
        return arCondicionado;
    }

    public void setArCondicionado(Boolean arCondicionado) {
        this.arCondicionado = arCondicionado;
    }

    public Boolean getWifi() {
        return wifi;
    }

    public void setWifi(Boolean wifi) {
        this.wifi = wifi;
    }

    public Boolean getBanheiro() {
        return banheiro;
    }

    public void setBanheiro(Boolean banheiro) {
        this.banheiro = banheiro;
    }

    public Boolean getAcessibilidade() {
        return acessibilidade;
    }

    public void setAcessibilidade(Boolean acessibilidade) {
        this.acessibilidade = acessibilidade;
    }
    
    public Onibus(int codigo, String chassi, String nome, String modelo, int anoModelo, int anoFabricacao,
            String fabricante, String nomeProprietario, String modelo2, int eixos, double pesoLiquido, double pesoTotal,
            int portas, int rodas, String tipoCombustivel, String estadoUF, String cidadeUF, String tipoVeiculo,
            int qtdeMotores, int qtdeOcupantes, String codigoRenavam, String placa, int capacidadeTotal,
            Boolean arCondicionado, Boolean wifi, Boolean banheiro, Boolean acessibilidade) {
        super(codigo, chassi, nome, modelo, anoModelo, anoFabricacao, fabricante, nomeProprietario, modelo2, eixos,
                pesoLiquido, pesoTotal, portas, rodas, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes, codigoRenavam, placa);
        this.capacidadeTotal = capacidadeTotal;
        this.arCondicionado = arCondicionado;
        this.wifi = wifi;
        this.banheiro = banheiro;
        this.acessibilidade = acessibilidade;
    }
   
    @Override
    public String toString() {
        return "Onibus [capacidadeTotal=" + capacidadeTotal + ", arCodicionado="  + arCondicionado + ", wifi=" + wifi + 
        ", banheiro=" + banheiro + ", acessibilidade=" + acessibilidade +"]";
    }
    @Override
    public void Imprimir() {
        
        System.out.println("\n\n");
        System.out.println("------------------------");
        System.out.println("Ônibus:");
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
        System.out.println("Código Renavam: " +this.codigoRenavam);
        System.out.println("Placa do Veículo: " +this.placa);
        System.out.println("Capacidade Total: " +this.capacidadeTotal);
        System.out.println("Ar Condicionado: " +this.arCondicionado);
        System.out.println("WI-Fi: " +this.wifi);
        System.out.println("Banheiro: " +this.banheiro);
        System.out.println("Acessibilidades: " +this.acessibilidade);
        System.out.println("------------------------");
        
    }
}