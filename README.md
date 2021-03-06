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

StringBuilder sb = new StringBuilder("aaa");

// 문자열 추가
sb.append("bbb"); // aaabbb
sb.append(4); // aaabbb4

// 문자열 삽입
sb.insert(2, "ccc"); // aacccabbb4

// 문자열 치환, 문자열 교체
sb.replace(3, 6, "ye"); // aacyebbb4

// 인덱싱, 문자열 자르기
sb.substring(5); // bbb4
sb.substring(3, 7); // yebb

// 문자 삭제
sb.deleteCharAt(3); // aacebbb4

// 문자열 삭제
sb.delete(3, sb.length()); // aac

// 문자열 변환
sb.toString(); // aac

// 문자열 뒤집기
sb.reverse(); // caa

// 문자 대체, 문자 교체, 문자 치환
sb.setCharAt(1, 'b'); // cba

// 문자열 길이 조정
sb.setLength(2); // cb
```


### ArrayList
ArrayList는 List 인터페이스를 구현 
```
List<String> list = new ArrayList<>();
ArrayList<String> arrayList = new ArrayList<>();
ArrayList<String> fruits = new ArrayList<>(Arrays.asList("kiwi", "apple", "melon", "banana"));

// 삽입
arrayList.add("KK");
arrayList.addAll(fruits);

// 조회
arrayList.get(0); // index 요소 반환 or IndexOutOfBoundsException 발생
arrayList.size(); 
arrayList.contains("KK"); // true or false 반환 
arrayList.indexOf("KK"); // index 반환 (값이 중복되면 낮은 index)
arrayList.lastIndexOf("KK"); // index 반환 (값이 중복되면 높은 index)

// 삭제 
arrayList.remove(0); // index 요소 제거 후 반환 
arrayList.clear(); // 모든 요소 제거 
arrayList.removeAll(fruits); // 전달된 list 모든 요소 제거 

// 순회 
Consumer<String> lambda= item -> System.out.println("item : " + item);
arrayList.forEach(lambda);

// 교집합 
arrayList.retainAll(fruits);  // 겹치는 요소만 남기고 겹치지 않은 요소들은 삭제 

```




### Queue

```
import java.util.LinkedList; 
import java.util.Queue; 

Queue<Integer> queue = new LinkedList<>(); 

// 삽입 
queue.offer(1); // true or false
queue.add(2); // true or Exception

// 삭제 
queue.poll(); // 출력 후 제거 or null 반환 
queue.remove(); // 출력 후 제거 or Exception

// 첫번째 값 
queue.peek(); // 값 or null 반환
queue.element(); // 값 반환 or Exception

// 초기화
queue.clear();
```



### HashMap
- key, value 쌍의 데이터를 보관 
- key, value로 null 값 가능
- 중복된 key는 허용하지 않음
- not synchronized

```
Map<String, Integer> map = new HashMap<>();


// 삽입
map.put("a",1);

Map<String, Integer> map2 = new HashMap<>();
map.put


// 조회
map.get(key); // value or null 반환 

map.keySet(); // Set 객체로 key들 반환 
map.values(); // Collection 객체로 value들 반환 

Set<String> keys = map.keySet();
for (String key : keys) {
    System.out.println("key: " + key);
}

Collection<Integer> values = map.values();
for (Integer value : values) {
    System.out.println("value: " + value);
}


// 삭제 
map.remove("a"); // 데이터 삭제 후 value or null 반환 
map.clear(); // 모든 데이터 삭제 

// 확인 
map.isEmpty(); // true or false 반환 
map.containsKey("a"); // true or false 반환
map.containsValue(1); // key가 존재하면 true or false 반환

// 변경 
map.replace("a", 100); // 값 변경 후 이전 value or 없으면 null 반환   

```