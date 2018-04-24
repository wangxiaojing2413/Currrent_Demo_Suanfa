
public class SortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[]{11,21,31,10,41};
		
      /*  for (int i = 0; i < a.length; i++)
            a[i] = (int) (Math.random() * 100);*/
		
        
        int len = a.length;
        /*
        for(int i=0; i< len;i++){
        	for(int j=0; j<len-i-1;j++){
        		if(a[j]<a[j+1]){
        			int temp = a[j];
        			a[j] = a[j+1];
        			a[j+1] = temp;
        		}
        	}
        }
        */
        
       /* for(int i=0; i< len;i++){
        	for(int j=0; j<len-i-1;j++){
        		if(a[j]<a[j+1]){
        			int temp = a[j];
        			a[j] = a[j+1];
        			a[j+1] = temp;
        		}
        	}
        }
        */
        for(int i=0; i< len;i++){
        	int min = i;
        	for(int j=i; j<len;j++){
        		if(a[j]<a[min]){
        			min = j;
        			int temp = a[i];
        			a[i] = a[min];
        			a[min] = temp;
        		}
        	}
        }
        
        
        
        
        
        
        for (int n : a)
            System.out.print(n + " ");

	}

}
