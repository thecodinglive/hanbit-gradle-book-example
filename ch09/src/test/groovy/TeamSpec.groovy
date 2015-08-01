import geb.spock.GebSpec

class TeamSpec extends GebSpec{

    def "Team추가 page 이동"(){
        given : "team add page"
        to TeamPage

        when: "팀 추가 버튼 클릭"

        teamMove.click()

        then:
        title == "teamadd"
    }
}
