public class X8 {
 public static void main(String[] args) {

System.out.printf("%c %10c %5c %7c %5c %n", 'J','a', 'v', 'v', 'a');
System.out.printf("%c %11s %5c  %4c %7s %n", 'J', "a a", 'v', 'v', "a a" );
System.out.printf("%c %5c %6s %8s %10s %n", 'J','J', "aaaaa", "v v", "aaaaa");
System.out.printf("%5s %3c %5c %6c %6c %5c ", "J J", 'a', 'a', 'v', 'a', 'a');

  } // End Main

} // End Class

/*

J----------a---v-----v---a
J---------a-a---v---v---a-a
J----J---aaaaa---V-V---aaaaa
-J J----a-----a---V---a-----a

*/
