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
        int iloscZmian = 0;
  System.out.println("Twoje slowo: "+ a);
      for (int i = 0; i < a.length(); i++) {
      char aktualnyZnak = a.charAt(i);
            
            if (Character.isLowerCase(aktualnyZnak)) {
                char nowyZnak = Character.toUpperCase(aktualnyZnak);
                a = a.substring(0, i) + nowyZnak + a.substring(i + 1);
                iloscZmian++;
            }
  }
         System.out.println("Tekst po zamianie: " + a);
        System.out.println("Ilość zmienionych liter: " + iloscZmian);
      break;

      case 2:
  int iloscZmian2 = 0;
  System.out.println("Twoje slowo: "+ a);
      for (int i = 0; i < a.length(); i++) {
      char aktualnyZnak = a.charAt(i);
            
            if (Character.isUpperCase(aktualnyZnak)) {
                char nowyZnak = Character.toLowerCase(aktualnyZnak);
                a = a.substring(0, i) + nowyZnak + a.substring(i + 1);
                iloscZmian2++;
            }
  }
         System.out.println("Tekst po zamianie: " + a);
        System.out.println("Ilość zmienionych liter: " + iloscZmian2);
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