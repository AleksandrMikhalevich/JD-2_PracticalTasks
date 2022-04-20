package lesson_12.perSubclass.entity;

import lombok.*;
import lombok.experimental.SuperBuilder;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Alex Mikhalevich
 * @version 1.0
 * @create 2022-04-17 16:15
 */
@SuperBuilder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table
@PrimaryKeyJoinColumn(name = "TASK_ID")
public class HomeTask extends Task {

    @Column
    private String startDate;

    @Column
    private String endDate;

    @Embedded
    private Person performer;

    @AttributeOverrides({
            @AttributeOverride(name = "name", column = @Column(name = "curators_name")),
            @AttributeOverride(name = "surname", column = @Column(name = "curators_surname"))
    })
    @Embedded
    private Person curator;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        HomeTask homeTask = (HomeTask) o;
        return getId() != null && Objects.equals(getId(), homeTask.getId());
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
