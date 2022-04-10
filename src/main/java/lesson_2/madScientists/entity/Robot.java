package lesson_2.madScientists.entity;

import lesson_2.madScientists.entity.part.*;
import lesson_2.madScientists.entity.part.abstraction.Part;

import java.util.List;

public class Robot {
    private final List<Part> parts = List.of(new Head(),
            new Body(),
            new RightHand(),
            new LeftHand(),
            new RightLeg(),
            new LeftLeg(),
            new CPU(),
            new RAM(),
            new HDD());

    public List<Part> getParts() {
        return parts;
    }
}
