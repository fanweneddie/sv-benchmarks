/*
 * The benchmark was created on Mar 25, 2022 by fanweneddie
*/
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    String x;
    boolean temp = Verifier.nondetBoolean();
    if (temp) {
        x = "ab";
    } else {
        x = "bb";
    }
    assert(x.charAt(0) == 'a' || x.charAt(0) == 'b');
  }
}
