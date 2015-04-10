import info.thecodinglive.Adder
import spock.lang.Specification


class AdderTestspecTest extends Specification {
    def "더하기 테스트"() {
        given:"adder클래스 생성"
            def adder  = new Adder()
        when: "1 더하기 2"
            def ret =  adder.add(1,2)
        then: "결과는 3이다"
           ret == 3
    }
}
