import entities.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Arrays;


public class SomeTest {

    @Test
    public void someTest() throws Exception {

        MarksForYear firstYear = new MarksForYearBuilder()
                .withYear(1)
                .withScore(Subject.Datastructures, 40.0)
                .withScore(Subject.Java, 50.0)
                .build();

        MarksForYear secondYear = new MarksForYearBuilder()
                .withYear(2)
                .withScore(Subject.Os, 30.0)
                .withScore(Subject.SDLC, 60.0)
                .build();



        CMM cmm = new CMM();
        Assert.assertEquals(cmm.calculateCgpa(Arrays.asList(firstYear, secondYear)), 5.0, "CGPA is not matching");

    }
}
