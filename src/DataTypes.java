public class DataTypes {
    public static void main(String[] args) {
        // cele mai folosite 5 tipuri de date

        // String = sir de caractere delimitate de "  "
        String marca = "Dacia";
        String model = "1310";

        System.out.println(marca);

        // integer = numar intreg, se noteaza int
        int an_fabricatie = 1987;

        // double = numar zecimal
        double pret = 2300.50;

        // boolean = adevarat sau fals
        boolean inmatriculata = false;

        // char = un singur caracter #, 2, $, b
        char nota = 'A' ;

        // aflam dimensiunea unui string
        System.out.println(marca.length());

        // scriem cu litere mari
        System.out.println(marca.toUpperCase());
    }
}
