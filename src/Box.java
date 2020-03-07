public class Box {
    private int a;
    private int b;
    private int c;

    Box (int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    int GetV(){
        return (a * b * c);
    }

}
