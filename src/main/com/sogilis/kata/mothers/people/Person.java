package com.sogilis.kata.mothers.people;

import java.time.LocalDate;

/**
 * A generic person
 */
public abstract class Person {
    private final String lastName;
    private final String firstName;
    private final LocalDate dateOfBirth;
    private final Gender gender;

    Person(String lastName, String firstName, LocalDate dateOfBirth, Gender gender) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
    }

    public static PersonBuilder builder() {
        return new PersonBuilder();
    }

    private String getLastName() {
        return this.lastName;
    }

    private String getFirstName() {
        return this.firstName;
    }

    private LocalDate getDateOfBirth() {
        return this.dateOfBirth;
    }

    private Gender getGender() {
        return this.gender;
    }

    public boolean equals(Object o) {
        if (o == this) return true;
        if (!(o instanceof Person)) return false;
        final Person other = (Person) o;
        if (!other.canEqual(this)) return false;
        final Object this$lastName = this.getLastName();
        final Object other$lastName = other.getLastName();
        if (this$lastName == null ? other$lastName != null : !this$lastName.equals(other$lastName)) return false;
        final Object this$firstName = this.getFirstName();
        final Object other$firstName = other.getFirstName();
        if (this$firstName == null ? other$firstName != null : !this$firstName.equals(other$firstName)) return false;
        final Object this$dateOfBirth = this.getDateOfBirth();
        final Object other$dateOfBirth = other.getDateOfBirth();
        if (this$dateOfBirth == null ? other$dateOfBirth != null : !this$dateOfBirth.equals(other$dateOfBirth))
            return false;
        final Object this$gender = this.getGender();
        final Object other$gender = other.getGender();
        return this$gender == null ? other$gender == null : this$gender.equals(other$gender);
    }

    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        final Object $lastName = this.getLastName();
        result = result * PRIME + ($lastName == null ? 43 : $lastName.hashCode());
        final Object $firstName = this.getFirstName();
        result = result * PRIME + ($firstName == null ? 43 : $firstName.hashCode());
        final Object $dateOfBirth = this.getDateOfBirth();
        result = result * PRIME + ($dateOfBirth == null ? 43 : $dateOfBirth.hashCode());
        final Object $gender = this.getGender();
        result = result * PRIME + ($gender == null ? 43 : $gender.hashCode());
        return result;
    }

    protected boolean canEqual(Object other) {
        return other instanceof Person;
    }

    public String toString() {
        return "Person(lastName=" + this.getLastName() + ", firstName=" + this.getFirstName() + ", dateOfBirth=" + this.getDateOfBirth() + ", gender=" + this.getGender() + ")";
    }

    public enum Gender { MALE, FEMALE }

    public static class PersonBuilder {
        private String lastName;
        private String firstName;
        private LocalDate dateOfBirth;
        private Gender gender;

        PersonBuilder() {
        }

        public Person.PersonBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public Person.PersonBuilder firstName(String firstName) {
            this.firstName = firstName;
            return this;
        }

        public Person.PersonBuilder dateOfBirth(LocalDate dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }

        public Person.PersonBuilder gender(Gender gender) {
            this.gender = gender;
            return this;
        }

        public String toString() {
            return "Person.PersonBuilder(lastName=" + this.lastName + ", firstName=" + this.firstName
                    + ", dateOfBirth=" + this.dateOfBirth + ", gender=" + this.gender + ")";
        }
    }
}
