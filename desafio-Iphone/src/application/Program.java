package application;

import entities.Iphone;

public class Program {
    public static void main(String[] args) {

        Iphone iphone = new Iphone();

        iphone.selecionarMusica("Faroeste Cabloco");
        iphone.tocar();
        iphone.pausar();
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
        iphone.exibirPagina("www.dio.com.br");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();
        iphone.ligar("11868585545555");

    }


}
