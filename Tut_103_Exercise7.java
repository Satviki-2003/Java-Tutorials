import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

class MiniLibrary{
    ArrayList<String> books,issuedBooks,author,issuedAuthor;
    Scanner sc;
    String name,a,user,b;
    int index;
    Calendar c;
    public MiniLibrary(){
        books=new ArrayList<>();
        issuedBooks=new ArrayList<>();
        author=new ArrayList<>();
        issuedAuthor=new ArrayList<>();
        sc=new Scanner(System.in);
        c=Calendar.getInstance();

        books.add("Book1");
        author.add("a1");

        books.add("Book2");
        author.add("a2");

        books.add("Book3");
        author.add("a3");

        books.add("Book4");
        author.add("a4");

        books.add("Book5");
        author.add("a5");
    }
    public void displayBooks(){
        System.out.println("Available books :");
        for(String s:books){
            System.out.println(s);
        }
    }
    public void addBooks(){
        System.out.println("Enter name of book : ");
        name=sc.nextLine();
        System.out.println("Enter name of author : ");
        a= sc.nextLine();
        books.add(name);
        author.add(a);
    }
    public void bookInfo() {
        for (int i = 0; i < issuedBooks.size(); i++) {
            System.out.println("Name of book : ");
            System.out.println(issuedBooks.get(i));
            System.out.println("Author : ");
            System.out.println(issuedAuthor.get(i));
            System.out.println("Book issued on : " + c.get(Calendar.DATE) + "/" + c.get(Calendar.MONTH) + "/" + c.get(Calendar.YEAR));
            System.out.println("Book issued to : " + user);
            System.out.print("\n");
        }
    }
    public void issueBook(){
        System.out.println("Enter name of book : ");
        b= sc.nextLine();
        index=books.indexOf(b);
        books.remove(b);
        issuedBooks.add(b);
        String au=author.remove(index);
        issuedAuthor.add(au);
        System.out.println("Book issued successfully !!!!");
    }
    public void returnIssuedBook(){
        System.out.println("Enter name of book : ");
        b= sc.nextLine();
        books.add(b);
        author.add(issuedAuthor.get(0));
        issuedBooks.remove(b);
        issuedAuthor.remove(issuedAuthor.get(0));
        System.out.println("Book issued successfully !!!!");
    }
    public void Login(){
        System.out.println("Enter your name : ");
        user= sc.nextLine();
        System.out.println("Welcome "+user+" !!");
    }
}
public class Tut_103_Exercise7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MiniLibrary m=new MiniLibrary();

        int ch=0;
        while (ch != 7) {
            System.out.println("\t\tWELCOME TO LIBRARY MANAGEMENT SYSTEM");
            System.out.println("******************** MENU ********************");
            System.out.println("1.Login");
            System.out.println("2.Display books");
            System.out.println("3.Add books");
            System.out.println("4.Issue books");
            System.out.println("5.Display issued books");
            System.out.println("6.Return book");
            System.out.println("7.Exit");
            System.out.println("Enter your choice :");
            ch= sc.nextInt();
            switch (ch) {
                case 1 -> m.Login();
                case 2 -> m.displayBooks();
                case 3 -> m.addBooks();
                case 4 -> {
                    m.displayBooks();
                    m.issueBook();
                }
                case 5 -> m.bookInfo();
                case 6 -> m.returnIssuedBook();
                case 7 -> System.out.println("Exiting ....");
            }
        }
    }
}
/*
WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
1
Enter your name :
Satviki
Welcome Satviki !!
		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
2
Available books :
Book1
Book2
Book3
Book4
Book5
		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
3
Enter name of book :
Book7
Enter name of author :
a7
		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
2
Available books :
Book1
Book2
Book3
Book4
Book5
Book7
		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
4
Available books :
Book1
Book2
Book3
Book4
Book5
Book7
Enter name of book :
Book2
Book issued successfully !!!!
		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
5
Name of book :
Book2
Author :
a2
Book issued on : 19/10/2022
Book issued to : Satviki

		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
6
Enter name of book :
Book2
Book issued successfully !!!!
		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
2
Available books :
Book1
Book3
Book4
Book5
Book7
Book2
		WELCOME TO LIBRARY MANAGEMENT SYSTEM
******************** MENU ********************
1.Login
2.Display books
3.Add books
4.Issue books
5.Display issued books
6.Return book
7.Exit
Enter your choice :
7
Exiting ....

 */