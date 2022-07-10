package com.github.dfedakagileti.jetbrainsplugingraphdbsupport.services

import com.intellij.openapi.project.Project
import com.github.dfedakagileti.jetbrainsplugingraphdbsupport.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
