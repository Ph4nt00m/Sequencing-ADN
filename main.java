import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        // exercice niveau 3
        // compteur de personne du genre feminin
        int compteur = 0;

        // parcourir le fichier et lire chaque sequence d'ADN
        File monfichier = new File("src/adn.txt");

        // verifier si le fichier existe
        if(monfichier.exists()) {
            System.out.println("Fichier existant");

            // lire le fichier
            try{
                BufferedReader lecture = new BufferedReader(new FileReader(monfichier));
                String ligne = lecture.readLine();

                // boucler sur chaque ligne
                // tant qu'il y en a encore
                while (ligne != null) {

                    // analyser l'age de chaque personne
                    int nombreCaracteres = ligne.length();
                    String trancheAge = nombreCaracteres <= 6 ? "+65 ans" : nombreCaracteres < 18 ? "-21 ans" : "+ de 21 ans";
                    System.out.println(trancheAge);
                    ligne = lecture.readLine();
                }


            } catch(IOException e) {
                e.printStackTrace();
            }


        }
        else{
            System.out.println("Fichier non existant");
        }

        System.out.println("Le nombre de femmes dans notre base d'ADN etant de " + compteur);

    } // fin de la fonction main

}