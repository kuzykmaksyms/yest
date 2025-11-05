public class Main {
   public static void main(String[] args) {
      // Write your solution here
       int v = 20;
       --v;
       System.out.println(v);
       System.out.println(v++);
       System.out.println("v = " + v);

       int s = 20;
       int t = s++ + --s;
       System.out.println("s = " + s);
       System.out.println("t = " + t);
   }
}