
public class AverageCalculator{
    public static void main(String[] args){
        double sum = 0, average;
        double [] numarr = new double [args.length]; 
        System.out.print("The numbers are: ");
        for(int i = 0; i < args.length; i++){
            numarr[i] = Double.parseDouble(args[i]);
            sum += numarr[i];
            System.out.format("%.3f\t", numarr[i]);
        }
        average = sum / args.length;
        System.out.format("\nAnd their average is: %.3f", average);
    }
}