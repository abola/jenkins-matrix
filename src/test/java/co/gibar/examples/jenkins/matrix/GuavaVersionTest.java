package co.gibar.examples.jenkins.matrix;

import org.junit.Assert;
import org.junit.Test;

public class GuavaVersionTest {

  @Test public void testGuavaVersion(){
    try{
      new GuavaVersion();
    } catch(Exception e){
      Assert.fail("new GuavaVersion() FAILED. CauseBy:" + e.getMessage() );
    }
  }
}
