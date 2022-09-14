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
                return (T) this.oArray[i];
            }
        }
        return null;
    }

    public void remove(int index) {
        if (index < 0 || index > this.size()) {
            System.out.println("Yanlış indis değeri");
        } else {
            for (int i = 0; i <=index; i++) {
                if (i == index) {
                    for (int j = index; j < this.oArray.length - 1; j++ ) {
                        this.oArray[j] = this.oArray[j + 1];
                    }
                }
            }
        }
    }

    public void set(int index, T data) {
        if (get(index) != null) {
            for (int i = 0; i < this.size(); i++) {
                if (i == index) {
                    this.oArray[i] = data;
                }
            }
        }
    }

    public String toString() {
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

    public int indexOf(T data) {
        for (int i = 0; i < size(); i++) {
            if (this.oArray[i] == data) {
                return i;
            }
        }
        return -1;
    }

    public int lastIndexOf(T data) {
        int count = 0;
        for (int i = 0; i < size(); i++) {
            if (this.oArray[i] == data) {
                count++;
            }
        }
        if (count == 0)
            return -1;
        else if (count == 1) {
            return indexOf(data);
        } else {
            for (int i = size() - 1; i >= 0; i--) {
                if (this.oArray[i] == data) {
                    return i;
                }
            }
        }
        return count;
    }

    public boolean isEmpty() {
        if (size() == 0) {
            return true;
        } else {
            return false;
        }
    }

    public <T> T[] toArray() {
        T[] tArray = (T[]) new Object[size()];
        for (int i = 0; i < size(); i++) {
            tArray[i] = (T) this.oArray[i];
        }
        return tArray;
    }

    public void clear() {
        System.out.println(size());
        for (int i = 0; i < this.oArray.length; i++) {
            this.oArray[i] = null;
        }
    }

    public MyList<T> subList(int start, int finish) {
        MyList<T> sub = new MyList<>();
        for (int i = start; i < finish; i++) {
            sub.add((T) this.oArray[i]);
        }

        return sub;
    }

    public boolean contains(T data) {
        for (Object o : this.oArray) {
            if (o == data) {
                return true;
            }
        }
        return false;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}
