import java.util.Arrays;
import java.util.List;

public class Lambda1 {

	public static void main(String[] args) {

		

		int arr[] = {10,20,30,40,50};

		for (int i = 0; i < arr.length; i++) {
			arr[i] = arr[i] + 1;
		}

		System.out.println(Arrays.toString(arr));
	}
}
