package practica_gitygithub_eclipse;

public class Array_Aleatorio {

  public static void main(String[] args) {
    final int NUMEROMAXIMO = 10;
    final int CANTIDADNUMEROS = 20;
    int[] numerosAleatorios = new int[CANTIDADNUMEROS];
    
    for (int i = 0; i < CANTIDADNUMEROS; i++) {
      numerosAleatorios[i] = (int) (Math.random()*(NUMEROMAXIMO + 1));
      int repetidos [] = new int [CANTIDADNUMEROS];
      for (int j = 0; j < CANTIDADNUMEROS; j++) {
        if (numerosAleatorios [i] == i) {
          repetidos[j]++;
        }
        System.out.println(repetidos[j]);
      }
    }

  }

}
