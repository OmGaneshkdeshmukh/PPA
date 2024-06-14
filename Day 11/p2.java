import java.util.Scanner;

class p2 {
    public static void main(String []args){
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter Your String");
        String str =sc.next();
        System.out.println("Enter Your Character");
        char ch = sc.next().charAt(0);
        int count=0;

        for(int i=0;i<str.length();i++) {
            if(str.charAt(i)==ch){
                count++;
            }
        }
        System.out.println(ch+"\t Occurs\t" +count+ "\tTimes");

    }
}