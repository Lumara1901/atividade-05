package uniderp.poo.escola.dominio;

public class Motocicleta extends BaseVeiculosRodoviario{

    private int cilindradas;
    private String tipoMotor;
    
    public int getCilindros() {
        return cilindradas;
    }
    public void setCilindros(int cilindros) {
        this.cilindradas = cilindros;
    }
    public String getTipoMotor() {
        return tipoMotor;
    }
    public void setTipoMotor(String tipoMotor) {
        this.tipoMotor = tipoMotor;
    }
    
    public Motocicleta(int codigo, String chassi, String nome, String modelo, int anoModelo, int anoFabricacao,
            String fabricante, String nomeProprietario, String modelo2, int eixos, double pesoLiquido, double pesoTotal,
            int portas, int rodas, String tipoCombustivel, String estadoUF, String cidadeUF, String tipoVeiculo,
            int qtdeMotores, int qtdeOcupantes, String codigoRenavam, String placa, int cilindros, String tipoMotor) {
        super(codigo, chassi, nome, modelo, anoModelo, anoFabricacao, fabricante, nomeProprietario, modelo2, eixos,
                pesoLiquido, pesoTotal, portas, rodas, tipoCombustivel, estadoUF, cidadeUF, tipoVeiculo, qtdeMotores,
                qtdeOcupantes, codigoRenavam, placa);
        this.cilindradas = cilindros;
        this.tipoMotor = tipoMotor;
    }
   
    @Override
    public String toString() {
        return "Motocicleta [tipoMotor=" + tipoMotor + ", cilindradas= "+ cilindradas + "]";
    }
    
    @Override
    public void Imprimir() {

        System.out.println("\n\n");
        System.out.println("------------------------");
        System.out.println("Motocicleta:");
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
        System.out.println("Quantidade de Cilindradas: " +this.cilindradas);
        System.out.println("Tipo do Motor: " +this.tipoMotor);
        System.out.println("------------------------");
        
    }

    
    
}