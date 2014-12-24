public class XorCode{
    public static void main(String[] args){
       char ch='a';
       int a=5;
       System.out.println("number = "+ch);
       ch=(char)(ch^8);
       System.out.println("encode number = "+ch);
       ch=(char)(ch^8);
       System.out.println("decode number = "+ ch);
}
}