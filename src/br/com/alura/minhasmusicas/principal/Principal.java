package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {
    static void main(String[] args) {
        Musica minhaMusica = new Musica();
        minhaMusica.setTitulo("Afterlife");
        minhaMusica.setCantor("Avanged sevenfold");

        for (int i = 0; i < 1000; i++) {

            minhaMusica.reproduz();

        }

        for (int i = 0; i < 50; i++) {

            minhaMusica.curte();

        }

        Podcast meuPodcast = new Podcast();
        meuPodcast.setTitulo("TibiaNews");
        meuPodcast.setApresentador("Minus o mago");
        meuPodcast.setDescricao("Podcast mais BADALADO do momento news");

        for (int i = 0; i < 5000; i++) {

            meuPodcast.reproduz();

        }

        for (int i = 0; i < 1000; i++) {

            meuPodcast.curte();

        }
        MinhasPreferidas preferidas = new MinhasPreferidas();
        preferidas.inclui(meuPodcast);
        preferidas.inclui(minhaMusica);

    }
}
