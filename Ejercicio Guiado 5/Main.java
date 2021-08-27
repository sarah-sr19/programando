import java.util.Arrays;
import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    String personas[] = {"personas"};
    String genero[] = {"masc", "fem"};
    int [] arrNew = {};
    Scanner s = new Scanner(System.in);
    System.out.println("Ingrese el numero de personas:");
    int length = s.nextInt();
    int [] myArray = new int[length];
    System.out.println("Ingrese 1 para masculino, ingrese 0 para femenino:");
     
    for(int i=0; i<length; i++ ) { 
      myArray[i] = s.nextInt();
    }

    for(int i=0; i<length; i++ ) {
      if(myArray[i]==1) {
        arrNew[i] = myArray[i];
        System.out.println("Hello world!");
        System.out.printf(" %d \n", myArray[i] * arrNew.length);
      }
    }
      System.out.println(Arrays.toString(myArray));
   }
}