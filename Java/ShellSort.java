public class ShellSort extends InsertionSort {

	private void shellSort(int[] m) {
		
		int n = m.length;
				
		// ���� ��� ������ �������� ���� �۾�����
		// ���� 1�϶� ����
		for(int gap = n/2; gap >= 1; gap /= 2) {
			
			// ���� ¦���� Ȧ���� ����
			if(gap % 2 == 0)
				gap++;
			
			// ���� ���� ����
			insertSort(m,gap);
		}
	}
	
	public void sort(int[] m) {
		shellSort(m);
		name = "�� ����";
		printArray(m);
	}
}
