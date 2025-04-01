import javax.print.DocFlavor;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Stream.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List list=new ArrayList();
        for(int i=0;i<10000;i++){
            list.add(i);

        }
        Stream<Integer> s= list.stream();
        List list1=s.map(b->b+1).filter(a->a%2==0)
                .collect(Collectors.toList());
        List<String> point=new ArrayList<>();
        point.add("a");
        point.add("b");
        Stream stream=point.stream();
        point.add("c");
        System.out.println(stream.count());

        //Optional optional=s.findFirst();
       // s.forEach((element)->System.out.println(element));
        //optional.ifPresent(System.out::println);


    }
}