import ordenadores.OrdenarPorInsercao;
import ordenadores.OrdenarPorMerge;
import ordenadores.OrdenarPorSelecao;

public class Main {
    public static void main(String[] args) {
        //teste01 inserção
    //     int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };
    //     OrdenarPorInsercao o = new OrdenarPorInsercao();
    //     int[] array2 = o.ordene(array);
    //     for (int i : array2) {
    //         System.out.println("InsertionSort"i);

    //     }
    //
    // //teste02 selecao
    // int[] array = { 5, 3, 2, 4, 7, 1, 0, 6 };
    //     OrdenarPorSelecao o = new OrdenarPorSelecao();
    //     int[] array2 = o.ordene(array);
    //     for (int i : array2) {
    //         System.out.println("selectionsort"+i);

    //     }
    // }

        //teste03
        int[] array3 = {  7, 9, 15, 17, 20};
        int[] array4 = { 0, 1,  2, 22, 30};
        OrdenarPorMerge m = new OrdenarPorMerge();
        int[] r = m.merge(array3, array4);
        for(int i : r)
        System.out.println(i);
    }
}
