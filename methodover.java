public class Main {
 public static void main(String[] args) {
 addition obj1=new addition();
 obj1.disp(10,20);
 obj1.disp(10,45.40f);
 }
}
class addition {
 void disp(int a,int b) {
 int x=a,y=b;
 int z= x+y;
 System.out.println("addition: " + z);
 }
 void disp(int a,float b) {
 int x=a;
 float y=b;
 float z= x*y;
 System.out.println("Multi: " + z);
 }
}