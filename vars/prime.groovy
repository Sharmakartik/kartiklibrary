@Grab('org.apache.commons:commons-math3:3.4.1')
import org.apache.commons.math3.primes.Prime

void parallelize(int count) {
  if (!Primes.isPrime(count)) {
    error "${count} was not prime"
  }
  
}
