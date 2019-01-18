import java.util.Scanner;

public class Sentences{

    public String sentenceOne(String first){
        return null;
    }

    public String sentenceTwo(String second){
        return null;   
    }

    public String sentenceThree(String third){
        return null;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] sentenceInput = new String[3];
        char[][] sentenceArray = new char[3][60];

        for(int i = 0; i < 3; i++){
            System.out.println("Please enter a sentence that does not exceed 60 characters.");
            sentenceInput[i] = scan.nextLine();
        }
    } 
}