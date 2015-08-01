package info.thecodinglive

import org.gradle.api.Plugin
import org.gradle.api.Project

class HelloPlugin implements Plugin<Project>{
    void apply(Project target){
        target.task('hello', type:HelloTask)
    }
}
