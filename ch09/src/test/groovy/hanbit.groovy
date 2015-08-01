
import geb.Browser



Browser.drive(){

    go("http://www.hanbit.co.kr/")

    $("input", name:'keyword').value('java')
    $("input", class:'bInp').click()


}
