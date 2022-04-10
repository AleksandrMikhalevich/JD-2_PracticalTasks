package lesson_2.madScientists.entity.part;

import lesson_2.madScientists.entity.part.abstraction.Part;

import java.util.Objects;

public class Head extends Part {
    private final String name = "Head";

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        return o != null && getClass() == o.getClass();
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return name;
    }
}