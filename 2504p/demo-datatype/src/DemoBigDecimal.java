
import java.math.BigDecimal;
import java.math.RoundingMode;

public class DemoBigDecimal {
  public static void main(String[] args) {
    double r1 = 0.1 + 0.2; 
    System.out.println(r1);

    // 2 approaches to create bigDecimal object
BigDecimal bd1 = new BigDecimal ("0.1"); 
BigDecimal bd2 = BigDecimal.valueOf(0.2);

// ! add
BigDecimal bd3 = bd1.add(bd2);// math + 
System.out.println(bd3);

float f1 = bd3.floatValue();
System.out.println(f1);
double d1 = bd3.doubleValue();
System.out.println(d1);
int i1 = bd3.intValue(); 
System.out.println(i1);

String s1 = bd3.toString(); 
System.out.println(s1);

BigDecimal bd4 = bd1.subtract(bd2); 
System.out.println(bd4);

//! subtract (0.3-0.1)
double result = BigDecimal.valueOf(0.3).subtract(BigDecimal.valueOf(0.1)).doubleValue(); 
System.out.println(result);

// ! MULTIPLY (0.1 * 0.2)
double result2 = BigDecimal.valueOf(0.1). multiply(BigDecimal.valueOf(0.2)). doubleValue();
System.out.println(result2);

// 3.33 * 2 = 6.666
double result7 = BigDecimal.valueOf(3.33). multiply(BigDecimal.valueOf(2).setScale(2, RoundingMode.HALF_UP)). doubleValue();
System.out.println(result7);


// ! divide (0.3/0.1)
double result3 = BigDecimal.valueOf(0.3). divide(BigDecimal.valueOf(0.1)). doubleValue();
System.out.println(result3);

// Non-terminating decimal expansion
// 10/3 =3.3333
// double result4 = BigDecimal.valueOf(10). divide(BigDecimal.valueOf(3)). doubleValue();
// System.out.println(result4); // error

double result4 = BigDecimal.valueOf(10). divide(BigDecimal.valueOf(3), 2, RoundingMode.DOWN). doubleValue();
System.out.println(result4);

// 16.5/2 = 8.25
// half up 
double result5 = BigDecimal. valueOf(16.5). divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_UP). doubleValue();
System.out.println(result5);

// half down 
double result6= BigDecimal. valueOf(16.5). divide(BigDecimal.valueOf(2), 1, RoundingMode.HALF_DOWN). doubleValue();
System.out.println(result6);

// x divide 0 
// BigDecimal.valueOf(9.9).divide(BigDecimal.valueOf(0)); // error




  }
}
