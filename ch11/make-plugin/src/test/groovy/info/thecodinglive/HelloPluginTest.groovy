package info.thecodinglive

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder
import org.junit.Test

import static org.junit.Assert.*;

class HelloPluginTest {

    @Test
    public void testPluginAddProject(){
        Project proj = ProjectBuilder.builder().build()
        proj.pluginManager.apply('Hello')

        assertTrue(proj.tasks.hello instanceof HelloTask)
    }
}
