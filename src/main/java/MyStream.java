import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class MyStream {
    public static void main(String[] args) {

        //Stream - fluxo de dados

        //Percorrendo lista usando o java 4
        List<Integer> asList = Arrays.asList(1,2,3,4,5);
        for (Iterator iterator = asList.iterator(); iterator.hasNext();){
            Integer integer = (Integer) iterator.next();
        }
/**

        //Percorrendo lista antes do java 8
        List<Integer> asList = Arrays.asList(1,2,3,4,5);
        for (Integer integer: asList) {
            System.out.println(integer);
        }
**/
        //Percorrendo lista com a ajuda de stream
        asList.stream()
                .filter(e -> e % 2 == 0) //filtra apenas numeros pares
                .forEach(e -> System.out.println(e));


    }
}
