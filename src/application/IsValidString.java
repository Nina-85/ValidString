package application;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class IsValidString {
	
	public static boolean isValidString(String str) 
	{
		if(str.isEmpty())
			return false;
		
		Map<Character, Character> braces = new HashMap<>();
		braces.put('}', '{');
		braces.put(']', '[');
		braces.put('>', '<');
		braces.put(')', '(');
		
		char[] chrs = str.toCharArray();
		if(!braces.containsValue(chrs[0]) || !braces.containsKey(chrs[chrs.length-1]))
			return false;
		
		Deque<Character> stack = new LinkedList<>();
		
		for(char ch: chrs) {
			if(braces.containsValue(ch))
				{
					stack.push(ch);
				}
			else if(braces.containsKey(ch))
				{
					if(stack.isEmpty() || stack.pop()!=braces.get(ch))
						{
							return false;
						}
				}			
		}
		return stack.isEmpty();		
	}
}
