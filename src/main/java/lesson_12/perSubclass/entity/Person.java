package lesson_12.perSubclass.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-17 16:19
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Person {

    private String name;

    private String surname;
}
