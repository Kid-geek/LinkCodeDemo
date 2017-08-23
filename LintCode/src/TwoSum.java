
/**
 * @author zh lintcode 1. ��һ���������飬�ҵ�������ʹ�����ǵĺ͵���һ���������� target��
 *         ����Ҫʵ�ֵĺ���twoSum��Ҫ���������������±�, ���ҵ�һ���±�С�ڵڶ����±ꡣע�������±�ķ�Χ�� 1 �� n�������� 0 ��ͷ��
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
