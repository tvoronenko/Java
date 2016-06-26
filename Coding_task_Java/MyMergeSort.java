
public class MyMergeSort {

	public static void main(String[] args) {
		  int[] inputArr = {45,23,11,89,77,98,4,28,65,43};
	        MyMergeSort mms = new MyMergeSort();
	        mms.sort(inputArr);
	        for(int i:inputArr){
	            System.out.print(i);
	            System.out.print(" ");
	        }
	}
	
	public void sort(int[] arr){
		int N=arr.length;
		int[] aux = new int[N];
		sort(arr,aux,0,N-1);
	}

	private void sort(int[] arr, int[] aux, int low, int high) {
		if(low<high){
			int mid = (high+low)/2;
			sort(arr,aux,0,mid);
			sort(arr,aux,mid+1,high);
			
			merge(arr,aux,low,mid,high);
		}
		
	}

	private void merge(int[] arr, int[] aux, int low, int mid, int high) {
		int left=low;
		int right = mid+1;
		for(int i=low;i<=high;i++){
			aux[i]=arr[i];
		}
		for(int i=low;i<=high;i++){
			if(right>high) {
				arr[i] = aux[left++];
			} else if(left>mid){
				arr[i] = aux[right++];
			}else if(aux[left]<aux[right]){
				arr[i]=aux[left++];
			}else{
				arr[i]=aux[right++];
			}
		}
		
		
	}

}
