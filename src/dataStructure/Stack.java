package dataStructure;

import java.util.LinkedList;
import java.util.List;

public class Stack {
    private final List values;


    public Stack(List value) {
        this.values = new LinkedList();
    }

    public void push(final Object obj){
        values.add(0, obj);
    }

    public Object pop(){
        if(values.size() == 0){
            return null;
        }

        return values.remove(0);
    }
}
