package Streamapi;
import java.util.*;
import java.util.stream.Stream;
public class StreamMethod {
public static void main(String[] args) {
	List<Integer> list = Arrays.asList(2,3,1,2,5,8,7,4,3,1);
	System.out.println(list);
	Stream s = list.stream();
	s.distinct();
	Stream s2 = s.distinct();
	s.forEach(n->System.out.println(n));
	Stream s1 = list.stream();
;}
}
