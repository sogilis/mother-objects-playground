package com.sogilis.kata.mothers.people;

import com.sogilis.kata.mothers.Service;
import com.sogilis.kata.mothers.Speciality;

import java.time.LocalDate;
import java.util.List;

public class Doctor extends Medic {
    private final List<Speciality> specialties;
    private Service managingService;
    private final List<Service> workingServices;

    public Doctor(
            final String firstName, final String lastName, final LocalDate dateOfBirth,
            final Gender gender, final LocalDate joiningDate, final List<Speciality> specialties,
            final List<Service> workingServices
    ){
        super(lastName, firstName, dateOfBirth, gender, joiningDate);
        this.specialties = specialties;
        this.workingServices = workingServices;
    }

    public static DoctorBuilder builder() {
        return new DoctorBuilder();
    }

    public List<Speciality> getSpecialties() {
        return this.specialties;
    }

    public Service getManagingService() {
        return this.managingService;
    }

    public List<Service> getWorkingServices() {
        return this.workingServices;
    }

    public void setManagingService(Service managingService) {
        this.managingService = managingService;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Doctor)) return false;
        final Doctor other = (Doctor) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$specialties = this.getSpecialties();
        final Object other$specialties = other.getSpecialties();
        if (this$specialties == null ? other$specialties != null : !this$specialties.equals(other$specialties))
            return false;
        final Object this$managingService = this.getManagingService();
        final Object other$managingService = other.getManagingService();
        if (this$managingService == null ? other$managingService != null : !this$managingService.equals(other$managingService))
            return false;
        final Object this$workingServices = this.getWorkingServices();
        final Object other$workingServices = other.getWorkingServices();
        if (this$workingServices == null ? other$workingServices != null : !this$workingServices.equals(other$workingServices))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $specialties = this.getSpecialties();
        result = result * PRIME + ($specialties == null ? 43 : $specialties.hashCode());
        final Object $managingService = this.getManagingService();
        result = result * PRIME + ($managingService == null ? 43 : $managingService.hashCode());
        final Object $workingServices = this.getWorkingServices();
        result = result * PRIME + ($workingServices == null ? 43 : $workingServices.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Doctor;
    }

    public String toString() {
        return "Doctor(specialties=" + this.getSpecialties() + ", managingService=" + this.getManagingService() + ", workingServices=" + this.getWorkingServices() + ")";
    }

    public static class DoctorBuilder extends PersonBuilder{
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private Gender gender;
        private LocalDate joiningDate;
        private List<Speciality> specialties;
        private List<Service> workingServices;

        DoctorBuilder() {
        }

        public Doctor.DoctorBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Doctor.DoctorBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Doctor.DoctorBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Doctor.DoctorBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Doctor.DoctorBuilder joiningDate(LocalDate joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public Doctor.DoctorBuilder specialties(List<Speciality> specialties) {
            this.specialties = specialties;
            return this;
        }

        public Doctor.DoctorBuilder workingServices(List<Service> workingServices) {
            this.workingServices = workingServices;
            return this;
        }

        public Doctor build() {
            return new Doctor(firstName, lastName, dateOfBirth, gender, joiningDate, specialties, workingServices);
        }

        public String toString() {
            return "Doctor.DoctorBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", gender=" + this.gender + ", joiningDate=" + this.joiningDate + ", specialties=" + this.specialties + ", workingServices=" + this.workingServices + ")";
        }
    }
}
