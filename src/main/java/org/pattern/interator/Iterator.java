package org.pattern.interator;

/**
 * 迭代器接口
 *
 * @author cheng
 * @date 2020/12/16 10:05
 */
public interface Iterator<T> {

    /**
     * 判断是否有下一个元素
     *
     * @return {@link boolean}
     * @author cheng
     * @date 2020/12/16 10:05
     */
    boolean hasNext();

    /**
     * 获取下一个集合元素
     *
     * @param
     * @return {@link T}
     * @author cheng
     * @date 2020/12/16 10:06
     */
    T next();

}
