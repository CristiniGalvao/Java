/*
 * @author Gabriella Cristini Galvão RA:00240549
Crie uma interface chamada Ordenavel com um método ordenar() que recebe um array de inteiros e o ordena em ordem crescente. 
Em seguida, implemente essa interface em uma classe chamada BubbleSort que implementa o algoritmo de ordenação Bubble Sort.
 */
package exer2listainterface;
public class Exer2ListaInterface {

    public static void main(String[] args) {
       BubbleSort  ordena = new BubbleSort();
        ordena.ordenar();
    }

}
