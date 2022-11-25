import java.util.Random;
import java.util.ArrayList;

public class PuzzleJava {
    Random randMachine = new Random(10);
    // ** TASK ONE **
    // To use methods from the Random library you will need to create an instance of Random
    
    public ArrayList<Integer> getTenRolls(){
        ArrayList<Integer> randomInt = new ArrayList<Integer>();
        Random rand = new Random();

        for (int i = 1; i <=10; i++){
            randomInt.add(rand.nextInt(20) + 1);
        }
        return randomInt;
    }

    // ** TASK TWO **
    // Create an array within the method that contains all 26 letters of the alphabet (this array must have 26 values). 
    // Generate a random index between 0-25, and use it to pull a random letter out of the array.
    // Return the random letter.
    public String getRandomLetter(){
        Random rand = new Random();
        String alphabeString = "abcdefghijklmnopqrstuvwxyz";
        String[] alphabet = new String[26];
        for (int i = 0; i < 26; i++){
            alphabet[i] = String.valueOf(alphabeString.charAt(i));
        }
        return alphabet[rand.nextInt(26)];
    }

    // ** TASK THREE **
    // Write a method that uses the previous method to create 
    // a random string of eight characters, and return that string.

    public String generatePassword(){
        String password = "";
        for (int i = 0; i < 8; i++){
            password = password + getRandomLetter();
        }
        return password;
    }

    // ** TASK FOUR **
    // Write a method that takes an int length as an argument and creates an array of random eight character words. 
    // The array should be the length passed in as an int.

    public ArrayList<String> getNewPasswordSet(int length){
        ArrayList<String> passwordSet = new ArrayList<String>();
        for (int i = 0; i < length; i++){
            passwordSet.add(generatePassword());
        }
        return passwordSet;
    }

}
