class a
{
int a=10;

}

class b extends a
{
int a=20;
void show(int a)
{
System.out.println(a);
System.out.println(this.a);
System.out.println(super.a);
}
}
public class super_class
{
public static void main(String[] args) {
b obj1 = new b();
obj1.show(30);

}
}