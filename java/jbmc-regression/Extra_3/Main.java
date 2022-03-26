/*
 * The benchmark was created on Mar 25, 2022 by fanweneddie
*/
import org.sosy_lab.sv_benchmarks.Verifier;

public class Main {
  public static void main(String[] args) {
    StringBuilder x = new StringBuilder(Verifier.nondetString());
    
    if (x.length() == 0) {
        return;
    }
    
    if (x.charAt(0) == 'b') {
        x.reverse();
        assert(x.charAt(x.length() - 1) == 'b');
    }
  }
}