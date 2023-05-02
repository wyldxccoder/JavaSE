package Test;

import java.util.Scanner;

public class Test11 {
    public static void main(String[] args) {
        int sum1=0;
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();


        String [] strint1=s1.split(":"+ " ");



        int []nums1=new int[strint1.length];
        for (int i = 0; i < nums1.length; i++) {
            nums1[i]=Integer.parseInt(strint1[i]);
            if(i==0){
                sum1=nums1[i]*3600+sum1;
            }
            if(i==1){
                sum1=nums1[i]*60+sum1;
            }if(i==3){
                sum1=nums1[i]+sum1;

            }else{ break;}        }
        int sum2=0;
        String s2 = sc.nextLine();
        String [] strint2=s2.split(":"+" ");
        int []nums2=new int[strint2.length];
        for (int i = 0; i < nums2.length; i++) {
            nums2[i]=Integer.parseInt(strint2[i]);
            if(i==0){
                sum2=nums2[i]*3600+sum2;
            }
            if(i==1){
                sum2=nums2[i]*60+sum2;
            }if(i==3){
                sum2=nums1[i]+sum2;

            }else{ break;}
        }
        int d=sum2-sum1;
        System.out.println(d);


    }
}
