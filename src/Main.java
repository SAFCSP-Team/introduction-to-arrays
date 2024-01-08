public class Main {
    public static void main(String[] args) {
      int num[] = new int[10];
      int count = 1;
      for(int x = 0; x < 10; x++){
        num[x] = count;
        count++;
      }
      for(int y = 0; y < 10; y++){
        System.out.print(" " + num[y]);
      }
      System.out.println();
      num[1] = 12;
      for(int c = 0; c < 10; c++){
        System.out.print(" " + num[c]);
      } 
    }}
