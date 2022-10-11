class Solution {
    public String interpret(String command) {
        return command.replace("G", "G").replace("()", "o").replace("(al)", "al");
    }
}