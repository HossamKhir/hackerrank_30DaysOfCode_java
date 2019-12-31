//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class day8{
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        HashMap<String, Integer> phoneBook = new HashMap<String, Integer>();

        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            phoneBook.put(name, phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s))
            {
                System.out.println(s + "=" + phoneBook.get(s));
            }
            else
            {
                System.out.println("Not found");
            }
        }
        in.close();
    }
}
