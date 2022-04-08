package Lesson5;

import lombok.*;

import java.io.Serializable;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-03-23 14:07
 */
@EqualsAndHashCode
@Getter
@Setter
@ToString
@AllArgsConstructor
public class Person implements Serializable {

    private String name;
    private String surname;
    private int age;
}
