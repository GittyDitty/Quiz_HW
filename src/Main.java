import org.junit.Test;
import java.util.Arrays;
import static org.junit.Assert.*;

public class Main {

    public static void main(String[] args) {
        // left empty on purpose
    }

    @Test
    public void testBubbleSort() {

        int[] inputs = {5,4,3,2,1};
        int[] expects = {1,2,3,4,5};

        bubbleSort(inputs);

        assertTrue(Arrays.equals(inputs, expects));
    }

	// Meant to sort in ascending order
    public static void bubbleSort(int[] data) {
		// check data size
		if (data.length <= 1) {//if the size of the array is less than or equal to one it should return nothing since the data is already sorted
			return;
		}

		// sorts data
        for (int i=0; i<data.length; i++) {
            for (int j=0; j<data.length-i-1; j++) {
                if (data[j]>data[j+1]) {
                    swap(data, j);
                }
            }
        }
    }

    private static void swap(int[] data, int j) {
        int k = data[j];
        data[j] = data[j+1];
        data[j+1] = k;
    }
}
