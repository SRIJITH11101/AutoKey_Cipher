import java.util.Scanner;

public class AutokeyCipher {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        char ar[]=new char[26];
        int j=0,ei=0,oi=0;
        String es="",os="";
        for (char i = 'A'; i <= 'Z'; i++,j++) {
            ar[j]=i; 
        }
        System.out.println("Enter the sentence to be enrypted");
        String ps=sc.nextLine();
        ps=ps.toUpperCase();
        System.out.println("Enter the key letter in Uppercase");
        char k=sc.next().charAt(0);
        String ks=k+(ps.substring(0,ps.length()-1));
        for(int i=0;i<ps.length();i++){
            char x=ps.charAt(i);
            char y=ks.charAt(i);
            ei=((int)x+(int)y-130)%26;
            es=es+(char)(65+ei);
        }
        System.out.println("Encrypted text : "+es);

        //Decryption
        for(int i=0;i<es.length();i++){
            char a=es.charAt(i);
            char b=ks.charAt(i);
            oi=((int)a-(int)b)%26;
            if(oi<0)
                oi=26+oi;
            os=os+(char)(65+oi);
        }
        System.out.println("Decrypted text : "+os);
    }
}
