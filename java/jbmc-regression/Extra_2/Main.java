/*
 * The benchmark was created on Mar 25, 2022 by fanweneddie
*/
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    String x = new String();
    
    while (Verifier.nondetBoolean()) {
      x = x.concat("hello");
    }

    if (x.length() > 0) {
        assert(x.startsWith("hello"));
        assert(x.endsWith("hello"));
    }
  }
}
