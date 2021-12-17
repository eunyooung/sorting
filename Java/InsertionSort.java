public class InsertionSort extends Sorting {
	
	protected void insertSort(int[] m, int diff) {
		
		// �ι�° �����ͺ��� �����̹Ƿ� i=1�������� ����
		for(int i = diff; i < m.length; i++) {
			int key = m[i];
			
			// j �� Ű���� ���� ������ �ε���
			int j = i - diff;
			
			// ������ ���� �ϳ��� Ű������ Ŭ������ ���ʷ� ��
			// �迭�� �ε����� 0���� ������ �������� �����Ƿ� �� �ߴ�
			while(j >= 0 && key < m[j]) {
				// ���� �ڷ� �б�
				m[j + diff] = m[j];
				j -= diff;
			}
			m[j + diff] = key;	
		}
	}
	
	public void sort(int[] m) {

		insertSort(m, 1);
		name = "���� ����";
		printArray(m);
	}
}
