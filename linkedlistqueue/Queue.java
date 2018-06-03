package linkedlistqueue;

public class Queue {
    private LinkedList data = new LinkedList();


    public void enqueue(int element) {
        data.insertElement(new Element(element));
    }

//liniile comentate de mai jos sunt ceea ce am facut eu pentru a scapa de return
    // public int dequeue(){
    // Element aux = data.getHead();
    //   int dequeue = 0;
    // while(aux!=null){
    //   if(aux.getPrevious()==null){
    //     dequeue = aux.getData();
    //  }
    //   aux = aux.getPrevious();
    //  }
    //  return dequeue;
    //  }

    public Integer dequeue() {//tip Integer pentru a puttea returna null.
        Element aux = data.getHead();
        while (aux != null) {//modifica ce e in interiorul while pentru a nu ne opori la return aux.get.Data
            if (aux.getPrevious() == null) {
                aux.getNext().setPrevious(null);//sters, rupem legatura
                aux.setNext(null);//fiind dubla inlantuita rupem si cealalta legatura
            }
            aux = aux.getPrevious();
        }
        return null;
    }

}

