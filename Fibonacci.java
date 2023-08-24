import java.math.BigInteger;

public class Fibonacci
{
  public static BigInteger fib(BigInteger n) {
    return fib_iter(BigInteger.ONE, BigInteger.ZERO, BigInteger.ZERO, BigInteger.ONE, n);
  }
  
  public static BigInteger fib_iter(BigInteger a, BigInteger b, BigInteger p, BigInteger q, BigInteger n)
  {
    BigInteger one = BigInteger.ONE;
    BigInteger two = new BigInteger("2");
    
    if(n.compareTo(BigInteger.ZERO) == 0)
      return b;
    if(n.compareTo(BigInteger.ZERO) < 0)
      return neg_fib(n);
    
    if(n.mod(two).equals(BigInteger.ZERO)) {
      BigInteger pSq = p.multiply(p);
      BigInteger qSq = q.multiply(q);
      return fib_iter(a, b, pSq.add(qSq), two.multiply(p).multiply(q).add(qSq), n.divide(two));
    } else {
        return fib_iter(b.multiply(q).add(a.multiply(q)).add(a.multiply(p)), b.multiply(p).add(a.multiply(q)), p, q, n.subtract(one));
    }
  }
  
  public static BigInteger neg_fib(BigInteger n) {
    BigInteger minusOne = new BigInteger("-1");
    BigInteger powerResult = minusOne.pow(n.abs().intValue() + 1);
        
    return powerResult.multiply(fib(n.abs()));
  }
  
  public static void main(String[] args) {
    System.out.println(fib(new BigIntger("1000000"))); //Millionth Fibonacci
  }
}
