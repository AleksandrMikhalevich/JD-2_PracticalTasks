package lesson_2.madScientists.utility;

import lesson_2.madScientists.entity.part.*;
import lesson_2.madScientists.entity.part.abstraction.Part;
import lesson_2.madScientists.entity.part.enums.PartTypes;

public class PartCreator {

    public static Part create(PartTypes type) {
        return switch (type) {
            case BODY -> new Body();
            case CPU -> new CPU();
            case HDD -> new HDD();
            case HEAD -> new Head();
            case LEFT_HAND -> new LeftHand();
            case LEFT_LEG -> new LeftLeg();
            case RAM -> new RAM();
            case RIGHT_HAND -> new RightHand();
            case RIGHT_LEG -> new RightLeg();
        };
    }
}
