package uniderp.poo.escola.dominio;

public class Carro extends BaseVeiculosRodoviario {

    private Float quilometragem;
    private int airbags;
    private Boolean sensor;
    
    public Float getQuilometragem() {
        return quilometragem;
    }
    public void setQuilometragem(Float quilometragem) {
        this.quilometragem = quilometragem;
    }
    public int getAirbags() {
        return airbags;
    }
    public void setAirbags(int airbags) {
        this.airbags = airbags;
    }
    public Boolean getSensor() {
        return sensor;
    }
    public void setSensor(Boolean sensor) {
        this.sensor = sensor;
    }
   
    public Carro(int codigo, String chassi, String nome, String modelo, int anoModelo, int anoFabricacao,
            String fabricante, String nomeProprietario, String modelo2, int eixos, double pesoLiquido, double pesoTotal,
            int portas, int rodas, String tipoCombustivel, String estadoUF, String cidadeUF, String tipoVeiculo,
            int qtdeMotores, int qtdeOcupantes, String codigoRenavam, String placa, Float quilometragem,
            int numeroPortas, int airbags, Boolean sensor) {
        super(codigo, chassi, nome, modelo, anoModelo, anoFabricacao, fabricante, nomeProprietario, modelo2, eixos,
                pesoLiquido, pesoTotal, portas, rodas, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes, codigoRenavam, placa);
        this.quilometragem = quilometragem;
        this.airbags = airbags;
        this.sensor = sensor;
    }
   
    
    @Override
    public String toString() {
        return "Carro [quilometragem=" + quilometragem + ", sensor=" + sensor +", airbags=" + airbags + "]";
    }
    
    @Override
    public void Imprimir() {

        System.out.println("------------------------");
        System.out.println("Carro:");
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
        System.out.println("Quilometragem: " +this.quilometragem);
        System.out.println("Airbag: " +this.airbags);
        System.out.println("Sensores: " +this.sensor);
        System.out.println("------------------------");
     

    }

    
}