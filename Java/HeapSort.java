public class HeapSort extends Sorting {
	
	// n = ����ũ��
	private void heapify(int[] m, int n, int parents) {
		
		// �θ� ��� �ε���
		int p = parents;
		// ���� �ڽ� ��� �ε���
		int l = p*2+1;
		// ������ �ڽ� ��� �ε���
		int r = p*2+2;
		
		// ������ �ڽ��� �� ũ�� p�� ������ �ڽ� �ε����� �ٲ�
		if(r < n && m[r] > m[p])
			p = r;
				
		// ���� �ڽ��� �� ũ�� p�� ���� �ڽ� �ε����� �ٲ�
		if(l < n && m[l] > m[p])
			p = l;
		
		
		// p�� ó�� ������ �ε����� �ٸ���, �� �� ū �ڽ��� ������ �θ� ����� �ε����� ��ȯ�� 
		if(p != parents) {
			swap(m, parents, p);
			// ����Լ��� �ٽ� ���� ���� Ȯ��
			heapify(m, n, p);
		}
	}
	
	private void heapSort(int[] m) {
		
		// �ƽ� ��
		for(int i = m.length / 2 - 1; i >= 0; i--)
			heapify(m, m.length, i);

		// delete
		for(int i = m.length - 1; i > 0; i--) {
			// �Ǹ����� ���� ��Ʈ ��带 ��ȯ
			swap(m, 0, i);
			// �ٿ� ��
			heapify(m, i, 0);
		}
	}
	
	public void sort(int[] m) {
		heapSort(m);
		name = "�� ����";
		printArray(m);
	}
}
