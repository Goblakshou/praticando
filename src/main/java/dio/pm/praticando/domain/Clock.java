package main.java.dio.pm.praticando.domain;

public abstract sealed class Clock permits USClock, BRLClock{

    protected Integer hour;

    protected Integer minute;

    protected Integer second;

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        if(hour >= 24){
            this.hour = 24;
        }
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        if(minute >= 60){
            this.minute = 60;
        }
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        if(second >= 60){
            this.second = 60;
        }
        this.second = second;
    }

    public abstract void calculateTime(Clock clock);

    public abstract String printClock();

    public Clock(Integer hour, Integer minute, Integer second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

}
