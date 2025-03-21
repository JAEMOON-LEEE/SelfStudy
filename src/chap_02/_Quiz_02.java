/**
 * 어린이 키에 따른 놀이기구 탑승 가능 여부를 확인하는 프로그램을 작성하시오
 * <조건>
 *     1. 키가 120cm 이상인 경우에만 탑승가능
 *     2. 삼항 연산자 이용
 * </조건>
 *
 * <실행결과>
 *     키가 115cm 이므로 탑승 불가합니다.
 *     키가 121cm 이므로 탑승 가능합니다.
 * </실행결과>
 */


package chap_02;

public class _Quiz_02 {
    public static void main(String[] args) {


        int ki = 115;
        int ki2 = 121;
        String no = (ki >= 120) ? "키가 "+ki+"cm 이므로 탑승 가능합니다." : "키가"+ki+"cm 이므로 탑승 불가능합니다.";
        System.out.println(no);
        String okay = (ki2 >= 121) ? "키가 "+ki2+"cm 이므로 탑승 가능합니다." : "키가"+ki2+"cm 이므로 탑승 불가능합니다.";
        System.out.println(okay);

/**
 * int height = 121;
 * String result = (height >= 120) ? "탑승 가능합니다" : "탑승 불가능합니다";
 * System.out.println("키가" + height + "cm 이므로" + result);
 */

    }
}
