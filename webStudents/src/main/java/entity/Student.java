package entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * @author Alex Mikhalevich
 * @created 2022-05-07 19:48
 */
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Integer id;

    @Column(name = "first_name")
    private String firstName;

    @Column (name = "second_name")
    private String secondName;

    @Column(name = "surname")
    private String surname;

    @Column(name = "faculty")
    private String faculty;

    @Column(name = "year_of_study")
    private String yearOfStudy;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student student)) return false;
        return Objects.equals(getId(), student.getId());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }
}
