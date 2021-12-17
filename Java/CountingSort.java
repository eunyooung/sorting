public class CountingSort extends Sorting {
	
	private void counting(int[] m) {

		// ī���� �迭�� ũ�� = �ִ� ������ ũ��
		int n = getMax(m)+1;
		int[] counting = new int[n];
		// ���ĵ� �迭
		int[] sorted = new int[m.length];
		
		// �迭�� ���� �ε����� �ϴ� counting �迭 �� ����
		for(int i = 0; i < m.length; i++)
			counting[m[i]]++;			
		
		// ���� ��
		for(int i = 1; i < counting.length; i++)
			counting[i] += counting[i - 1];
		
		// i��° ��Ҹ� �ε����� �ϴ� ī���� �迭�� �������� 1 ����
		// ī���� �迭�� �������� �ε����� �Ͽ� ���ĵ� �迭�� ����
		for(int i = m.length - 1; i >= 0; i--) {
			int temp = m[i];
			sorted[counting[temp] - 1] = temp;
			counting[temp] -= 1;
		}
		// �迭 ����
		System.arraycopy(sorted, 0, m, 0, m.length);
	}
	
	public void sort(int[] m) {
		counting(m);
		name = "��� ����";
		printArray(m);
	}
}
