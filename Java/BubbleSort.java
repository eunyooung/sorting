public class BubbleSort extends Sorting {
	
	private void bubbleSort(int[] m) {
		
		int n = m.length;
		
		// 자료를 하나하나 비교하여 교환하면서 자료를 정렬하는 알고리즘
		for(int i = 0; i < n; i++) {
			// 한 회전 후 제일 큰 요소가 뒤로 이동하므로 맨 뒤는 정렬에서 제외
			for(int j = 0; j < n - i - 1; j++) {
				if(m[j] > m[j + 1]) {
					swap(m, j, j + 1);
				}
			}
		}
	}
	
	public void sort(int[] m) {
		bubbleSort(m);
		name = "거품 정렬";
		printArray(m);
	}
}
