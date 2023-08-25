package net.java.projectmanager.repositories;

import net.java.projectmanager.models.Project;

import java.util.List;

public interface ProjectRepository {
    List<Project> getProjects();

    Project getProjectById(String id);

    int addProject(Project project);

    int updateProject(Project project);

    int deleteProject(String id);
}
