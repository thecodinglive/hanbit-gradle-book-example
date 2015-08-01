package info.thecodinglive

import org.gradle.api.Project
import org.gradle.testfixtures.ProjectBuilder

import org.junit.Test
import static org.junit.Assert.*

class HelloTaskTest {
    @Test
    public void testCustomTaskAddValidate(){
        Project proj = ProjectBuilder.builder().build()
        def task = proj.task('hello', type: HelloTask)

        assertTrue(task instanceof HelloTask)
    }
}
