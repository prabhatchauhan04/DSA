package OOPS_2.GenericClassesMethods;

public class GenericMethodDisplay {
    public static void main(String[] args) {
		String[] arr = { "Ankit", "Ankita", "Kaju", "Amisha", "Raj", "Vishal", "Pooja" };
		Display(arr);
		Integer[] arr1 = { 1, 2, 3, 4, 5 };
		Display(arr1);

	}

	public static <Kaju> void Display(Kaju[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}



