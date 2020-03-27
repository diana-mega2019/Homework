import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString

public class Car {
    private String brand;
    private String model;
    private int battery;
    private boolean autoPilot;
    private long price;

}
