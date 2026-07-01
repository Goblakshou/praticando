package main.java.dio.pm.praticando.domain;

public non-sealed class BRLClock extends Clock{
    public BRLClock(Integer hour, Integer minute, Integer second) {
        super(hour, minute, second);
    }

    @Override
    public void calculateTime(Clock clock) {

        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case USClock usClock -> this.hour = usClock.getMeridianPeriod().equals("PM") ? this.hour + 12 : this.hour;
            case BRLClock brlClock -> this.hour = clock.getHour();

        }
    }

    @Override
    public String printClock() {
        String secondString = this.second.toString();
        String minuteString = this.minute.toString();
        String hourString = this.hour.toString();

        if(second < 9){
            secondString = "0" + this.second;
        }
        if(minute < 9){
            minuteString = "0" + this.minute;
        }
        if(hour < 9){
            hourString = "0" + this.hour;
        }
        return hourString + ":" + minuteString + ":" + secondString;
    }

}
