public class LogicalOperatorTest {
  public static void main(String[] args) {
     boolean a = true;
     boolean b = false;
     boolean c = true;
     boolean d = false;
     System.out.println("a = " + a+",b = " + b);
     System.out.println("c = " + c+",d = " + d);
     System.out.println("a && b = " + (a&&b));
     System.out.println("a && c = " + (a&&c));
     System.out.println("b && d = " + (b&&d));
     System.out.println("a || b = " + (a||b) );
     System.out.println("a || c = " + (a||c) );
     System.out.println("b || d = " + (b||d) );
     System.out.println("!(a && b) = " + !(a && b));
     System.out.println("!(a && c) = " + !(a && c));
     int x = 5;
     boolean y = (x<4)&&(x++<10);
     System.out.println("使用短路逻辑运算符&&的结果为"+y);
     System.out.println("x的结果为"+x);


  }
}
