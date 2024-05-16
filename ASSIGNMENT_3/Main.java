package Q12;
import java.util.PriorityQueue;

public class Main {
	public static void createMinHeap(int arr[],PriorityQueue<Integer> minHeap) {
		for(int element:arr) {
			minHeap.offer(element);
		}
		
		System.out.println(minHeap);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int array[]= {6551,152565,46810,9387,7648,368546,488,6468,555,45};
		PriorityQueue<Integer> minHeap=new PriorityQueue<>();
		
		createMinHeap(array,minHeap);
		
		while(!minHeap.isEmpty()) {
			System.out.print(minHeap.poll()+" ");
		}
		
	}

}
