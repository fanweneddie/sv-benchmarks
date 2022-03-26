/*
 * The benchmark was created on Mar 25, 2022 by fanweneddie
*/
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    StringBuilder x = new StringBuilder();
    
    while (Verifier.nondetBoolean()) {
        x = x.append("hello");
    }

    String y = x.toString();
    if (y.length() > 0) {
        assert(y.startsWith("hello"));
        assert(y.endsWith("hello"));
    }
  }
}
