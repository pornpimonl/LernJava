package datastructure.LinkedList;

public class DoubleLinkList {
    DoubleLink newNode;
    DoubleLink head;
    DoubleLink last;
    DoubleLink curr;
    DoubleLink prev1;
    DoubleLink prev2;
    public void add(Object newItem){
        if(head == null){
            newNode = new DoubleLink(newItem);
            last = newNode;
        }else{
            newNode = new DoubleLink(newItem,head,null);
            head.setPrecode(newNode);
            head = newNode;
        }
        head = newNode;
    }
    public boolean searchItem(Object item){
        curr = head;
        prev1 = null;
        boolean status = false;
        while(curr!=null){
            if(curr.getItem() == item){
                prev2 = curr.getNext();
                status = true;
                break;
            }else{
                prev1 = curr;
                curr = curr.getNext();
            }
        }
        return status;
    }
    public void delateNode(Object item){
        if(searchItem(item)){
            if(prev1 == null){
                head = curr.getNext();
                if(prev2 != null){
                    prev2.setPrecode(null);
                }
            }else if(prev2 == null){
                prev1.setNext(null);
                curr.setPrecode(null);
                last = prev1;
            }else{
                prev1.setNext(curr.getNext());
                prev2.setPrecode(curr.getPrecode());
            }
        }else{
            System.out.println("Not found");
        }
    }
    public void insert(Object iteminsert,Object newItem){
        newNode = new DoubleLink(newItem);
        if(searchItem(iteminsert)){
            prev2 = curr;
            if(prev1 == null){
                newNode.setNext(curr);
                curr.setPrecode(newNode);
                head = newNode;
            }else{
                newNode.setNext(prev1.getNext());
                prev1.setNext(newNode);
                newNode.setPrecode(prev2.getPrecode());
                prev2.setPrecode(newNode);
            }
        }else{
            if(head == null){
                newNode = new DoubleLink(newItem);
                last = newNode;
            }else{
                newNode = new DoubleLink(newItem,null,last);
                last.setNext(newNode);
                last = newNode;
            }
        }
    }
    public void showdata(){
        curr = head;
        while(curr!=null){
            System.out.print(curr.getItem()+" ");
            curr = curr.getNext();
        }
        if(head!=null){
            System.out.print(" backward : ");
            curr=last;
            while(curr!=null){
                System.out.print(curr.getItem()+" ");
                curr = curr.getPrecode();
            }
            System.out.println();
        }
    }
    public static void main(String[] args){
        DoubleLinkList linklist=new DoubleLinkList();
        linklist.add(9);
        linklist.showdata();
        linklist.add(10);
        linklist.showdata();
    }
}
