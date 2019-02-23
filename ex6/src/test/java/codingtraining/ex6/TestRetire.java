package codingtraining.ex6;

import org.junit.Test;

import java.util.Calendar;
import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.fail;

public class TestRetire {
    @Test
    public void testCalculateRemaining() {
        int age = 35;
        int retirement = 65;

        try {
            String result = Retire.calculateRetire(age, retirement);
            assertEquals(String.format(Retire.REMAINING_FORMAT, retirement - age, Retire.CURR_YEAR, Retire.CURR_YEAR - retirement + age), result);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }

    public void testRetired() {
        int age = 75;
        int retirement = 75;

        try {
            String result = Retire.calculateRetire(age, retirement);
            assertEquals(String.format(Retire.RETIRED_FORMAT, Retire.CURR_YEAR - retirement + age, Retire.CURR_YEAR, age - retirement), result);
        } catch (Exception e) {
            e.printStackTrace();
            fail();
        }
    }
}
