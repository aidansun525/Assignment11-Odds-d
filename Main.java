import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    scenario1();
    scenario2();
    scenario3();
    scenario4();
    scenario5();
    }

    public static void scenario1(){
        //Rolling a odd number
        //probability = 50%
        int odd = 0;
        int even = 0;
        int count = 100000;
        System.out.println("Scenario1: Expected result is 50%");

        for(int i=0; i<count; i++){
            int result = (int)Math.floor(Math.random()*6+1);

            if(result%2 == 0){
                even+=1;
            }
            if(result%2 != 0){
                odd+=1;
            }
        }
        System.out.println("Count of even : "+even);
        System.out.println("Count of odd : "+odd);
        System.out.println("Condition reached  : "+((float)odd/(float)count)*100+"%");
        System.out.println("-----------------------------------------");
    }
    public static void scenario2(){
        //10-sided die, rolling a even number or a number over 5
        //probability = 7/10 = 70%
        int fail = 0;
        int success = 0;
        int count = 100000;
        System.out.println("Scenario2: Expected result is 70%");

        for(int i=0; i<count; i++){
            int result = (int)Math.floor(Math.random()*10+1);

            if(result%2 == 0 || result > 5){
                success+=1;
            }
            if(result%2 != 0){
                fail+=1;
            }
        }
        System.out.println("Count of success : "+success);
        System.out.println("Count of fail : "+fail);
        System.out.println("Condition reached  : "+((float)success/(float)count)*100+"%");
        System.out.println("-----------------------------------------");

    }
    public static void scenario3(){
        //6-sided die, rolling a even number first, and a odd number second
        //probability = 1/4 = 25%
        int fail = 0;
        int success = 0;
        int count = 100000;
        System.out.println("Scenario3: Expected result is 25%");

        for(int i=0; i<count; i++){
            int result1 = (int)Math.floor(Math.random()*6+1);
            int result2 = (int)Math.floor(Math.random()*6+1);

            if(result1%2 == 0 && result2%2 != 0){
                success+=1;
            }
            else{
                fail+=1;
            }
        }
        System.out.println("Count of success : "+success);
        System.out.println("Count of fail : "+fail);
        System.out.println("Condition reached  : "+((float)success/(float)count)*100+"%");
        System.out.println("-----------------------------------------");

    }
    public static void scenario4(){
        //6-sided die, rolling
        // first, 1 or 2, second 3 or 4, third 4 or 5.
        //probability = 3.7%
        int fail = 0;
        int success = 0;
        int count = 100000;
        System.out.println("Scenario4: Expected result is 3.7%");

        for(int i=0; i<count; i++){
            int result1 = (int)Math.floor(Math.random()*6+1);
            int result2 = (int)Math.floor(Math.random()*6+1);
            int result3 = (int)Math.floor(Math.random()*6+1);

            if((result1 == 1 || result1 == 2) && (result2 == 3 || result2 == 4)&&(result3 == 5 || result3 == 6)){
                success+=1;
            }
            else{
                fail+=1;
            }
        }
        System.out.println("Count of success : "+success);
        System.out.println("Count of fail : "+fail);
        System.out.println("Condition reached  : "+((float)success/(float)count)*100+"%");
        System.out.println("-----------------------------------------");

    }
    public static void scenario5(){
        //6-sided die, rolling
        // first, 1 or 2, second 3 or 4, third 4 or 5.
        //probability = 27.8%
        int fail = 0;
        int success = 0;
        int count = 100000;
        System.out.println("Scenario5: Expected result is 27.8%");

        for(int i=0; i<count; i++){
            int result1 = (int)Math.floor(Math.random()*6+1);
            int result2 = (int)Math.floor(Math.random()*6+1);
            int result3 = (int)Math.floor(Math.random()*6+1);
            int result4 = (int)Math.floor(Math.random()*6+1);

            if(result1 != result2 && result1 != result3 && result1 != result4 && result2 != result3 && result2 != result4 &&result3 != result4){
                success+=1;
            }
            else{
                fail+=1;
            }
        }
        System.out.println("Count of success : "+success);
        System.out.println("Count of fail : "+fail);
        System.out.println("Condition reached  : "+((float)success/(float)count)*100+"%");
        System.out.println("-----------------------------------------");

    }
}
