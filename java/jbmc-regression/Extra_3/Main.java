/*
 * The benchmark was created on Mar 25, 2022 by fanweneddie
*/
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    String temp = Verifier.nondetString();
    StringBuilder x = new StringBuilder(temp);
    
    if (x.startsWith("b")) {
        x.reverse();
        assert(x.endsWith("b"));
    }
  }
}
