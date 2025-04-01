public class wordcount12{
    public static void main(String[] args){
        String s;
        int count=1,i;
        
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the your String :");
        s=sc.nextLine();
        for(i=0;i<s.length;i++){
        char a,b;
        a.charAt(i);
        b.charAt(i+1);
        if(a==" "&&b!=" "){
            count++;
        }

        }
        System.out.println("the words are :"+count);
    }
}