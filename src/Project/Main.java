package Project;

import java.sql.SQLOutput;

public class Main {

    public int[] letCount;

    public Main(int[] letterCount) {
        this.letCount=letterCount;
    }

    public static void main(String[] args) {
	// write your code here
        String s = "aaabbdbwbenr";
        char[] alphabet=new char[26];
        int[] letterCount=new int[26];
        char letter ='a';

        for (int i=0;i<alphabet.length;i++){
            alphabet[i]=letter;
            letter++;
        }

        for (int i=0;i<s.length();i++){
            for (int j=0;j< alphabet.length;j++)
                if (s.charAt(i)==alphabet[j])
                    letterCount[j]++;
        }

        for (char c:alphabet) {
            System.out.print(c);
        }
        System.out.println();

        for (int d:letterCount) {
            System.out.print(d);
        }
        System.out.println();

        Main a =new Main(letterCount);

      
        if (a.toHighestNumber(letterCount)||a.toLowestNumber(letterCount))
            System.out.println("YES");
        else
            System.out.println("NO");


    }

    public boolean toHighestNumber(int[]letterCount){
        int count=0;
        int highest =0;
        for (int i=0;i<letterCount.length;i++){
            if(letterCount[i]>highest)
                highest=letterCount[i];
        }
        for (int i=0;i<letterCount.length;i++){
            if((letterCount[i]<highest)&&(letterCount[i]>0)){
                count+= (highest-letterCount[i]);
            }
        }
        System.out.println(highest);
        System.out.println(count);
        if(count>1)
            return false;
        else
            return true;

    }
    public boolean toLowestNumber(int[]letterCount){
        int count=0;
        int lowest =Integer.MAX_VALUE;
        for (int i=0;i<letterCount.length;i++){
            if(letterCount[i]<lowest&&letterCount[i]!=0)
                lowest=letterCount[i];
        }
        for (int i=0;i<letterCount.length;i++){
            if((letterCount[i]>lowest)&&(letterCount[i]>0)) {
                count += (letterCount[i] - lowest);
            }
        }
        System.out.println(lowest);
        System.out.println(count);

        if(count>1)
            return false;
        else
            return true;
    }






}
