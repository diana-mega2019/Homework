import java.io.Serializable;

public class SkiTimeResult implements Serializable {

    private byte minutes;
    private byte seconds;
    private byte skiTimeInSeconds;

    public SkiTimeResult(byte minutes, byte seconds) {
        this.minutes = minutes;
        this.seconds = seconds;
    }
    public SkiTimeResult() {

    }


    public byte getMinutes() {
        return minutes;
    }

    public byte getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return minutes + " : " + seconds;
    }
}
