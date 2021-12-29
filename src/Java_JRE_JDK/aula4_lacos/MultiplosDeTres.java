package Java_JRE_JDK.aula4_lacos;

public class MultiplosDeTres {

    public static void main(String[] args) {
        //jeito 1
        //for(int i =0; i <= 100; i++){
        //    if(i % 3 == 0){
        //        System.out.println(i);
        //    }
        //}

        //jeito 2
        for (int i = 3; i < 100; i+= 3 ){
            System.out.println(i);
        }
    }
}
