package ordenadores;

public class OrdenarPorMerge implements Ordenador {

    @Override
    public int[] ordene(int[] array) {
        // if (array.length <= 1) {
            return array;
        }
   // }
    //     int meio = (array.length / 2);
    //     int[] esquerda = new int[meio];
    //     int[] direita = new int[array.length - meio];

    //     System.arraycopy(array, 0, parteEsquerda, 0, meio);
    //     System.arraycopy(array, meio, parteDireita, 0, array.length - meio);
    //     parteEsquerda = ordene(parteEsquerda);
    //     parteDireita = ordene(parteDireita);

    //     return merge(parteEsquerda, parteDireita);
    // }

    public int[] merge(int[] array, int[] array2) {
        int[] result = new int[array.length + array2.length];
        int i = 0, j = 0, k = 0;

        while (i < array.length && j < array2.length) {
            if (array[i] <= array2[j]) {
                result[k++] = array[i++];
            } else {
                result[k++] = array2[j++];
            }
        }

        while (i < array.length) {
            result[k++] = array[i++];
        }
        while (j < array.length) {
            result[k++] = array2[j++];
        }
        return result;
    }
}
