package exer2listainterface;

public class BubbleSort implements Ordenavel {

    @Override
    public void ordenar() {
        int[] lista = {10,40,30,20};
        int temp = 0;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 1; j < (lista.length - i); j++) {
                if (lista[j - 1] > lista[j]) {
                    temp = lista[j - 1];
                    lista[j - 1] = lista[j];
                    lista[j] = temp;
                }
            }
        }
        for (int i = 0; i < lista.length; i++) {
            System.out.println(lista[i]+" ");
        }
        System.out.println();
    }


}
