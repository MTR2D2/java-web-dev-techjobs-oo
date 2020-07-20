package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    private Job firstJob, secondJob;

    @Before
    public void createTestJobObjects() {
        firstJob = new Job();
        secondJob = new Job();
    }

    @Test
    public void testSettingJobID() {
        //Test that the ID values for the two objects are NOT the same and differ by 1
        assertEquals(1, secondJob.getId() - firstJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }
}

