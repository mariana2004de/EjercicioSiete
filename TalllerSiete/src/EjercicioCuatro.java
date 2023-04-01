
public class EjercicioCuatro {
	    public static void main(String[] args) {
	        // sintaxis
	        int x = 6
	        System.out.println("El valor de x es: " + x);

	        //lógico
	        int y = 12;
	        if (y < 6) {
	            System.out.println("y es menor que 5");
	        } else {
	            System.out.println("y es mayor o igual que 5");
	        }

	        // Excepción
	        int[] nums = {1, 2, 3};
	        try {
	            System.out.println(nums[3]); // 
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Se ha producido una excepción: " + e.getMessage());
	        }
	    }
	}



