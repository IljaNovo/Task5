import org.junit.Test;

import java.util.Arrays;

import static org.junit.Assert.*;

public class ArrayUntilTest {

    @Test
    public void testSelectValues() throws Exception {
        Integer[] elems = {1, 2, 3, 4, 5, 6};
        Integer[] paternAnswer = {2, 4, 6};

        Integer[] answer = ArrayUntil.selectValues(elems, new Predicate<Integer>() {

            @Override
            public boolean checkCondition(Integer obj) {
                if ((obj % 2) == 0)
                    return true;
                else {
                    return false;
                }
            }
        });
        assertTrue(Arrays.equals(paternAnswer, answer));
    }

    @Test
    public void testNullArrayInParam() throws Exception {
        try {
            ArrayUntil.selectValues(null, new Predicate<Integer>() {

                @Override
                public boolean checkCondition(Integer obj) {
                    if ((obj % 2) == 0)
                        return true;
                    else {
                        return false;
                    }
                }
            });
        }
        catch (NullArrayExeption e) {
            assertTrue(true);
        }
    }
}