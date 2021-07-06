package programs;

public class Insertion {


		public static void main(String[] args) {

			int[] arr = { 6, 19, 81, 66, 3, 5 };
			System.out.println("Array Before sorting");
			printArray(arr);
			Insertion ob = new Insertion();
			ob.sort(arr);
			System.out.println("Array After sorting");
			printArray(arr);
		}


		void sort(int[] arr) {
			int n = arr.length;
			for (int i = 1; i < n; ++i) {
				int value = arr[i];
				int j = i - 1;
				while (j >= 0 && arr[j] > value) {
					arr[j + 1] = arr[j];
					j = j - 1;
				}
				arr[j + 1] = value;
			}
		}


		static void printArray(int[] arr) {
			int n = arr.length;
			for (int j : arr)
				System.out.print(j + " ");
			System.out.println();
		}

	}
