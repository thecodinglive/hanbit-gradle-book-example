import info.thecodinglive.Adder
import info.thecodinglive.AdderException
import spock.lang.Specification


class AdderTestspec extends Specification {

    def "더하기 테스트"(){

        when: "클래스가 생성되었을 때"
        def adder = new Adder()

        then: "1더하기 1의 값은 2이다."
            adder.add(1, 1) == 4
    }


}
