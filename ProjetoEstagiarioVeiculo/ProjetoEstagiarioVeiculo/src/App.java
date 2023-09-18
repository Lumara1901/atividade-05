import uniderp.poo.escola.dominio.Aviao;
import uniderp.poo.escola.dominio.Caminhao;
import uniderp.poo.escola.dominio.Carro;
import uniderp.poo.escola.dominio.Motocicleta;
import uniderp.poo.escola.dominio.Onibus;


public class App {
    public static void main(String[] args) throws Exception {

        
        Caminhao cm = new Caminhao(2, 
        "9 BW SU19F0 863652", 
        "VOLVO", 
        "FH 460", 
        2023, 
        1993, 
        "VOLVO", 
        "Luiz", 
        "FH 460", 
        7, 
        9000, 
        78, 
        2, 
        6, 
        "Diesel", 
        "RJ", 
        "Rio de Janeiro", 
        "Caminhão", 
        2, 
        3, 
        "984300294385", 
        "GIO-3452", 
        (float) 30, 
        (float) 10);
    
        cm.Imprimir();


         Carro c1 = new Carro(1, 
        "7 FR DI55554 555225", 
        "CORSA", 
        "CLASSIC", 
        2010, 
        2003, 
        "CHEVROLET", 
        "Gabriel",
        "SEDAN", 
        2, 
        2.0, 
        905, 
        4, 
        4, 
        "Gaslina", 
        "MS", 
        "CAMPO GRANDE", 
        "Carro", 
        1, 
        5, 
        "7329853087", 
        "REF-5896", 
        (float)30, 
        0, 
        30,
        true);

        c1.Imprimir();


        Onibus o1 = new Onibus(3, 
        "5 HJ25566 25625555", 
        "COMIL PIA ROD", 
        "COMIL PIA ROD", 
        2013, 
        2020, 
        "VOLKSWAGEN", 
        "Antonio", 
        "2020", 
        4, 
        209, 
        500, 
        2, 
        4, 
        "Óleo Diesel", 
        "AL", 
        "Maceio", 
        "ônibus", 
        2, 
        200, 
        "20993738753", 
        "TGD67432", 
        205, 
        true, 
        true,
        false, 
        true);

        o1.Imprimir();



        Motocicleta m1 = new Motocicleta(4, 
        "2 HU4524 0255842", 
        "BMW", 
        "R 1250", 
        2017, 
        2016, 
        "BMW", 
        "Elias", 
        "R 1250", 
        1, 
        20, 
        25, 
        0, 
        2, 
        "Gasolina", 
        "MS", 
        "Campo Grande", 
        "Motocicleta", 
        1, 
        2, 
        "2030943975212", 
        "MDH37452", 
        5, 
        "Combustão");

        m1.Imprimir();



        Aviao a1 = new Aviao(5, 
        "7 gf9555 4815216", 
        "Boeing", 
        "747", 
        2020, 
        2019, 
        "Boeing CO", 
        "Azul", 
        "747", 
        1, 
        10000, 
        20000, 
        2, 
        2, 
        "QAV", 
        "MS", 
        "Campo Grande", 
        "Aeronave", 
        2, 
        300, 
        300, 
        "209498487298", 
        null, (float) 50, 
        (float) 50, 
        (float) 1000,
        300);

        a1.Imprimir();
    }
}