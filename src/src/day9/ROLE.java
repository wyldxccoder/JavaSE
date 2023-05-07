package day9;

import java.util.Random;

public class ROLE {
    private String name;
    private int blood;

    public ROLE() {
    }

    public ROLE(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getBlood() {
        return blood;
    }
    public void setBlood(int blood) {
        this.blood = blood;
    }
    public void attack(ROLE role){
        Random r=new Random();
      int hurt=  r.nextInt(20)+1;
       int rablood=role.getBlood()-hurt;
      rablood=  rablood<0?0:rablood;
      role.setBlood(rablood);


        System.out.println(this.getName()+"举起了拳头打了"+role.getName()+"一下,"+"造成了"+hurt+"点伤害"+role.getName()+"还剩下了"+rablood+"点血");
    }


}
