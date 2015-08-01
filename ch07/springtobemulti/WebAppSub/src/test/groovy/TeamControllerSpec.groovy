import info.thecodinglive.hiber.service.TeamService
import info.thecodinglive.web.controller.TeamController
import org.springframework.test.web.servlet.MockMvc
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.http.HttpStatus.*

import spock.lang.Specification


class TeamControllerSpec extends Specification {
    def teamController = new TeamController()
    def teamService = Mock(TeamService)

    MockMvc mockMvc = standaloneSetup(teamController).build()

    def setup(){
        teamController.teamService = teamService
    }

    def "컨트롤러 리스트 요청 테스트"(){
        when:
        def response = mockMvc.perform(get("/team/list")).andReturn().response

        then:"기본 팀 관리 페이지 응답 확인"
        response.status == OK.value()

    }
}

