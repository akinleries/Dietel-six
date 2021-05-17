package ChapterSix;

public class NumberConversion {


    public  void convertToBinary(int number){
    String num = Integer.toBinaryString(number);
        System.out.print(num+"               ");
    }

    public  void convertToOctal(int number){
    String num = Integer.toOctalString(number);
        System.out.print(num+"               ");


    }
    public void convertToHexadecimal (int number){
     String num = Integer.toHexString(number);
        System.out.print(num);
    }

    public  void convert(){
        System.out.printf("%s%15s%18s","binary","octal","Hexadecimal");
        System.out.println();
        System.out.println("-------------------------------------------------------------");

        for (int num = 1; num <= 256; num++){
            convertToBinary(num);
            convertToOctal(num);
            convertToHexadecimal(num);
            
                System.out.println();
        }
    }

    public static void main(String[] args) {
        NumberConversion numberConversion = new NumberConversion();
        numberConversion.convert();
    }
}
