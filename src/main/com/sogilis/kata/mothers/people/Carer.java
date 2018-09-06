package com.sogilis.kata.mothers.people;

import com.sogilis.kata.mothers.Service;

import java.time.LocalDate;
import java.util.List;

public class Carer extends Medic{
    private final List<Service> workingServices;

    public Carer(
            final String firstName, final String lastName, final LocalDate dateOfBirth,
            final Gender gender, final LocalDate joiningDate,
            final List<Service> workingServices){
        super(lastName, firstName, dateOfBirth, gender, joiningDate);
        this.workingServices = workingServices;
    }

    public static CarerBuilder builder() {
        return new CarerBuilder();
    }

    public List<Service> getWorkingServices() {
        return this.workingServices;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Carer)) return false;
        final Carer other = (Carer) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$workingServices = this.getWorkingServices();
        final Object other$workingServices = other.getWorkingServices();
        if (this$workingServices == null ? other$workingServices != null : !this$workingServices.equals(other$workingServices))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $workingServices = this.getWorkingServices();
        result = result * PRIME + ($workingServices == null ? 43 : $workingServices.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Carer;
    }

    public String toString() {
        return "Carer(workingServices=" + this.getWorkingServices() + ")";
    }

    public static class CarerBuilder extends PersonBuilder {
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private Gender gender;
        private LocalDate joiningDate;
        private List<Service> workingServices;

        CarerBuilder() {
        }

        public Carer.CarerBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Carer.CarerBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Carer.CarerBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Carer.CarerBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Carer.CarerBuilder joiningDate(LocalDate joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public Carer.CarerBuilder workingServices(List<Service> workingServices) {
            this.workingServices = workingServices;
            return this;
        }

        public Carer build() {
            return new Carer(firstName, lastName, dateOfBirth, gender, joiningDate, workingServices);
        }

        public String toString() {
            return "Carer.CarerBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", gender=" + this.gender + ", joiningDate=" + this.joiningDate + ", workingServices=" + this.workingServices + ")";
        }
    }
}
