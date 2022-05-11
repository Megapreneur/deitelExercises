package ChapterThreeTest;

import ChapterThree.HealthProfile;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.testng.AssertJUnit.assertEquals;

public class HealthProfileTest {

    HealthProfile patient;
    @BeforeEach
    public void setUp(){

        patient = new HealthProfile("Ola", "Tunde", 8, 10, 2000, "Male", 1.56, 70.5);
    }
    @Test
    public void genderTest(){
        patient.setGender("Male");
        assertEquals("Male", patient.getGender());
    }
    @Test
    public void heightTest(){
        patient.setHeight(1.6);
        assertEquals(1.6, patient.getHeight());
    }
    @Test
    public void weightTest(){
        patient.setWeight(70.4);
        assertEquals(70.4, patient.getWeight());
    }
    @Test
    public void bmiCalculationTest(){
        patient.setGender("Male");
        patient.setHeight(45.2);
        patient.setWeight(123.4);
        patient.bmiCalculation();
        assertEquals("Male", patient.getGender());
        assertEquals(45.2, patient.getHeight());
        assertEquals(123.4, patient.getWeight());
        assertEquals(42, patient.bmiCalculation());

    }
}
