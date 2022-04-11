public class Pract3B{
    public static void main(String[] args){
        Add();
    }
    static void Add(){
        String str="0 1 2 3 4 5 6 7 8 9";
        char ch[] = str.toCharArray();
        long sum = 0;
        for(int i=0; i<str.length(); i++){
            sum= sum+Character.getNumericValue(ch[i]);
        }
        System.out.println("The sum is:"+sum);
    }
}