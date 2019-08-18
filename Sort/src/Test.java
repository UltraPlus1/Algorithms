import java.util.Scanner;
import java.util.Random;
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r = new Random();
		while (sc.hasNextInt()){
			int size = sc.nextInt();
			if(size==0){
				break;
			}
			int arr[]= new int[size];
			for(int i=0;i<size;i++){
				arr[i] = r.nextInt(1000);
				System.out.print(arr[i]+" ");
			}
			System.out.println();
			int[] arr2 = arr.clone();
			long begin1 = System.nanoTime();
			BubbleSort.bubbleSort(arr);
			long end1 = System.nanoTime();
			long begin2 = System.nanoTime();
			SelectionSort.selectionSort(arr2);
			long end2 = System.nanoTime();
			for(int item:arr){
				System.out.print(item+" ");
			}
			System.out.println();
			for(int item:arr2){
				System.out.print(item+" ");
			}
			System.out.println();
			System.out.println("冒泡排序时间："+(end1-begin1)+"纳秒");
			System.out.println("选择排序时间："+(end2-begin2)+"纳秒");
		}
	}
}
