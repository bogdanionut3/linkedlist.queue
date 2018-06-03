package linkedlistqueue;

public class Main {
    public static void main(String[] args) {
        Queue myQueue = new Queue();


    /*    myQueue.data[4] = 20;
        System.out.println(myQueue.data[4]);*/ //daca nu am restrictionat in clasa facem orice. dar pt restrictionare mergem la clasa si transf in private
        // myQueue.enqueue(3);
        myQueue.enqueue(4);
        myQueue.enqueue(5);

        System.out.println(myQueue.dequeue());




    }

}
