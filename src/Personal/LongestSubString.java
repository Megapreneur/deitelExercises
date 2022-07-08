package Personal;//package Personal;
//
//public class LongestSubstring {
//    private int count;
//    public void collectInput(String word) {
//        if(word.length() <= 15){
//            for (int i = 0; i < word.length(); i++) {
//                count = 0;
//                for (int j = 0; j < word.length(); j++) {
//                    if (word.== word[j])
//
//
//                }
//            }
//        }
//        else
//        {
//            System.out.println("The word entered is to long");
//        }
//    }
//
//    public int longestSubstring() {
//        return count;
//    }
//}


/**
 Coding Step
 1. Repeat the question in your own words
 2. Do you know the input and output / How do you want to represent your data
 3. Ask clarifying questions
 4. What edge cases have you thought about
 5. What is your approach (the first solution that comes to mind) ⇒ Write out the pseudocode & time & space complexity
 6. What is your second approach, **if available** ⇒ Write out the pseudocode & time & space complexity
 1. can you come up with something more efficient?
 2. can you come up with a different way of solving the problem (doesn't have to be more efficient)?
 7. Write the code for the approach you & your interviewer decide on
 1. Do not write code until you and your interviewer have agreed
 2. Once you and your interviewer have agreed, write the code (even if you think you have something more efficient - you can mention it later)
 8. Test the code
 1. Dry run
 2. Find the mistakes
 9. Sometimes the time & space complexity is not trivial (e.g.for backtracking problems), so you may want to leave it for last. Write out the time complexity of your solution here, if you don't have it
 **/


public class LongestSubString {
    public static int lengthOfLongestNonRepeatingSubString(String string){
        StringBuilder test = new StringBuilder();
        int maxLength = -1;
        if (string.length() == 0){
            return 0;
        }
        if (string.length() == 1){
            return 1;
        }
        StringBuilder longestSubString = new StringBuilder();

        for (char c: string.toCharArray()) {
            String currentChar = String.valueOf(c);

            if (test.toString().contains(currentChar)){
                test = new StringBuilder(test.substring(test.indexOf(currentChar)+1));
                System.out.println(test);
            }
            test.append(currentChar);

            if (test.length() > maxLength){
                maxLength = test.length();
                longestSubString = test;
            }
        }
        System.out.println("Longest Substring --> " + longestSubString);
        return maxLength;
    }
    public static void main(String[] args) {
        String s = "GeeksForGeeks";
        int max = lengthOfLongestNonRepeatingSubString(s);
        System.out.println(max);
    }
}