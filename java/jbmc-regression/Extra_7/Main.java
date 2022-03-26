/*
 * The benchmark was created on Mar 25, 2022 by fanweneddie
*/
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    String x;
    if (Verifier.nondetBoolean()) {
        x = "ab";
    } else {
        x = "bb";
    }
    assert(x.charAt(1) == 'b');
  }
}