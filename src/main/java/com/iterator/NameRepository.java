package com.iterator;

/**
 * @desc :名称库
 * @author: zhoushengwen
 * @date: 2020/9/3
 **/
public class NameRepository implements Container {
    private String[] names = {"张三", "李四", "王五", "赵六", "孙七"};

    @Override
    public Iterator getIterator() {
        return new nameIterator();
    }


    public class nameIterator implements Iterator {
        private int index;

        @Override
        public boolean hasNext() {
            if (index < names.length)
                return true;
            return false;
        }

        @Override
        public Object next() {
            if (hasNext())
                return names[index++];
            return null;
        }
    }
}
