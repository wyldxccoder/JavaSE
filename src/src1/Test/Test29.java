package Test;

import java.util.Scanner;

public class Test29 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int []below=new int[9];
        int []score=new int[9];
        for (int i = 0; i < score.length; i++) {
           score[i] = sc.nextInt();
        }

       int  n= fun(score,below);
        for (int i = 0; i < n; i++) {
            System.out.print(below[i]+" ");
        }



    }
    public static int fun(int [] score,int [] below) {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum = score[i] + sum;

        }
        double avg = sum / score.length;
        int count=0;
        for (int i = 0; i < score.length; i++) {
            if (score[i] < avg) {
                below[count] = score[i];
                count++;
            }
        }
return count;
    }
    }



