import java.util.Arrays;



public class Masiv <T extends Number> {

    private Number [] arr = new Number[10];;
   //private int [] arr = {1, 5,56,81,32,5,0,0};

    public void addArreyToArrey(T[] copy){
        System.out.println("Добавление массива");
        System.out.println(Arrays.toString(arr));

        int poin = 0 ;
        int freeSize=0;

        for (int i =0 ; i< arr.length; i++){
            if (arr[i]==null){
                freeSize++;
            }
        }

        int newLeng = arr.length+copy.length-freeSize;
        //System.out.println( "newLeng= " + newLeng);

        Number [] newArr =  new Number  [newLeng];
        int j=0;
        for (int i=0; i< arr.length; i++){
            if (arr[i]!=null){
                newArr[j]=arr[i];
                j++;
            }

        }
        j=0;


        for (int i=0; i <newArr.length; i++)
            if (newArr[i] == null) {
                newArr[i] = copy[j];
                j++;
            }

        arr = newArr;


        System.out.println(Arrays.toString(arr));

    }

    public void addIntToArray(T a){
        System.out.println("добавление числа");
        System.out.println("В масив "+Arrays.toString(arr)+ "добавляем число"+ a);

        int freeSize=0; // свободные ячейки
        Number [] newArrForInt;//новый масив

        for(int i = 0; i<arr.length; i++) { // проверяемколичество свободных ячеек в масиве
            if (arr[i] == null) {
                freeSize++;
            }
        }
        int newSize=arr.length+1-freeSize;//вычисляем какой требуется размер новогомасива
        int j=0;


        newArrForInt =  new Number[newSize]; //создаем новый масив требуемой длинны

        for (int i = 0; i<arr.length; i++) { // копируем исходный масив
            if (arr[i] != null) {
                newArrForInt[j] = arr[i];
                j++;//
            }
        }


        for (int i = 0; i<newArrForInt.length; i++) { // копируем новое число всвободную ячейку
            if (newArrForInt[i] == null) {
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
            if (max < ((int)arr[i])){
                max =(int) arr[i];
                caseArr=i;
            }


        }
        System.out.println("Максимальное значение числа масива =" + max + " и оно находится в ячейке №"+ caseArr);


    }
    public void minElement(){
        int min=((int)arr[0]);
        int caseArr=0;
        for (int i = 0; i<arr.length; i++){
            if (min >((int) arr[i])) {
                min = (int)arr[i];
                caseArr=i;
            }


        }
        System.out.println("Минимальное значение числа масива =" + min + " и оно находится в ячейке №"+ caseArr);


    }
    public void avgElement(){
        int avg=0;
        int summ=0;

        for (int i = 0; i<arr.length; i++){
            summ= summ+(int)arr[i];


        }
        avg=summ/arr.length;

        System.out.println("среднее значение значение в масиве " +avg);


    }


}
