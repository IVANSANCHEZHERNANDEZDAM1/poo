public class pruebadominos {

  public static void main(String[] args) {
    int cuentaFichas = 0;
    FichaDominos[] fichas = new FichaDominos[8];

    fichas[0] = new FichaDominos();
    
    for (int i = 1; i < 8; i++) {
      FichaDominos aux;
      do {
        aux = new FichaDominos();
      } while (!fichas[i - 1].encajaEnFila(aux));
      fichas[i] = aux;
    }

    for (FichaDominos ficha : fichas) {
      System.out.print(ficha);
    }
  }

}
