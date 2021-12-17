public class SelectionSort extends Sorting {
	
	private void selectionSort(int[] m) {
		
		int n = m.length;
		
		// 최솟값을 찾은 뒤 맨 앞에 위치한 값과 교체 하는 알고리즘
		for(int i = 0; i < n; i++) {
			int min = i;
			// 매 회전마다 정렬할 요소를 맨 앞에서 하나씩 제외
			for(int j = i + 1; j < n; j++) {
				if(m[j] < m[min]) min = j;
			}
			swap(m, min, i);
		}
	}
	
	public void sort(int[] m) {
		selectionSort(m);
		name = "선택 정렬";
		printArray(m);
	}
}
