public class ReturnStatment{
    static void odd(int x){
        if(x%2 == 0) return;
        System.out.println(x);
    }
    public static void main(String[] args){
        for(int i = 1; i<50; i++){
            odd(i);
        }
    }
}