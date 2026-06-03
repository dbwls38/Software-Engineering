//이클립스 워크 스페이스를 open 해야한다. 
//내용을 변경하고 COMMIT 및 PUSH를 해야한다. 
//북매니저 패키지 commit 
package BookManager;

import java.util.ArrayList;
import java.util.List;

public class BookManagerClass {
    private List<String> books = new ArrayList<>();

    // ADD BOOK
    public void addBook(String title) {
        books.add(title);
    }

    // DELETE BOOK
    public boolean removeBook(String title) {
        return books.remove(title);
    }

    // SEARCH BOOK
    public List<String> getBooks() {
        return new ArrayList<>(books);
    }
}
