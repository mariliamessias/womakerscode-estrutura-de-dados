package com.br.loiane.estrutura.de.dados.activities.vetor;

import com.br.loiane.estrutura.de.dados.models.Lista;

public class Aula04 {

    public static void main(String[] args) {
        Lista lista = new Lista(10);

        lista.adiciona("elemento 1");
        lista.adiciona("elemento 2");

        System.out.println(lista.tamanho());
        System.out.println(lista);
    }
}
