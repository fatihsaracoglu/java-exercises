# Luhn Algorithm

The Luhn algorithm, also known as the modulus 10 or mod 10 algorithm, is a simple checksum formula used to validate a variety of identification numbers, such as credit card numbers, IMEI numbers.

Here is the algorithm:

- Double every other digit, scanning from right to left, starting from the second digit (from the right).

	Another way to think about it is: if there are an even number of digits, double every other digit starting with the first; if there are an odd number of digits, double every other digit starting with the second:
	
	`1714 ==> [1*, 7, 1*, 4] ==> [2, 7, 2, 4]`
	`12345 ==> [1, 2*, 3, 4*, 5] ==> [1, 4, 3, 8, 5]`
	`891 ==> [8, 9*, 1] ==> [8, 18, 1]`

- If a resulting number is greater than `9`, replace it with the sum of its own digits (which is the same as subtracting `9` from it):

	`[8, 18*, 1] ==> [8, (1+8), 1] ==> [8, 9, 1]`
	or
	`[8, 18*, 1] ==> [8, (18-9), 1] ==> [8, 9, 1]`

- Sum all of the final digits:
	`[8, 9, 1] ==> 8 + 9 + 1 = 18`

- Finally, take that sum and divide it by `10`. If the remainder equals zero, the original credit card number is valid.

	`18 (modulus) 10 ==> 8 , which is not equal to 0, so this is not a valid credit card number`

### Examples
```java
LuhnAlgorithm.validate("91203034126940783")
//should return "Credit Card number is not valid!"
LuhnAlgorithm.validate("2626262626262626")
//should return "Credit Card number is valid!"
```