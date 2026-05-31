package BookManager;

import java.util.ArrayList;
import java.util.List;

public class BookManagerClass {
    private List<String> books = new ArrayList<>();

    // 책 추가
    public void addBook(String title) {
        books.add(title);
    }

    // 책 삭제
    public boolean removeBook(String title) {
        return books.remove(title);
    }

    // 책 목록 조회
    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
}
