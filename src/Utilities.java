public class Utilities {


        public static int getFirstRepeatedCharacter(String txt){
            int length = txt.length();
            for (int i=0; i< length-1; i++){
                if (txt.charAt(i) == txt.charAt(i+1)){
                    return i;
                }
            }
            return -1;
        }

        public static void goDownToOne(int startingNumber){
            while (startingNumber!=1){
                System.out.print(startingNumber + " ");
                if (startingNumber % 2 == 0){
                    startingNumber = startingNumber / 2;
                }else{
                    startingNumber = startingNumber+startingNumber*2 + 1;
                }
            }
            System.out.print(startingNumber);
        }


    }

