package org.pattern.interator;

/**
 * 测试
 *
 * @author chengchaochao
 * @date 2020/12/15 17:10
 */
public class Test {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf(3);
        bookShelf.append(new Book("设计模式1"));
        bookShelf.append(new Book("设计模式2"));
        bookShelf.append(new Book("设计模式3"));
        Iterator<Book> iterator = bookShelf.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}
