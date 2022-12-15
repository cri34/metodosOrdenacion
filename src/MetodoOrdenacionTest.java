public class MetodoOrdenacionTest {
    public static void main(String[] args) {
        int[] numeros = {2, 34, 0, 0, 53, 3, 9, 90, 78, 90, 9};
        MetodoOrdenacion s=new MetodoOrdenacion(numeros);
        //selection
        s.mostrarArray(s.ordenar());
        s.mostrarArray(s.ordenarBubbleSort());
        s.mostrarArray(s.ordenarInsertion());
    }
}
