/*
Leer 10 números utilizando el ciclo FOR y determinar cuál de los números es el mayor y cual es el menor con arreglos.
*/

class Main {
  public static int mayornumero(int[] a, int total){
    int temp;
    for (int i = 0; i < total; i++) {
      for (int j = i + 1; j < total; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a[total-1];
  }

  public static int menornumero(int[] a, int total){
    int temp;
    for (int i = 0; i < total; i++) {
      for (int j = i + 1; j < total; j++) {
        if (a[i] > a[j]) {
          temp = a[i];
          a[i] = a[j];
          a[j] = temp;
        }
      }
    }
    return a[0];
  }

  public static void main(String args[]) {
    int a[]={1, 2, 124, 123, 513, 2, 21, 23, 21, 2};
    int b[]={44, 213, 213, 12, 636, 99, 77, 33, 22, 55};
    System.out.println("Mayor numero:"+mayornumero(a,10));
    System.out.println("Menor numero:"+menornumero(a,10));
    System.out.println("Mayor numero:"+mayornumero(b,10));
    System.out.println("Menor numero:"+menornumero(b,10));
  }
}