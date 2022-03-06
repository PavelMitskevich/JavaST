package com.mitskevich.task1.entity;

import com.mitskevich.task1.observer.impl.CustomArrayObserver;
import com.mitskevich.task1.util.IdGenerator;
import com.mitskevich.task1.observer.impl.CustomArrayObservable;

import java.util.Arrays;

public class CustomArray extends CustomArrayObservable{
    private int[] array;
    private int arrayId;

    public CustomArray(int[] array) {
        this.array = array;
        arrayId = IdGenerator.generateId();
        Warehouse.getInstance().put(arrayId, new CustomArrayParameter());
        attach(new CustomArrayObserver());
        notifyObservers();
    }

    public CustomArray() {
        arrayId = IdGenerator.generateId();
        this.array = new int[0];
        Warehouse.getInstance().put(arrayId, new CustomArrayParameter());
        attach(new CustomArrayObserver());
        }

    public int[] getArray() {
        return Arrays.copyOf(array, array.length);
    }

    public void setArray(int... array) {
        this.array = array;
        attach(new CustomArrayObserver());
        notifyObservers();
    }

    public int getArrayId() {
        return arrayId;
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        CustomArray customArray = (CustomArray) obj;
        if (customArray.array == null || this.array == null) {
            return this.array == null && customArray.array == null;
        }
        if (customArray.array.length != this.array.length) {
            return false;
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != customArray.array[i]) {
                return false;
            }
        }
        return true;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("CustomArray{");
        sb.append("array=").append(Arrays.toString(array));
        sb.append(", arrayId=").append(arrayId);
        sb.append('}');
        return sb.toString();
    }
}
