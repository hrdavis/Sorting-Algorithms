package quicksort;

public class QuickSort
{
    public static int partition( int array[], int left, int right )
    {        
        // Create the pivot by picking the last spot in the array
        int pivot_index;
        int pivot;
        
        pivot = array[ right ];
        
        int i;
        int hold;
        
        i = left - 1;
        
        for ( int j = left; j < right; j++ )
        {
            // If the element at array[ j ] is less than the pivot, change its position
            if ( array[ j ] < pivot )
            {
                i           = i + 1;
                hold        = array[ i ];
                array[ i ]  = array[ j ];
                array[ j ]  = hold;
            }
        }
        
        hold            = array[ i + 1 ];
        array[ i + 1 ]  = array[ right  ];
        array[ right ]  = hold;
        
        return ( i + 1 );
    }
  
    public static void Quick_Sort( int array[], int left, int right )
    {
        if ( left < right )
        {
            int q;
            
            q = partition( array, left, right );
            Quick_Sort( array, left, ( q - 1 ) );
            Quick_Sort( array, ( q + 1 ), right );
        }
    }
}
