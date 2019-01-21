
public class Clock{

    private static int day, hour, minute, second;

    public int getDay(){ return day; }
    public int getHour() { return hour; }
    public int getMinute() { return minute; }
    public int getSecond() { return second; }

    public void setDay(int d){
        if(d < 0){
            return;
        }else{
            day = d; 
        }
    }
    public void setHour(int h){
        if(h < 0 || h > 23){
            return;
        }else{
             hour = h; 
        }
    }
    public void setMinute(int m){ 
        if(m < 0 || m > 59){
            return;
        }else{
             minute = m; 
        }
    }
    public void setSecond(int s){
        if(s < 0 || s > 59){
            return;
        }else{
            second = s;
        }
    }

    public Clock(){
        this(0, 0, 0, 0);
    }

    public Clock(int day, int hour, int minute, int second){
        setDay(day);
        setHour(hour);
        setMinute(minute);
        setSecond(second);
    }

    public void increment(int sec){
        for(int i = 0; i < sec; i++){
            second++;
            if(second > 59){
                second = 0;
                minute++;
            }
            if(minute > 59){
                minute = 0;
                hour++;
            }
            if(hour > 23){
                hour = 0;
                day++;
            }
        }
    }
    
    public int calculateTotalSeconds(){
        int totalSec = day * 86400 + hour * 3600 + minute * 60 + second;
        return totalSec;
    }

    public static void main(String[] args) {
        Clock t1 = new Clock();

        t1.setHour(23);
        t1.setDay(1);
        t1.setMinute(59);
        t1.setSecond(16);

        System.out.println(t1.getDay() + ":" + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        t1.increment(44);
        System.out.println(t1.getDay() + ":" + t1.getHour() + ":" + t1.getMinute() + ":" + t1.getSecond());
        System.out.printf("The elapsed time in seconds is: %d", t1.calculateTotalSeconds());

        Clock t2 = new Clock(3, 1, 4, 5);
        System.out.println();
        System.out.println(t2.getDay() + ":" + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        t2.increment(55);
        System.out.println(t2.getDay() + ":" + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        System.out.printf("The elapsed time in seconds is: %d", t2.calculateTotalSeconds());

        t2.setDay(9);
        t2.setHour(25);
        t2.setMinute(-7);
        t2.setSecond(59);
        System.out.println();
        System.out.println(t2.getDay() + ":" + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        t2.increment(1);
        System.out.println(t2.getDay() + ":" + t2.getHour() + ":" + t2.getMinute() + ":" + t2.getSecond());
        System.out.printf("The elapsed time in seconds is: %d", t2.calculateTotalSeconds());
    }
}