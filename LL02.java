class LL02 {
    Node head;

    private int size;

    LL02(){
        this.size = 0;
    }

    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
            size++;
        }
    }

    //add - first, last
    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addlast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }


        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    //print
    public void printList(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("NULL");
    }

    //delete first
    public void deleteFirst(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;
        head = head.next;
    }

    //delete last
    public void deletelast(){
        if(head == null){
            System.out.println("The list is empty");
            return;
        }
        size--;

        if(head.next == null){
            head = null;
            return;
        }

        Node secondLast = head;
        Node lastNode = head.next;
        while(lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }

        secondLast.next = null;
    }

    public int getSize(){
        return size;
    }


    public static void main(String args[]){
        LL02 list = new LL02();
        list.addFirst("a");
        list.addFirst("is");
        list.printList();
        list.addlast("list");
        list.printList();
        list.addFirst("This");
        list.printList();

        list.deleteFirst();
        list.printList();

        list.deletelast();
        list.printList();

        System.out.println(list.getSize());

        list.addFirst("This");
        System.out.println(list.getSize());
    }
}
