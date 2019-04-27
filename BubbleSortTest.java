//import static org.junit.Assert.assertEquals;

import org.junit.Assert;

import org.junit.Test;

public class BubbleSortTest {
    private BubbleSort bs=new BubbleSort();
	public BubbleSortTest() {
		// TODO Auto-generated constructor stub
	}
	@Test
	public void bsTest(){
		int [] arr= new int[]{1,2,6,2,5,9,8};
		int [] expectresult=new int[]{1, 2, 2, 5, 6,8,9};
		
		int[] result=bs.doBubbleSort(arr);
		/*for(int i=0;i<arr.length;++i)
			System.out.println(arr[i]);*/
		Assert.assertArrayEquals(result,expectresult);
		
	}

}
