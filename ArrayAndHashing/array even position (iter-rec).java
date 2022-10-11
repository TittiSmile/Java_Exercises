package com.company;

public class Main {

    private int function(int[] array){
        //sommare elementi di posizione pari nell'array
        int sum=0;
        /*for(int i=0; i< array.length; i++){
            if((i%2)==0){
                sum=sum+array[i];
            }
        }*/
        for(int i=0; i< array.length; i=i+2){
            sum=sum+array[i];
        }

        return sum;
    }

    private int functionRecursive(int[] array, int index, int sum){
        int indexIncremento = index+2;
        int arrayLen = array.length;
        if(index < arrayLen){
            sum+=array[index];
            return functionRecursive(array,indexIncremento,sum);
        }
        else{
            return sum;
        }
    }

    public static void main(String[] args) {
	// write your code here
        Main m = new Main();
        int[] array={1,2,3,4};
        System.out.println(m.function(array));
        System.out.println(m.functionRecursive(array,0,0));
    }
}
