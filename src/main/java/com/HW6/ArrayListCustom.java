package com.HW6;

import java.util.Arrays;

public class ArrayListCustom<E> {
    private static final Object[] EMPTY_ELEMENTDATA = {};
    private static final int MAX_ARRAY_SIZE = 2147483639;
    private final int INIT_SIZE = 10;
    private Object[] elementData;
    private int size;
    private int modCount;

    public ArrayListCustom() {
        this.elementData = EMPTY_ELEMENTDATA;
    }

    public ArrayListCustom(int initialArraySize){
        if(initialArraySize > 0){
            elementData = new Object[initialArraySize];
        } else if (initialArraySize == 0){
            elementData = EMPTY_ELEMENTDATA;
        } else {
            throw new IllegalArgumentException("size can not be " + initialArraySize);
        }
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public Object[] getElementData() {
        return elementData;
    }

    public E get(int index) {
        return (E) elementData[index];
    }

    public void add(E e){
        setArraySizeCheck(size + 1);
        elementData[size++] = e;
    }

    private void setArraySizeCheck(int minSize){
        if(elementData == EMPTY_ELEMENTDATA){
            minSize = INIT_SIZE;
        }
        if (minSize < 0){
            throw new OutOfMemoryError("you are out of int range");
        }
        boostArraySizeCheck(minSize);
    }

    private void boostArraySizeCheck(int minSize){
        modCount++;
        int newSize = elementData.length + (elementData.length >> 1);
        if (minSize > size){
            if (minSize < newSize){
                minSize = newSize;
            }
            elementData = Arrays.copyOf(elementData, minSize);
        }

    }
}
