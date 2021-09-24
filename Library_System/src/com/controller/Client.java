package com.controller;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import com.dao.BookDaoImplementation;
import com.model.Book;
import com.model.Member;
import com.service.BookServiceImplementation;
import com.service.MemberService;
import com.service.MemberServiceImplementation;
import com.service.BookService;

public class Client {


	public static void main(String[] args) {
		String str;
	BookService bookService = new BookServiceImplementation();
	MemberService memberService = new MemberServiceImplementation();
	do
	{
	Scanner scanner=new Scanner(System.in);
	System.out.println("______________________________________________________________");
	System.out.println("");
	System.out.println("");
	System.out.println("                         JUST BOOKS                         \n");
	System.out.println("______________________________________________________________");
	System.out.println("1.  Book_Details"+"\n"+"2.  Add_Book"+"\n"+"3.  Delete_Record"+"\n"+"4.  Update_Record"+"\n"+"5.  Member_Details"+"\n"+"6.  Add_Member"+"\n"+"7.  Delete_Member"+"\n"+"8.  Calculate Fine Of Member");
	System.out.println("______________________________________________________________");
	System.out.println("\nPlease Enter Assigned Numbers To Record To Perform Operations ");
	int choice = scanner.nextInt();
	System.out.println("______________________________________________________________");
	List<Book> bookList=bookService.getAllBooks();
	Iterator<Book> itr=bookList.iterator();
	List<Member> memberList=memberService.getAllMembers();
	Iterator<Member> itr1 =memberList.iterator();

	switch(choice)
	{
	case 1:
	System.out.println(">>>>>>>>>>>>>>>>>>>>>.All Book Details.<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println("______________________________________________________________");
	while (itr.hasNext()) {
		Book book = (Book) itr.next();
		System.out.println("book_id:- "+ book.getBook_id());
		System.out.println("book_name:- "+ book.getBook_name());
		System.out.println("book_price:- "+ book.getBook_price());
		System.out.println("author_id:- "+ book.getAuthor_id());
		System.out.println("category_id:- "+ book.getCategory_id());
		System.out.println("\n");
		System.out.println("______________________________________________________________");
	}
	
	break;
	case 2:
		System.out.println("To Add Book In library Please Fill The Below Necessary Fields");
		System.out.println("______________________________________________________________");
		System.out.println("Fill Up Book ID");
		int book_id = scanner.nextInt();
		System.out.println("______________________________________________________________");
		System.out.println("Fill Up Book Name");
		String book_name = scanner.next();	
		System.out.println("______________________________________________________________");
		System.out.println("Fill Up Book Price");
		int book_price = scanner.nextInt();
		System.out.println("______________________________________________________________");
		System.out.println("Fill Up Author ID");
		int author_id = scanner.nextInt();	
		System.out.println("______________________________________________________________");
		System.out.println("Fill Up Category_Id");
		int category_id = scanner.nextInt();
		System.out.println("______________________________________________________________");
	 Book book= new Book( book_id,book_name,book_price,author_id,category_id);
	 int status=bookService.addBook(book);
	    if(status>0) {
	    	System.out.println("Book Added Sucessfully.....");
	    	System.out.println("______________________________________________________________");
	    }else {
	    	System.out.println("Unable To Add Book.........");
	    	System.out.println("______________________________________________________________");
	    }
	break;
	
case 3:
	System.out.println("Fill Fields To Delete Book");
	System.out.println("______________________________________________________________");
	System.out.println("Fill Book ID");
	
	int book_id1 = scanner.nextInt();
	System.out.println("______________________________________________________________");
int status1=bookService.deleteBook(book_id1);
       	
    if(status1>0) {
    	System.out.println("Book Delete Sucessfully.....");
    	System.out.println("______________________________________________________________");
    }else {
    	
    	System.out.println("Unable to Delete Book......");
    	System.out.println("______________________________________________________________");
    }
break;
	

	case 4:
		System.out.println("Fill Details To Update Below Mention Field");
	int book_id2 = scanner.nextInt();
	System.out.println("______________________________________________________________");
	System.out.println("Enter Book Price To Update");
	int book_price1 = scanner.nextInt();
	System.out.println("______________________________________________________________");
	System.out.println("Enter Category Id To Update");
	int category_id1= scanner.nextInt();
	System.out.println("______________________________________________________________");
	int book1	=bookService.updateBook (book_id2, book_price1, category_id1);

    if(book1 >0) {
    	System.out.println("Books Fields Update Sucessfully.....");
    	System.out.println("______________________________________________________________");
    }else {
    	System.out.println("Unable To Update Book Details......");
    	System.out.println("______________________________________________________________");
    }
break;
	
	case 5:
		
	System.out.println(">>>>>>>>>>>>>>>>>>>>>All Member Details<<<<<<<<<<<<<<<<<<<<<<<");
	System.out.println("______________________________________________________________");
	while (itr1.hasNext())
	{
		Member member = (Member) itr1.next();
		System.out.println("member_id:- "+ member.getMember_id());
		System.out.println("member_name:- "+ member.getMember_name());
		System.out.println("______________________________________________________________");
	}
	
	break;
	case 6:
		System.out.println("ADD Member");
		System.out.println("Please Asign Member ID");
		int member_id = scanner.nextInt();
		System.out.println("Fill Member Name");
		String member_name = scanner.next();
	       	Member member = new Member(member_id,member_name);
	       	int status3=memberService.addMember(member);
	       	if(status3>0)
	       	{
	       		System.out.println("Member Added Sucessfully.....");
		    }else {
		    	System.out.println("Unable To Add Member.........");
		    }
	       	break;
	case 7:

	
	System.out.println("Delete Member In Record");
	System.out.println("______________________________________________________________");
	System.out.println("Enter Member ID To Delete Member In Record");
	int member_id1 = scanner.nextInt();
	System.out.println("______________________________________________________________");
	int status4=memberService.deleteMember(member_id1);
       	
    if(status4>0) {
    	System.out.println("Member Delete sucessfully.....");
    	System.out.println("______________________________________________________________");
    }else {
    	System.out.println("Unable to Member book......");
    	System.out.println("______________________________________________________________");
    }
break;
	
	case 8:
		System.out.println(" Calculate Fine Of Member");
		System.out.println("______________________________________________________________");
		System.out.println("Enter member id");
		int member_id2 = scanner.nextInt();
		System.out.println("______________________________________________________________");
	      memberService.dateDiff(member_id2);
			
		break;
	}
	System.out.println("Do you Want Perform More Opretions yes / no");
	str=scanner.next();
	System.out.println("______________________________________________________________");
	}
	while(str.equals("YES")||str.equals("yes"));
	
	}
}