public class Main {
    public static void main(String[] args) {
     LogicalOp op = new LogicalOp();

     //Cerinta 2
        int[] array2 = op.populateArray(100);
        op.printArray(array2);
        System.out.println("-----------");

     //Cerinta 3
     int[] array3 = new int[50];
     op.parArray(array3);
     op.printArray(array3);
        System.out.println("---------------");



     //Cerinta 4
     int[] array4 = op.populateArray(30);
     System.out.println(op.getAverageValueFromArray(array4));
        System.out.println("---------------");

     //Cerinta 5
     String[] array5 = {"carte","maimuta","robotel"};
     String word = "maimuta2";
        System.out.println(op.stringArray(array5,word));
        System.out.println("-------------");

     //Cerinta 6
     int[] array6 = {1,14,46,67,21,16,58,91,87,63};
        System.out.println(op.posArray(array6,99));
        System.out.println("---------------");

     //Cerinta 7
     op.linieArray();
        System.out.println("----------");

     //Cerinta 8
     int[] array8 = {2,14,6,10,4,22,7,11,18};
     int numar = 6;
        op.printArray(op.faraNumar(array8,numar));
        System.out.println("----------");


     //Cerinta 9
        System.out.println(op.alDoilea(array8));
        System.out.println("----------");

     //Cerinta 10
     int[] arrayCop = new int[array6.length];
     op.copiat(array6,arrayCop);
     op.printArray(arrayCop);
    }



}
