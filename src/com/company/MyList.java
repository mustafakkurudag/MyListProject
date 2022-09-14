package com.company;

public class MyList<T> {
    private int capacity;
    private Object[] oArray;

    public MyList() {
        this.capacity = 10;
        this.oArray = new Object[capacity];
    }

    public MyList(int customCapacity) {
        if (customCapacity > 0) {
            this.setCapacity(customCapacity);
            this.oArray = new Object[capacity];
        }
    }

    public int size() {
        int counter = 0;
        for (Object o: this.oArray) {
            if (o == null)
                break;
            counter++;
        }
        return counter;
    }

    public void add(T data) {
        if (this.size() == this.oArray.length) {
            this.oArray = increaseCapacity(this.oArray);
        }
        for (int i = 0; i < this.oArray.length; i++) {
            if (this.oArray[i] == null) {
                this.oArray[i] = data;
                break;
            }
        }
    }

    public Object[] increaseCapacity(Object[] objArray) {
        Object[] temp = new Object[objArray.length*2];
        for (int i = 0; i < objArray.length; i++) {
            temp[i] = objArray[i];
        }
        this.setCapacity(temp.length);

        return temp;
    }

    public T get(int index) {
        for (int i = 0; i < this.oArray.length; i++) {
            if (i == index) {
                return (T) this.oArray[i-1];
            }
        }
        return null;
    }

    public String getoArray() {
        String startStr = "[";
        String endStr = "]";
        StringBuilder centralStr = new StringBuilder();
        for (int i = 0; i < this.oArray.length; i++) {
            if (this.oArray[i+1] == null) {
                centralStr.append(this.oArray[i]);
                break;
            } else
                centralStr.append(this.oArray[i]).append(", ");
        }
        return startStr + centralStr + endStr;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
