import java.util.Arrays;

public class LogicalOp {
    //Cerinta 3
    public int checkBiggerNumber(int first, int second){
        if (first < second){
            return second;
        } else {
            return first;
        }
    }
    //Cerinta 4
    public String verifyProvidedText(String text){
        if (text.equals("FastTrackIT")){
            return "Learning text comparison";
        }
        else return "Got to try some more";
    }

    //Cerinta 5
    public String cerinta5(String text, int number){
        if (text.equals("FastTrackIT") && number <= 3)
            return text + number;
        else if(!text.equals("FastTrackIT") && number >= 4)
            return text + number;
        else return "Not Found";
    }

    //Cerinta 6
    public String cerinta6(int b){
        if (b > 8 || b == 6) {
            return "The amount of snow this winter was(cm): " + b;
        }
        else {
            return "The forecast snow is(cm): " + b;
        }
    }

    //Cerinta 7

    public String cerinta7(int number){
        if (number > 4 && number != 4){
            return "The number is greater than 3 and not equal to 4";
        } else if(number == 4) {
            return "The number is equal to 4";
        } else if (number < 3){
            return "The number is lower than 3";
        } return "Not found";
    }

    //Cerinta 8

    public void cerinta8(int number){
        System.out.println(number);
        switch(number){
            case 6: System.out.println("The number is : 6!");break;
            case 12: System.out.println("The number is : 12!");break;
            case 200: System.out.println("The number is : 200!");break;
            default: System.out.println("The number is none of the above");
        }
    }

    //Cerinta 9

    public boolean isNumberEven(int number){
        if ( number %2 == 0){
            return true;
        } else return false;
    }

    //Cerinta 10

    public boolean isEligibleToVote(int number){
        if (number > 18){
            return true;
        } else return false;
    }

    //Cerinta 11


    public int cerinta11(int a , int b , int c ){
        int max = a;
        if (b > max ) {
            max = b;
        }
        if(c > max){
            max = c;
        }
        return max;
    }

    //Cerinta1 tema 4

    public void count(int start){
        for (int i= start ; i<=100 ;i++){
            System.out.println(i);
        }

    }

    //Cerinta 2 tema 4
    public void countReverse(int start){
        for ( int i = start ; i>=-100; i--){
            System.out.println(i);
        }
    }

    //Cerinta 3 tema 4
    public void fromXToY(int x, int y){
        for (int i = x; i<=y; i++){
            System.out.println(i);
        }
    }

    //Cerinta 4 tema 4
    public void xOrY(int x, int y){
        if ( x > y){
            for ( int i = x; i<=y; i++){
                System.out.println(i);
            }
        } else {
            for (int i = y ; i<=x ; i++){
                System.out.println(i);
            }
        }
    }

    //Cerinta 5 tema 4
    public void par() {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //Cerinta 6 tema 4
    public void impar(){
        for (int i=1; i<=100; i++){
            if ( i%2 !=0){
                System.out.println(i);
            }
        }
    }

    //Cerinta 7 tema 4
    public void sumFromNumber(int x){
        int sum=0;
        for (int i=x; i<=100; i++){
            sum = sum+i;

        }
        System.out.println(sum);
    }
    //Cerinta 8 tema 4
    public float sumFromNumberAndMean(int x){
        float sum=0;

        for (int i=x; i<=100; i++){
            sum = sum+i;

        }
        System.out.println(sum);
        return sum/(100 - x + 1);}

    //Cerinta 9 tema 4
    public void asterisk(){
        for (int i =0; i<7; i++){
            System.out.println();
            for(int j=i; j<7;j++){
                System.out.print(" * ");
            }

        }

    }

    //Cerinta 1 tema 4 While
    public void countWhile(int x){
        while ( x<= 100){
            System.out.println(x);
            x++;
        }
    }

    //Cerinta 2 tema 4 While
    public void reverseWhile(int x){
        while (x>= -100){
            System.out.println(x);
            x--;
        }
    }

    //Cerinta 3 tema 4 While
    public void fromXToYWhile(int x, int y){
        while( x <= y){
            System.out.println(x);
            x++;
        }
    }

    //Cerinta 4 tema 4 While
    public void higherNumberWhile(int x, int y){
        if (x <= y){
            while (x <= y){
                System.out.println(x);
                x++;
            }
        }
        else {
            while (x >= y){
                System.out.println(y);
                y++;
            }
        }
    }

    //Cerinta 5 tema 4 While
    public void pareWhile(){
        int i = 1;
        while (i <= 100){
            if (i %2 == 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //Cerinta 6 tema 4 While
    public void impareWhile(){
        int i = 1;
        while ( i <= 100){
            if (i %2 != 0){
                System.out.println(i);
            }
            i++;
        }
    }

    //Cerinta 7 tema 4 While
    public void intervalWhile(){
        int i = 111;
        int count = 0;
        float sum = 0;
        while(i <=8899){
            sum+=i;
            i++;
            count++;
        }
        System.out.println(sum);
        System.out.println(sum/count);
    }

    //Cerinta 8 tema 4 While
    public float dividedBySevenWhile(int x, int y){
        float suma = 0;
        int count = 0;
        while (x <= y ){
            if (x%7 ==0){
                suma+=x;
                count++;
            }
            x++;

        }
        return suma/count;
    }

    //Cerinta 9 tema 4 While
    public void fiboWhile(){
        int i =3;
        int a = 0;
        int b = 1;
        int next;
        System.out.println(a);
        System.out.println(b);
        while (i <= 20) {
            next = a + b;
            System.out.println(next);
            a = b;
            b = next ;
            i++;
        }
    }

    //Cerinta 10 tema 4 While
    public void CozaLozaWoza(){
        int nr = 1;
        while (nr <=110){
            if (nr %11 == 1){
                System.out.println();
            }

            if (nr %3 ==0 && nr %5 ==0 && nr %7 ==0){
                System.out.print("CozaLozaWoza ");
            }
            else if (nr %3 ==0 && nr %5 ==0){
                System.out.print("CozaLoza ");
            }
            else if (nr %3 ==0 && nr %7== 0){
                System.out.print("CozaWoza ");
            }
            else if (nr %5 ==0 && nr %7 ==0){
                System.out.print("LozaWoza ");
            }
            else if (nr %3 == 0){
                System.out.print("Coza ");
            }
            else if (nr %5 == 0){
                System.out.print("Loza ");
            }
            else if (nr %7 == 0){
                System.out.print("Woza ");
            }
            else {
                System.out.print(nr + " ");
            }
            nr++;
        }
    }

// Array Cerinta 2
    public int[] populateArray(int max){
        int[] myArr = new int[max];
        for (int i =0; i< max; i++) {
            myArr[i] = i +1;
        }
        return myArr;
    }

    public void printArray(int[] array){
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }



    //Cerinta 3
    public void parArray(int[] array){
        for (int i=0; i<array.length;i++){
           array[i] = (i+1)*2;
        }
    }


    //Cerinta 4
    public float getAverageValueFromArray(int[] array){
        float sum = 0;
        for (int i =0; i<array.length; i++){
            sum = sum + array[i];
        }
        System.out.println(sum);
        float avg = sum/array.length;
        return avg;

    }

    //Cerinta 5
    public boolean stringArray(String [] array,String find){
        for (int i=0; i<array.length; i++){
            if (array[i] == find ){
                return true;
            }
        }
        return false;
    }


    //Cerinta 6
    public int posArray(int [] array,int number){
        for (int i =0; i<array.length; i++){
            if (array[i] == number){
                return i;
            }
        } return -1;
    }

    //Cerinta 7
    public void linieArray(){
        String[] array = new String[10];
        for (int i =0; i<array.length; i++){
            array[i]="- - - - - - - - - -";
        }
        for (int i=0; i<array.length; i++){
            System.out.println(array[i]);
        }
    }


    //Cerinta 8
    public int[] faraNumar(int[] array,int number){

        int index = 0;
        for(int i=0; i<array.length; i++){
            if (array[i] == number){
                index = i;
                break;

            }
        }
        for(int i=0; i<array.length-1; i++){
            if (i >= index){
                array[i] = array[i+1] ;
            }
        }
        return array;
    }

    //Cerinta 9
    public int alDoilea(int[] array){
        Arrays.sort(array);
        return array[1];
    }

    //Cerinta 10
    public void copiat(int[] array1, int[] array2){
        for (int i=0; i<array1.length; i++){
            array2[i]=array1[i];

        }
    }
}
