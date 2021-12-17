public class QuickSort extends Sorting {

	private int partition(int[] m, int left, int right) {
		
		// �迭�� ���� ���� ���� �Ǻ����� ����
		int pivot = m[left];
		
		int l = left;
		int r = right;
		
		// l�� r�� ������ �� ����
		while(l < r) {
			// r�� �Ǻ����� ũ�� �������� �̵�
			while(m[r] > pivot && l < r) {
				r--;
			}
			// l�� �����ʺ��� ������ ���������� �̵�
			while(m[l] <= pivot && l < r) {
				l++;
			}
			// l�� r��ȯ
			swap(m,l,r);
		}
		// l�� r�� �������� �Ǻ��� �ٲٱ�
		swap(m,left,l);
		return l;
	}
	
	private void quickSort(int[] m, int l, int r) {
		
		// l�� r���� Ŀ���� ������ �迭�� 1�� �����̹Ƿ� ����Լ� ������
		if(l >= r)
			return;
		
		// ��Ƽ�ǿ��� ���� ����
		int pivot = partition(m,l,r);
		
		// �Ǻ� ���� �迭�� ������ ������
		quickSort(m, l, pivot - 1);
		// �Ǻ� ���� �迭�� �������� ����
		quickSort(m, pivot + 1, r);
	}

	
	public void sort(int[] m) {
		quickSort(m, 0, m.length - 1);
		name = "�� ����";
		printArray(m);
	}
}
