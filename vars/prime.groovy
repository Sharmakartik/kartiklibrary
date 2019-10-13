@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Primes

def call(int count) {
  if (!Primes.isPrime(${count})) {
    echo"number is not prime"
  }
}
