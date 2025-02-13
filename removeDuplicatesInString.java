public class removeDuplicatesInString {

    public static void removeDuplicates(String str, int idx, StringBuilder newString, boolean map[]) {
        if(idx == str.length()) {
            System.out.println(newString);
            return;
        }
        //main logic
        char currChar = str.charAt(idx);
        if(map[currChar - 'a'] == true) {
            //duplicate
            removeDuplicates(str, idx+1, newString, map);
        } else {
            map[currChar - 'a'] = true;
            removeDuplicates(str, idx+1, newString.append(currChar), map);
        }
    }
    public static void main(String[] args) {
        String str = "RudraPrasad";
        removeDuplicates(str.toLowerCase(), 0, new StringBuilder(""), new boolean[26]);
    }
}
