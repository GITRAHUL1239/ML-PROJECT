
class A
{
void f1 ()
{
System.out.println("f1() of class A ");
}
}
class B extends A
{
void f2()
{
System.out.println("f2 () of class B");
}
}
class C extends B 
{
void f3 ()
{
System.out.println("f3() of class C ");
}
}
class DemoHierarchy 
{
public static void main (String arrgs[])
{
B obj= new B ();
C obj1 = new C();
obj.f1 ();
obj.f2 ();
obj1.f3 ();
}
}