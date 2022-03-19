package Lesson2.madScientists.entity.part;

import Lesson2.madScientists.entity.part.abstraction.Part;

import java.util.Objects;

public class CPU extends Part {
    private final String name = "CPU";

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