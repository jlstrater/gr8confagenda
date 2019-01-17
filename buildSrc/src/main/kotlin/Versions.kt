import kotlin.String

/**
 * Find which updates are available by running
 *     `$ ./gradlew buildSrcVersions`
 * This will only update the comments.
 *
 * YOU are responsible for updating manually the dependency version. */
object Versions {
    const val com_android_support: String = "27.1.1"

    const val com_android_tools_build_gradle: String = "3.3.0" 

    const val lint_gradle: String = "26.3.0" 

    const val com_gradle_build_scan_gradle_plugin: String = "1.16"

    const val urlimageviewhelper: String = "1.0.4" 

    const val de_fayard_buildsrcversions_gradle_plugin: String = "0.3.2" 

    const val gradle_groovy_android_plugin: String = "0.3.10"

    const val groovy_json: String = "2.5.5"

    const val groovy: String = "2.5.5"

    /**
     *
     *   To update Gradle, edit the wrapper file at path:
     *      ./gradle/wrapper/gradle-wrapper.properties
     */
    object Gradle {
        const val runningVersion: String = "4.10.3"

        const val currentVersion: String = "5.1.1"

        const val nightlyVersion: String = "5.2-20190117003518+0000"

        const val releaseCandidate: String = ""
    }
}
