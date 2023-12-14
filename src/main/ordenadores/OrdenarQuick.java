package ordenadores;
public class OrdenarQuick implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
        int n = array.length;
        boolean trocou;

        do {
            trocou = false;
            for (int i = 0; i < n - 1; i++) {
                if (array[i] > array[i + 1]) {
                    // Troca os elementos se estiverem fora de ordem
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                    trocou = true;
                }
            }
        } while (trocou);
        return array;
    }


    public int quickParticio(int[] array, int inicio, int fim){
        if (inicio < fim) {
            int indicePivot = quickParticao(array, inicio, fim);
            quickSort(array, inicio, indicePivot - 1);
            quickSort(array, indicePivot + 1, fim);
        }
        return 0;
    }


    private void quickSort(int[] array, int inicio, int i) {
    }


    private int quickParticao(int[] array, int inicio, int fim) {
        return 0;
    }
    
}
