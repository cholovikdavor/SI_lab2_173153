import java.util.ArrayList;
import java.util.List;

class Time {
    int hours;
    int minutes;
    int seconds;

    public Time(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
};

public class SILab2 {

    public List<Integer> function(List<Time> timesList) {
        List<Integer> result = new ArrayList<>();

        for (int i = 0; i < timesList.size(); i++) {
            int hr = timesList.get(i).getHours();  //A
            int min = timesList.get(i).getMinutes(); //A
            int sec = timesList.get(i).getSeconds(); //A
            if (hr < 0 || hr > 24){ //C
                if (hr < 0){  //D
                    throw new RuntimeException("The hours are smaller than the minimum");//E
                }
                else { //F
                    throw new RuntimeException("The hours are grater than the maximum");//g
                }
            }
            else if (hr < 24) { //h
                if (min < 0 || min > 59) //i
                    throw new RuntimeException("The minutes are not valid!"); //j
                else { //k
                    if (sec >= 0 && sec <= 59) //l
                        result.add(hr * 3600 + min * 60 + sec); //m
                    else //n
                        throw new RuntimeException("The seconds are not valid"); //O
                }
            }
            else if (hr == 24 && min == 0 && sec == 0) { //P
                result.add(hr * 3600 + min * 60 + sec);//Q
            }
            else { //r
                throw new RuntimeException("The time is greater than the maximum"); //s
            }
        }
        return result; //B
    }
}