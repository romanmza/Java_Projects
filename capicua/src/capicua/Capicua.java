package capicua;

public class Capicua {

    public static void main(String[] args) {
     
        Integer num = 65456;
        

            Integer n = Math.abs(num), numInv = 0;
            while (n != 0) {
                int digito = n % 10;
                numInv = numInv * 10 + digito;
                n = n / 10;
                System.out.println(digito + "\t" + numInv + "\t" + n);
                    String pepe ="pepe";
                    pepe.charAt(1);
            }
            
            System.out.println(numInv == Math.abs(num));
 
        
        

    }

//    public Boolean numeroCapicua(Integer num) {
//        if (num == null) {
//            return false;
//        } else {
//            Integer n = Math.abs(num), numInv = 0;
//            while (n != 0) {
//                int digito = n % 10;
//                numInv = numInv * 10 + digito;
//                n = n / 10;
//                System.out.println(digito + "\t" + numInv + "\t" + n);
//
//            }
//            return numInv == Math.abs(num);
//        }
//    }
}
