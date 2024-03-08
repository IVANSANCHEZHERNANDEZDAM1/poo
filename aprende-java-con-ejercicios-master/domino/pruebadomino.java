public class pruebadomino {

  public static void main(String[] args) {
    FichaDominos f1 = new FichaDominos(6, 1);
    FichaDominos f2 = new FichaDominos(0, 4);
    FichaDominos f3 = new FichaDominos(3, 3);
    FichaDominos f4 = new FichaDominos(0, 1);
    System.out.println(f1);
    System.out.println(f2);
    System.out.println(f3);
    System.out.println(f4);

    System.out.println(f2.voltea());
    System.out.println(f2.encaja(f4));
    System.out.println(f1.encaja(f4));
    System.out.println(f1.encaja(f3));
    System.out.println(f1.encaja(f2));
  }

}
