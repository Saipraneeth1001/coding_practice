class Process {
    int start;
    int end;
    int load;
    Process(int start, int end, int load) {
        this.start = start;
        this.end = end;
        this.load = load;
    }
}


public class MyClass {
    public static void main(String args[]) {
      Process[] process = new Process[5];
      // SORT THE ARRAY BASED ON THE END TIME.
      Arrays.sort(process, new Comparator<Process>() {
         @Override
         public int compare(Process p1, Process p2) {
             return p1.end - p2.end;
         }
      });
      int left = 0, right = 1,sum = process[0].load, max = Integer.MIN_VALUE;
      while(left < process.length && right < process.length) {
          if(left == right) right += 1;
          int currentEnd = process[left].end;
          int nextStart = process[right].start;
          if(currentEnd > nextStart) {
              sum += process[right].load;
              right += 1;
          } else {
              sum = Math.max(sum - process[left].load , 0);
              left += 1;
          }
          if(max < sum) {
              max = sum;
          }
      }
      return max;
    }
}
