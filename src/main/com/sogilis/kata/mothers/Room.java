package com.sogilis.kata.mothers;


public class Room {
    private final int roomNumber;
    private final int capacityInPerson;
    private final int surface;
    private final int level;
    private final Type type;

    @java.beans.ConstructorProperties({"roomNumber", "capacityInPerson", "surface", "level", "type"})
    public Room(int roomNumber, int capacityInPerson, int surface, int level, Type type) {
        this.roomNumber = roomNumber;
        this.capacityInPerson = capacityInPerson;
        this.surface = surface;
        this.level = level;
        this.type = type;
    }

    public Room() {
        this.roomNumber = 0;
        this.capacityInPerson = 0;
        this.surface = 0;
        this.level = 0;
        this.type = null;
    }

    public static RoomBuilder builder() {
        return new RoomBuilder();
    }

    public int getRoomNumber() {
        return this.roomNumber;
    }

    public int getCapacityInPerson() {
        return this.capacityInPerson;
    }

    public int getSurface() {
        return this.surface;
    }

    public int getLevel() {
        return this.level;
    }

    public Type getType() {
        return this.type;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Room)) return false;
        final Room other = (Room) o;
        if (!other.canEqual((Object) this)) return false;
        if (this.getRoomNumber() != other.getRoomNumber()) return false;
        if (this.getCapacityInPerson() != other.getCapacityInPerson()) return false;
        if (this.getSurface() != other.getSurface()) return false;
        if (this.getLevel() != other.getLevel()) return false;
        final Object this$type = this.getType();
        final Object other$type = other.getType();
        if (this$type == null ? other$type != null : !this$type.equals(other$type)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = result * PRIME + this.getRoomNumber();
        result = result * PRIME + this.getCapacityInPerson();
        result = result * PRIME + this.getSurface();
        result = result * PRIME + this.getLevel();
        final Object $type = this.getType();
        result = result * PRIME + ($type == null ? 43 : $type.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Room;
    }

    public String toString() {
        return "Room(roomNumber=" + this.getRoomNumber() + ", capacityInPerson=" + this.getCapacityInPerson() + ", surface=" + this.getSurface() + ", level=" + this.getLevel() + ", type=" + this.getType() + ")";
    }

    public enum Type { PATIENT_ROOM, OR, OFFICE }

    public boolean isPatientRoom(){
        return Type.PATIENT_ROOM == type;
    }

    public static class RoomBuilder {
        private int roomNumber;
        private int capacityInPerson;
        private int surface;
        private int level;
        private Type type;

        RoomBuilder() {
        }

        public Room.RoomBuilder roomNumber(int roomNumber) {
            this.roomNumber = roomNumber;
            return this;
        }

        public Room.RoomBuilder capacityInPerson(int capacityInPerson) {
            this.capacityInPerson = capacityInPerson;
            return this;
        }

        public Room.RoomBuilder surface(int surface) {
            this.surface = surface;
            return this;
        }

        public Room.RoomBuilder level(int level) {
            this.level = level;
            return this;
        }

        public Room.RoomBuilder type(Type type) {
            this.type = type;
            return this;
        }

        public Room build() {
            return new Room(roomNumber, capacityInPerson, surface, level, type);
        }

        public String toString() {
            return "Room.RoomBuilder(roomNumber=" + this.roomNumber + ", capacityInPerson=" + this.capacityInPerson + ", surface=" + this.surface + ", level=" + this.level + ", type=" + this.type + ")";
        }
    }
}
