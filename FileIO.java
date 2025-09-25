import java.io.File;
import java.io.FileNotFoundException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {
    public static void main(String[] args){


        try {
            File myObj = new File("something.txt");

            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            }

            else {
                System.out.println("File already exists.");
            }
        }

        catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }


        File myObj = new File("arrivingAnimals.txt");

        try (Scanner myReader = new Scanner(myObj)) {
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }

        System.out.println("\n ");


        try (BufferedReader br = new BufferedReader(new FileReader("arrivingAnimals.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);

                String[]mySixParts = line.split(", ");
                System.out.println("mySixParts[0] is " + mySixParts[0]);
                System.out.println("mySixParts[1] is " + mySixParts[1]);
                System.out.println("mySixParts[2] is " + mySixParts[2]);
                System.out.println("mySixParts[3] is " + mySixParts[3]);
                System.out.println("mySixParts[4] is " + mySixParts[4]);
                System.out.println("mySixParts[5] is " + mySixParts[5]);
                System.out.println();

                String[] ageAndSexAndSpecies = mySixParts[0].split(", ");


                int numOfElements = ageAndSexAndSpecies.length;
                System.out.println("\nnumOfElements is " + numOfElements);

            }
        } catch (IOException e) {
            System.out.println("Error reading file.");
        }







    }
}