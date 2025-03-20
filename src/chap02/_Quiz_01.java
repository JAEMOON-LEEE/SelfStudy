/*
버스 도착 정보를 출력하는 프로그램을 작성하시오
각 정보는 적절한 자료형의 변수에 정의합니다.

<정보>
1, 버스 번호는 "1234","상암08"과 같은 형태
2. 남은 시간은 분 단위(예 3분, 5분)
3. 남은 거리는 km단위(예 1.5km, 0.8km)

<실행결과>
상암08번 버스
약 3분 후 도착
남은 거리 1.2km
 */
package chap02;

public class _Quiz_01 {
    public static void main(String[] args) {
        String BusName = "상암08";
        int min = 3;
        double far = 1.2;

        System.out.println(BusName+"번 버스");
        System.out.println("약"+min+"분 후 도착");
        System.out.println("남은 거리"+far+"km");


    }
}
