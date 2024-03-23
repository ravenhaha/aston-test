//1 task

import java.util.Scanner;
 
public class Program {
   
    public static void main(String[] args) {
           
        Scanner in = new Scanner(System.in);
        System.out.print("first num: ");
        int firstnum = in.nextInt();
        System.out.print("second num: ");
        int secondnum = in.nextInt();
        if (firstnum > secondnum) {
            System.out.println("first num  > second num");
        } else if (firstnum < secondnum) {
            System.out.println("second num < first num");
        } else {
            System.out.println("first num  = second numb ");
        } 
        in.close();
    }
}

//2 task

public class Program {
   
    public static void main(String[] args) {
           
        String str1 = new String("hello");
String str2 = new String("hello1");
 
if (str1.equals(str2)) {
    System.out.println("the lines are identical");
} else {
    System.out.println("strings are not identical");
}
    }
}

//3 task

public class Program {
   
    public static void main(String[] args) {
           
 int [] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

    for(int i=0;i<array.length;i++)
    {
        if(array[i]%2==0)
        {
            System.out.println("Number: "+array[i]);
        }
    }
    }
}
 