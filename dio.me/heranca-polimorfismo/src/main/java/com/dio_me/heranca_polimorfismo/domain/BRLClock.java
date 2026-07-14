package com.dio_me.heranca_polimorfismo.domain;

public non-sealed class BRLClock extends Clock{

    @Override
    public Clock calculateTime(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case USClock usClock -> this.hour = usClock.getMeridiamPeriod().equals("PM") ? formatHour(this.hour) : usClock.getHour();
            
            case BRLClock brlClock -> this.hour = brlClock.getHour();
        }

        return this;
    }

    @Override
    public void formatHour(Clock clock) {

        this.hour = hour - 12;

    }
    
    

}
