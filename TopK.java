
public class TopK {

	/*
	 * Hoàn thiện phương thức getTopk trả lại giá trị lớn thứ k trong dãy k <=
	 * a.length
	 */
	public static int getTopk(int[] a, int k) {
		int len = a.length;
		for (int i = len - 1; i >= 0; i--) {
			for (int j = 1; j <= i; j++) {
				if (a[j - 1] < a[j]) {
					swap(a, j-1, j);
				}
			}
		}
		return a[k - 1];
	}

	public static void swap(int[] a, int i, int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	
	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 4, 2, 3, 5, 7, 6 };
		int k = 2;

		System.out.printf("Phần tử lớn thứ %d là: %d", k, getTopk(a, k));

	}
}
