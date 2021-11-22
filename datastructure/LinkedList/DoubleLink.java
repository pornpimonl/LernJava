package datastructure.LinkedList;

public class DoubleLink {
    private Object item;
    private DoubleLink next;
    private DoubleLink precode;
    public DoubleLink(){
        next = null;
        precode = null;
    }
    public DoubleLink(Object newItem){
        item = newItem;
        next = null;
        precode = null;
    }
    public DoubleLink(Object newItem,DoubleLink nextNode,DoubleLink precodeNode){
        item = newItem;
        next = nextNode;
        precode = precodeNode;
    }
    public void setItem(Object newItem){
        item = newItem;
    }
    public Object getItem(){
        return item;
    }
    public void setNext(DoubleLink nextNode){
        next = nextNode;
    }
    public DoubleLink getNext(){
        return next;
    }
    public void setPrecode(DoubleLink precodeNode){
        precode = precodeNode;
    }
    public DoubleLink getPrecode(){
        return precode;
    }
}
