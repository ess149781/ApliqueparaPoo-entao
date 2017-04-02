public interface DoItPlus extends DoIt { 
   	default boolean didItWork(int i, double x, String s) {
   		// Faz algo diferente do que a interface DoIt
   	}
}



