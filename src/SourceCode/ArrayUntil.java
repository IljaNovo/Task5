import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayUntil {
    public <T> T[] selectValues (T[] array, Predicate<? super T> pred) {
        T[] foundItems = (T[]) Array.newInstance(array.getClass().getComponentType(), array.length);
        int countElems = 0;

        for (int i = 0; i < foundItems.length; ++i) {
            if (pred.checkCondition(array[i])) {
                foundItems[countElems++] = array[i];
            }
        }
        T[] foundItemsCopy;

        if (foundItems.length != countElems) {
            foundItemsCopy = Arrays.copyOfRange(foundItems, countElems - 1, foundItems.length);
        }
        return foundItems;
    }
}
