/**
 * 冒泡排序
 */
public class BubbleSort {
	/**
	 * 冒泡排序
	 * @param arr
	 * @return
	 */
	public static int[] bubbleSort(int[] arr){
		if(arr.length<=1){
			return arr;
		}else{
			for(int i=0;i<arr.length-1;i++){
				for(int j=0;j<arr.length-i-1;j++){
					if(arr[j]>arr[j+1]){
						swap(arr,j,j+1);
					}
				}
			}
			return arr;
		}
	}

	public static void swap(int[] arr,int indexA,int indexB){
		int tmp = arr[indexA];
		arr[indexA]= arr[indexB];
		arr[indexB]=tmp;
	}
}
