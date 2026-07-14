package com.dio_me.heranca_polimorfismo.domain;

public non-sealed class USClock extends Clock{

    private String meridiamPeriod;

    public String getMeridiamPeriod() {
        return meridiamPeriod;
    }

    public void setMeridiamPeriod(String meridiamPeriod) {
        this.meridiamPeriod = meridiamPeriod;
    }

    @Override
    public Clock calculateTime(Clock clock) {
        this.second = clock.getSecond();
        this.minute = clock.getMinute();

        switch (clock) {
            case BRLClock brlClock -> formatHour(this.hour);

            case USClock usClock -> this.hour = clock.getHour();
        }

        return this;
    }

    private void formatHour(Integer hour){
        setMeridiamPeriod("AM");
        if(hour > 12){
            this.hour = hour - 12;
            setMeridiamPeriod("PM");
        }
    }

}
