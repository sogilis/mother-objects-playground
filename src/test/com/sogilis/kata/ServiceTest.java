package com.sogilis.kata;

import com.sogilis.kata.mothers.ServiceMother;
import com.sogilis.kata.mothers.Speciality;
import com.sogilis.kata.mothers.exceptions.InvalidServiceException;
import com.sogilis.kata.mothers.people.Doctor;
import org.junit.Assert;
import org.junit.Test;

import java.util.Collections;

public class ServiceTest {

    @Test
    public void throws_exception_for_empty_service(){
        try {
            ServiceMother.emptyService().validate();
            Assert.fail("InvalidServiceException expected");
        } catch (InvalidServiceException e) {
            Assert.assertEquals(e.getMessage(),"specialty of director does not match service's one");
        }
    }

    @Test
    public void validate_empty_service_with_doctor(){
        final Doctor director = Doctor.builder()
                .specialties(Collections.singletonList(Speciality.CARDIOLOGY))
                .build();

        try {
            ServiceMother.emptyServiceWithDirector(director).validate();
            Assert.fail("InvalidServiceException expected");
        } catch (InvalidServiceException e) {
            Assert.assertEquals(e.getMessage(),"specialty of director does not match service's one");
        }
    }
}
