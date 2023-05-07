package day9;

public class Gametest {
    public static void main(String[] args) {
        ROLE r1=new ROLE("王云龙",100);
        ROLE r2=new ROLE("董骁畅",100);
        while(true){
            r1.attack(r2);
            if(r2.getBlood()==0){
                System.out.println(r1.getName()+"ko了"+r2.getName());
           break;
            }
                r2.attack(r1);
                if(r1.getBlood()==0){
                    System.out.println(r2.getName()+"ko了"+r1.getName());
                    break;
                }
            }




        }
    }

