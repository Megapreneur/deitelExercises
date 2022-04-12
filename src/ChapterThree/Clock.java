package ChapterThree;

public class Clock {
    public int second;
    public int minute;
    public int hour;
    public Clock(int hour, int minute, int second) {
        this.second = second;
        this.minute = minute;
        this.hour = hour;
    }
    public void setSeconds(int seconds) {
        if(seconds <= 59)this.second = seconds;
        else{second = 0;}
    }
    public int getSeconds() {return second;
    }
    public void setMinutes(int minutes) {
        if(minutes <= 59)this.minute = minutes;
        else {minute = 0;}
    }
    public int getMinutes() {return minute;
    }
    public void setHours(int hours) {
        if(hours <= 23)this.hour = hours;
        else{hour = 0;}
    }
    public int getHours() {
        return hour;
    }

    public String getDisplayTime() {
        return getHours()+":"+getMinutes()+":"+ getSeconds();
    }
}

