public class CompareNumber {
    public static void main(String[] args) {

        try {
            final char[] anyString = args[0].toCharArray();
            final int stringLength = args[0].length();
            boolean isValid = true;

            for (int i = 0; i < stringLength - 1; i++) {
                if (Integer.parseInt(String.valueOf(anyString[i])) > Integer.parseInt(String.valueOf(anyString[i + 1]))) {
                    isValid = false;
                    break;
                }
            }
            System.out.println(args[0]);

            if (!isValid) {
                System.out.println("This numbers are not consecutive.");
            } else {
                System.out.println("This numbers are consecutive.");
            }
        } catch (Exception e) {
            System.out.println("Please enter number!");
        }
    }
}


