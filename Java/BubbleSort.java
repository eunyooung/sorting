public class BubbleSort extends Sorting {
	
	private void bubbleSort(int[] m) {
		
		int n = m.length;
		
		// �ڷḦ �ϳ��ϳ� ���Ͽ� ��ȯ�ϸ鼭 �ڷḦ �����ϴ� �˰���
		for(int i = 0; i < n; i++) {
			// �� ȸ�� �� ���� ū ��Ұ� �ڷ� �̵��ϹǷ� �� �ڴ� ���Ŀ��� ����
			for(int j = 0; j < n - i - 1; j++) {
				if(m[j] > m[j + 1]) {
					swap(m, j, j + 1);
				}
			}
		}
	}
	
	public void sort(int[] m) {
		bubbleSort(m);
		name = "��ǰ ����";
		printArray(m);
	}
}
