package datastructure.LinkedList;
public class SinglyLinkList{
    Node newNode;
    Node head;
    Node curr;
    Node prev;
    public void add(Object newItem){
        if(head == null){
            newNode = new Node(newItem);
        }else{
            newNode = new Node(newItem,head);
        }
        head=newNode;
    }
    public boolean searchItem(Object item){
        curr = head;
        prev = null;
        boolean status = false;
        while(curr!=null){
            if(curr.getItem()==item){
                status = true;
                break;
            }else{
                prev=curr;
                curr=curr.getNext();
            }
        }
        return status;
    }
    public void deleteNode(Object item){
        if(searchItem(item)){
            if(prev == null){
                head = curr.getNext();
            }else{
                prev.setNext(curr.getNext());
            }
        }else{
            System.out.println("Not Found");
        }
    }
    public void insert(Object iteminsert, Object newItem){
        newNode = new Node(newItem);
        if(searchItem(iteminsert)){
            if(prev ==null){
                newNode.setNext(curr);
                head = newNode;
            }else{
                newNode.setNext(curr);
                prev.setNext(newNode);
            }
        }else{
            if(head == null){
                newNode.setNext(curr);
                head = newNode;
            }else if(curr == null){
                prev.setNext(newNode);
            }
        }
    }
    public void showdata(){
        curr = head;
        while(curr!=null){
            System.out.print(curr.getItem()+" ");
            curr = curr.getNext();
        }
        System.out.println();
    }
    public static void main(String[] args){
        SinglyLinkList linklist = new SinglyLinkList();
        linklist.add(9);
        linklist.showdata();
        linklist.add(10);
        linklist.showdata();
        // linklist.add(11);
        // linklist.add(12);
        // linklist.deleteNode(10);
        // linklist.deleteNode(12);
        // linklist.insert(11,15);
        // linklist.insert(11,17);
        // linklist.insert(18,19);
        // linklist.showdata();
    }
}