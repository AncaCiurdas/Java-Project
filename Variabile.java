public class Variabile {
    public static void main(String[] args) {

        // declarare si initializare

        String marcaMasina ="Volvo";
        String modelMasina ="XC60";

        // strongly typed- trebuie sa specificam tipul de date al variabilei cu care lucram

        System.out.println("Am cumparat o masina marca:"+ marcaMasina);
        System.out.println("Este modelul:"+ modelMasina);
        System. out.println("Cea mai frumoasa masina:" + marcaMasina);

        // suprascrierea

        modelMasina = "XC60 facelift";
        System.out.println("Am cumparat o masina marca:"+ marcaMasina);
        System.out.println("Este modelul:"+ modelMasina);

        //declarare
        String nume;
        String prenume;


        //initializare
        nume = "Andy";
        prenume = "Pop";
        int varsta = 35;

        //concatenare de stringuri (adunare de doua stringuri)
        System.out.println(prenume+" " + nume+ " si am varsta de" +"  "+ varsta);
    }
}