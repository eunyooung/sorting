public class HeapSort extends Sorting {
	
	// n = 힙의크기
	private void heapify(int[] m, int n, int parents) {
		
		// 부모 노드 인덱스
		int p = parents;
		// 왼쪽 자식 노드 인덱스
		int l = p*2+1;
		// 오른쪽 자식 노드 인덱스
		int r = p*2+2;
		
		// 오른쪽 자식이 더 크면 p를 오른쪽 자식 인덱스로 바꿈
		if(r < n && m[r] > m[p])
			p = r;
				
		// 왼쪽 자식이 더 크면 p를 왼쪽 자식 인덱스로 바꿈
		if(l < n && m[l] > m[p])
			p = l;
		
		
		// p가 처음 가져온 인덱스와 다르면, 즉 더 큰 자식이 있으면 부모 노드의 인덱스와 교환함 
		if(p != parents) {
			swap(m, parents, p);
			// 재귀함수로 다시 순서 조건 확인
			heapify(m, n, p);
		}
	}
	
	private void heapSort(int[] m) {
		
		// 맥스 힙
		for(int i = m.length / 2 - 1; i >= 0; i--)
			heapify(m, m.length, i);

		// delete
		for(int i = m.length - 1; i > 0; i--) {
			// 맨마지막 노드와 루트 노드를 교환
			swap(m, 0, i);
			// 다운 힙
			heapify(m, i, 0);
		}
	}
	
	public void sort(int[] m) {
		heapSort(m);
		name = "힙 정렬";
		printArray(m);
	}
}
