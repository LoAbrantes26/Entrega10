package br.estacio.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cores {
    public static void main(String[] args) {
        
        /* criando lista de cores */
        List<String> listaCores = new ArrayList<>();
        
        listaCores.add("Azul");
        listaCores.add("Vermelho");
        listaCores.add("Amarelo");
        listaCores.add("Preto");
        listaCores.add("Laranja");
        listaCores.add("Roxo");
        
        /* imprimindo lista de cores */
        System.out.println("--> Lista de Cores <-- \n");
        for (int i = 0; i < listaCores.size(); i++) {
            System.out.println("-" + listaCores.get(i));
        }
        
        /* adicionando três cores novas na lista */
        listaCores.add("Cinza");
        listaCores.add("Prata");
        listaCores.add("Bordô");
        
        /* ordenando lista com Collections */
        Collections.sort(listaCores);
        
        /* imprimindo lista ordenada */
        System.out.println("\n\n--> Lista [ORDENADA] de Cores  <-- \n");
        for (int i = 0; i < listaCores.size(); i++) {
            System.out.println("-" + listaCores.get(i));
        }
        

                
    }
}
