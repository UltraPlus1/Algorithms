public class BinarySearch {
	/**
	 * 二分查找 寻找一个数
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int binarySearch(int[] nums,int target){
		int length = nums.length;
		int left = 0;
		int right = length-1;// 注意 该算法左右均为闭区间
		int mid ;
		while (left<=right){
			mid = (int)(left+right)/2;
			if(nums[mid]==target)return mid;
			else if(target>nums[mid])left = mid+1;//注意
			else if(target<nums[mid]) right = mid-1;//注意
		}
		return -1;
	}

	/**
	 * 寻找左侧边界的二分搜索
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int LowerBinarySearch(int[] nums,int target){
		if(nums.length==0)return -1;
		int left = 0;
		int right = nums.length;//注意 该算法为左闭右开区间
		int mid;
		while (left<right)//注意 左闭右开右边不能取
		{
			mid = (int)(left+right)/2;
			if(target==nums[mid])right = mid; //注意 向右边收缩
			else if(target>nums[mid])left = mid+1;
			else if(target<nums[mid]) right= mid;//注意 左闭右开
		}
		if(left==nums.length) return -1;//target 比所有的数都要大
		return target==nums[left]?left:-1;
	}

	/**
	 * 寻找右侧边界的二分搜索
	 * @param nums
	 * @param target
	 * @return
	 */
	public static int UpperBinarySearch(int[] nums,int target){
		int left = 0;
		int right = nums.length; //注意搜索区间 [left,right)
		int mid;
		while (left<right){
			mid = (int)(left+right)/2;
			if(nums[mid]==target) left = mid+1; //右侧搜索的精华
			else if(nums[mid]>target) right = mid; //
			else if(nums[mid]<target) left = mid+1;//这些是由左开右闭引起的
		}
		if(left==0)return -1;//target 比所有的数都要小
		return nums[left-1]==target?left-1:-1;
	}
}
