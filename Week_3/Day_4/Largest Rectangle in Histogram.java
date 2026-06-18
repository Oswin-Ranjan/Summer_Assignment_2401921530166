class Solution {
    public int largestRectangleArea(int[] heights) {
        Stack<Integer> st=new Stack<>();
        int maxArea=0,element,nse,pse,n=heights.length;
        for(int i=0;i<n;i++) {
            while(!st.empty() && heights[st.peek()]>heights[i]) {
                element=st.peek();
                st.pop();
                nse=i;
                pse=st.empty()?-1:st.peek();
                maxArea=(int)Math.max(heights[element]*(nse-pse-1),maxArea);
            }
            st.push(i);
        }
        while(!st.empty()) {
            nse=n;
            element=st.peek();
            st.pop();
            pse=st.empty()?-1:st.peek();
            maxArea=(int)Math.max(heights[element]*(nse-pse-1),maxArea);
        }
        return maxArea;
    }
}