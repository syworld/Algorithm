# Algorithm Study 


- <a href = "https://github.com/syworld/Algorithm/tree/main/src/leetCode">LeetCode Problems</a>
- <a href = "https://github.com/syworld/Algorithm/tree/main/src/programmers">Programmers Problems</a>


## Learn Java

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
int	        Integer  
long	        Long   
float	        Float  
double	        Double   
char	        Character   
boolean	        Boolean   

Wrapper Class는 인스턴스에 저장된 값을 변경할 수 없다. 값을 참조하기 위해 새로운 인스턴스를 생성하고, 생성된 인스턴스의 값만 참조 가능

```
Integer num = new Integer(17); // Boxing (Primitive Type -> Wrapper Class)

int n = num.intValue();        // UnBoxing (Wrapper Class -> Primitive Type)

System.out.println(n); //17
 

Character ch = 'X'; // AutoBoxing -> Character ch = new Character('X'); 

char c = ch;        // AutoUnBoxing -> char c = ch.charValue();

System.out.println(c); // X
```

오토 박싱과 오토 언박싱을 통해 기본 타입과 래퍼 클래스 간의 다양한 연산도 가능
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





