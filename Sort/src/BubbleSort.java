/**
 * 冒泡排序
 */
public class BubbleSort {
	/**
	 * 冒泡排序
	 * 时间复杂度 n^2
	 * 空间复杂度 1
	 * @param arr
	 * @return
	 */
	public static void bubbleSort(int[] arr){
		if(arr.length<=1){
			return ;
		}else{
			boolean tag = true;
			for(int i=0;i<arr.length-1;i++){
				tag = true;
				for(int j=0;j<arr.length-i-1;j++){
					if(arr[j]>arr[j+1]){//冒泡过程
						tag = false;
						Tools.swap(arr,j,j+1);
					}
				}
				if(tag == true )return;
			}
			return ;
		}
	}

}
