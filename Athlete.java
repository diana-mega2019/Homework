import java.io.Serializable;
import java.util.Objects;


public class Athlete  implements Serializable {
    private int athleteNumber;
    private String athleteName;
    private String countryCode;
    private SkiTimeResult skiTimeResult;
    private String firstShootingRange;
    private String secondShootingRange;
    private String thirdShootingRange;

    public Athlete(int athleteNumber,
                   String athleteName,
                   String countryCode,
                   SkiTimeResult skiTimeResult,
                   String firstShootingRange,
                   String secondShootingRange,
                   String thirdShootingRange) {
        this.athleteNumber = athleteNumber;
        this.athleteName = athleteName;
        this.countryCode = countryCode;
        this.skiTimeResult = skiTimeResult;
        this.firstShootingRange = firstShootingRange;
        this.secondShootingRange = secondShootingRange;
        this.thirdShootingRange = thirdShootingRange;
    }

    public Athlete(int athleteNumber, String token, String token1, String token2, String token3, String token4, String token5) {
    }

    public Athlete() {

    }

    @Override
    public String toString() {
        return "Athlete{" +
                "athleteNumber=" + athleteNumber +
                ", athleteName='" + athleteName + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", skiTimeResult=" + skiTimeResult +
                ", firstShootingRange=" + firstShootingRange +
                ", secondShootingRange=" + secondShootingRange +
                ", thirdShootingRange=" + thirdShootingRange +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Athlete athlete = (Athlete) o;
        return athleteNumber == athlete.athleteNumber &&
                athleteName.equals(athlete.athleteName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(athleteNumber, athleteName);
    }
}
