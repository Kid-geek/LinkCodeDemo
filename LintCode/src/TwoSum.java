
/**
 * @author zh lintcode 1. 给一个整数数组，找到两个数使得他们的和等于一个给定的数 target。
 *         你需要实现的函数twoSum需要返回这两个数的下标, 并且第一个下标小于第二个下标。注意这里下标的范围是 1 到 n，不是以 0 开头。
 *
 */
public class TwoSum {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4 };
		int target = 2;
		int[] b = twoSum(a, target);
		System.out.println(b[0] + "  " + b[1]);
	}

	public static int[] twoSum(int[] numbers, int target) {
		int[] result = new int[2];
		for (int i = 0; i < numbers.length; i++) {
			for (int j = i + 1; j < numbers.length; j++) {
				if ((numbers[i] + numbers[j]) == target) {
					result[0] = i + 1;
					result[1] = j + 1;
				} else {
					continue;
				}
			}
		}

		return result;

	}
}
