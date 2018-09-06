package com.sogilis.kata.mothers.people;

import com.sogilis.kata.mothers.Service;

import java.time.LocalDate;

public class Nurse extends Medic {
    private final Service workingService;
    private final Service mangingService;

    public Nurse(
            final String firstName, final String lastName, final LocalDate dateOfBirth,
            final Gender gender, final LocalDate joiningDate,
            Service workingService, Service mangingService){
        super(lastName, firstName, dateOfBirth, gender, joiningDate);
        this.workingService = workingService;
        this.mangingService = mangingService;
    }

    public static NurseBuilder builder() {
        return new NurseBuilder();
    }

    public Service getWorkingService() {
        return this.workingService;
    }

    public Service getMangingService() {
        return this.mangingService;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Nurse)) return false;
        final Nurse other = (Nurse) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$workingService = this.getWorkingService();
        final Object other$workingService = other.getWorkingService();
        if (this$workingService == null ? other$workingService != null : !this$workingService.equals(other$workingService))
            return false;
        final Object this$mangingService = this.getMangingService();
        final Object other$mangingService = other.getMangingService();
        if (this$mangingService == null ? other$mangingService != null : !this$mangingService.equals(other$mangingService))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $workingService = this.getWorkingService();
        result = result * PRIME + ($workingService == null ? 43 : $workingService.hashCode());
        final Object $mangingService = this.getMangingService();
        result = result * PRIME + ($mangingService == null ? 43 : $mangingService.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Nurse;
    }

    public String toString() {
        return "Nurse(workingService=" + this.getWorkingService() + ", mangingService=" + this.getMangingService() + ")";
    }

    public static class NurseBuilder extends PersonBuilder {
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private Gender gender;
        private LocalDate joiningDate;
        private Service workingService;
        private Service mangingService;

        NurseBuilder() {
        }

        public Nurse.NurseBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Nurse.NurseBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Nurse.NurseBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Nurse.NurseBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Nurse.NurseBuilder joiningDate(LocalDate joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public Nurse.NurseBuilder workingService(Service workingService) {
            this.workingService = workingService;
            return this;
        }

        public Nurse.NurseBuilder mangingService(Service mangingService) {
            this.mangingService = mangingService;
            return this;
        }

        public Nurse build() {
            return new Nurse(firstName, lastName, dateOfBirth, gender, joiningDate, workingService, mangingService);
        }

        public String toString() {
            return "Nurse.NurseBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", gender=" + this.gender + ", joiningDate=" + this.joiningDate + ", workingService=" + this.workingService + ", mangingService=" + this.mangingService + ")";
        }
    }
}
