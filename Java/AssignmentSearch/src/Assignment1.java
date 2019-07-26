import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String> lst = Arrays.asList("ram","tom","ram","adasd","ram");
		Set<String> set = new HashSet<>();
		for(String str: lst) {
			if(!set.add(str))
				System.out.println(str);
		}
	}

}
