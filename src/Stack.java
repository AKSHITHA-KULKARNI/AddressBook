public class Stack <K>{
    //Typecasting
    int n=5;
    K[] ar1;
    int top=-1;
    public void push(K k){
        if(top+1==ar1.length-1){   //here top==ar1.length does not work
            System.out.println("stack is full");
        }
        else{
            ar1[++top]=k;
        }

    }
    public void pop(){
        if(top==-1) System.out.println("Stack is empty!");
        else{
            System.out.println(ar1[top]);
            top--;
        }

    }
    public void peek(){
        System.out.println(ar1[top]);
    }
    Stack(int n){
        this.n=n;
        this.ar1=(K[]) new Object[n];
    }
}