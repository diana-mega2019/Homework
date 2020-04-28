package homeworkjdbc;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class Accommodation {
    int id;
    String type;
    String bedType;
    int maxGuests;
    String description;
}