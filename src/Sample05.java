import java.util.ArrayList;
import java.util.List;
public class Sample05 {
	public static void main(String[] args) {
		List<String> fruitslist = new ArrayList<String>();
		
		fruitslist.add("apple");
		fruitslist.add("peach");
		fruitslist.add("banana");
		fruitslist.add("melon");
		System.out.println(fruitslist);
	     
		List<String> fruitslist2 = new ArrayList<>();
	         
		fruitslist2.add("grape");
		fruitslist2.add("cherry");
		fruitslist2.add("orange");
		fruitslist2.add("fig");
	         
		fruitslist.addAll(fruitslist2);
	        
		System.out.println(fruitslist);
	    }
	 
	}

