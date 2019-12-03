/**
 * Stream_of_numbers
 */
public class Stream_of_numbers {

    public int StreamIt(int startNumber)
        throws InterruptedException {
        var count = startNumber;        
        
        while (count < 100) {
            count++;
            System.out.println("count:" + count);
            Thread.sleep(1000);
        }

        return count;
    }
}