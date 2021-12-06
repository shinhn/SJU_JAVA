package ksh;

import javax.script.*;

public class test {

	public static void main(String[] args) throws ScriptException {
		ScriptEngineManager manager = new ScriptEngineManager();
		ScriptEngine engine = manager.getEngineByName("JavaScript");
		int result = (int)engine.eval("4*5-2");
		
		System.out.println(result);

	}

}
