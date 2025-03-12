package entities;

import services.MusicPlayer;
import services.Phone;
import services.WebBrowser;

import java.sql.SQLOutput;

public class Iphone implements WebBrowser, MusicPlayer, Phone {


    @Override
    public void pausar() {
        System.out.println("Pausando Musica");

    }



    @Override
    public String selecionarMusica(String musicaSelecionada) {
        return "musica selecionada: " + musicaSelecionada;
    }

    @Override
    public void tocar() {

        System.out.println("Tocando Musica");
    }

    @Override
    public void atender() {

        System.out.println("Atendendo Telefone");

    }

    @Override
    public void iniciarCorreioDeVoz() {

        System.out.println("Inciando correio de voz");

    }

    @Override
    public String ligar(String numero) {
        return "Ligando para o número: " + numero;
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova Aba Aberta");

    }

    @Override
    public void atualizarPagina() {

        System.out.println("Página Atualizada");

    }

    @Override
    public String exibirPagina(String url) {
        return "Exibindo a página: " + url;
    }
}