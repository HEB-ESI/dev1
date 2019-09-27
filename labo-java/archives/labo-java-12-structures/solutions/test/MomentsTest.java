package g12345.dev1.structure;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MomentsTest {

    @Test
    public void testAddASecondOneSecond() {
        System.out.println("testAddASecondOneSecond");
        Moment moment = new Moment(10, 7, 4);
        Moment exp = new Moment(10, 7, 5);
        Moments.addASecond(moment);
        assertEquals(exp.hours, moment.hours);
        assertEquals(exp.minutes, moment.minutes);
        assertEquals(exp.seconds, moment.seconds);
    }

    @Test
    public void testAddASecondOneMinute() {
        System.out.println("testAddASecondOneMinute");
        Moment moment = new Moment(12, 4, 59);
        Moment exp = new Moment(12, 5, 0);
        Moments.addASecond(moment);
        assertEquals(exp.hours, moment.hours);
        assertEquals(exp.minutes, moment.minutes);
        assertEquals(exp.seconds, moment.seconds);
    }    
    
     @Test
    public void testAddASecondOneHour() {
        System.out.println("testAddASecondOneHour");
        Moment moment = new Moment(13, 59, 59);
        Moment exp = new Moment(14, 0, 0);
        Moments.addASecond(moment);
        assertEquals(exp.hours, moment.hours);
        assertEquals(exp.minutes, moment.minutes);
        assertEquals(exp.seconds, moment.seconds);
    }       
}
