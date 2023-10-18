import java.util.ArrayList;
import java.util.Scanner;

class Library{
    private ArrayList<String> avail_book=new ArrayList<>();
    private ArrayList<String> issue_book=new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    public Library(){
        avail_book.add("Don Quixote");
        avail_book.add("Lord of the Rings");
        avail_book.add("Harry Potter and the Sorcerer's Stone");
        avail_book.add("And Then There Were None");
        avail_book.add("Alice's Adventures in Wonderland");
        avail_book.add("The Lion, the Witch, and the Wardrobe");
        avail_book.add("Pinocchio");
        avail_book.add("Catcher in the Rye");
    }
    public void addBook(){
        System.out.println("Enter the book you want to add to library : ");
        String available=sc.nextLine();
        avail_book.add(available);
        System.out.println("Book added !!!!!!\n");
    }
    public void issueBook(){
        System.out.println("Enter the name of book you want to issue :");
        String issue= sc.nextLine();
        avail_book.remove(issue);
        issue_book.add(issue);
        System.out.println("BOOK ISSUED !!!!!\n");
    }

    public void returnBook(){
        System.out.println("Enter book which you want to return :");
        String returns = sc.nextLine();
        avail_book.add(returns);
        issue_book.remove(returns);
        System.out.println("Book returned !!!!");
    }
    public void showAvailableBooks(){
        System.out.println("Available books :");
        System.out.println(avail_book);
    }
    public void showIssuedBooks(){
        System.out.println("Issued books are :");
        System.out.println(issue_book);
    }
}
public class Tut_51_Exercise4 {
    public static void main(String[] args) {
        System.out.println("\t\t\tWELCOME !!!!!!!!!!");
        int ch = 0;
        Scanner sc = new Scanner(System.in);
        Library l=new Library();
        while (ch != 6) {
            System.out.println("***** MENU *****");
            System.out.println("1.Issue a book");
            System.out.println("2.Return a book");
            System.out.println("3.Add a book");
            System.out.println("4.Show available books");
            System.out.println("5.Show issued books");
            System.out.println("6.Exit");
            System.out.println("Enter your choice :");
            ch=sc.nextInt();
            switch (ch){
                case 1:
                    l.showAvailableBooks();
                    l.issueBook();
                    break;
                case 2:
                    l.returnBook();
                    break;
                case 3:
                    l.addBook();
                    break;
                case 4:
                    l.showAvailableBooks();
                    break;
                case 5:
                    l.showIssuedBooks();
                    break;
                case 6:
                    System.out.println("EXIT .....");
                    break;
            }
        }
    }
}
//
// OUTPUT :
//
/*
			WELCOME !!!!!!!!!!
***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
1
Available books :
[Don Quixote, Lord of the Rings, Harry Potter and the Sorcerer's Stone, And Then There Were None, Alice's Adventures in Wonderland, The Lion, the Witch, and the Wardrobe, Pinocchio, Catcher in the Rye]
Enter the name of book you want to issue :
Don Quixote
BOOK ISSUED !!!!!

***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
4
Available books :
[Lord of the Rings, Harry Potter and the Sorcerer's Stone, And Then There Were None, Alice's Adventures in Wonderland, The Lion, the Witch, and the Wardrobe, Pinocchio, Catcher in the Rye]
***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
5
Issued books are :
[Don Quixote]
***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
2
Enter book which you want to return :
Don Quixote
Book returned !!!!
***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
4
Available books :
[Lord of the Rings, Harry Potter and the Sorcerer's Stone, And Then There Were None, Alice's Adventures in Wonderland, The Lion, the Witch, and the Wardrobe, Pinocchio, Catcher in the Rye, Don Quixote]
***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
5
Issued books are :
[]
***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
3
Enter the book you want to add to library :
Harry Potter and Chamber of Secrets
Book added !!!!!!

***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
4
Available books :
[Lord of the Rings, Harry Potter and the Sorcerer's Stone, And Then There Were None, Alice's Adventures in Wonderland, The Lion, the Witch, and the Wardrobe, Pinocchio, Catcher in the Rye, Don Quixote, Harry Potter and Chamber of Secrets]
***** MENU *****
1.Issue a book
2.Return a book
3.Add a book
4.Show available books
5.Show issued books
6.Exit
Enter your choice :
6
EXIT .....

 */