package linkedlistqueue;

public class LinkedList {
    //tip clasa element, nu avem nevoie de un integer deoarece avem structuri de date
    private Element head;

    public Element getHead() {
        return head;
    }

    public void setHead(Element head) {
        this.head = head;
    }

    //inserarea elementului
    public void insertElement(Element newElement) {
        if (head != null) {
            head.setNext(newElement);
        }//head ul bate spre noul element
        newElement.setPrevious(head);//mut pointerul pe new element
        head = newElement;
        //noul head devine elementul nou
    }

    public Element searchElement(int element) {
        Element aux = head;
        while (aux != null && aux.getData() != element) {
            aux = aux.getPrevious();
        }
        return aux;
    }

    public void deleteElement(int element) {
        Element myElement = searchElement(element);//face aceelasi lucru ca while ul de mai sus
        if (myElement != null) {
            Element previousElement = myElement.getPrevious();
            Element nextElement = myElement.getNext();
//mai jos reconstruim lista.
            if (previousElement != null) {
                previousElement.setNext(nextElement);
            }
            if (nextElement != null) {
                nextElement.setPrevious(previousElement);
            }else{
                head = previousElement;
            }
        }

    }
}
