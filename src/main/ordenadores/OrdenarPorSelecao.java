package ordenadores;

public class OrdenarPorSelecao implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        // int n = array.length;
        for (int i = 0; i < array.length - 1; i++) {
            int minimo = i;

            for (int j = i; j < array.length; j++) {
                if (array[j] < array[minimo]) {
                    minimo = j;

                }
            }

            int temp = array[minimo];
            array[minimo] = array[i];
            array[i] = temp;

        }

        return array;
    }
}
