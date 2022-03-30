package basicPrograms;

public class AnagramStringMethod2 {

	public static void main(String[] args) {
		String str1 = new String("aababac");
		String str2 = new String("abcaaab");
		boolean isAnagram = true;

		int a[] = new int[256];
		int b[] = new int[256];
		
		for(char c: str1.toCharArray()) {
			int index = (int) c;
			a[index]++;
		}
		for(char c: str2.toCharArray()) {
			int index = (int) c;
			b[index]++;
		}
		for(int i=0; i<256; i++) {
			if(a[i] != b[i]) {
				isAnagram = false;
			}
		}
		
		if(isAnagram) {
			System.out.println("both are anagram.");
		}else {
			System.out.println("both are not anagram.");
		}
	}

}
