public class ReverseWordsInSentence {
    public static void main(String[] args) {
    }

    public static String reverseWords(char[] sentence) {
        reverseString(sentence, 0, sentence.length - 1);
        int start = 0;
        int end = 0;
        while (end < sentence.length) {
            if (sentence[end] == ' ') {
                reverseString(sentence, start, end - 1);
                start = end + 1;
            }
            end++;
        }
        reverseString(sentence, start, end - 1);
        String string = new String(sentence);
        return string;
    }

    public static void reverseString(char[] sentence, int start, int end) {
        while (start < end) {
            char temp = sentence[start];
            sentence[start] = sentence[end];
            sentence[end] = temp;
            end--;
            start++;
        }
    }
}