package algorithm_project;

public class Output {
    public void sortedArray(int arr[]){
        System.out.println("");
        System.out.print("After sorting the array: ");
        int len = arr.length;
            for(int k=0;k<len;k++){
                System.out.print(arr[k]+" ");
            }
        System.out.println("\n---------------------------------------------");
    }
}
