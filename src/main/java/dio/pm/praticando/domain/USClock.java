package main.java.dio.pm.praticando.domain;

public non-sealed class USClock extends Clock{

    private String meridianPeriod;

    public USClock(Integer hour, Integer minute, Integer second) {
        super(hour, minute, second);
    }

    public String getMeridianPeriod() {
        return meridianPeriod;
    }

    public void setMeridianPeriod(String meridianPeriod) {
        this.meridianPeriod = meridianPeriod;
    }

    @Override
    public void calculateTime(Clock clock) {

        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock){
            case BRLClock brlClock -> this.hour = clock.getHour();
            case USClock usClock -> {
                    this.meridianPeriod = (this.hour > 12) ? "PM" : "AM";
                    this.hour = (this.hour > 12) ? this.hour - 12 : this.hour;
            }
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
        return hourString + ":" + minuteString + ":" + secondString + " " + this.meridianPeriod;
    }
}
