package lab.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.List;

@Accessors(chain=true)
@Data
@AllArgsConstructor
public class UsualPerson implements Person {
    private int id;

    private int age;

    private float height;

    private boolean isProgrammer;

    private String name;

    private Country country;

    private List<String> contacts;

    public UsualPerson() {
    }

}
