import org.sourcegrade.jagr.gradle.task.grader.GraderRunTask

plugins {
    alias(libs.plugins.algomate)
}

submission {
    // ACHTUNG!
    // Setzen Sie im folgenden Bereich Ihre TU-ID (NICHT Ihre Matrikelnummer!), Ihren Nachnamen und Ihren Vornamen
    // in Anführungszeichen (z.B. "ab12cdef" für Ihre TU-ID) ein!
    // BEISPIEL:
    // studentId = "ab12cdef"
    // firstName = "sol_first"
    // lastName = "sol_last"
    studentId = ""
    firstName = ""
    lastName = ""

    // Optionally require own tests for mainBuildSubmission task. Default is false
    requireTests = false
}

dependencies {
    implementation(libs.fopbot)
}

tasks {
    withType<GraderRunTask> {
        doFirst {
            throw GradleException("No public tests are provided for this exercise. For more information, please refer to the Moodle section 'Übungen' -> 'Informationen zu Tests'.")
        }
    }
}
