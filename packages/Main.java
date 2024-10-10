import library.books.Book;
import library.members.Member;
import library.transactions.Transaction;

public class Main {
    public static void main(String[] args) {
        // Create books
        Book book1 = new Book("the complete refrence", "h s", "1234567890");
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "0987654321");

        // Create members
        Member member1 = new Member("Ayush", "M001");
        Member member2 = new Member("Bob", "M002");

        // Perform transactions
        Transaction transaction1 = new Transaction(member1, book1, "Borrow");
        transaction1.execute(); // Alice borrows 1984

        Transaction transaction2 = new Transaction(member2, book1, "Borrow");
        transaction2.execute(); // Bob tries to borrow 1984

        Transaction transaction3 = new Transaction(member1, book1, "Return");
        transaction3.execute(); // Alice returns 1984

        // Member borrows the book again
        Transaction transaction4 = new Transaction(member2, book1, "Borrow");
        transaction4.execute(); // Bob borrows 1984
    }
}
