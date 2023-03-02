public class LC_443_String_Compression {
    public int compress(char[] chars) {
        int n = chars.length;

        //Base Case - When there is only one char, we can compress in one way
        if (n == 1) {
            return 1;
        }

        //j is the fast pointer, index is the actual slow pointer to be returned.
        int j = 0, index = 0;

        while (j < n) {
            int count = 1;
            //Navigate until the characters are same
            while (j < (n - 1) && (chars[j] == chars[j + 1])) {
                count++;
                j++;
            }
            //Jump to the next character as the chars are not equal
            chars[index++] = chars[j++];

            //Add the Count to the input
            if (count > 1) {
                String countStr = String.valueOf(count);
                for (char c : countStr.toCharArray())
                    chars[index++] = c;
            }

        }
        return index;
    }
}
