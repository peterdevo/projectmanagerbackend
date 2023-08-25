package net.java.projectmanager.services;

import net.java.projectmanager.models.Project;

import java.util.List;

public interface ProjectService {
    List<Project> getProjects();
    Project getProjectById(String id);
    Integer addProject(Project project);
    Project updateProject(Project project);
    Integer deleteProject(String id);
}
