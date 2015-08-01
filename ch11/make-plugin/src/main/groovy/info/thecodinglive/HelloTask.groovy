package info.thecodinglive

import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class HelloTask extends DefaultTask{
    String firstComment  = 'hello Gradle custom plugin'

    @TaskAction
    def SayHello(){
        println firstComment
    }
}
