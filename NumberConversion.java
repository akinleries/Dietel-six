package ChapterSix;

public class NumberConversion {


    public  void convertToBinary(int number){
    String num = Integer.toBinaryString(number);
        System.out.print(num+" ");
    }

    public  void convertToOctal(int number){
    String num = Integer.toOctalString(number);
        System.out.print(num+" ");


    }
    public void convertToHexal (int number){
     String num = Integer.toHexString(number);
        System.out.print(num+"       ");
    }

    public  void convert(){
        System.out.print("  number                        value  ");
        for (int num = 1; num <= 256; num++){
            convertToBinary(num);
            convertToOctal(num);
            convertToHexal(num);
            if(num % 3 == 0){
                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        NumberConversion numberConversion = new NumberConversion();
        numberConversion.convert();
    }
}
