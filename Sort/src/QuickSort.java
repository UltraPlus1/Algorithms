public class QuickSort {
	/**
	 * 快速排序
	 * @param array
	 * @param left
	 * @param right
	 */
	public static void quickSort(int[] array, int left, int right) {

		if (left >= right)
		{
			return;
		}//区间只有一个数 停止递归
		int index = PartSort(array, left, right);//枢轴的位置
		// index 的位置已经排好了
		quickSort(array, left, index - 1);
		quickSort(array, index + 1, right);
	}

	public static int PartSort(int[] array,int left,int right)
	{
		int key = left;//每次取区间中最左的数作为基准数
		//两个标尺，表示left左边的数都比它小 ，right 右边的数都比它大
		while(left < right)
		{
			//终止循环的两个条件
			//1.left==right 表示整个循环中 直到 index = left = right
			//都遵循 index 左边 比 key 小 ,index 右边 比 key
			//至于 index 当然 <= key 啊 因为 限制性 ++ left 啊
			//终止条件2
			// left 比 key 大，说明需要交换，停止循环
			while(left < right && array[left] <= array[key])
			{
				++left;
			}
			//与上面的同理
			while(left < right && array[right] >= array[key])
			{
				--right;
			}
			//交换
			Tools.swap(array,left,right);//自己写的交换函数
		}
		//交换 index 和 key 已经说明清楚了 key 比 index 大 见上面解释
		Tools.swap(array,left,key);
		return left;
	}
}
