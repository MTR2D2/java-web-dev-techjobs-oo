package org.launchcode.techjobs_oo.Tests;

import org.junit.Test;
import org.junit.Before;
import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;


public class JobTest {

    private Job firstJob, secondJob, thirdJob;

    @Before
    public void createTestJobObjects() {
        firstJob = new Job();
        secondJob = new Job();
        thirdJob = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
    }

    @Test
    public void testSettingJobID() {
        //Test that the ID values for the two objects are NOT the same and differ by 1
        assertEquals(1, secondJob.getId() - firstJob.getId());
    }

    @Test
    public void testJobConstructorSetsAllFields() {
        assertEquals("Product tester", thirdJob.getName());
        assertEquals("ACME", thirdJob.getEmployer().getValue());
        assertEquals("Desert", thirdJob.getLocation().getValue());
        assertEquals("Quality control", thirdJob.getPositionType().getValue());
        assertEquals("Persistence", thirdJob.getCoreCompetency().getValue());
    }

    @Test
    public void testJobsForEquality() {
        assertFalse(firstJob.equals(secondJob));
    }
}

