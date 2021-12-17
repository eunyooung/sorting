public class MergeSort extends Sorting {

	private void merge(int[] m, int start, int mid, int end) {

		// 나눠진 두 배열의 사이즈
		int size1 = mid - start + 1 ;
		int size2 = end - mid;
        
		// 중앙 기준으로 왼쪽 배열과 오른쪽 배열 임시 생성 후 데이터 넣어주기
		int left[] = new int[size1];
		int right[] = new int[size2];
		for (int i = 0; i < size1; i++) left[i] = m[start + i];
		for (int j = 0; j < size2; j++) right[j] = m[mid + 1 + j];

		
		// 병합(merge) 시작

		// 서브 배열들의 인덱스 초기화
		int i = 0, j = 0;
		// 병합될 배열의 인덱스 초기화
		int k = start;
		
		// i나 j가 서브 배열의 크기와 같아지거나 커지면 멈추기
		do {
			// 더 작은 쪽의 배열을 원 배열에 넣어주고 인덱스를 증가 해주기
			if(left[i] <= right[j]) m[k++] = left[i++];
			else m[k++] = right[j++];
		} while(i < size1 && j < size2);
		
		// 왼쪽 배열에 남은 데이터 복사
		while(i < size1) {
			m[k++] = left[i++];
		}
		
		// 오른쪽 배열에 남은 데이터 복사
		while (j < size2) {
			m[k++] = right[j++];
		}
	}
    
	private void mergeSort(int[] m, int start, int end) {

		// 배열에 요소가 1개거나 배열이 없으면 재귀호출 종료
		if (start >= end) return;

		// 중앙 찾기 
		int mid = (start + end) /2;

		// 중간을 기준으로 분할하기: 시작 ~ 중앙 & 중앙+1 ~ 끝  
		mergeSort(m, start, mid);  
		mergeSort(m, mid+1 , end); 
		// 정렬하며 다시 병합 하기
		merge(m, start, mid, end);
	}

	public void sort(int[] m) {
	
		mergeSort(m, 0, m.length-1);
		name = "병합 정렬";
		printArray(m);
	}
}
