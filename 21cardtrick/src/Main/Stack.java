package Main;



import java.util.ArrayList;
import java.util.Iterator;


public class Stack<T> implements Iterable<T> {
    private class implementation<T> implements Iterator<T>{
        private int nextIndex;
        private int lastIndex;

        public implementation(){
            nextIndex=0;
            lastIndex=-1;
        }
        public boolean hasNext(){
            boolean res=false;
            if(nextIndex!=stack.size())
                res=true;
            return res;
        }
        public T next(){
            lastIndex=nextIndex;
            nextIndex++;
            return (T) stack.get(lastIndex);
        }
    }
    private ArrayList<T> stack;
    Stack(){
        stack=new ArrayList<T>();
    }

    public void push(T val){
        stack.add(val);
    }
    public T pop(){
        T r =stack.get(stack.size()-1);
        stack.remove(stack.size()-1);
        return r;
    }
    public boolean Empty(){
        boolean res=false;
        if(stack.size()==0)
            res=true;
        return res;
    }
    @Override
    public Iterator<T> iterator() {
        return new implementation();
    }

}

