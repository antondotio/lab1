import java.util.Scanner;

public class Marathon2{

    public static int findFastestRunner(double [] time){
        int index = 0;
        double shortest = time[0];
        for(int i = 1; i < time.length; i++){
            if(time[i] <= time[i-1] && time[i] <= shortest){
                shortest = time[i];
                index = i;
            }
        }
        return index;
    }
    
    public static void main(String[] args) {
        // Define two array lists here to store the names and the running times
        // Read user input
        String[] name;
        double[] time;
        int i = 0;
        String sin;
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Please enter the name of the participant");
            sin = scan.nextLine();
            if (sin.toUpperCase().equals("QUIT"))
                break;
            // Add the name to your ArrayList
            name[i] = sin;
            System.out.println("Please enter the running time of the participant");
            sin = scan.nextLine();
            // Add the running time to your array list
            time[i] = Double.parseDouble(sin);
            i++;
        }
        // Call the function findFastestRunner and pass the running times array list to
        // it
        int index = findFastestRunner(time);
        // Print the name of the fastestrunner to the console
        System.out.println("The fastest runner was " + name[index] + " and their time was " + time[index] + " minutes.");
    }
}