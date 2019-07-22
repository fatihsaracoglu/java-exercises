# Roman Numerals Encoder

**Roman numerals** are a numeral system that originated in ancient Rome and remained the usual way of writing numbers throughout Europe well into the Late Middle Ages. Numbers in this system are represented by combinations of letters from the Latin alphabet. Modern usage employs seven symbols, each with a fixed integer value:

>I  ---> 1
IV ---> 4
V ---> 5
IX ---> 9
X ---> 10
XL ---> 40
L ---> 50
XC ---> 90
C ---> 100
CD ---> 400
D ---> 500
CM ---> 900 
M ---> 1000

## Task

Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.


### Examples

```java
RomanNumeralsEncoder.encoder(1343)
//should return "MCCCXLIII"
RomanNumeralsEncoder.encoder(517)
//should return "DXVII"
```