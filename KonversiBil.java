import java.util.Scanner;

public class KonversiBil {
    public static void main(String[] agrs){
        Scanner in = new Scanner (System.in); 

        boolean run = true ; 
        String Biner = "" ;
        String HexaDesimal = "" ; 

        int Desimal = 0 ; 
        

        while(run){
            System.out.println("Menu");
            System.out.println("1. Biner ke Desimal");
            System.out.println("2. Desimal ke Biner");
            System.out.println("3. Biner ke HexaDesimal");
            System.out.println("4. HexaDesimal ke Biner");
            System.out.println("5. Desimal Ke HexaDesimal");
            System.out.println("6. HexaDesimal ke Desimal");
            System.out.println("0. Keluar");

            int Menu = in.nextInt(); 
            in.nextLine();

            switch(Menu){
                case 1:
                System.out.print("Masukkan Bilangan Biner: ");
                Biner = in.next();
                Desimal = Integer.parseInt(Biner, 2);
                System.out.println("Hasil: "+ Desimal);
                break; 

                case 2:
                System.out.print("Masukkan Bilangan Desimal: ");
                Desimal = in.nextInt(); 
                Biner = Integer.toBinaryString(Desimal);
                System.out.println(("Hasil  " + Biner));
                break; 

                case 3:
                System.out.println("Masukkan Bilangan Biner: ");
                Biner = in.next(); 
                Desimal = Integer.parseInt(Biner); 
                HexaDesimal= Integer.toHexString(Desimal); 
                System.out.println("Hasil "+ HexaDesimal); 
                break; 

                case 4: 
                System.out.println("Masukkan Bilangan HexaDesimal: ");
                HexaDesimal = in.next(); 
                Desimal = Integer.parseInt(HexaDesimal, 16); 
                Biner = Integer.toBinaryString(Desimal);
                System.out.println("Hasil "+ Biner);
                break; 

                case 5: 
                System.out.println("Masukkan Bilangan Desimal: ");
                Desimal = in.nextInt(); 
                HexaDesimal = Integer.toHexString(Desimal);
                System.out.println("Hasil "+ HexaDesimal);
                break; 

                case 6:
                System.out.println("Masukkan Bilangan HexaDesimal: ");
                HexaDesimal = in.next();
                Desimal = Integer.parseInt(HexaDesimal, 16);
                System.out.println("Hasil: " + Desimal);
                break;

                case 0 :
                System.out.println("keluar");
                run = false ; 
                break;

                default:
                System.out.println("invalid");
                break; 
            }
        }
        in.close();
    }
}
