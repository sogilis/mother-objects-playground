package com.sogilis.kata.mothers.people;

import java.time.LocalDate;

/**
 * Person working in the hospital as medic people.
 */
public abstract class Medic extends Person {
    private final LocalDate joiningDate;

    public Medic(
            final String firstName,
            final String lastName,
            final LocalDate dateOfBirth,
            final Gender gender,
            final LocalDate joiningDate
    ){
        super(lastName, firstName, dateOfBirth, gender);
        this.joiningDate = joiningDate;
    }

    public LocalDate getJoiningDate() {
        return this.joiningDate;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Medic)) return false;
        final Medic other = (Medic) o;
        if (!other.canEqual((Object) this)) return false;
        final Object this$joiningDate = this.getJoiningDate();
        final Object other$joiningDate = other.getJoiningDate();
        if (this$joiningDate == null ? other$joiningDate != null : !this$joiningDate.equals(other$joiningDate))
            return false;
        return true;
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $joiningDate = this.getJoiningDate();
        result = result * PRIME + ($joiningDate == null ? 43 : $joiningDate.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Medic;
    }

    public String toString() {
        return "Medic(joiningDate=" + this.getJoiningDate() + ")";
    }
}
