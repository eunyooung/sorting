public abstract class Sorting {
	
	public abstract void sort(int[] m);
	
	public String name = "원 배열";

	public void swap(int[] m, int i, int j) {
		
		int temp = m[i];
		m[i] = m[j];
		m[j] = temp;
	}

	public int getMax(int[] m) {
		
		int max = Integer.MIN_VALUE;
		for(int i = 0; i < m.length; i++)
			if(m[i] > max) max = m[i];
		return max;
	}
	
	public void printArray(int[] m) {
		
		System.out.print(name + " 결과: ");
		for(int i = 0; i < m.length; i++) {
			System.out.print(m[i]+" ");
		}
		System.out.println("\n");
	}

}
