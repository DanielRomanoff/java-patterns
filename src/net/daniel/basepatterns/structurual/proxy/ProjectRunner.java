package net.daniel.basepatterns.structurual.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.github.com/danielromanoff/basepatterns");

        project.run();
    }
}
