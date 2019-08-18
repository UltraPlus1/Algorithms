/**
 * 选择排序
 */
public class SelectionSort {
	/**
	 * 选择排序
	 * 时间复杂度 n^2
	 * 空间复杂度 1
	 * @param arr
	 */
	public static void selectionSort(int[] arr){
		int length = arr.length;
		int M ;
		int index;
		for(int i=0;i<length;i++){
			M = Integer.MAX_VALUE;
			index = i;
			for(int j=i;j<length;j++){
				if(M > arr[j]){
					M = arr[j];
					index = j;
				}
			}//选择过程
			if(i!=index)
				Tools.swap(arr,i,index);//交换过程
		}
	}
}
