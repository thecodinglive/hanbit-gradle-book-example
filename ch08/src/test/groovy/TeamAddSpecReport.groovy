import geb.spock.GebReportingSpec
import spock.lang.Stepwise

@Stepwise
class TeamAddSpecReport extends GebReportingSpec{
    def "[Report]Team 추가"(){
        given : "team add page"
        to TeamAddPage

        when: "팀 추가 버튼 클릭"
        inputName  ="arizona"
        inputRating = "3"
        submitButton.click()

        then:"team list page"

        to TeamlistPage
        title == "List of teams"
    }
}
