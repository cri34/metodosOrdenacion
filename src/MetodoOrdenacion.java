public class MetodoOrdenacion {
    int [] numeros ;
    public MetodoOrdenacion(int [] numeros){
      this.numeros = numeros;
    }


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
    public boolean isArrayOrdenado(int[] array) {
        boolean isArrayOrdenado =true;
        for (int index = 0; index < numeros.length - 1; index++) {
            if (array[index] > array[index + 1]) {
                isArrayOrdenado = false;
                break;
            }
        }
        return isArrayOrdenado;
    }

    public int[] ordenarBubbleSort() {
        int[] arrayOrdenat = new int[numeros.length];
        int temp;
        for (int index = 0; index < arrayOrdenat.length; index++) {
            arrayOrdenat[index] = numeros[index];
        }
        while (!isArrayOrdenado(arrayOrdenat)) {
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

    //insertion

    public int [] rotarPosFinsIndMarcat(int [] numeros, int indNum){
        int temp;
        for (int i = 0; i <= indNum; i++){
            if (numeros[indNum] < numeros[i]){
                temp = numeros[i];
                numeros[i] = numeros[indNum];
                numeros[indNum] = temp;
            }
        }
        return  numeros;
    }
public int [] ordenarInsertion(){
    int[] arrayOrdenat = new int[numeros.length];
    int temp;
    //copi array
    for (int index = 0; index < arrayOrdenat.length; index++) {
        arrayOrdenat[index] = numeros[index];
    }
    for (int i = 0 ; i < arrayOrdenat.length;i++){
       arrayOrdenat = rotarPosFinsIndMarcat(arrayOrdenat,i);
    }
    return arrayOrdenat;
}

}
