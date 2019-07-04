package Tutorial.MultiThread;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.IntStream;

import org.junit.Test;

/**
 * Use 10 thread to run 1000 calculate
 *
 */
public class MultiThread {
    
    @Test
    public void MultiThreadTest() throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(10);
        SumObject summation = new SumObject();
        
        IntStream.range(0, 1000).forEach(count -> service.submit(summation::calculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        
        // Not Equal because use multi thread but not synchronized
        assertNotEquals(1000, summation.getSum());
        
        // Use synchronized method
        summation.setSum(0);
        IntStream.range(0, 1000).forEach(count -> service.submit(summation::synchronisedCalculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        // Equal because use multi thread with synchronized code block
        assertEquals(1000, summation.getSum());
        
        // Use static synchronized method
        IntStream.range(0, 1000).forEach(count -> service.submit(SumObject::syncStaticCalculate));
        service.awaitTermination(1000, TimeUnit.MILLISECONDS);
        // Equal because use multi thread with synchronized code block
        assertEquals(1000, summation.getSum());
    }
}
