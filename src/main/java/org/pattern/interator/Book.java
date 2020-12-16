package org.pattern.interator;

/**
 * 书籍(具体元素)
 *
 * @author cheng
 * @date 2020/12/16 10:07
 */
public class Book {

    private String name;

    public Book(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                '}';
    }
}
