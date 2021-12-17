public class MergeSort extends Sorting {

	private void merge(int[] m, int start, int mid, int end) {

		// ������ �� �迭�� ������
		int size1 = mid - start + 1 ;
		int size2 = end - mid;
        
		// �߾� �������� ���� �迭�� ������ �迭 �ӽ� ���� �� ������ �־��ֱ�
		int left[] = new int[size1];
		int right[] = new int[size2];
		for (int i = 0; i < size1; i++) left[i] = m[start + i];
		for (int j = 0; j < size2; j++) right[j] = m[mid + 1 + j];

		
		// ����(merge) ����

		// ���� �迭���� �ε��� �ʱ�ȭ
		int i = 0, j = 0;
		// ���յ� �迭�� �ε��� �ʱ�ȭ
		int k = start;
		
		// i�� j�� ���� �迭�� ũ��� �������ų� Ŀ���� ���߱�
		do {
			// �� ���� ���� �迭�� �� �迭�� �־��ְ� �ε����� ���� ���ֱ�
			if(left[i] <= right[j]) m[k++] = left[i++];
			else m[k++] = right[j++];
		} while(i < size1 && j < size2);
		
		// ���� �迭�� ���� ������ ����
		while(i < size1) {
			m[k++] = left[i++];
		}
		
		// ������ �迭�� ���� ������ ����
		while (j < size2) {
			m[k++] = right[j++];
		}
	}
    
	private void mergeSort(int[] m, int start, int end) {

		// �迭�� ��Ұ� 1���ų� �迭�� ������ ���ȣ�� ����
		if (start >= end) return;

		// �߾� ã�� 
		int mid = (start + end) /2;

		// �߰��� �������� �����ϱ�: ���� ~ �߾� & �߾�+1 ~ ��  
		mergeSort(m, start, mid);  
		mergeSort(m, mid+1 , end); 
		// �����ϸ� �ٽ� ���� �ϱ�
		merge(m, start, mid, end);
	}

	public void sort(int[] m) {
	
		mergeSort(m, 0, m.length-1);
		name = "���� ����";
		printArray(m);
	}
}
