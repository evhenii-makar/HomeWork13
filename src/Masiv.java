import java.util.Arrays;



public class Masiv {

    private int [] arr = new int[10];
   //private int [] arr = {1, 5,56,81,32,5,0,0};

    public void addArreyToArrey(int[] copy){
        System.out.println("Добавление массива");
        System.out.println(Arrays.toString(arr));

        int poin = 0 ;
        int freeSize=0;

        for (int i =0 ; i< arr.length; i++){
            if (arr[i]==0){
                freeSize++;
            }
        }

        int newLeng = arr.length+copy.length-freeSize;
        //System.out.println( "newLeng= " + newLeng);

        int [] newArr= new int [newLeng];
        int j=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]!=0){
                newArr[j]=arr[i];
                j++;
            }

        }
        j=0;


        for (int i=0; i <newArr.length; i++)
            if (newArr[i] == 0) {
                newArr[i] = copy[j];
                j++;
            }

        arr = newArr;


        System.out.println(Arrays.toString(arr));

    }

    public void addIntToArray(int a){
        System.out.println("добавление числа");
        System.out.println("В масив "+Arrays.toString(arr)+ "добавляем число"+ a);

        int freeSize=0; // свободные ячейки
        int [] newArrForInt;//новый масив

        for(int i = 0; i<arr.length; i++) { // проверяемколичество свободных ячеек в масиве
            if (arr[i] == 0) {
                freeSize++;
            }
        }
        int newSize=arr.length+1-freeSize;//вычисляем какой требуется размер новогомасива
        int j=0;


        newArrForInt = new int[newSize]; //создаем новый масив требуемой длинны

        for (int i = 0; i<arr.length; i++) { // копируем исходный масив
            if (arr[i] != 0) {
                newArrForInt[j] = arr[i];
                j++;//
            }
        }


        for (int i = 0; i<newArrForInt.length; i++) { // копируем новое число всвободную ячейку
            if (newArrForInt[i] == 0) {
                newArrForInt[i] = a;
            }
        }
        arr=newArrForInt;

        System.out.println("получили масив "+Arrays.toString(arr));
    }


    public void maxElement(){
        int max=0;
        int caseArr=0;
        for (int i = 0; i<arr.length; i++){
            if (max < arr[i]){
                max = arr[i];
                caseArr=i;
            }


        }
        System.out.println("Максимальное значение числа масива =" + max + " и оно находится в ячейке №"+ caseArr);


    }
    public void minElement(){
        int min=arr[0];
        int caseArr=0;
        for (int i = 0; i<arr.length; i++){
            if (min > arr[i]){
                min = arr[i];
                caseArr=i;
            }


        }
        System.out.println("Минимальное значение числа масива =" + min + " и оно находится в ячейке №"+ caseArr);


    }
    public void avgElement(){
        int avg=0;
        int summ=0;

        for (int i = 0; i<arr.length; i++){
            summ= summ+arr[i];


        }
        avg=summ/arr.length;

        System.out.println("среднее значение значение в масиве " +avg);


    }


}
