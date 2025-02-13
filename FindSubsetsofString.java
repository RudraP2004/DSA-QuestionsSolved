public class FindSubsetsofString {

    public static void findSubsets(String str, String ans, int i) {
        // Base case
        if (i == str.length()) {
            if (ans.length() == 0) {
                System.out.println("null");
            } else {
                System.out.println(ans);
            }
            return;
        }

        // Yes case: Include the current character
        findSubsets(str, ans + str.charAt(i), i + 1);

        // No case: Exclude the current character
        findSubsets(str, ans, i + 1);
    }

    public static void main(String args[]) {
        String str = "abc";
        findSubsets(str, "", 0); // Call the method here
    }
}
