import java.util.Locale;

public class DataTypes {
    public static <string> void main(String[] args) {
        // cele mai folosite 5 tipuri de date sunt:
        // String=sir de caractere delimitate de ghilimele duble ""
        String marca= "Dacia";
        String model= "1310";
        System.out.println(marca+ " " +model);
        String a= "3!"; // si cifrele puse in ghilimele duble se considera string si nu sunt de tipul int
        String b= "4@";
        System.out.println(a+b);

        // modificam caracterele unui string
        System.out.println(marca.toUpperCase());

        // aflam dimensiunea unui string
        System.out.println(marca.length());

        // data facem de ex:
        int c = 3; // in acest caz 3 si 4 se comporta ca int (cifre)
        int d = 4;
        System.out.println(c+d); // 3+4=7 se proceseaza matematic

        // Integer= numar intreg (Int)
        Integer an_fabricatie = 1987;
        System.out.println(marca +" "+ model + " " + "fabricata in anul "+ an_fabricatie);

        // double= numere zecimale
        double pret = 23000.50;

        // Boolean= adevarat sau fals(0=false, 1= true ) (bool)
        boolean inmatriculata = true; // se scrie cu lit mica

        // Char = un singur caracter (#, $, 2, D)- caracterul se pune intre ghilimele simple
        char nota = 'A';


    }
}
