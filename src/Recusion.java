public class Recusion {
    public static void main(String[] args) {
        Recusion r = new Recusion();
    }
  //  public int w = 0;
    public  int answer;

    public Recusion(){
        recursiveMethod(5);
        answer=recursiveMethod(5);
        System.out.println(answer);
    }



    public int recursiveMethod(int i){


        if(i!=0){ //Base case
            return i * recursiveMethod(i-1);
        }
        else{
         return 1;
        }

     //   System.out.println(i);
    }

}
