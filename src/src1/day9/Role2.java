package day9;

import java.util.Random;

public class Role2 {
    private String name;
    private int blood;
    private String gender;
    private String face;
    String[] boyfaces={"风流俊雅","气宇轩昂","相貌英军","五官端正","相貌平平","一塌糊涂","面部狰狞"};
    String[] girlfaces={"国色天香","沉鱼落雁","亭亭玉立","身材娇小","相貌平平","一塌糊涂","面部狰狞"};
    public Role2(){}
    public Role2(String name, int blood, String gender, String face ) {
        this.name = name;
        this.blood = blood;
        this.gender = gender;
        setFace(gender);

    }

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setBlood(int blood ){
        this.blood=blood;
    }
    public int getBlood(){
        return blood;
        }
        public void setGender(String gender){
        this.gender=gender;
        }
        public String getGender(){
        return gender;
        }

    public String getFace() {
        return face;
    }

    public void setFace(String gender) {//长相是随机的
        Random r=new Random();

        if(gender=="男"){
            int index=  r.nextInt(boyfaces.length);
            this.face=boyfaces[index];
        }else if (gender=="女"){
            int index=  r.nextInt(girlfaces.length);
            this.face=girlfaces[index];
        }else {this.face = "面貌狰狞";}

    }
    public void showRoleinfo(){
        System.out.println("姓名为"+getName());
        System.out.println("血量为"+getBlood());
        System.out.println("性别为"+gender);
        System.out.println("长相为"+getFace());

    }





}

