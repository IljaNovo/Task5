import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUntil {
    public static  <T> T[] selectValues (T[] array, Predicate<? super T> pred) {
        if (array == null) {
            
        }

        T[] foundItems = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        int countElems = 0;

        for (int i = 0; i < foundItems.length; ++i) {
            if (pred.checkCondition(array[i])) {
                foundItems[countElems++] = array[i];
            }
        }
        T[] foundItemsCopy = null;

        if (foundItems.length != countElems) {
            foundItemsCopy = Arrays.copyOfRange(foundItems, 0, countElems - 1);
        }
        return foundItemsCopy;
    }
}
