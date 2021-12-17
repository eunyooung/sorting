public class RadixSort extends Sorting {
	
	private void countingSort(int[] m, int digit) {

		int n = getMax(m)+1;
		int[] counting = new int[n];
		int[] sorted = new int[m.length];
		
		for(int i = 0; i < m.length; i++)
			counting[(m[i] / digit) % 10]++;			

		for(int i = 1; i < counting.length; i++)
			counting[i] += counting[i - 1];
		
		for(int i = m.length - 1; i >= 0; i--) {
			int temp = m[i];
			sorted[counting[(temp / digit) % 10] - 1] = temp;
			counting[(temp / digit) % 10] -= 1;
		}
		System.arraycopy(sorted, 0, m, 0, m.length);
	}
	
	private void radixSort(int[] m) {
		
		// �迭���� �ִ� ���� ã�Ƽ� �ִ� �ڸ����� �˾ƾ���
		int max = getMax(m);
		for(int digit = 1; digit <= max; digit *= 10) {
			//  ī���� ������ �̿��Ͽ� �����ڸ� �� ���� ������ ���ư�
			countingSort(m, digit);
		}
	}
	
	public void sort(int[] m) {
		radixSort(m);
		name = "��� ����";
		printArray(m);
	}
}
