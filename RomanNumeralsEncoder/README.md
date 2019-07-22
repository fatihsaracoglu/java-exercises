# Roman Numerals Encoder

**Roman numerals** are a numeral system that originated in ancient Rome and remained the usual way of writing numbers throughout Europe well into the Late Middle Ages. Numbers in this system are represented by combinations of letters from the Latin alphabet. Modern usage employs seven symbols, each with a fixed integer value:

>I  ---> 1<br/>
IV ---> 4<br/>
V ---> 5<br/>
IX ---> 9<br/>
X ---> 10<br/>
XL ---> 40<br/>
L ---> 50<br/>
XC ---> 90<br/>
C ---> 100<br/>
CD ---> 400<br/>
D ---> 500<br/>
CM ---> 900<br/>
M ---> 1000<br/>

## Task

Create a function taking a positive integer as its parameter and returning a string containing the Roman Numeral representation of that integer.


### Examples

```java
RomanNumeralsEncoder.encoder(1343)
//should return "MCCCXLIII"
RomanNumeralsEncoder.encoder(517)
//should return "DXVII"
```