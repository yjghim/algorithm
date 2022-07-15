# Tips

## 빠른 입력
- BufferedReader
```
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

int num = Integer.parseInt(br.readLine());
...
br.close();
```
readLine()은 **Enter**를 경계로 인식한다.  
또한 리턴 타입이 **String**이므로, 경우에 따라 타입캐스팅이 필요하다.
- StringTokenizer
```
String info = "id=yjghim&addr=wonju";
StringTokenizer st = new StringTokenizer(info, "&");
int n = st.countTokens();

for(int i=0; i<n; i++) {
    String token = st.nextToken();
    System.out.println(token);
}
```
BufferedReader로 입력받은 문자열에 대해 StringTokenizer 클래스를 이용해 토큰 단위로 가공한다.

## 빠른 출력
- BufferedWriter
```
BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

bw.write("test");
bw.newLine(); // 개행
bw.write("test");
bw.flush();
...
bw.close();
```
마찬가지로 write()은 인자로 **String** 타입을 전달받는다.  
(즉, 경우에 따라 타입캐스팅을 하도록 한다)