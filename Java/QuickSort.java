public class QuickSort extends Sorting {

	private int partition(int[] m, int left, int right) {
		
		// 배열의 제일 왼쪽 값을 피봇으로 설정
		int pivot = m[left];
		
		int l = left;
		int r = right;
		
		// l과 r이 엇갈릴 때 까지
		while(l < r) {
			// r이 피봇보다 크면 왼쪽으로 이동
			while(m[r] > pivot && l < r) {
				r--;
			}
			// l이 오른쪽보다 작으면 오른쪽으로 이동
			while(m[l] <= pivot && l < r) {
				l++;
			}
			// l과 r교환
			swap(m,l,r);
		}
		// l과 r이 엇갈리면 피봇과 바꾸기
		swap(m,left,l);
		return l;
	}
	
	private void quickSort(int[] m, int l, int r) {
		
		// l이 r보다 커지면 정렬할 배열이 1개 이하이므로 재귀함수 끝내기
		if(l >= r)
			return;
		
		// 파티션에서 정렬 진행
		int pivot = partition(m,l,r);
		
		// 피봇 기준 배열의 왼쪽을 퀵정렬
		quickSort(m, l, pivot - 1);
		// 피봇 기준 배열의 오른쪽을 정렬
		quickSort(m, pivot + 1, r);
	}

	
	public void sort(int[] m) {
		quickSort(m, 0, m.length - 1);
		name = "퀵 정렬";
		printArray(m);
	}
}
