
/**
 * @author zh
 *给定一个字符串，逐个翻转字符串中的每个单词。
 *说明:单词的构成：无空格字母构成一个单词
输入字符串是否包括前导或者尾随空格？可以包括，但是反转后的字符不能包括
如何处理两个单词间的多个空格？在反转字符串中间空格减少到只含一个
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
