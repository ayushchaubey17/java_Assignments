package library.transactions;

import library.books.Book;
import library.members.Member;

public class Transaction {
    private Member member;
    private Book book;
    private String transactionType; // "Borrow" or "Return"

    public Transaction(Member member, Book book, String transactionType) {
        this.member = member;
        this.book = book;
        this.transactionType = transactionType;
    }

    public void execute() {
        if ("Borrow".equalsIgnoreCase(transactionType)) {
            if (book.isAvailable()) {
                book.setAvailable(false);
                System.out.println(member.getName() + " borrowed " + book.getTitle());
            } else {
                System.out.println(book.getTitle() + " is currently not available.");
            }
        } else if ("Return".equalsIgnoreCase(transactionType)) {
            book.setAvailable(true);
            System.out.println(member.getName() + " returned " + book.getTitle());
        } else {
            System.out.println("Invalid transaction type.");
        }
    }
}
