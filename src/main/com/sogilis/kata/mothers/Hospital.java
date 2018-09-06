package com.sogilis.kata.mothers;

import com.sogilis.kata.mothers.people.Medic;

import java.util.List;

public class Hospital {
    private final List<Service> services;
    private final List<Speciality> specialities;
    private final List<Medic> employees;

    @java.beans.ConstructorProperties({"services", "specialities", "employees"})
    public Hospital(List<Service> services, List<Speciality> specialities, List<Medic> employees) {
        this.services = services;
        this.specialities = specialities;
        this.employees = employees;
    }

    public Hospital() {
        this.services = null;
        this.specialities = null;
        this.employees = null;
    }

    //TODO All OR on the same floor
    //TODO All rooms have disctinct number

    public static HospitalBuilder builder() {
        return new HospitalBuilder();
    }

    public List<Service> getServices() {
        return this.services;
    }

    public List<Speciality> getSpecialities() {
        return this.specialities;
    }

    public List<Medic> getEmployees() {
        return this.employees;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Hospital)) return false;
        final Hospital other = (Hospital) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$services = this.getServices();
        final Object other$services = other.getServices();
        if (this$services == null ? other$services != null : !this$services.equals(other$services)) return false;
        final Object this$specialities = this.getSpecialities();
        final Object other$specialities = other.getSpecialities();
        if (this$specialities == null ? other$specialities != null : !this$specialities.equals(other$specialities))
            return false;
        final Object this$employees = this.getEmployees();
        final Object other$employees = other.getEmployees();
        if (this$employees == null ? other$employees != null : !this$employees.equals(other$employees)) return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $services = this.getServices();
        result = result * PRIME + ($services == null ? 43 : $services.hashCode());
        final Object $specialities = this.getSpecialities();
        result = result * PRIME + ($specialities == null ? 43 : $specialities.hashCode());
        final Object $employees = this.getEmployees();
        result = result * PRIME + ($employees == null ? 43 : $employees.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Hospital;
    }

    public String toString() {
        return "Hospital(services=" + this.getServices() + ", specialities=" + this.getSpecialities() + ", employees=" + this.getEmployees() + ")";
    }

    public static class HospitalBuilder {
        private List<Service> services;
        private List<Speciality> specialities;
        private List<Medic> employees;

        HospitalBuilder() {
        }

        public Hospital.HospitalBuilder services(List<Service> services) {
            this.services = services;
            return this;
        }

        public Hospital.HospitalBuilder specialities(List<Speciality> specialities) {
            this.specialities = specialities;
            return this;
        }

        public Hospital.HospitalBuilder employees(List<Medic> employees) {
            this.employees = employees;
            return this;
        }

        public Hospital build() {
            return new Hospital(services, specialities, employees);
        }

        public String toString() {
            return "Hospital.HospitalBuilder(services=" + this.services + ", specialities=" + this.specialities + ", employees=" + this.employees + ")";
        }
    }

}
