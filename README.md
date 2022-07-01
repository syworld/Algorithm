# Algorithm Study 


- <a href = "https://github.com/syworld/Algorithm/tree/main/src/leetCode">LeetCode Problems</a>
- <a href = "https://github.com/syworld/Algorithm/tree/main/src/programmers">Programmers Problems</a>
- <a href = "https://github.com/syworld/Algorithm/tree/main/src/basic">Basic Problems</a>

# Learn Java

### Scanner
- Scanner 의 입력 메소드들은 대부분 공백과 개행(' ', '\t', '\r', '\n' 등)을 기준으로 읽는다. 이 덕분에 사용자의 편의에 따라 쉽게 입력을 받을 수 있다.
- System.in : 입력 받을 InputStream
```
import java.util.Scanner;

Scanner sc = new Scanner(System.in);

sc.nextByte()		// byte 형 입력 및 리턴
sc.nextShort()		// short 형 입력 및 리턴
sc.nextInt()		// int 형 입력 및 리턴
sc.nextLong()		// long 형 입력 및 리턴
 
sc.nextFloat()		// float 형 입력 및 리턴
sc.nextDouble()		// double 형 입력 및 리턴
 
sc.nextBoolean()	// boolean 형 입력 및 리턴
 
sc.next()		// String 형 입력 및 리턴 - 공백 기준으로 한 단어
sc.nextLine()		// String 형 입력 및 리턴 - Line 기준으로 한 줄
```


### Wrapper Class와 Primitive Type
Wrapper Class: 기본 타입의 데이터를 객체로 취급

byte	        Byte   
short	        Short  
int	            Integer  
long	        Long   
float	        Float  
double	        Double   
char	        Character   
boolean	        Boolean   

Wrapper Class는 인스턴스에 저장된 값을 변경할 수 없다. 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값만 참조 가능하다.

```
Integer num = new Integer(17); // Boxing (Primitive Type -> Wrapper Class)
int n = num.intValue();        // UnBoxing (Wrapper Class -> Primitive Type)
System.out.println(n); //17
 
Character ch = 'X'; // AutoBoxing -> Character ch = new Character('X'); 
char c = ch;        // AutoUnBoxing -> char c = ch.charValue();
System.out.println(c); // X
```

오토 박싱과 오토 언박싱을 통해 기본 타입과 래퍼 클래스 간의 다양한 연산도 가능하다.
```
Integer num1 = new Integer(7); 
Integer num2 = new Integer(3); 

int int1 = num1.intValue();    
int int2 = num2.intValue(); 
   
Integer result1 = num1 + num2;  //10
Integer result2 = int1 - int2;  //4

int result3 = num1 * int2;     //21
```

래퍼 클래스도 객체이므로 동등 연산자(==)를 사용하게 되면, 두 인스턴스의 값을 비교하는 것이 아니라 두 인스턴스의 주소값을 비교하게 된다. 
```
Integer num1 = new Integer(10);
Integer num2 = new Integer(20);
Integer num3 = new Integer(10);
System.out.println(num1 < num2);       // true
System.out.println(num1 == num3);      // false
System.out.println(num1.equals(num3)); // true
```


### String
```
String str = "apple is apple";
str.toUppercase(); // 문자열을 대문자로 변환

char[] charArr = str.toCharArray(); // char횽 배열로 변환 
String tmp = String.valueOf(charArr); // String으로 변환 

String.valueOf(Object); // Object의 값을 String으로 변환 
int n2 = 2;
String.valueOf(n2); // '2'

String[] words = str.split(" ");
String[] str = new String[n];

str.charAt(i); // i번째 char or -1 리턴 
str.substring(0,2); //ap
str.substring(2); //ple is apple
str.length(); // 문자열 길이 
str.indexOf(a); //a값의 index or -1 리턴 


// 대소문자 
str.equalsIgnoreCase(str2);
str.toUpperCase().replaceAll("[^A-Z]", ""); // 알파벳이 아닌 값은 ""로 변환

char c = "x";
Character.isLowerCase(c); //true 
Character.toUpperCase(c); //X
Character.isAlphabetic(c); //true
Character.isDigit(x); //false

String answer = "";
for (char x : str.toCharArray()) {
    // 대문자: 65 ~ 90
    // 소문자: 97 ~ 122

    if (x >= 97 && x <= 122) {
        answer += (char)(x - 32); // 소문자 -> 대문자
    } else if(x>=65 && x<=90) {
        answer += (char)(x + 32); // 대문자 -> 소문자 
    }
}

// 아스키코드 
char x = '9';
int x3 = x - 1; // 56
char x4 = (char)(x -1); //8 숫자 -> 문자
int x5 = (int) x4; //56 문자 -> 숫자 

Character.getNumericValue(x) // 9 



// 숫자 char형 아스키코드 '0' ~ '9' : 48 ~ 57
int answer = 0;
if(x>=48 && x<=57) { // x는 char형 
  answer = answer * 10 + (x-48); // x - '0' 
}

Integer.parseInt("3"); //3
Integer.parseInt("110", 2); //6 (2진수 int로 변환) 
Integer.parseInt("110", 10); //110
```

### StringBuilder
```
String str = "good";
String tmp = new StringBuilder(str).reverse().toString(); //doog 
```


