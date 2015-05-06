import geb.Page

class TeamPage extends Page{
    static url ="http://localhost:8080/"

    static content = {
        teamMove{ $("#btnadd")}
    }
}
