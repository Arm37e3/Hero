public class Hero {


    private String name;
    private int hp;
    private int sp;
    private int str;
    private int agi;
    private int megic;
    

    public Hero() {
        System.out.println("I am hero : " );
    }

    public void set_HeroName(String Name) {

            this.name = Name;

            System.out.println(this.name);
    }
       
    public int[] setStatus(int HP , int SP ,int STR, int AGI, int MEGIC) {
        this.hp = HP;
        this.sp = SP;
        this.str = STR;
        this.agi = AGI;
        this.megic = MEGIC;

        int[] status = {this.hp, this.sp,this.str, this.agi, this.megic} ;
        
      return status;
    
    
    }







    






}
