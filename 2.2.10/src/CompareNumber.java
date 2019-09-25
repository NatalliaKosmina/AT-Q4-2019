public class CompareNumber {
    public static void main(String[] args) {

        char[] a = args[0].toCharArray();
        int[] f = new int[args[0].length()];
        for (int i = 0; i < a.length; i ++) {
            f[i]= Character.getNumericValue(a[i]);
        }
        System.out.println(args[0]);
        int max = f[0];
        boolean g = true;
        for (int i=0; i<f.length-1; i++){

            if (max<f[i+1]){
                max = f[i+1];
                g = true;
            } else {
                g = false;
                break;
            }
        }

        if(!g){
            System.out.println("not");
        }else{
            System.out.println("ok");
        }
    }
}
