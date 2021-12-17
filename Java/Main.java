import java.util.Scanner;

public class Main {
	static Scanner ss = new Scanner(System.in);

	// �迭 �ʱ�ȭ �ϸ� ���
	private static void init(int[] m) {

		for (int i = 0; i < m.length; i++) {
			m[i] = (int)(Math.random() * 45 + 1);
			System.out.print(m[i]+" ");
		}
		System.out.println("\n");
	}
	
	private static void menu(int[] m) {
		
		System.out.println("���� ����� �����ϼ���.");
		System.out.println("1. ��ǰ ����");
		System.out.println("2. ���� ����");
		System.out.println("3. �� ����");
		System.out.println("4. ���� ����");
		System.out.println("5. �� ����");
		System.out.println("6. ���� ����");
		System.out.println("7. ��Ŷ ����");
		System.out.println("8. �� ����");
		System.out.println("9. ��� ����");
		System.out.println("10. ��� ����");
		
		switch(ss.nextInt()) {
			case 1:
				BubbleSort bubble = new BubbleSort();
				bubble.sort(m);
				break;
			case 2:
				SelectionSort selection = new SelectionSort();
				selection.sort(m);
				break;
			case 3:
				QuickSort quick = new QuickSort();
				quick.sort(m);
				break;
			case 4:
				InsertionSort insert = new InsertionSort();
				insert.sort(m);
				break;
			case 5:
				HeapSort heap = new HeapSort();
				heap.sort(m);
				break;
			case 6:
				MergeSort merge = new MergeSort();
				merge.sort(m);
				break;
			case 7:
				BucketSort bucket = new BucketSort();
				bucket.sort(m);
				break;
			case 8:
				ShellSort shell = new ShellSort();
				shell.sort(m);
				break;
			case 9:
				CountingSort counting = new CountingSort();
				counting.sort(m);
				break;
			case 10:
				RadixSort radix = new RadixSort();
				radix.sort(m);
				break;
			default:
				System.out.println("���� �ȵ�");
		}
	}
	

	public static void main(String[] args) {
		
		System.out.println("�迭�� ũ�⸦ �Է����ּ���:");
		int n = ss.nextInt();
	
		int[] m = new int[n];
		init(m);
		menu(m);
	}
}
