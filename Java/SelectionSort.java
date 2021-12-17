public class SelectionSort extends Sorting {
	
	private void selectionSort(int[] m) {
		
		int n = m.length;
		
		// �ּڰ��� ã�� �� �� �տ� ��ġ�� ���� ��ü �ϴ� �˰���
		for(int i = 0; i < n; i++) {
			int min = i;
			// �� ȸ������ ������ ��Ҹ� �� �տ��� �ϳ��� ����
			for(int j = i + 1; j < n; j++) {
				if(m[j] < m[min]) min = j;
			}
			swap(m, min, i);
		}
	}
	
	public void sort(int[] m) {
		selectionSort(m);
		name = "���� ����";
		printArray(m);
	}
}
