package com.dio_me.heranca_polimorfismo.domain;

public abstract sealed class Clock permits BRLClock, USClock{

    protected Integer hour;

    protected Integer minute;

    protected Integer second;

    public Integer getHour() {
        return hour;
    }

    public void setHour(Integer hour) {
        if(hour > 23){
            this.hour = 0;
        }
        this.hour = hour;
    }

    public Integer getMinute() {
        return minute;
    }

    public void setMinute(Integer minute) {
        if(minute > 59){
            this.minute = 59;
        }
        this.minute = minute;
    }

    public Integer getSecond() {
        return second;
    }

    public void setSecond(Integer second) {
        if(second > 59){
            this.second = 59;
        }
        this.second = second;
    }

    public abstract Clock calculateTime(Clock clock);


}
