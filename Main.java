import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
  while(true){
    System.out.println("Podaj slowo:");
   Scanner scan = new Scanner(System.in);
     String a = scan.next();
    System.out.println("Wybierz co chcesz zrobic:");
    System.out.println("1. Male litery na duze:");
    System.out.println("2. Duze litery na male:");
    System.out.println("3. Odwrocona kolejnosc:");
      System.out.println("4. Koniec programu");
    int stan = scan.nextInt();
    
     StringBuilder builder = new StringBuilder(a);
     builder.reverse();
    String odwroconyTekst = builder.toString();
   
    switch (stan){
      case 1:
  System.out.println("Twoje slowo: "+ a);
  System.out.println("Twoje slowo po modyfikacji: "+ a.toUpperCase());
      break;

      case 2:
  System.out.println("Twoje slowo: "+ a);
  System.out.println("Twoje slowo po modyfikacji: "+ a.toLowerCase());
      break;

     case 3:  
    System.out.println("Twoje slowo: "+ a);
    System.out.println("Twoje slowo po modyfikacji: " + odwroconyTekst);
      break;

      case 4:
      return;
     

     }
    }
  }
}