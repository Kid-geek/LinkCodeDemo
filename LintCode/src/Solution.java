
/**
 * @author zh
 *����һ���ַ����������ת�ַ����е�ÿ�����ʡ�
 *˵��:���ʵĹ��ɣ��޿ո���ĸ����һ������
�����ַ����Ƿ����ǰ������β��ո񣿿��԰��������Ƿ�ת����ַ����ܰ���
��δ����������ʼ�Ķ���ո��ڷ�ת�ַ����м�ո���ٵ�ֻ��һ��
 *
 */
public class Solution {
	public static void main(String[] args) {
		String a = "world";
		System.out.println(ReverSentence(a));
	}

	public static String ReverSentence(String s) {
		if (s.length() <= 0 || s.trim().equals("")) {
			return s;
		}
		StringBuffer strbuffer = new StringBuffer("");
		String[] strarr = s.split(" ");
		for (int i = strarr.length - 1; i > 0; i--) {
			strbuffer.append(strarr[i] + " ");
		}
		strbuffer.append(strarr[0]);
		return strbuffer.toString();
	}

}
