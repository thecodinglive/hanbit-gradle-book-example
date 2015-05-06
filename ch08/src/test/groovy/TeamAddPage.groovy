import geb.Page

/**
 * Created by Administrator on 2015-05-03.
 */
class TeamAddPage extends Page{
    static url ="http://localhost:8080/team/add.html"


    static content = {
        inputName {$("#teamName")}
        inputRating{$("#rating")}
        submitButton(to: TeamlistPage) { $("button[type=submit]") }

    }
}
