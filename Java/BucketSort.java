import java.util.ArrayList;
import java.util.Collections;

public class BucketSort extends Sorting {
	
	// 해쉬 함수: 몇번째 버킷에 들어갈건지 찾음. 즉 버킷의 인덱스를 리턴
	private static int hash(int num){
		int a =  num/10;
		return a;
	}

	void bucketSort(int[] m) {

		// 버킷을 몇개 만들지 알기위해 제일 큰 숫자를 찾기
		int numOfBuckets = getMax(m) + 1;

	    // 리스트를 사용하여 버킷 만들기
		@SuppressWarnings("unchecked")
		ArrayList<Integer>[] buckets = new ArrayList[numOfBuckets];

		// 버킷에안에 요소들이 들어갈 공간 만들기
		for(int i = 0; i < numOfBuckets; i++)
			buckets[i] = new ArrayList<Integer>();

		// 각 요소들을 해당하는 버킷에 넣기
		for(int i = 0; i < m.length; i++)
			buckets[hash(m[i])].add(m[i]);

		// 각 버킷 정렬하기. 벡터는 collection.sort 라이브러리로 정렬가능
		for (int i = 0; i < numOfBuckets; i++)
			Collections.sort(buckets[i]);

	    // 요소들을 버킷안에서 꺼내서 합치기
		int index = 0;
		for (int i = 0; i < numOfBuckets; i++) {
			for (int j = 0; j < buckets[i].size(); j++) {
				m[index++] = buckets[i].get(j);
			}
		}
	}
	
	public void sort(int[] m) {
		bucketSort(m);
		name = "버킷 정렬";
		printArray(m);
	}
}
