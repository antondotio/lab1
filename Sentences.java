import java.util.Scanner;

public class Sentences{

    public static char[] sentenceOne(String first){
        char[] sOne = first.toCharArray();
        char[] firstSentence = new char[first.length()];
        int j = 0;
        for(int i = first.length() - 1; i >= 0; i--){
            firstSentence[j] = sOne[i];
            j++;
        }
        return firstSentence;
    }

    public static char[] sentenceTwo(String second){
        String[] splitString = second.split(" ");
        String rearranged = "";

        for(int i = splitString.length - 1; i >= 0; i--){
            if(i == 0){
                rearranged = rearranged + splitString[i];
            }else{
                rearranged = rearranged + splitString[i] + " ";
            }
        }
        char[] secondSentence = rearranged.toCharArray();
        return secondSentence;   
    }

    public static char[] sentenceThree(String third){
        char[] thirdSentence = third.toCharArray();
        for(int i = 0; i < thirdSentence.length; i++){
            if(i % 5 == 0){
                thirdSentence[i] = Character.toUpperCase(thirdSentence[i]);
            }
        }
        return thirdSentence;
    }

    public static boolean validSentence(String sentence){
        if(sentence.length() + 1 > 60)
            return false;
        else
            return true;
    }


    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String[] sentenceInput = new String[3];
        char[][] sentenceArray = new char[3][60];
        boolean accept = true;

        for(int i = 0; i < 3; i++){
            System.out.println("Please enter a sentence that does not exceed 60 characters.");
            sentenceInput[i] = scan.nextLine();
            accept = validSentence(sentenceInput[i]);
            if(!accept){
                System.out.println("Invalid Input");
                System.exit(1);
            }
        }

        sentenceArray[0] = sentenceOne(sentenceInput[0]);
        sentenceArray[1] = sentenceTwo(sentenceInput[1]);
        sentenceArray[2] = sentenceThree(sentenceInput[2]);
        
        for(int i = 0; i < sentenceArray.length; i++){
            for(int j = 0; j < sentenceArray[i].length; j++){
                System.out.print(sentenceArray[i][j]); 
            }
            System.out.println("\n"); 
        }
        
        scan.close();
    } 
}