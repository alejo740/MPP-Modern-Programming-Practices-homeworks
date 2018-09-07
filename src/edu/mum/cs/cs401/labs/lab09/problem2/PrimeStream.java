package edu.mum.cs.cs401.labs.lab09.problem2;

import java.math.BigInteger;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeStream {

	// Problem A
	final Stream<BigInteger> primes = Stream.iterate(BigInteger.TWO, n -> n.add(BigInteger.ONE))
			.filter(x -> IntStream.rangeClosed(2, (int) Math.sqrt(x.intValue())).noneMatch(y -> x.intValue() % y == 0));

	// Problem B
	final Function<Long, Stream<BigInteger>> getPrimeNumbers = number -> Stream
			.iterate(BigInteger.TWO, n -> n.add(BigInteger.ONE))
			.filter(x -> IntStream.rangeClosed(2, (int) Math.sqrt(x.intValue())).noneMatch(y -> x.intValue() % y == 0))
			.limit(number);
	
	final Supplier<Stream<BigInteger>> supplyStreamPrimeNumbers = () -> Stream
			.iterate(BigInteger.TWO, n -> n.add(BigInteger.ONE))
			.filter(x -> IntStream.rangeClosed(2, (int) Math.sqrt(x.intValue())).noneMatch(y -> x.intValue() % y == 0));

	public void printFirstNPrimes(long n) {
		//getPrimeNumbers.apply(n).forEach(System.out::println);
		supplyStreamPrimeNumbers.get().limit(n).forEach(System.out::println);
	}

	public static void main(String[] args) {
		// problem A
		PrimeStream ps2 = new PrimeStream();
		ps2.primes.limit(5).forEach(System.out::println);
		System.out.println("====");
		// problem B
		PrimeStream ps = new PrimeStream();
		ps.printFirstNPrimes(10);
		System.out.println("====");
		ps.printFirstNPrimes(5);

		/*
		 * ///First versions of the prime Numbers stream
		 * 
		 * Stream<BigInteger> primes1 = Stream.iterate(BigInteger.ONE, n ->
		 * n.add(BigInteger.ONE)).limit(100).skip(1) .filter(x ->
		 * isPrime(x.intValue()));
		 * 
		 * Stream<BigInteger> primes2 = Stream.iterate(BigInteger.TWO, n ->
		 * n.add(BigInteger.ONE)).limit(100).filter( x -> IntStream.rangeClosed(2, (int)
		 * Math.sqrt(x.intValue())).noneMatch(y -> x.intValue() % y == 0));
		 * 
		 * primes2.forEach(System.out::println);
		 */
	}
	
	public static boolean isPrime(int number) {
		if (number < 2)
			return false;

		for (int i = 2; i < number / 2; i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
	 

}
