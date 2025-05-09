import java.util.*; 
public class fibonaccisequence{
public static void main(String[] args){
int n=10;

System.out.println("using recursive function:");
for (int i=1;i<=n;i++){
int fibrecursive = fibonaccirecursive(i);
System.out.println("fibonacci("+ i +") = " + fibrecursive);
}
System.out.println("\nusing non-recursive function:");
for (int i=1;i<=n;i++){
int fibnonrecursive = fibonaccinonrecursive(i);
System.out.println("fibonacci("+ i +")=" + fibnonrecursive);
   }
}
public static int fibonaccirecursive(int n){
if (n<=2){
return 1;
}else{
return fibonaccirecursive(n-1) + fibonaccirecursive(n-2);
}
}
public static int fibonaccinonrecursive(int n){
if (n<=2) {
return 1;
}else {
int fib1 = 1;
int fib2 = 1;
int fibN = 0;

for(int i = 3; i<=n;i++){
fibN = fib1+fib2;
fib1 = fib2;
fib2 = fibN;
}
return fibN;
}
}
}