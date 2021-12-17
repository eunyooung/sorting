public class InsertionSort extends Sorting {
	
	protected void insertSort(int[] m, int diff) {
		
		// 두번째 데이터부터 시작이므로 i=1에서부터 시작
		for(int i = diff; i < m.length; i++) {
			int key = m[i];
			
			// j 는 키값의 왼쪽 값들의 인덱스
			int j = i - diff;
			
			// 왼쪽의 값중 하나가 키값보다 클때까지 차례로 비교
			// 배열의 인덱스가 0보다 작으면 존재하지 않으므로 비교 중단
			while(j >= 0 && key < m[j]) {
				// 값을 뒤로 밀기
				m[j + diff] = m[j];
				j -= diff;
			}
			m[j + diff] = key;	
		}
	}
	
	public void sort(int[] m) {

		insertSort(m, 1);
		name = "삽입 정렬";
		printArray(m);
	}
}
