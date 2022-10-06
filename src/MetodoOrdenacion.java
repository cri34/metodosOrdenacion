public class MetodoOrdenacion {
    int[] numeros = {2, 34, 0, 0, 53, 3, 9, 90, 78, 90, 9};

    public void mostrarArray(int[] array) {
        for (int index = 0; index < array.length; index++) {
            System.out.print(" " + array[index]);
        }
        System.out.println();
    }

    //Selection
    private int cercarIndexNumMenor(int indexElegido, int[] array) {
        int index = indexElegido;
        int minNum = index;
        for (index = indexElegido; index < array.length; index++) {
            if (array[index] < array[minNum]) {
                minNum = index;
            }

        }
        return minNum;
    }

    public int[] ordenar() {
        int index = 0;
        int temp, indNumMenor;
        int[] arrayOrdenat = new int[numeros.length];
        //copiar array
        for (int ind = 0; ind < arrayOrdenat.length; ind++) {
            arrayOrdenat[ind] = numeros[ind];
        }

        for (index = 0; index < arrayOrdenat.length; index++) {
            indNumMenor = cercarIndexNumMenor(index, arrayOrdenat);
            temp = arrayOrdenat[index];
            arrayOrdenat[index] = arrayOrdenat[indNumMenor];
            arrayOrdenat[indNumMenor] = temp;

        }
        return arrayOrdenat;
    }

    //bubblesort
    public boolean comprobarArrayDesordenado(int[] array) {
        boolean isArrayDesordenado = false;
        for (int index = 0; index < numeros.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                isArrayDesordenado = true;
                break;
            }
        }
        return isArrayDesordenado;
    }

    public int[] ordenarBubbleSort() {
        int[] arrayOrdenat = new int[numeros.length];
        int temp;
        for (int index = 0; index < arrayOrdenat.length; index++) {
            arrayOrdenat[index] = numeros[index];
        }
        while (comprobarArrayDesordenado(arrayOrdenat)) {
            for (int index = 0; index < arrayOrdenat.length - 1; index++) {
                if (arrayOrdenat[index] > arrayOrdenat[index + 1]) {
                    temp = arrayOrdenat[index];
                    arrayOrdenat[index] = arrayOrdenat[index + 1];
                    arrayOrdenat[index + 1] = temp;
                }
            }
        }
        return arrayOrdenat;
    }
}
