package org.pattern.interator;

/**
 * 书架(具体)迭代器
 *
 * @author cheng
 * @date 2020/12/16 10:06
 */
public class BookShelfIterator implements Iterator<Book> {

    private BookShelf bookShelf;

    private int index = 0;


    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
    }

    /**
     * 判断是否有下一个元素
     *
     * @return {@link boolean}
     * @author cheng
     * @date 2020/12/16 10:06
     */
    @Override
    public boolean hasNext() {
        return bookShelf.getLength() > index;
    }

    /**
     * 获取下一个集合元素
     *
     * @param
     * @return {@link Book}
     * @author cheng
     * @date 2020/12/16 10:06
     */
    @Override
    public Book next() {
        return bookShelf.getBookAt(index++);
    }
}
