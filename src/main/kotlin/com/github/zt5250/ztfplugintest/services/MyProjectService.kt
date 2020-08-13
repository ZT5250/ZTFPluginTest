package com.github.zt5250.ztfplugintest.services

import com.intellij.openapi.project.Project
import com.github.zt5250.ztfplugintest.MyBundle

class MyProjectService(project: Project) {

    init {
        println(MyBundle.message("projectService", project.name))
    }
}
