public class InstanceCounter {
   private static int numInstances = 0;//私有静态变量
   protected static int getCount() {
      return numInstances;
   }//受保护的静态方法
 
   private static void addInstance() {
      numInstances++;
   }//私有的静态方法
 
   InstanceCounter() {
      InstanceCounter.addInstance();
   }
 
   public static void main(String[] arguments) {
      System.out.println("Starting with " +
      InstanceCounter.getCount() + " instances");
      for (int i = 0; i < 500; ++i){
         new InstanceCounter();
          }
      System.out.println("Created " +
      InstanceCounter.getCount() + " instances");
   }
}
