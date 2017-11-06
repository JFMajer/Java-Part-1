
public class Clock {

    private BoundedCounter hours;
    private BoundedCounter minutes;
    private BoundedCounter seconds;

    public Clock(int hoursAtBeginning, int minutesAtBeginning, int secondsAtBeginning) {
      // the counters that represent hours, minutes and seconds are created and
        // set to have the correct initial values
        this.hours = new BoundedCounter(23);
        this.hours.setValue(hoursAtBeginning);
        this.minutes = new BoundedCounter(59);
        this.minutes.setValue(minutesAtBeginning);
        this.seconds = new BoundedCounter(60);
        this.seconds.setValue(secondsAtBeginning);
    }

    public void tick() {
        if (this.seconds.getValue() == 59) {
            this.seconds.next();
            if (this.minutes.getValue() == 59) {
                this.hours.next();
                this.minutes.next();
            } else {
                this.minutes.next();
            }
        }
        this.seconds.next();
    }

    public String toString() {
        return this.hours + ":" + this.minutes + ":" + this.seconds;
    }
}
