public class Str_Hero extends Hero  {

    public Str_Hero() {
        super();
        set_HeroName("Nataya");
    }

    public void Show_Status(int HP , int SP ,int STR, int AGI, int MEGIC){

      int[] status =  setStatus(HP, SP, STR, AGI, MEGIC);

        System.out.println("MY HP :"+status[0] + "\n");
        System.out.println("MY SP :"+status[1] + "\n");
        System.out.println("MY STR :"+status[2] + "\n");
        System.out.println("MY AGI :"+status[3] + "\n");
        System.out.println("MY MEGIC :"+status[4] + "\n"); 


    }

    public void Show_Status2(int HP , int SP ,int STR,int AGI, int MEGIC){
        setStatus(HP, SP, STR, AGI, MEGIC);
        
    }







    
}
