package datastructure.LinkedList;

public class CircularLinkList {
    Node newNode;
    Node head;
    Node lastNode;
    Node curr;
    Node prev;
    public void add(Object newItem){
        if(head==null){
            newNode = new Node(newItem);
            lastNode = newNode;
        }else{
            newNode = new Node(newItem,head);
        }
        lastNode.setNext(newNode);
        head = newNode;
    }
    public boolean searchItem(Object item){
        curr = head;
        prev = null;
        boolean status = false;
        do{
            if(curr.getItem() == item){
                status = true;
                break;
            }else{
                prev = curr;
                curr = curr.getNext();
            }
        }while(curr != head);
        return status;
    }
    public void deleteNode(Object item){
        if(searchItem(item)){
            if(prev==null){
                head = curr.getNext();
                lastNode.setNext(curr.getNext());
                curr.setNext(null);
            }else if(curr == lastNode){
                prev.setNext(lastNode.getNext());
                lastNode = prev;
                curr.setNext(null);
            }else{
                prev.setNext(curr.getNext());
            }
        }else{
            System.out.print("Not Found");
        }
    }
    public void insert(Object iteminsert,Object newItem){
        newNode = new Node(newItem);
        if(searchItem(iteminsert)){
            if(prev==null){
                newNode.setNext(curr);
                lastNode.setNext(newNode);
                head = newNode;
            }else{
                newNode.setNext(curr);
                prev.setNext(newNode);
            }
        }else{
            if(head ==null){
                newNode.setNext(curr);
                head=newNode;
            }else if(curr ==head){
                newNode.setNext(head);
                lastNode.setNext(newNode);
                lastNode=newNode;
            }
        }
    }
    public void showdata(){
        curr=head;
        while(curr!=lastNode){
            System.out.print(curr.getItem()+" ");
            curr = curr.getNext();
        }
        System.out.print(curr.getItem()+" ");
        curr = curr.getNext();
        System.out.print(" head data = "+curr.getItem());
        System.out.println();
    }
    public static void main(String[] args){
        CircularLinkList circular = new CircularLinkList();
        circular.add(6);
        circular.showdata();
        circular.add(9);
        circular.showdata();
        circular.add(5);
        circular.showdata();
        circular.deleteNode(5);
        circular.showdata();
        circular.insert(9,10);
        circular.showdata();
    }
}
