package com.java11.ravi;

import java.util.function.BiFunction;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.ToIntBiFunction;

public class LambdaEnhancements {
	public static void main(String[] args) {
		
		
		Function<Integer, String>  r = (Integer i) ->{
			return "Hi";
		};
		
		IntFunction r1 = (var i ) -> {     // instead of int we can write var also
			return "Hi";
		};
		
		// no mixing  'var' cannot be mixed with non-var parameters    ( var i, Integer j)
		//no skipping
		
		ToIntBiFunction<Object,Object> r2 =( var i, var j) ->{
			return 10;
		};
		r2.applyAsInt("ABC","XYHI");
	}

}
