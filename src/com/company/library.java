package com.company;
import java.util.*;
import java.util.ArrayList;
import java.lang.String;

//#navinkytr@21
class libtasks{
    public List<String> addBook(String bookname,List<String> booklist)
    {
        if(booklist.contains(bookname))
        {
            System.out.println("Book is already in the shelf");
            return booklist;
        }
        else
        {
            booklist.add(bookname);
            System.out.println("Book successfully added");
            return booklist;
        }
    }

    public List<String> borrowBook(String bookname,List<String> booklist)
    {
        if(booklist.contains(bookname))
        {
            booklist.remove(bookname);
            System.out.println("Thank you, visit again");
        }
        else
        {
            System.out.println("Sorry "+bookname+" book is not available.");
        }
        return booklist;
    }

    public List<String> returnBook(String bookname,List<String> booklist)
    {
        int id;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter th book id");
        id=sc.nextInt();
        booklist.add(id-1,bookname);
        System.out.println("Thank you book successfully returned");
        return booklist;
    }

    public void showAvailablebooks(List<String> booklist)
    {
        int i=1;
        for(String book:booklist)
        {
            System.out.print(i+"."+book+"  ");
            i++;
        }
        System.out.println();
    }

}

public class library {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        libtasks l=new libtasks();
        int choice;
        String bookname;
        String[] books={"GMAT","GATE","GRE","CAT","UPSC","XAT","MPSC"};
        List<String> booklist=new ArrayList<String>(Arrays.asList(books));
        while (true)
        {
            System.out.println("Choose your option :\n1.Add a book\n2.Borrow a book\n3.Return a book\n4.Show the available books\n5.Exit");
            choice=sc.nextInt();
            switch (choice)
            {
                case 1:
                    System.out.println("Enter the name of the book");
                    bookname=sc.next();
                    booklist=l.addBook(bookname,booklist);
                    break;

                case 2:
                    System.out.println("Enter the name of the book");
                    bookname=sc.next();
                    booklist=l.borrowBook(bookname,booklist);
                    break;

                case 3:
                    System.out.println("Enter the name of the book to return");
                    bookname=sc.next();
                    booklist=l.returnBook(bookname,booklist);
                    break;

                case 4:
                    l.showAvailablebooks(booklist);
                    break;

                case 5: return;
                default:
                    System.out.println("Please enter the correct choice");
                    break;
            }
        }
    }
}
