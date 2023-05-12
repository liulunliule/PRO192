
public class MyString implements IString {

    @Override
    public int f1(String arg0) {
        int result = 0;
        arg0 = arg0.toLowerCase();
        String words[] = arg0.split(" ");
//		for (String string : words) {
//			if (string.endsWith("m") || string.endsWith("n")) {
//				result++;
//			}
//		}





//Hnam làm cái này
        for (int i = 0; i < words.length; i++) {
            if (arg0.contains("m") || arg0.contains("m")) {
                result++;
            }
        }

        return result;
    }

    @Override
    public String f2(String arg0) {
        // TODO Auto-generated method stub
        String result = "";
        String word[] = arg0.split("\\s");
        //find the longest word in the string
        int max = word[0].length();
        int position = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > max) {
                max = word[i].length();
                position = i;
            }
        }
        //reversing the word
        result = new StringBuilder(word[position]).reverse().toString();
        arg0 = arg0.replaceFirst(word[position], result);
        return arg0;
    }

}
