package firstProgram;

public class childClass extends staticCheck{
    @Override
    public void run(){

        System.out.println("I am child running");
        super.run();
    }
    childClass(){
        super();
      super.run();
     
    }


    public static void main(String[] args) {
        childClass obj=new childClass();
        staticCheck obj1=new childClass();

        obj.run();
        obj1.run();

    }
}
