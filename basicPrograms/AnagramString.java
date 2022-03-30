package basicPrograms;

public class AnagramString {

	public static void main(String[] args) {
		String str1 = new String("aab");
		String str2 = new String("abc");
		boolean isAnagram = false;
		boolean visited[] = new boolean[str2.length()];
		
		if(str1.length() == str2.length()) {
			for(int i=0; i<str1.length(); i++) {
				char c = str1.charAt(i);
				isAnagram = false;
				for(int j=0; j<str2.length(); j++) {
					if(str2.charAt(j) == c && !visited[j]) {
						visited[j] = true;
						isAnagram = true;
						break;
					}
				}
				if(!isAnagram) {
					break;
				}
			}
		}
		
		
		if(isAnagram) {
			System.out.println("both are anagram.");
		}else {
			System.out.println("both are not anagram");
		}
	}

}
