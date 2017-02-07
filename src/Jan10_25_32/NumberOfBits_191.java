package Jan10_25_32;

/**
 * Write a function that takes an unsigned integer and returns the number of ’1' bits it has (also known as the Hamming weight).

 For example, the 32-bit integer ’11' has binary representation 00000000000000000000000000001011, so the function should return 3.
 * Created by zhupd on 1/10/2017.
 */
public class NumberOfBits_191 {
    public  void main(String[] args) {
        long te = 2147483640;

        long a = hammingWeight(te+9);
        //a = te*10;
        System.out.println(a);
    }
    public int hammingWeight(long n) {
        int count = 0;
        while (n != 0) {
            count += n & 1;
            n = n >>> 1;
        }
        return count;
    }
}
