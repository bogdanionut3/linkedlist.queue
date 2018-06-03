package linkedlistqueue;

public class Element {
    private Element next;
    private Element previous;
    private int data;

    //vedem daca ne trebuie constructorul creat.
    public Element() {

    }
    public Element(int data) {
        this.data =data;
        }


    public Element(Element next, Element previous, int data) {
        this.next = next;
        this.previous = previous;
        this.data = data;
    }

    public Element getNext() {
        return next;
    }

    public void setNext(Element next) {
        this.next = next;
    }

    public Element getPrevious() {
        return previous;
    }

    public void setPrevious(Element previous) {
        this.previous = previous;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}
