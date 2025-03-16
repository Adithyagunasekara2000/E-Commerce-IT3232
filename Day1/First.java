public class First {
    public static void main(String []args)
    {
        System.out.println("Hello  World");

        System.out.println("\n");
        System.out.println("1 to 10 numbers:");
        for(int i=1;i<=10;i++){
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println("10 to 1 reverse numbers:");
        for(int i=10;i>0;i--){
            System.out.println(i);
        }
        System.out.println("\n");
        System.out.println("1 to 20 Odd numbers:");
        for (int i=1;i<=20;i++){
            if(i%2 != 0){
                System.out.println(i);
            }
        }
        System.out.println("\n");
        
        
    }
}
