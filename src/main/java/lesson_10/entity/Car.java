package lesson_10.entity;

import lombok.*;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-09 13:09
 */
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
@MyTable(name = "car")
public class Car {

    @MyColumn(name = "id")
    private int id;

    @MyColumn(name = "name")
    private String name;

    @MyColumn(name = "color")
    private String color;

    @MyColumn(name = "price")
    private int price;

}
