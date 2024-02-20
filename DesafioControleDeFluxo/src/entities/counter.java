package entities;

import Exceptions.ParametrosInvalidosException;

public class counter {
	 static void contar(int firstParameter, int secondParameter) throws ParametrosInvalidosException {
	        if (secondParameter > firstParameter) {
	            int x = secondParameter - firstParameter;
	            for (int i = 0; i < x; i++) {
	                System.out.printf("Imprimindo numero %d.\n", i + 1);
	            }
	        } else {
	            // Throw the custom exception if parameters are invalid
	            throw new ParametrosInvalidosException("Parametros invalidos");
	        }
	    }
}
