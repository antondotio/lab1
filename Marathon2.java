import java.util.Scanner;
import java.util.*;

public class Marathon2{

    public static int findFastestRunner(ArrayList<Double> times){
        int index = 0;
        double shortest = times.get(0);
        for(int i = 1; i < times.size(); i++){
            if(times.get(i) <= times.get(i-1) && times.get(i) <= shortest){
                shortest = times.get(i);
                index = i;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<String>();
        ArrayList<Double> times = new ArrayList<Double>();
        String sin;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the name of the participant");
            sin = scan.nextLine();
            if (sin.toUpperCase().equals("QUIT"))
                break;
            names.add(sin);
            System.out.println("Please enter the running time of the participant");
            sin = scan.nextLine();
            Double time = Double.parseDouble(sin);
            times.add(time);
        }
       
        int index = findFastestRunner(times);
        System.out.println("The fastest runner was " + names.get(index) + " and their time was " + times.get(index) + " minutes.");

        scan.close();
    }
}