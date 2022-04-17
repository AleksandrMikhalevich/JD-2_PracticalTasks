package lesson_12.perClassHierarchy.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-17 14:28
 */
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@DiscriminatorValue("W")
public class WorkTask extends Task {

    @Column
    private String cost;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        WorkTask workTask = (WorkTask) o;
        return getId() != null && Objects.equals(getId(), workTask.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }
}
