public class recursion {
    public static void main(String[] args){
        int ans=sum(10);
        System.out.println(ans);
    }

    public static int sum(int N){
        if(N==1){
            return 1;
        }

        int temp=sum(N-1);
        return temp+N;
    }



}
