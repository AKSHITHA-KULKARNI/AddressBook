public class Queue <K>{
    int n=5;
    K[] ar1;
    int front=-1;
    int rear=-1;
    public void enqueue(K k){
        ar1[++rear]=k;
        if(front==-1)front=0;
    }
    public void dequeue(){
        if(front==rear) {
            System.out.println("Queue is empty!");
            rear=-1;
            front=-1;

        }
        else{
            System.out.println(ar1[++front]);
        }

    }
    public void current(){
        if(front==-1) System.out.println("Cannot Print");
        System.out.println(ar1[front]);
    }
    Queue(int n){
        this.n=n;
        this.ar1=(K[]) new Object[n];
    }
}