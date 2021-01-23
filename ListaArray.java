/* Array list é uma lista que tu pode adicionar e remover itens (que nem no Python)
Linkedlist é a mesma coisa porém com comandos diferentes

It is best to use an ArrayList when:

You want to access random items frequently
You only need to add or remove elements at the end of the list
It is best to use a LinkedList when:

You only use the list by looping through it instead of accessing random items
You frequently need to add and remove items from the beginning, middle or end of the
list*/

import java.util.ArrayList;

public class ListaArray {

    public static void main(String[] args) {
        ArrayList<String> objetoCarros = new ArrayList<String>();
        objetoCarros.add("Fusca");
        objetoCarros.add("Corsa");
        objetoCarros.add("Celta");

        //para pegar um item da lista, usa-se get
        System.out.println(objetoCarros.get(2));

        //para modificar, usa-se set
        objetoCarros.set(1, "Ferrari");

        //para remover
        objetoCarros.remove(0);

        //para limpar a lista
        objetoCarros.clear();
        
        for (String i : objetoCarros) {
            System.out.println(i);

        }
    }
}
