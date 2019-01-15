public class Marathon{

    public static int shortestTime(int [] time){
        int index = 0;
        int shortest = time[0];
        for(int i = 1; i < time.length; i++){
            if(time[i] <= time[i-1] && time[i] <= shortest){
                shortest = time[i];
                index = i;
            }
        }
        return index;
    }
    public static void main(String [] args){

        String[] names = {  "Elena", "Thomas", "Hamilton", "Suzie",
                            "Phil", "Matt", "Alex", "Emma", "John",
                            "James", "Jane", "Emily", "Daniel",
                            "Neda", "Aaron", "Kate" };

        int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243,
                        334, 412, 393, 299, 343, 317, 265 }; 
        
        int index = shortestTime(times);

        System.out.println("The fastest runner was " + names[index] + " and their time was " + times[index]);

    }
}