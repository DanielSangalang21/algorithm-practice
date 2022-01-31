
public class QuickSortAlgo {

	public static void main(String[] args) {
		int[] array = {2,3,1,4,-1};
		
		quickSort(array, 0, 4);
		for(int num : array) {
			System.out.println(num);
		}
		
		//System.out.println("pivot new index "+ pivot); 
	}
	
	private static int partition(int a[],int start,int end) {
		int i=start+1;
		int pivot = a[start]; 
		
		for(int j = start; j <= end ;j++) {
			if(a[j]<pivot) {
				swap(a,i,j);
				i+=1;
			}
		}
		swap(a,start,i-1);
		return i-1;
	}
	
	private static void swap(int a[],int i,int j) {
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}

	private static void quickSort(int a[], int start, int end) {
		if (start < end) {
			int pivotPosition = partition(a, start, end);
			quickSort(a,start,pivotPosition-1);
			quickSort(a,pivotPosition+1,end);
		}
	}
}
