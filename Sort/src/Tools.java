/**
 * 排序算法中常用的工具方法
 */
public class Tools {
	public static void swap(int[] arr,int indexA,int indexB){
		int tmp = arr[indexA];
		arr[indexA]= arr[indexB];
		arr[indexB]=tmp;
	}
}
