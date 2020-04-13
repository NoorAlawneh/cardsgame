package Main;

import java.util.ArrayList;
import java.util.Iterator;

public class Queue<T> implements Iterable<T>{
    private class implementation<T> implements Iterator<T>{
        private int nextIndex;
        private int lastIndex;

        public implementation(){
            nextIndex=0;
            lastIndex=-1;
        }
        public boolean hasNext(){
            boolean res=false;
            if(nextIndex!=queue.size())
                res=true;
            return res;
        }
        public T next(){
            lastIndex=nextIndex;
            nextIndex++;
            return (T) queue.get(lastIndex);
        }
    }
    private ArrayList<T> queue;
    Queue(){
        queue=new ArrayList();
    }

    public void push(T val){
        queue.add(val);
    }
    public T pop(){
        T r =queue.get(0);
        queue.remove(0);
        return r;
    }
    public boolean Empty(){
        boolean res=false;
        if(queue.size()==0)
            res=true;
        return res;
    }
    public Iterator<T> iterator() {
        return new implementation();
    }
}


