class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
      int count = 0; 
    
        int[] inDegree = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) {
            inDegree[prerequisites[i][0]]++;
        }
        LinkedList<Integer> stack = new LinkedList<>();
        for(int i= 0; i < inDegree.length; i++) {
            if(inDegree[i] == 0) {
                stack.push(i);
            }
        }
        while(!stack.isEmpty()) {
            int temp = stack.pop();
            count++;
            for(int i = 0; i < prerequisites.length; i++) {
                if( prerequisites[i][1] == temp) {
                    inDegree[prerequisites[i][0]]--;
                    if(inDegree[prerequisites[i][0]] == 0) {
                         stack.push(prerequisites[i][0]);
                    }
                }
            }
        }
        
      return count == numCourses;
    }
}


//https://www.youtube.com/watch?v=0LjVxtLnNOk
