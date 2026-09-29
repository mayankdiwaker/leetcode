
public class Solution {
    public String removeDuplicates(String s) {
        Deque<Character> deque = new ArrayDeque<>();
        
        for (char c : s.toCharArray()) {

            if (!deque.isEmpty() && deque.peekLast() == c) {
                deque.pollLast();
            } else {
               
                deque.offerLast(c);
            }
        }
        StringBuilder sb = new StringBuilder();
        for (char c : deque) {
            sb.append(c);
        }
        
        return sb.toString();
    }
}