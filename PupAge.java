public class PupAge{ 
   public void pAge(){
      int age = 0;
      //局部变量没有默认值，所以局部变量被声明后，必须经过初始化，才可以使用
      //int age; 声明后不赋值会报错
      age = age + 7;
      System.out.println("小狗的年龄是: " + age);
   }
   
   public static void main(String[] args){
      PupAge test = new PupAge();
      test.pAge();
   }
}
