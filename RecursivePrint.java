package OOP;

public class RecursivePrint {

    public static int recursivePrint(int a, int b){
        if(a > b){
            return 0;
        }
        System.out.println(a);
        return recursivePrint(++a, b);
    }

    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        recursivePrint(a, b);
    }
}
