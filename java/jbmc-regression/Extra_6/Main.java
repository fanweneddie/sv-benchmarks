/*
 * The benchmark was created on Mar 25, 2022 by fanweneddie
*/
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    String x = Verifier.nondetString();
    String y = Verifier.nondetString();
    String z = x.concat(y);

    assert(z.length() = x.length + y.length());
  }
}