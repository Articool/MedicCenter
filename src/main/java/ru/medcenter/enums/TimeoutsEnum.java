package ru.medcenter.enums;

import java.time.Duration;

public enum TimeoutsEnum {

    MICRO(1),
    TINY(2),
    MINI(3),
    MINOR(5),
    MIDDLE(7),
    MAJOR(10),
    SUPER_BIG(15),
    ULTRA_BIG(20);

    long value;

    TimeoutsEnum(long value) {
        this.value = value;
    }

    private long getValue(){return value;}

    public Duration get(){
        return Duration.ofSeconds(getValue());
    }
}
