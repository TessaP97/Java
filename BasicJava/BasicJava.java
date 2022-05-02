public class BasicJava {  

    public static void main(String[] args) {
        System.out.println("Testing main function")
    }

    public void print1to255(){
        for (int i = 0; i < 256; i++) {
            System.out.println(i);
        }
    }

    public void printOdd(){
        for (int i = 0; i < 256; i++) {
            if(i % 2 == 1) {
                System.out.println(i);
            }
        }
    }

    public void printSum() {
        int sum = 0;
        for (int i = 0; i < 256; i++) {
            sum += i;
            System.out.println(String.format(i , sum));
        }
    }

    public void iteratingArray(int[] myArray) {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println(myArray[i]);
        }
    }

    public void findMax(int[] myArray) {
        int max = myArray[0];
        for (int i = 1; i < myArray.length; i++) {
            if (max < myArray[i]) {
                max = myArray[i];
            }
        }
        System.out.println("max num is " + max);
    }

    public ArrayList arrayOddNumber(){
        ArrayList<Integer> myArray = new ArrayList<Integer>();
        for (int i = 1; i < 256; i++) {
            if ( i % 2 == 1) {
                myArray.add(i);
            }
        }
        return myArray;
    }
}