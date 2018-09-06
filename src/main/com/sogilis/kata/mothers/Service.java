package com.sogilis.kata.mothers;

import com.sogilis.kata.mothers.exceptions.InvalidServiceException;
import com.sogilis.kata.mothers.people.Doctor;
import com.sogilis.kata.mothers.people.Medic;
import com.sogilis.kata.mothers.people.Nurse;
import com.sogilis.kata.mothers.people.Patient;
import lombok.NonNull;

import java.util.List;
import java.util.Optional;

public class Service {
    private final Speciality speciality;

    private Doctor director;

    private Nurse manager;

    private final List<Medic> currentWorkers;

    private final List<Patient> currentPatients;

    private final List<Room> rooms;

    @java.beans.ConstructorProperties({"speciality", "director", "manager", "currentWorkers", "currentPatients", "rooms"})
    public Service(Speciality speciality, Doctor director, Nurse manager, List<Medic> currentWorkers, List<Patient> currentPatients, List<Room> rooms) {
        this.speciality = speciality;
        this.director = director;
        this.manager = manager;
        this.currentWorkers = currentWorkers;
        this.currentPatients = currentPatients;
        this.rooms = rooms;
    }

    public Service() {
        this.speciality = null;
        this.currentWorkers = null;
        this.currentPatients = null;
        this.rooms = null;
    }

    public static ServiceBuilder builder() {
        return new ServiceBuilder();
    }

    public void validate() throws InvalidServiceException {
        directorMatchesSpecialty();
        noRoomOverloading();
    }

    /**
     * Checks that the director's specialty matches the service specialty
     * @throws InvalidServiceException
     */
    private void directorMatchesSpecialty() throws InvalidServiceException {
        Optional.ofNullable(director)
                .map(dr -> dr.getSpecialties())
                .filter(specialities -> specialities.contains(speciality))
                .orElseThrow(() -> new InvalidServiceException("specialty of director does not match service's one"));
    }

    /**
     * Checks that the service has enough room capacity in total to
     * host all current patients.
     * @throws InvalidServiceException
     */
    private void noRoomOverloading() throws InvalidServiceException {
        final int totalCapacity = rooms.stream()
                .filter(Room::isPatientRoom)
                .mapToInt(r -> r.getCapacityInPerson())
                .sum();

        if(totalCapacity < currentPatients.size()) {
            throw new InvalidServiceException("Overloaded service ! more patient than total room capacity");
        }
    }

    @NonNull
    public Speciality getSpeciality() {
        return this.speciality;
    }

    public Doctor getDirector() {
        return this.director;
    }

    public Nurse getManager() {
        return this.manager;
    }

    @NonNull
    public List<Medic> getCurrentWorkers() {
        return this.currentWorkers;
    }

    @NonNull
    public List<Patient> getCurrentPatients() {
        return this.currentPatients;
    }

    @NonNull
    public List<Room> getRooms() {
        return this.rooms;
    }

    public void setDirector(Doctor director) {
        this.director = director;
    }

    public void setManager(Nurse manager) {
        this.manager = manager;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Service)) return false;
        final Service other = (Service) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$speciality = this.getSpeciality();
        final Object other$speciality = other.getSpeciality();
        if (this$speciality == null ? other$speciality != null : !this$speciality.equals(other$speciality))
            return false;
        final Object this$director = this.getDirector();
        final Object other$director = other.getDirector();
        if (this$director == null ? other$director != null : !this$director.equals(other$director)) return false;
        final Object this$manager = this.getManager();
        final Object other$manager = other.getManager();
        if (this$manager == null ? other$manager != null : !this$manager.equals(other$manager)) return false;
        final Object this$currentWorkers = this.getCurrentWorkers();
        final Object other$currentWorkers = other.getCurrentWorkers();
        if (this$currentWorkers == null ? other$currentWorkers != null : !this$currentWorkers.equals(other$currentWorkers))
            return false;
        final Object this$currentPatients = this.getCurrentPatients();
        final Object other$currentPatients = other.getCurrentPatients();
        if (this$currentPatients == null ? other$currentPatients != null : !this$currentPatients.equals(other$currentPatients))
            return false;
        final Object this$rooms = this.getRooms();
        final Object other$rooms = other.getRooms();
        if (this$rooms == null ? other$rooms != null : !this$rooms.equals(other$rooms)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $speciality = this.getSpeciality();
        result = result * PRIME + ($speciality == null ? 43 : $speciality.hashCode());
        final Object $director = this.getDirector();
        result = result * PRIME + ($director == null ? 43 : $director.hashCode());
        final Object $manager = this.getManager();
        result = result * PRIME + ($manager == null ? 43 : $manager.hashCode());
        final Object $currentWorkers = this.getCurrentWorkers();
        result = result * PRIME + ($currentWorkers == null ? 43 : $currentWorkers.hashCode());
        final Object $currentPatients = this.getCurrentPatients();
        result = result * PRIME + ($currentPatients == null ? 43 : $currentPatients.hashCode());
        final Object $rooms = this.getRooms();
        result = result * PRIME + ($rooms == null ? 43 : $rooms.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Service;
    }

    public String toString() {
        return "Service(speciality=" + this.getSpeciality() + ", director=" + this.getDirector() + ", manager=" + this.getManager() + ", currentWorkers=" + this.getCurrentWorkers() + ", currentPatients=" + this.getCurrentPatients() + ", rooms=" + this.getRooms() + ")";
    }

    public static class ServiceBuilder {
        private Speciality speciality;
        private Doctor director;
        private Nurse manager;
        private List<Medic> currentWorkers;
        private List<Patient> currentPatients;
        private List<Room> rooms;

        ServiceBuilder() {
        }

        public Service.ServiceBuilder speciality(Speciality speciality) {
            this.speciality = speciality;
            return this;
        }

        public Service.ServiceBuilder director(Doctor director) {
            this.director = director;
            return this;
        }

        public Service.ServiceBuilder manager(Nurse manager) {
            this.manager = manager;
            return this;
        }

        public Service.ServiceBuilder currentWorkers(List<Medic> currentWorkers) {
            this.currentWorkers = currentWorkers;
            return this;
        }

        public Service.ServiceBuilder currentPatients(List<Patient> currentPatients) {
            this.currentPatients = currentPatients;
            return this;
        }

        public Service.ServiceBuilder rooms(List<Room> rooms) {
            this.rooms = rooms;
            return this;
        }

        public Service build() {
            return new Service(speciality, director, manager, currentWorkers, currentPatients, rooms);
        }

        public String toString() {
            return "Service.ServiceBuilder(speciality=" + this.speciality + ", director=" + this.director + ", manager=" + this.manager + ", currentWorkers=" + this.currentWorkers + ", currentPatients=" + this.currentPatients + ", rooms=" + this.rooms + ")";
        }
    }

    // TODO: All rooms on the same floor/level
    // TODO: director is mandatory (but can change)
    // TODO: manager is mandatory (but can change)
    // TODO: must have at least N PATIENT_ROOM and one OFFICE
}
