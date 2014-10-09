/**
 * 測試 Guava 的版本
 */
package co.gibar.examples.jenkins.matrix;

import java.util.concurrent.TimeUnit;

import com.google.common.base.Stopwatch;

public class GuavaVersion {
	
	public GuavaVersion() {
		Stopwatch watch = new Stopwatch();
		watch.elapsedTime(TimeUnit.MILLISECONDS);
		
		watch.start(); 
		System.out.println( "Start:"+ watch.toString() );
		try{
			Thread.currentThread().sleep(50);
		} catch(Exception e) {}
		System.out.println( "  End:"+ watch.toString() );
		watch.stop();
	}
	
	
	
}
