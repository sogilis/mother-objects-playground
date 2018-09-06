package com.sogilis.kata.mothers;

import com.sogilis.kata.mothers.people.Carer;
import com.sogilis.kata.mothers.people.Doctor;
import com.sogilis.kata.mothers.people.Patient;

import java.util.Collections;

public class ServiceMother {
    public static Service.ServiceBuilder emptyServiceToBuild(){
        return Service.builder()
                .currentWorkers(Collections.singletonList(Carer.builder().build()))
                .currentPatients(Collections.singletonList(Patient.builder().build()))
                .rooms(Collections.singletonList(RoomMother.defaultRoom()));
    }

    public static Service emptyService(){
        return emptyServiceToBuild().build();
    }

    public static Service emptyServiceWithDirector(final Doctor director){
        return emptyServiceToBuild().director(director).build();
    }
}
