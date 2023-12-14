package ordenadores;

import java.util.Arrays;

public class OrdenarPorContagemSimples implements Ordenador{

    @Override
    public int[] ordene(int[] array) {
         Arrays.sort(array);
        return array;
    }
    
}
