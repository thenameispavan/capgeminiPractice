//list of operations

import java.util.*;
class ArrayListOps {
	public List<Integer> makeArrayListInt(int n){
		List<Integer> li=new ArrayList<Integer>();
		for(int i=0;i<n;i++){
			li.add(0);
		}
		return li;
	}
	public List<Integer> reverseList(ArrayList<Integer> list){
		Collections.reverse(list);
		return list;
	}
	public List<Integer> changeList(ArrayList<Integer> list, int m, int n){
		Collections.replaceAll(list,m,n);
		return list;
	}
   
}
public class Source{
	public static void main(String[] args) {
	}
}