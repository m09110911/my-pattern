package org.pattern.interator;

/**
 * 书架(具体集合)
 *
 * @author cheng
 * @date 2020/12/16 10:07
 */
public class BookShelf implements Aggregate {

    private Book[] books;

    private int last = 0;

    public BookShelf(int maxSize) {
        this.books = new Book[maxSize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void append(Book book) {
        this.books[last++] = book;
    }

    public int getLength() {
        return last;
    }


    /**
     * 集合迭代器
     *
     * @return {@link Iterator}
     * @author chengchaochao
     * @date 2020/12/15 15:15
     */
    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
