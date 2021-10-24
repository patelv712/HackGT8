package exportkit.xd;

public class HelperClass {
    public String getTimeString(int intTime) {
        int hours = intTime / 100;
        int minutes = intTime % 100;
        String time;
        if (hours <= 12) {
            if (hours == 0) {
                hours = 12;
            }
            time = String.valueOf(hours) + ":" + String.valueOf(minutes) + " AM";
        } else {
            hours = hours - 12;
            if (hours == 0) {
                hours = 12;
            }
            time = String.valueOf(hours) + ":" + String.valueOf(minutes) + " PM";
        }
        return time;
    }
}
