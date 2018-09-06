package com.sogilis.kata.mothers.people;

import com.sogilis.kata.mothers.Service;
import com.sogilis.kata.mothers.Speciality;

import java.time.LocalDate;

public class Patient extends Person {
    private Doctor doctor;
    private Service service;
    private Speciality specialityTreatedfor;
    private LocalDate admissionDate;

    public Patient(
            final String firstName, final String lastName, final LocalDate dateOfBirth, final Gender gender,
            final Doctor doctor, final Service service,
            final Speciality speciality, final LocalDate admissionDate
    ){
        super(lastName, firstName, dateOfBirth, gender);
        this.doctor = doctor;
        this.service = service;
        this.specialityTreatedfor = speciality;
        this.admissionDate = admissionDate;
    }

    public static PatientBuilder builder() {
        return new PatientBuilder();
    }

    public Doctor getDoctor() {
        return this.doctor;
    }

    public Service getService() {
        return this.service;
    }

    public Speciality getSpecialityTreatedfor() {
        return this.specialityTreatedfor;
    }

    public LocalDate getAdmissionDate() {
        return this.admissionDate;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public void setService(Service service) {
        this.service = service;
    }

    public void setSpecialityTreatedfor(Speciality specialityTreatedfor) {
        this.specialityTreatedfor = specialityTreatedfor;
    }

    public void setAdmissionDate(LocalDate admissionDate) {
        this.admissionDate = admissionDate;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Patient)) return false;
        final Patient other = (Patient) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$doctor = this.getDoctor();
        final Object other$doctor = other.getDoctor();
        if (this$doctor == null ? other$doctor != null : !this$doctor.equals(other$doctor)) return false;
        final Object this$service = this.getService();
        final Object other$service = other.getService();
        if (this$service == null ? other$service != null : !this$service.equals(other$service)) return false;
        final Object this$specialityTreatedfor = this.getSpecialityTreatedfor();
        final Object other$specialityTreatedfor = other.getSpecialityTreatedfor();
        if (this$specialityTreatedfor == null ? other$specialityTreatedfor != null : !this$specialityTreatedfor.equals(other$specialityTreatedfor))
            return false;
        final Object this$admissionDate = this.getAdmissionDate();
        final Object other$admissionDate = other.getAdmissionDate();
        if (this$admissionDate == null ? other$admissionDate != null : !this$admissionDate.equals(other$admissionDate))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $doctor = this.getDoctor();
        result = result * PRIME + ($doctor == null ? 43 : $doctor.hashCode());
        final Object $service = this.getService();
        result = result * PRIME + ($service == null ? 43 : $service.hashCode());
        final Object $specialityTreatedfor = this.getSpecialityTreatedfor();
        result = result * PRIME + ($specialityTreatedfor == null ? 43 : $specialityTreatedfor.hashCode());
        final Object $admissionDate = this.getAdmissionDate();
        result = result * PRIME + ($admissionDate == null ? 43 : $admissionDate.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Patient;
    }

    public String toString() {
        return "Patient(doctor=" + this.getDoctor() + ", service=" + this.getService() + ", specialityTreatedfor=" + this.getSpecialityTreatedfor() + ", admissionDate=" + this.getAdmissionDate() + ")";
    }

    public static class PatientBuilder extends PersonBuilder {
        private String firstName;
        private String lastName;
        private LocalDate dateOfBirth;
        private Gender gender;
        private LocalDate joiningDate;
        private Doctor doctor;
        private Service service;
        private Speciality speciality;
        private LocalDate admissionDate;

        PatientBuilder() {
        }

        public Patient.PatientBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Patient.PatientBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Patient.PatientBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Patient.PatientBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public Patient.PatientBuilder joiningDate(LocalDate joiningDate) {
            this.joiningDate = joiningDate;
            return this;
        }

        public Patient.PatientBuilder doctor(Doctor doctor) {
            this.doctor = doctor;
            return this;
        }

        public Patient.PatientBuilder service(Service service) {
            this.service = service;
            return this;
        }

        public Patient.PatientBuilder speciality(Speciality speciality) {
            this.speciality = speciality;
            return this;
        }

        public Patient.PatientBuilder admissionDate(LocalDate admissionDate) {
            this.admissionDate = admissionDate;
            return this;
        }

        public Patient build() {
            return new Patient(firstName, lastName, dateOfBirth, gender, doctor, service, speciality, admissionDate);
        }

        public String toString() {
            return "Patient.PatientBuilder(firstName=" + this.firstName + ", lastName=" + this.lastName + ", dateOfBirth=" + this.dateOfBirth + ", gender=" + this.gender + ", joiningDate=" + this.joiningDate + ", doctor=" + this.doctor + ", service=" + this.service + ", speciality=" + this.speciality + ", admissionDate=" + this.admissionDate + ")";
        }
    }
}
