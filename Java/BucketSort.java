import java.util.ArrayList;
import java.util.Collections;

public class BucketSort extends Sorting {
	
	// �ؽ� �Լ�: ���° ��Ŷ�� ������ ã��. �� ��Ŷ�� �ε����� ����
	private static int hash(int num){
		int a =  num/10;
		return a;
	}

	void bucketSort(int[] m) {

		// ��Ŷ�� � ������ �˱����� ���� ū ���ڸ� ã��
		int numOfBuckets = getMax(m) + 1;

	    // ����Ʈ�� ����Ͽ� ��Ŷ �����
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[numOfBuckets];

		// ��Ŷ���ȿ� ��ҵ��� �� ���� �����
		for(int i = 0; i < numOfBuckets; i++)
			buckets[i] = new ArrayList<Integer>();

		// �� ��ҵ��� �ش��ϴ� ��Ŷ�� �ֱ�
		for(int i = 0; i < m.length; i++)
			buckets[hash(m[i])].add(m[i]);

		// �� ��Ŷ �����ϱ�. ���ʹ� collection.sort ���̺귯���� ���İ���
		for (int i = 0; i < numOfBuckets; i++)
			Collections.sort(buckets[i]);

	    // ��ҵ��� ��Ŷ�ȿ��� ������ ��ġ��
		int index = 0;
		for (int i = 0; i < numOfBuckets; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				m[index++] = buckets[i].get(j);
			}
		}
	}
	
	public void sort(int[] m) {
		bucketSort(m);
		name = "��Ŷ ����";
		printArray(m);
	}
}
