package lesson_12.perClassHierarchy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Embeddable;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-17 14:20
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@Embeddable
public class Person {

    private String name;

    private String surname;

}
