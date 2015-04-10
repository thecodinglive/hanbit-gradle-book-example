import info.thecodinglive.Adder
import spock.lang.Specification

class AdderDataTestSpec extends Specification {
    def "더하기 테이블 테스트"(){
        setup: "adder 클래스 생성"
        def adder = new Adder()
        expect:"a와 b의 값을 더하면 c가 된다."
        adder.add(a, b) == c
        where:
        a | b | c
        1 | 2 | 3
        3 | 4 | 7
        7 | 8 | 15
    }

}