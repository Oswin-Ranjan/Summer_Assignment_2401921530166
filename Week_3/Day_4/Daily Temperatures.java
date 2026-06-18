class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> helperStack=new Stack<>();
        int n=temperatures.length;
        int[] result=new int[n];
        for(int i=n-1;i>=0;i--) {
            // Popping all indices with a lower or equal temperature than the current index
            while(!helperStack.isEmpty() && temperatures[i]>=temperatures[helperStack.peek()]) {
                helperStack.pop();
            }
            // If the stack still has elements, then the next warmer temperature exists!
            if(!helperStack.isEmpty()) {
                result[i]=helperStack.peek()-i;
            }
            // Inserting current index in the stack
            helperStack.push(i);
        }
        return result;
    }
}