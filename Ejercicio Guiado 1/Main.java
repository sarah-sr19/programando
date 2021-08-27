/*
 Mostrar la tabla de multiplicar de cualquier Numero ingresado por el usuario usando arreglos
*/
class Main {
    public static void main(String[] args) {

        int[] minumero = {5};
        int[] digitos = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        for(int i = 0; i < digitos.length; ++i)
        {
            System.out.printf("%d * %d = %d \n", minumero[0], digitos[i], minumero[0] * digitos[i]);
        }
    }
}