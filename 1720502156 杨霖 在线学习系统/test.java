				
			public class test{
			   	 int[] array = {5,3,9,6,10,1,23,30 };
        for (int i = 0; i < array.Length - 1; i++)
        {
            for (int j = 0; j < array.Length - i - 1; j++)
            {
                int temp = array[j];            
                if (array[j] > array[j + 1])    
                {
                    array[j] = array[j + 1];   
                    array[j + 1] = temp;     
                }
            }
        }
        for (int i = 0; i < array.Length; i++)
        {
            Console.WriteLine(array[i]);
        }
        }