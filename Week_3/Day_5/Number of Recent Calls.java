class RecentCounter {
    
    Queue<Integer> q;
    
    public RecentCounter() {
        q=new LinkedList();
    }

    public int ping(int t) {
        q.add(t);
        while(q.peek()<t-3000) {
            q.poll(); //retrieves and removes the element at the head(front) of the queue
        } 
        return q.size();
    }
}