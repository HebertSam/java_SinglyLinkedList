
public class SLL{
    private Node head;

    public SLL(){
        this.head = null;
    }

    public void add(int num){
        if (this.head == null){
            this.head = new Node(num);
        } else{
            Node current = this.head;
            while (current.next != null){
                current = current.next;
            }
            current.next = new Node(num);
        }
    }
    public void remove(){
        if (this.head == null){
            System.out.println("this list is empty");
        } 
        Node current = this.head;
        while (current.next.next != null){
            current = current.next;
        }
        current.next = null;
    }
    public void printVals(){
        if (this.head == null){
            System.out.println("this list is empty");
        } else {
            Node current = this.head;
            while(current != null){
                System.out.println(current.value);
                current = current.next;
            }
        }  
    }
    public int find(int num){
        if (this.head == null){
            System.out.println("this list is empty");
        }
        Node current = this.head;
        while(current != null){
            if (current.value == num){
                return current.value;
            } else {
                current = current.next;
            }
        }
        return current.value;
    }
    public void removeAt(int num){
        if (this.head == null){
            System.out.println("this list is empty");
        } else {
            Node current = this.head;
            Node prev = this.head;
            int count = 0;
            while (current != null){
                if (count == num){
                    prev.next = current.next;
                } else {
                    prev = current;
                    current = current.next;
                }
            }
        }
    }
}