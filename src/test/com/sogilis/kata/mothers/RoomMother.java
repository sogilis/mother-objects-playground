package com.sogilis.kata.mothers;

/**
 * Mother objects that generates rooms, for test purpose
 */
public class RoomMother {

    private static final int DEFAULT_CAPACITY = 2;
    private static final int DEFAULT_LEVEL = 1;
    private static final int DEFAULT_SURFACE = 50;
    private static final Room.Type DEFAULT_TYPE = Room.Type.PATIENT_ROOM;

    private static Room defaultRoomWithType(Room.Type type){
        return Room.builder()
                .capacityInPerson(DEFAULT_CAPACITY)
                .level(DEFAULT_LEVEL)
                .surface(DEFAULT_SURFACE)
                .type(type)
                .build();
    }

    public static Room defaultRoom(){
        return defaultRoomWithType(DEFAULT_TYPE);
    }
}
