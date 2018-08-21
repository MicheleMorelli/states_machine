public class Stati {
    private static String state = "move";

    public static void main(String[] args){
        update(); 
    }

    public static void update(){
        while (true){
            //get_input();
            swapState(); 
        }
    }


    public static void swapState(){
            switch (state){
                case ("jump"): jump(); break;
                case ("move"): move(); break;
            }
        }

    public static void move(){
        System.out.println("I am moving");
    }
    
    public static void jump(){
        System.out.println("I am jumping");
    }
}

