import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testUniqDocNumber() throws Exception {
        Person personFirst = new Person("Vasya Pupkin", 15, 12, 1993);
        Person personSecond = new Person("Vasya Pupkin", 15, 12, 1992);

        assertNotEquals(personFirst.getDocNumber(), personSecond.getDocNumber());
    }

    @Test
    public void testGetYearBirthday() throws Exception {
        Person person = new Person("Vasya Pupkin", 15, 12, 1993);

        assertEquals(1993, person.getYearBirthday());
    }

    @Test
    public void testGetMonthBirthday() throws Exception {
        Person person = new Person("Vasya Pupkin", 15, 12, 1993);

        assertEquals(12, person.getMonthBirthday());
    }

    @Test
    public void testGetDayOfMonthBirthday() throws Exception {
        Person person = new Person("Vasya Pupkin", 15, 12, 1993);

        assertEquals(15, person.getDayOfMonthBirthday());
    }

    @Test
    public void testGetAge() throws Exception {
        Person person = new Person("Vasya Pupkin", 15, 12, 1993);
        int curDayOfMonth = Calendar.getInstance().get(Calendar.DAY_OF_MONTH);
        int curMonth = Calendar.getInstance().get(Calendar.MONTH);
        int curYear = Calendar.getInstance().get(Calendar.YEAR);

        if (curMonth < person.getMonthBirthday()) {
            assertTrue((curYear - person.getYearBirthday()) - person.getAge() == 1);
            return;
        }
        if (curMonth == person.getMonthBirthday()) {
            if (curDayOfMonth < person.getDayOfMonthBirthday()) {
                assertTrue((curYear - person.getYearBirthday()) - person.getAge() == 1);
                return;
            }
        }
        assertTrue((person.getAge() - (curYear - person.getYearBirthday())) == 0);
    }

    @Test
    public void testCompareTo() throws Exception {
        Person personFirst = new Person("Vasya Pupkin", 15, 12, 1993);
        Person personSecond = new Person("Vasya Pupkin", 15, 12, 1992);

        assertEquals(personFirst.compareTo(personSecond), -1);
    }
}