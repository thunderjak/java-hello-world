public class OperationTest {
 
  public static void main(String[] args) {
     int a = 10;
     int b = 20;
     int c = 25;
     int d = 25;
     System.out.println("(a，b，c，d): (" +a+","+b+","+c+","+d+")" );
     System.out.println("a + b = " + (a + b) );
     System.out.println("a - b = " + (a - b) );
     System.out.println("a * b = " + (a * b) );
     System.out.println("b / a = " + (b / a) );
     System.out.println("b % a = " + (b % a) );
     System.out.println("c % a = " + (c % a) );
     System.out.println("a++   = " +  (a++) );
     System.out.println("a--   = " +  (a--) );
     System.out.println("a = " +  a );
     // 查看  d++ 与 ++d 的不同
     System.out.println("d++   = " +  (d++) );
     System.out.println("++d   = " +  (++d) );
     a =5;b= 5;
     int x = 2*++a;
     int y = 2*b++;
     System.out.println("自增运算符前缀++a运算后a="+a+",x=2*++a="+x);
     System.out.println("自增运算符后缀b++运算后b="+b+",y=2*b++="+y);
  }
}
