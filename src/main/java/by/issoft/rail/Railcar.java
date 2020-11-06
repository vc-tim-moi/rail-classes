package by.issoft.rail;

public abstract class Railcar {
    private Railcar front;
    private Railcar rear;

    public void attachFront(Railcar front){
        if (front == this) {
            throw new IllegalArgumentException("Cannot attach a railcar to itself");
        }
        front.rear = this;
        this.front = front;
    }

    public Railcar getFront() { return front; }

    public void attachRear(Railcar rear){
        if (rear == this) {
            throw new IllegalArgumentException("Cannot attach a railcar to itself");
        }
        rear.front = this;
        this.rear = rear;
    }

    public Railcar getRear() { return rear; }
}